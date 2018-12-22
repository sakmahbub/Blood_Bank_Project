package com.mahbub.bloodbank.entity;

import javax.persistence.*;

@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "Hospital_name", unique = true, nullable = false)
    private String name;

    @Column (name = "phone_no", unique = true, nullable = false)
    private String phone;

    @Column (name = "email", unique = true, nullable = false)
    private String email;

    @Column (name = "address")
    private String address;



    @ManyToOne
    @JoinColumn(name = "blood_id", nullable =false)
    private Blood blood;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
