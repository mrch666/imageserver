package ru.insnstrumentstore.imageserver.entity;

import javax.persistence.*;


@Entity
//@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private  String name;

    @Column (length = 2048)
    private  String description;

    @Column (length = 256)
    private  String photo;

    public Category(){}

    public Category(String name,String description,String photo)
    {
        this.name=name;
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
}
