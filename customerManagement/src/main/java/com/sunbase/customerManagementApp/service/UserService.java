package com.sunbase.customerManagementApp.service;

import com.sunbase.customerManagementApp.model.User;
import com.sunbase.customerManagementApp.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    @Autowired
    PasswordEncoder encode;

    //Create user
    public String createUser(User user) {
        //Check if user with same email  exists or not
        Optional<User> check = userRepo.getByuserEmail(user.getUserEmail());

        if(check.isPresent())
            return "User email already exists";
        user.setUserPassword(encode.encode(user.getUserPassword()));
        userRepo.save(user);

        return "User created";
    }


    //Delete user
    public String deleteUser(Integer id) {
        if(userRepo.findById(id).isEmpty())
            return "User with Id not found";
        userRepo.deleteById(id);

        return "User deleted";
    }


    //Get the list of users
    public List<User> getUsers() {
        return userRepo.findAll();
    }


    //Update user profile
    public String updateProfile(User user, String userEmail, String userPassword) {
        //Firstly get the user by email
        User existing = userRepo.getByuserEmail(userEmail).orElse(null);

        if(existing == null)
            return "User with email id does not exists";

        if(!existing.getUserPassword().equals(userPassword))
            return "User password didn't match";

        //Now check if username and email to be updated are available or not
        if(user.getFirstName() != null)
            existing.setFirstName(user.getFirstName());

        if(user.getUserEmail() != null)
        {
            if(userRepo.getByuserEmail(user.getUserEmail()).isPresent())
                return "UserEmail already exists";
            else
                existing.setUserEmail(user.getUserEmail());
        }

        if(user.getLastName() != null)
            existing.setLastName(user.getLastName());

        if(user.getUserPassword() != null)
            existing.setUserPassword(user.getUserPassword());

        if(user.getAddress() != null)
            existing.setAddress(user.getAddress());

        if(user.getCity() != null)
            existing.setCity(user.getCity());

        if(user.getState() != null)
            existing.setState(user.getState());

        if(user.getStreet() != null)
            existing.setState(user.getState());

        if(user.getPhoneNumber() != null)
            existing.setPhoneNumber(user.getPhoneNumber());

        userRepo.save(existing);

        return "User details updated";

    }

    //Get user by Id
    public User getUser(Integer id) {
        return userRepo.findById(id).orElse(null);
    }
}
