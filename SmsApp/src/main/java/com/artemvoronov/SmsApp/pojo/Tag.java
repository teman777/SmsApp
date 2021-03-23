package com.artemvoronov.SmsApp.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String key;

    @Column(name = "Val")
    private String value;

    public Tag(String keyVal){
        this.key = keyVal.substring(0, keyVal.indexOf(':'));
        this.value = keyVal.substring(keyVal.indexOf(':') + 1);
    }

    public Tag(String key, String value){
        this.key = key;
        this.value = value;
    }

    public Tag(){
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
        } else if(o instanceof Tag){
            if(this.key.equals(((Tag) o).getKey()) && this.value.equals(((Tag) o).getValue())){
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
