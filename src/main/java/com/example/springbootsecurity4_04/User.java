package com.example.springbootsecurity4_04;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_table")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    @Size (min=3)
    private String username;

    @Column(name="email")
    @NotEmpty
    @NotNull
    private String email;

    @Column(name="password")
    private String password;

    @Column (name="first_name")
    @NotNull
    @NotEmpty
    private String firstName;

    @Column (name="last_name")
    @NotNull
    @NotEmpty
    private String lastName;

    @Column(name="enabled")
    private boolean enabled;



    public User(@Size(min=3) String username,
                @NotEmpty @NotNull email,
                @NotEmpty @NotNull String password,
                @NotEmpty @NotNull firstName,
                @NotEmpty @NotNull lastName, boolean enabled) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;

}


