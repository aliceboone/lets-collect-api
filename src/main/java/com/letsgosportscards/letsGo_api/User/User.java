package com.letsgosportscards.letsGo_api.User;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1 )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "user-sequence")

    private Long id;
    private String username;
    private String email;
    private String password;
    private String type;

    public User() {
    }

    public User(Long id,
                String username,
                String email,
                String password,
                String type) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
