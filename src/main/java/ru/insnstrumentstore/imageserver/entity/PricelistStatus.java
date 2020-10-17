package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="pricelist_status")
public class PricelistStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private String name;

    public PricelistStatus(){}
    public PricelistStatus(String name)
    {
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
