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
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
        String req = "https://" + email + ":" + apiKey
                + "@gate.smsaero.ru/v2/sms/send?text=" + message.getText() + "&sign=" + sign;
        if(message.getNumbers().stream().count() == 1){
            req = req + "&number=" + message.getNumbers().get(0);
        } else {
            for (Long num : message.getNumbers()) {
                req = req + "&numbers[]=" + num;
            }
        }
        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(req)).GET().build();
            HttpResponse<String> resp = client.send(request,HttpResponse.BodyHandlers.ofString());
            /*
            URL url = new URL(req);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            HttpClient
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("Connection", "close");


            con.setRequestProperty("Host", "gate.smsaero.ru");
            */

        } catch (InterruptedException e){
            check = false;
            e.printStackTrace();
        } catch (IOException e){
            check = false;
            e.printStackTrace();
        } finally {
            System.out.println(req);
            if(check){
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
