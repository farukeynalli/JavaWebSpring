package com.example.deneme2.resource;

import java.util.List;

public class ProductRequest {

    private String[] gelenMetin;
    private String birlesen_metin;
    private String saniye;

    public String getSaniye() {
        return saniye;
    }

    public void setSaniye(String saniye) {
        this.saniye = saniye;
    }

    public ProductRequest(String saniye) {
        this.saniye = saniye;
    }

    public ProductRequest() {
    }

    public ProductRequest(String[] gelenMetin, String birlesen_metin, String saniye) {
        this.gelenMetin = gelenMetin;
        this.birlesen_metin = birlesen_metin;
        this.saniye = saniye;
    }

    public String[] getGelenMetin() {
        return gelenMetin;
    }

    public void setGelenMetin(String[] gelenMetin) {
        this.gelenMetin = gelenMetin;
    }

    public String getBirlesen_metin() {
        return birlesen_metin;
    }

    public void setBirlesen_metin(String birlesen_metin) {
        this.birlesen_metin = birlesen_metin;
    }
}
