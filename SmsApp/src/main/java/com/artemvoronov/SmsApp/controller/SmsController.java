package com.artemvoronov.SmsApp.controller;

import com.artemvoronov.SmsApp.pojo.MessagePojo;
import com.artemvoronov.SmsApp.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


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
    public ResponseEntity sendMessage(@RequestBody List<MessagePojo> messagePojos){
        List<Integer> statuses = new ArrayList<>();
        for(MessagePojo ms: messagePojos){
            ms.setDate(LocalDate.now());
            int status = smsService.sendSms(ms);
            statuses.add(status);

        }
        Integer maxStatus = statuses.stream().max(Comparator.naturalOrder()).get();
        HttpStatus result = null;
        if(maxStatus < 300){
            result = HttpStatus.OK;
        } else {
            result = HttpStatus.BAD_REQUEST;
        }
        ResponseEntity<Integer> re = new ResponseEntity<Integer>(result);
        return re;

    }
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public void get(){
        System.out.println(LocalDate.now());
        smsService.findPojos(LocalDate.now(), 79277597668L);
    }


}
