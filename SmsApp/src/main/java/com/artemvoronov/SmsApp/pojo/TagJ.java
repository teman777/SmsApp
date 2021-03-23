package com.artemvoronov.SmsApp.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Tag")
public class TagJ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String key;

    @Column(name = "Val")
    private String value;

    public TagJ(String keyVal){
        this.key = keyVal.substring(0, keyVal.indexOf(':'));
        this.value = keyVal.substring(keyVal.indexOf(':') + 1);
    }

    public TagJ(String key, String value){
        this.key = key;
        this.value = value;
    }

    public TagJ(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object o){
        if(o == this){
            return true;
        } else if(o instanceof  TagJ){
            if(this.key.equals(((TagJ) o).getKey()) && this.value.equals(((TagJ) o).getValue())){
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
}
