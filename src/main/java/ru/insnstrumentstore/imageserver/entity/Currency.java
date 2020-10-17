package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
//@Table(name="currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private  String name;

    public  Currency(){}

    public  Currency(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
