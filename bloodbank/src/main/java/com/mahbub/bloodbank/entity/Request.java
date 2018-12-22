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


    @OneToOne
    @JoinColumn(name = "patient_id", nullable =false)
    private Patient patient;

}
