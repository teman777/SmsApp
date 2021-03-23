package com.artemvoronov.SmsApp.controller;

import com.artemvoronov.SmsApp.pojo.MessagePojo;
import com.artemvoronov.SmsApp.pojo.Tag;
import com.artemvoronov.SmsApp.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
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
    public List<MessagePojo> get(@RequestParam(name = "date", required = false)
                                 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                 LocalDate date,
                                 @RequestParam(name = "number", required = false)
                                 Long number,
                                 @RequestParam(name = "tags", required = false)
                                 List<String> tags){
        List<Tag> tagMap = null;
        if(tags != null){
            tagMap = tags.stream().map(s -> {
                Tag tagJ = new Tag(s);
                return tagJ;
            }).collect(Collectors.toList());

        }
        List<MessagePojo> result = smsService.findMessages(number, date, tagMap);
        if(result == null){
            result = new ArrayList<>();
        }
        return result;
    }


}
