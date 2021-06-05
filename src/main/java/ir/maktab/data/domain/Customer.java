package ir.maktab.data.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<CustomerOrder> orders=new ArrayList<>();
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<CustomerComment> comments=new ArrayList<>();

    public List<CustomerOrder> getOrders() {
        return orders;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Customer setOrders(List<CustomerOrder> orders) {
        this.orders = orders;
        return this;
    }

    public Customer setComments(List<CustomerComment> comments) {
        this.comments = comments;
        return this;
    }

    public List<CustomerComment> getComments() {
        return comments;
    }

}
