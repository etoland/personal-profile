package com.emtcodes.profilepagesystem.service;

import com.emtcodes.profilepagesystem.model.Profile;

import java.util.List;

public interface ProfileService {
    public Profile saveProfile(Profile profile);
    public List<Profile> getAllProfiles();
}
