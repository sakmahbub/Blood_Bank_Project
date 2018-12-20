package com.mahbub.bloodbank.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name ="user_name", unique = true, nullable = false)
    private String userName;

    @Column(name ="email", unique = true)
    private String email;

    @Column(name ="mobile", unique = true)
    private String mobile;

    @Column(name ="firstName", unique = true)
    private String firstName;

    @Column(name ="lastName", unique = true)
    private String lastName;

    @Column(name ="regiDate", unique = true)
    private Date registrationDate;

    @ManyToOne
    @JoinColumn(name = "role_name", nullable = false)
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
