package com.mahbub.bloodbank.entity;


import javax.persistence.*;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "quantity")
    private String quantity;


    @ManyToOne
    @JoinColumn(name = "patient_id", nullable =false)
    private Patient patient;


    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable =false)
    private Hospital hospital;

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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
