package com.mahbub.bloodbank.controller;

import com.mahbub.bloodbank.entity.Donor;
import com.mahbub.bloodbank.entity.Role;
import com.mahbub.bloodbank.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/donor/")
public class DonorController {


    @Autowired
    private RoleRepo repo;

    @GetMapping(value = "add-donor.jsf")
    public String displayDonor(Model model) {
        model.addAttribute("obj", new Donor());
        return "donor/add-donor";
    }

    @GetMapping(value = "list.jsf")
    public String getDonorList(Model model) {
        model.addAttribute("obj", new Donor());
        return "donor/add-donor";
    }


    @PostMapping(value = "add-donor.jsf")
    public String saveDonor(@Valid Role obj, BindingResult result, Model model) {
        if (obj != null) {
            repo.save(obj);
            model.addAttribute("successMsg", "Success");
            model.addAttribute("obj", new Role());
        }
        return "donor/add-donor";
    }
}