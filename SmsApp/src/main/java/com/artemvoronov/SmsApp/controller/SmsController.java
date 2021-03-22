package com.artemvoronov.SmsApp.controller;

import com.artemvoronov.SmsApp.pojo.MessagePojo;
import com.artemvoronov.SmsApp.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;


@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;



/*

    @RequestMapping(value = "/send"
                   ,method = RequestMethod.POST
                   )
    public void sendMessage(@RequestBody MessagePojo messagePojo){
        messagePojo.setDate(LocalDate.now());
        smsService.sendSms(messagePojo);

    }*/

    @RequestMapping(value = "/send", method = RequestMethod.POST, params = {})
    public void sendMessage(@RequestBody List<MessagePojo> messagePojos){
        for(MessagePojo ms: messagePojos){
            ms.setDate(LocalDate.now());
            smsService.sendSms(ms);
        }

    }


}
