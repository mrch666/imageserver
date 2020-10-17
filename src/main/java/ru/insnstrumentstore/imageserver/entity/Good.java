package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import  javax.persistence.*;


@Data
@Entity
//@Table(name="good")
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private  String name;

    @Column(nullable = true)
    private  String article;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="brand_id")
    private  Brand brand;

    @Column (length = 2048)
    private  String description;

    @Column (length = 256)
    private  String photo;

    public Good(){}

    public Good(String name,String article, Brand brand, String description,String photo)
    {
        this.name=name;
        this.article=article;
        this.brand=brand;

        this.description=description;
        this.photo=photo;
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

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public Brand getBrand() {
        return brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getPhoto() {
        return photo;
    }

    public String getArticle() {
        return article;
    }
    public void setArticle(String article) {
        this.article = article;
    }
}
