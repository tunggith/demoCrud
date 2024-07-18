package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Accounts")
@Entity
public class AccoutEntity{
    @Id
    @Column(name = "Username")
    private String userName;
    @Column(name = "Password")
    private String passWord;
    @Column(name = "Fullname")
    private String fullName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Photo")
    private String Photo;

}