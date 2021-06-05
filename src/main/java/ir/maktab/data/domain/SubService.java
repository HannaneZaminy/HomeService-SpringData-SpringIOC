package ir.maktab.data.domain;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SubService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Service service;
    @Column(unique = true, nullable = false)
    private String subServiceName;
    @Column(nullable = false)
    private Double basePrice;
    private String description;
    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE})
    private List<Specialist> specialists = new ArrayList<>();
    @OneToMany(mappedBy = "subService")
    private List<CustomerOrder> orders = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public SubService setId(Integer id) {
        this.id = id;
        return this;
    }

    public Service getService() {
        return service;
    }

    public SubService setService(ir.maktab.data.domain.Service service) {
        this.service = service;
        return this;
    }

    public String getSubServiceName() {
        return subServiceName;
    }

    public SubService setSubServiceName(String subServiceName) {
        this.subServiceName = subServiceName;
        return this;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public SubService setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SubService setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<ir.maktab.data.domain.Specialist> getSpecialists() {
        return specialists;
    }

    public SubService setSpecialists(List<ir.maktab.data.domain.Specialist> specialists) {
        this.specialists = specialists;
        return this;
    }

    public List<ir.maktab.data.domain.CustomerOrder> getOrders() {
        return orders;
    }

    public SubService setOrders(List<ir.maktab.data.domain.CustomerOrder> orders) {
        this.orders = orders;
        return this;
    }
}
