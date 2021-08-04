package com.example.springbootsecurity4_04;

import javax.persistence.*;

@Entity
@Table(name = "role_table")
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "role")
    private String role;

    public Role(String username, String role){
        this.username=username;
        this.role=role;
    }

    public Role() {

    }
}
