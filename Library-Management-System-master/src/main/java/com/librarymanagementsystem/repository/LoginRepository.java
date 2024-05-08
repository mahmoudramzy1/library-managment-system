package com.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.librarymanagementsystem.entity.Users;

public interface LoginRepository extends JpaRepository<Users, Integer> {

}
