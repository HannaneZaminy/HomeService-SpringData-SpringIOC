package ir.maktab.data.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String serviceName;
    @OneToMany(mappedBy = "service")
    private List<SubService> subServices=new ArrayList<>();
}
