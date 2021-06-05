package ir.maktab.data.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Specialist extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer specialistId;
    @Lob
    @Column(columnDefinition="BLOB")
    private String picture;
    private double Score;
    @ManyToMany(mappedBy = "specialists")
    private List<SubService> services=new ArrayList<>();
    @OneToMany(
            mappedBy = "specialist",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<SpecialistOffer> offers=new ArrayList<>();
    @OneToMany(
            mappedBy = "specialist",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<SpecialistComment> comments=new ArrayList<>();
    @OneToMany(
            mappedBy = "specialist",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<CustomerOrder> orders=new ArrayList<>();
    public Integer getSpecialistId() {
        return specialistId;
    }

    public Specialist setSpecialistId(Integer specialistId) {
        this.specialistId = specialistId;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public Specialist setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public double getScore() {
        return Score;
    }

    public Specialist setScore(double score) {
        Score = score;
        return this;
    }

    public List<SubService> getServices() {
        return services;
    }

    public Specialist setServices(List<SubService> services) {
        this.services = services;
        return this;
    }

    public List<SpecialistOffer> getOffers() {
        return offers;
    }

    public Specialist setOffers(List<SpecialistOffer> offers) {
        this.offers = offers;
        return this;
    }

    public List<SpecialistComment> getComments() {
        return comments;
    }

    public Specialist setComments(List<SpecialistComment> comments) {
        this.comments = comments;
        return this;
    }

    public List<CustomerOrder> getOrders() {
        return orders;
    }

    public Specialist setOrders(List<CustomerOrder> orders) {
        this.orders = orders;
        return this;
    }
}
