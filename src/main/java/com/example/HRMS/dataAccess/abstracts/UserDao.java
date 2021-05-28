package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entitites.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long>{

}
