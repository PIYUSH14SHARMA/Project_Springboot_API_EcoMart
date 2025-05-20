package com.learner.e_comProject.repo;

import com.learner.e_comProject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer>{
    Users findByUsername(String username);
}
