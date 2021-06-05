package ir.maktab.data.domain;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
public class SpecialistOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder orders;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date SubmitOfferTime;
    @Column
    private Double offerPrice;
    @Column
    private Double durationOfWork;
    @Temporal(value = TemporalType.TIME)
    private Date startTime;

    public Integer getId() {
        return id;
    }

    public SpecialistOffer setId(Integer id) {
        this.id = id;
        return this;
    }

    public ir.maktab.data.domain.Specialist getSpecialist() {
        return specialist;
    }

    public SpecialistOffer setSpecialist(ir.maktab.data.domain.Specialist specialist) {
        this.specialist = specialist;
        return this;
    }

    public ir.maktab.data.domain.CustomerOrder getOrders() {
        return orders;
    }

    public SpecialistOffer setOrders(ir.maktab.data.domain.CustomerOrder orders) {
        this.orders = orders;
        return this;
    }

    public Date getSubmitOfferTime() {
        return SubmitOfferTime;
    }

    public SpecialistOffer setSubmitOfferTime(Date submitOfferTime) {
        SubmitOfferTime = submitOfferTime;
        return this;
    }

    public Double getOfferPrice() {
        return offerPrice;
    }

    public SpecialistOffer setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
        return this;
    }

    public Double getDurationOfWork() {
        return durationOfWork;
    }

    public SpecialistOffer setDurationOfWork(Double durationOfWork) {
        this.durationOfWork = durationOfWork;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public SpecialistOffer setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

}
