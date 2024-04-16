package com.emtcodes.profilepagesystem.controller;

import com.emtcodes.profilepagesystem.model.Profile;
import com.emtcodes.profilepagesystem.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping("/add")
    public String add(@RequestBody Profile profile) {
        profileService.saveProfile(profile);
        return "New Profile is Added Successfully";
    }

    @GetMapping("/getAll")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }
}
