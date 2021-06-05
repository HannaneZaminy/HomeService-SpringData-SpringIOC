package ir.maktab.data.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String street;
    private Long zipCod;

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public Long getZipCod() {
        return zipCod;
    }

    public Address setZipCod(Long zipCod) {
        this.zipCod = zipCod;
        return this;
    }
}
