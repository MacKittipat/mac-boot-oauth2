package com.mackittipat.authorizationserver.service;

import com.mackittipat.authorizationserver.model.UserModel;
import com.mackittipat.authorizationserver.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserModel userModel = userRepository.findByUsername(username);
        if(userModel == null) {
            log.warn("User {} does not exist", username);
            return null;
        }

        return new User(
                userModel.getUsername(),
                userModel.getPassword(),
                new ArrayList<>());
        }
}
