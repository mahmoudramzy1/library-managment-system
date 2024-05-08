package com.librarymanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagementsystem.entity.Users;
import com.librarymanagementsystem.repository.LoginRepository;


@Service
public class UsersService {

    @Autowired
    private LoginRepository usersrepo;

    public Users getUser() {
        Optional<Users> user = this.usersrepo.findById(1);
        return user.orElse(new Users());
    }
}
