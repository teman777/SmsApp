package com.artemvoronov.SmsApp.pojo;

import java.time.LocalDate;
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

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }
}
