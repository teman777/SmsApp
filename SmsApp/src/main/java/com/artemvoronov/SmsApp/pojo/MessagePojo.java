package com.artemvoronov.SmsApp.pojo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagePojo {

    private List<Long> numbers;
    private Map<String, String> tags;

    private String text;


    private LocalDate date;

    public MessagePojo(){

    }

    public MessagePojo(List<Long> numbers, Map<String, String> tags) {
        this.numbers = numbers;
        this.tags = tags;
    }

    public MessagePojo(Message mes){
        this.date = mes.getDate();
        this.text = mes.getText();

        if(mes.getNumbers() != null){
            List<Long> numbers = new ArrayList<>();
            for(Number num: mes.getNumbers()){
                numbers.add(num.getNumber());
            }
            this.numbers = numbers;
        }
        if(mes.getTags() != null){
            Map<String, String> tags = new HashMap<>();
            for(Tag tag: mes.getTags()){
                tags.put(tag.getKey(), tag.getValue());
            }
            this.tags = tags;
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Long> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Long> numbers) {
        this.numbers = numbers;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public Message convertToEntity(){
        Message mes = new Message();
        mes.setDate(this.getDate());
        mes.setText(this.getText());
        List<Number> numbers = new ArrayList<>();
        if(this.numbers != null) {
            for (Long num : this.numbers) {
                Number n = new Number(num);
                numbers.add(n);
            }
            mes.setNumbers(numbers);
        }
        if(this.tags != null) {
            List<Tag> tags = new ArrayList<>();
            for (String key : this.tags.keySet()) {
                String val = this.tags.get(key);
                Tag tag = new Tag(key, val);
                tags.add(tag);
            }
            mes.setTags(tags);
        }
        return mes;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }
}
