package com.mahbub.bloodbank.entity;


import javax.persistence.*;

@Entity
@Table(name = "summary")
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToOne
    @JoinColumn(name = "donor_id", nullable =false )
    private Donor donor;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable =false )
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable =false )
    private Patient patient;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
