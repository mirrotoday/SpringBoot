package com.example.demojpa.repository;

import com.example.demojpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Rpository 等价于 DAO
public interface UserRepository extends JpaRepository<User,Integer> {

}
