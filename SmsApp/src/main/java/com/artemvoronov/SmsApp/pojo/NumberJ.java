package com.artemvoronov.SmsApp.pojo;

import javax.persistence.*;

@Entity
@Table(name = "NumberMessageRelation")
public class NumberJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Number")
    private long number;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
