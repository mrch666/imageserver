package ru.insnstrumentstore.imageserver.entity;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ProduktImage {
    @Id @GeneratedValue
    Long id;
//    @NonNull
    String brand;
//    @NonNull
    String art;
    String url;
    String dest;
    String filename;
    String extension;
    String basename;
    Long size;
}