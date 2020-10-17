package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import  javax.persistence.*;
@Data
@Entity
@Table(name="provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private  String name;

    @Column(nullable = true,length = 12)
    private  String inn;

    @Column
    private  String adress;

    @Column
    private  String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="pricelist_id")
    private  Pricelist pricelist;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="currency_id")
    private  Currency currency;

    public Provider(){}

    public Provider(String name, String inn, String adress, String email,Pricelist pricelist,Currency currency)
    {
        this.name=name;
        this.inn=inn;
        this.adress=adress;
        this.email=email;
        this.pricelist=pricelist;
        this.currency=currency;
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

    public Pricelist getPricelist() {
        return pricelist;
    }
    public void setPricelist(Pricelist pricelist) {
        this.pricelist = pricelist;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getInn() {
        return inn;
    }
    public void setInn(String inn) {
        this.inn = inn;
    }

    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
