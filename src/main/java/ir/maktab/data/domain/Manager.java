package ir.maktab.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;
    private String password;
    private String name;
    private String family;

    public Integer getId() {
        return id;
    }

    public Manager setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Manager setUserName(String username) {
        this.userName = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Manager setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Manager setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Manager setFamily(String family) {
        this.family = family;
        return this;
    }
}
