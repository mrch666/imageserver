package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name="category_list")
public class CategoryList
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="good_id", referencedColumnName="id")
    private  Good good;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private  Category category;

    public CategoryList(){}

    public CategoryList(Good good, Category category)
    {
        this.good=good;
        this.category=category;
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

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
