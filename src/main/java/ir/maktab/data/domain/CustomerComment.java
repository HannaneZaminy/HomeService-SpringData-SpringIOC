package ir.maktab.data.domain;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class CustomerComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double score;
    @ManyToOne
    private Customer customer;
    private String comment;
    @OneToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder order;
    public Integer getId() {
        return id;
    }

    public CustomerComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public CustomerComment setScore(Double score) {
        this.score = score;
        return this;
    }

    public ir.maktab.data.domain.Customer getCustomer() {
        return customer;
    }

    public CustomerComment setCustomer(ir.maktab.data.domain.Customer customer) {
        this.customer = customer;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public CustomerComment setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
