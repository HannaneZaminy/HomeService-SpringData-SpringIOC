package ir.maktab.data.domain;

import ir.maktab.data.enums.UserStatus;

import javax.persistence.*;
import java.util.Date;
@MappedSuperclass
public class User {
    private String fullName;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dayAndTime;
    private double wallet;
    @Enumerated(value = EnumType.STRING)
    private UserStatus userStatus;

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getDayAndTime() {
        return dayAndTime;
    }

    public User setDayAndTime(Date dayAndTime) {
        this.dayAndTime = dayAndTime;
        return this;
    }

    public double getWallet() {
        return wallet;
    }

    public User setWallet(double wallet) {
        this.wallet = wallet;
        return this;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public User setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }
}
