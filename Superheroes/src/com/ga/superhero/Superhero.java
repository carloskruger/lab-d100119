package com.ga.superhero;

public class Superhero {

String name;
String secretIdentity;
String placeOfOrigin;

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }
}
