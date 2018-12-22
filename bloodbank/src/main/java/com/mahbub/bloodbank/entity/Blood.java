package com.mahbub.bloodbank.entity;

import javax.persistence.*;

@Entity
@Table(name = "blood")
public class Blood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "blood_type", unique = true, nullable = false)
    private String bloodName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBloodName() {
        return bloodName;
    }

    public void setBloodName(String bloodName) {
        this.bloodName = bloodName;
    }
}
