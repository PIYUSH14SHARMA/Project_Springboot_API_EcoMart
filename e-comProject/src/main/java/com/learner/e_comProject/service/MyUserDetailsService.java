package com.learner.e_comProject.service;

import com.learner.e_comProject.model.MyUserPrincipal;
import com.learner.e_comProject.model.Users;
import com.learner.e_comProject.repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);

        if (user == null) {
            System.out.println("user not found ");
            throw new UsernameNotFoundException("user not found");
        }
        return new MyUserPrincipal(user);
    }
}
