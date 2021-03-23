package com.artemvoronov.SmsApp.service;


import com.artemvoronov.SmsApp.pojo.MessageJ;
import com.artemvoronov.SmsApp.pojo.MessagePojo;
import com.artemvoronov.SmsApp.pojo.TagJ;
import com.artemvoronov.SmsApp.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.net.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SmsService {

    @Autowired
    private MessageRepository messageRepository;

    @Value("${sms.email}")
    private String email;

    @Value("${sms.sign}")
    private String sign;

    @Value("${sms.api}")
    private String apiKey;




    public int sendSms(MessagePojo message){
        boolean check = true;
        String req = "text=" + message.getText() + "&sign=" + sign;
        if(message.getNumbers().stream().count() == 1){
            req = req + "&number=" + message.getNumbers().get(0);
        } else {
            for (Long num : message.getNumbers()) {
                req = req + "&numbers[]=" + num;
            }
        }
        int status = 0;
        try {
            String protocol = "http";
            String auth = email + ":" + apiKey;
            String host = "gate.smsaero.ru";
            String path = "/v2/sms/send";
            URI uri = new URI(protocol,auth,host,80,path,req,null);
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(auth.getBytes()));

            URL url = uri.toURL();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("Connection", "keep-alive");
            con.setRequestProperty("Host", "gate.smsaero.ru:80");
            con.setRequestProperty("Authorization", basicAuth);
            status = con.getResponseCode();

        } catch(Exception e){
            check = false;
            e.printStackTrace();
        } finally {
            if(check && status < 300){
                messageRepository.save(message.convertToEntity());
            }
        }

        return status;

    }

    public List<MessagePojo> findMessages(Long number, LocalDate date, List<TagJ> tags){
        List<MessageJ> message = null;
        if(number != null && date != null){
            message = messageRepository.findByNumberAndDate(date, number);
        } else if(number != null){
            message = messageRepository.findByNumber(number);
        } else if(date != null){
            message = messageRepository.findByDate(date);
        } else {
            message = messageRepository.findAll();
        }

        if(tags != null && tags.size() > 0){
            message = message.stream().filter(messageJ -> {
                if(messageJ.getTags() != null){
                    return messageJ.getTags().containsAll(tags);
                }
                return false;
            }).collect(Collectors.toList());
        }

        List<MessagePojo> mesPojos = new ArrayList<>();
        for(MessageJ mes: message){
            mesPojos.add(new MessagePojo(mes));
        }
        return mesPojos;
    }

}
