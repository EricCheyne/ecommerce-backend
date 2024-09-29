package com.cheyne.ecommerce_backend.service;

import com.cheyne.ecommerce_backend.api.model.*;
import com.cheyne.ecommerce_backend.model.*;
import com.cheyne.ecommerce_backend.model.dao.*;
import org.springframework.stereotype.*;

@Service
public class UserService {

    private LocalUserDAO localUserDAO;

    public UserService(LocalUserDAO localUserDAO) {
        this.localUserDAO = localUserDAO;
    }

    public LocalUser registerUser(RegistrationBody registrationBody) {
        LocalUser user = new LocalUser();
        user.setEmail(registrationBody.getEmail());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setUsername(registrationBody.getUsername);
        //TODO: Encrypt Password!!
        user.setPassword(registrationBody.getPassword());
        return localUserDAO.save(user);

    }
}
