package com.librarymanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
@Table(name = "userdata")
public class Users {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    @Column(name = "userName", length = 50, nullable = false)
    private String userName;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    public Users(String name, String password) {
        this.userName = name;
        this.password = password;
    }
}
