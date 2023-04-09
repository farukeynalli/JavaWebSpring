package com.example.deneme2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("yazlabProje")
public class Product {

    @Id
    private String id;
    private List<String> gelenMetin;
    private String saniye;
    private String birlesen_metin;

    public String getSaniye() {
        return saniye;
    }

    public void setSaniye(String saniye) {
        this.saniye = saniye;
    }

    public Product(String saniye) {
        this.saniye = saniye;
    }




    public Product() {
    }

    public Product(String id, List<String> gelenMetin, String saniye, String birlesen_metin) {
        this.id = id;
        this.gelenMetin = gelenMetin;
        this.saniye = saniye;
        this.birlesen_metin = birlesen_metin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGelenMetin() {
        return gelenMetin;
    }

    public void setGelenMetin(List<String> gelenMetin) {
        this.gelenMetin = gelenMetin;
    }

    public String getDescription() {
        return birlesen_metin;
    }

    public void setBirlesen_metin(String birlesen_metin) {
        this.birlesen_metin = birlesen_metin;
    }
}
