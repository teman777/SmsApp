package com.artemvoronov.SmsApp.service;

import com.artemvoronov.SmsApp.generated.sms.tables.Message;
import com.artemvoronov.SmsApp.generated.sms.tables.Numbermessagerelation;
import com.artemvoronov.SmsApp.generated.sms.tables.Tag;
import com.artemvoronov.SmsApp.pojo.MessagePojo;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.math.BigInteger;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

@Service
public class SmsService {

    @Autowired
    private DSLContext dsl;


    @Value("${sms.email}")
    private String email;

    @Value("${sms.sign}")
    private String sign;

    @Value("${sms.api}")
    private String apiKey;


    private Message message = Message.MESSAGE;
    private Tag tag = Tag.TAG;
    private Numbermessagerelation number = Numbermessagerelation.NUMBERMESSAGERELATION;

    public void addMessage(MessagePojo ms){
        Result<Record1<Integer>> id = dsl.insertInto(message)
                .set(message.TEXT, ms.getText())
                .set(message.CREATEDDATE, ms.getDate())
                .returningResult(message.ID).fetch();
        int insertedID = id.get(0).value1();
        for(Long num: ms.getNumbers()){
            dsl.insertInto(number, number.MESSAGEID, number.NUMBER)
                    .values(insertedID, BigInteger.valueOf(num))
                    .execute();
        }
        for(String key: ms.getTags().keySet()){
            dsl.insertInto(tag, tag.MESSAGEID, tag.NAME, tag.VAL)
                    .values(insertedID, key, ms.getTags().get(key))
                    .execute();
        }

    }

    public void sendSms(MessagePojo message){
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
                this.addMessage(message);
            }
        }

    }


    public DSLContext getDsl() {
        return dsl;
    }

    public void setDsl(DSLContext dsl) {
        this.dsl = dsl;
    }
}
