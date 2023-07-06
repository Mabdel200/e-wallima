package com.mycompany.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_users;

    @Column(nullable = false, name="noms")
    private String  noms;

    @Column(nullable = false, unique = true, length = 50)
    private String  email;

    @Column(length = 25, nullable = false)
    private Integer  num_tel;

    @Column(length = 15, nullable = false)
    private String  password;

    @Column(length = 25, nullable = false)
    private String  login;

    @Column(length = 5, nullable = false)
    private Integer  role_id;

    public User() {
    }

    public User(long id_users, String noms, String email, Integer num_tel, String password, String login, Integer role_id) {
        this.id_users = id_users;
        this.noms = noms;
        this.email = email;
        this.num_tel = num_tel;
        this.password = password;
        this.login = login;
        this.role_id = role_id;
    }

    public long getId_users() {
        return id_users;
    }

    public void setId_users(long id_users) {
        this.id_users = id_users;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(Integer num_tel) {
        this.num_tel = num_tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    //Partie controls User
    public boolean isAccountNonExpired() {
        return false;
    }

    public boolean isAccountNonLocked() {
        return false;
    }

    public boolean isCredentialsNonExpired() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }



    @Override
    public String toString() {
        return "User{" +
                "id_users=" + id_users +
                ", noms='" + noms + '\'' +
                ", email='" + email + '\'' +
                ", num_tel=" + num_tel +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}
