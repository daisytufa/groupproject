package com.example.groupproject;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    // define our fields

    // define constructors

    // define getter setters

    // define tostring

    // annotate fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    //@OneToMany(cascade=CascadeType.ALL)
    
    public User() {

    }

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username is " + username;
    }


}