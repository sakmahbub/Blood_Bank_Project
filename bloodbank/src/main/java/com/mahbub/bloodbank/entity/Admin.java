package com.mahbub.bloodbank.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "user_name", unique = true, nullable = false)
    private String userName;


    @Column (name = "password", unique = true, nullable = false)
    private String password;


    @Column (name = "blood_group", unique = true, nullable = false)
    private String bloodGroup;

    @Column (name = "full_name", unique = true,nullable = false)
    private String fullName;

    private String age;
    private String Sex;
    private String weight;
    private String address;
    private Date date;
    private String country;
    private String city;


    @Column (name = "Mobile", unique = true)
    private String mobile;

    @Column (name = "Email", unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable =false )
    private Role role;




}
