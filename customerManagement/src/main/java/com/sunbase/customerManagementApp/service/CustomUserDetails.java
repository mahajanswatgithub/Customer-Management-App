package com.sunbase.customerManagementApp.service;

import com.sunbase.customerManagementApp.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetails implements UserDetailsService {

    @Autowired
    private IUserRepo iUserRepo;

    //Load user from database

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return iUserRepo.getByuserEmail(username).orElseThrow(() -> new RuntimeException("User not found!!"));
    }
}
