package com.artemvoronov.SmsApp.pojo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(targetEntity = Number.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "MessageID", referencedColumnName = "ID")
    private List<Number> numbers;

    @OneToMany(targetEntity = Tag.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "MessageID", referencedColumnName = "ID")
    private List<Tag> tags;

    @Column(name = "Text")
    private String text;

    @Column(name = "CreatedDate")
    private LocalDate date;



    public List<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
