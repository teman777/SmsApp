package com.artemvoronov.SmsApp.pojo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Message")
public class MessageJ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(targetEntity = NumberJ.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "MessageID", referencedColumnName = "ID")
    private List<NumberJ> numbers;

    @OneToMany(targetEntity = TagJ.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "MessageID", referencedColumnName = "ID")
    private List<TagJ> tags;

    @Column(name = "Text")
    private String text;

    @Column(name = "CreatedDate")
    private LocalDate date;

    public List<NumberJ> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberJ> numbers) {
        this.numbers = numbers;
    }

    public List<TagJ> getTags() {
        return tags;
    }

    public void setTags(List<TagJ> tags) {
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
