package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
//@Table(name="brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private  String name;

    @Column (length = 2048)
    private  String description;

    @Column (length = 256)
    private  String photo;

    public Brand(){}

    public Brand(String name,String description,String photo)
    {
        this.name=name;
        this.description=description;
        this.photo=photo;
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
