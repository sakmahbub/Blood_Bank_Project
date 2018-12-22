package com.mahbub.bloodbank.entity;


import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "name", unique = true, nullable = false)
    private String name;

    @Column (name = "phone_no", unique = true, nullable = false)
    private String phone;

    @Column (name = "Hospital_name")
    private String hospital;



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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }



    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
