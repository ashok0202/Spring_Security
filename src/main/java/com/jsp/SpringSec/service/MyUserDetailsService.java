package com.jsp.SpringSec.service;

import com.jsp.SpringSec.model.UserPrinciple;
import com.jsp.SpringSec.model.Users;
import com.jsp.SpringSec.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user=userRepo.findByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrinciple(user);
    }
}
