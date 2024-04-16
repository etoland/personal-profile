package com.emtcodes.profilepagesystem.repository;

import com.emtcodes.profilepagesystem.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
