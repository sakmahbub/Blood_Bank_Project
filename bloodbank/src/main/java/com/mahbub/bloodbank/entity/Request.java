package com.mahbub.bloodbank.entity;


import javax.persistence.*;

@Entity
@Table(name = "req")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column (name = "hospital_patient_name")
    private String name;

    @Column (name = "blood_group", nullable =false)
    private String bloodgroup;

    @Column (name = "quantity")
    private String quantity;

    @Column (name = "phone_no", unique = true, nullable = false)
    private String phone;

    @Column (name = "email", unique = true, nullable = false)
    private String email;

    @Column (name = "address")
    private String address;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
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
}
