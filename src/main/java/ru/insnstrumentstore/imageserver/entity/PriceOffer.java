package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import  javax.persistence.*;
@Data
@Entity
//@Table(name="price_offer")
public class PriceOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="good_id",nullable = true)
    private  Good good;

    @Column(nullable = true)
    private  double price;

    @Column(nullable = true)
    private  int count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="provider_id")
    private  Provider provider;

    //VNESHAAA SSILKA
    @Column ()
    private  String delivery;

    public PriceOffer(){}

    public PriceOffer(Good good, double price, int count, Provider provider, String delivery)
    {
        this.good=good;
        this.price=price;
        this.count=count;
        this.provider=provider;
        this.delivery=delivery;
    }

    public int getId() {
        return id;
    }

    public Good getGood() {
        return good;
    }
    public void setGood(Good good) {
        this.good = good;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Provider getProvider() {
        return provider;
    }
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getDelivery() {
        return delivery;
    }
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
