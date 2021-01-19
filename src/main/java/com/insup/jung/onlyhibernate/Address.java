package com.insup.jung.onlyhibernate;

import javax.persistence.Embeddable;

//Entity에 속한, 종속적인 것을 Value 타입이라고 보면 됨
@Embeddable
public class Address {
    //@Column 생략
    private String street;

    private String city;

    private String state;

    private String zipCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
