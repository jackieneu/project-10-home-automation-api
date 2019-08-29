package com.teamtreehouse.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teamtreehouse.core.BaseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@Entity
public class User extends BaseEntity {
    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    @NotNull
    private String name;

    @JsonIgnore
    private String password;

    @JsonIgnore
    private String[] roles;

    protected User() {
        super();
    }

    public User(String name, String password, String[] roles) {
        this();
        this.name = name;
        setPassword(password);
        this.roles = roles;
    }

    public void setPassword(String password) {
        this.password = PASSWORD_ENCODER.encode(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public boolean hasAdminRole() {
        List<String> roles = Arrays.asList(getRoles());
        return roles.contains("ROLE_ADMIN");
    }
}
