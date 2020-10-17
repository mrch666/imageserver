package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="pricelist")
public class Pricelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private Date last_update;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="status_id")
    private  PricelistStatus status;

    @Column
    private  String login;

    @Column
    private  String password;

    @Column
    private  String url;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="format_id")
    private  PricelistFormat format;

    public Pricelist(){}

    public Pricelist(Date last_update,PricelistStatus status, String login, String password , String url, PricelistFormat format)
    {
        this.format=format;
        this.last_update=last_update;
        this.login=login;
        this.password=password;
        this.status=status;
        this.url=url;
    }

    public int getId() {
        return id;
    }

    public Date getLast_update() {
        return last_update;
    }
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public PricelistFormat getFormat() {
        return format;
    }
    public void setFormat(PricelistFormat format) {
        this.format = format;
    }

    public PricelistStatus getStatus() {
        return status;
    }
    public void setStatus(PricelistStatus status) {
        this.status = status;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
