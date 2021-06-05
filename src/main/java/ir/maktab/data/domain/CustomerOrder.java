package ir.maktab.data.domain;

import ir.maktab.data.enums.OrderStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerOrderId;
    private double price;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTimOfOrderRegistration;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTimeOfExecution;
    private String description;
    @ManyToOne
    private Customer customer;
    private Address address;
    private OrderStatus orderStatus;
    @OneToMany(mappedBy = "customerOrder")
    private List<SpecialistOffer> offers = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public CustomerOrder setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CustomerOrder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public CustomerOrder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public List<SpecialistOffer> getOffers() {
        return offers;
    }

    public CustomerOrder setOffers(List<SpecialistOffer> offers) {
        this.offers = offers;
        return this;
    }

    public CustomerOrder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Date getDateAndTimOfOrderRegistration() {
        return dateAndTimOfOrderRegistration;
    }

    public CustomerOrder setDateAndTimOfOrderRegistration(Date dateAndTimOfOrderRegistration) {
        this.dateAndTimOfOrderRegistration = dateAndTimOfOrderRegistration;
        return this;
    }

    public Date getDateAndTimeOfExecution() {
        return dateAndTimeOfExecution;
    }

    public CustomerOrder setDateAndTimeOfExecution(Date dateAndTimeOfExecution) {
        this.dateAndTimeOfExecution = dateAndTimeOfExecution;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CustomerOrder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Address getAddress() {
        return address;
    }


    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public CustomerOrder setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

}
