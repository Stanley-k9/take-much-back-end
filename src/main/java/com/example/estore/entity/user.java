package com.example.estore.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "user_tbl")

public class user {

    @Id
    @GeneratedValue
    private int user_id;


    private @NotNull String username;
    private @NotNull String password;
    private @NotNull String email;
    private String first_name;
    private String last_name;
    private int age;
    private int role;
    private String type;
    private @NotNull boolean logged_in;
    private String photo_url;

    @ManyToOne
    @NotNull
    private address address_id ;

    public user() {
    }

    public int getUser_id() {
        return user_id;
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



    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getFirst_name() {
        return first_name;
    }



    public void setLast_name(String last_name) {
        this.last_name  = last_name;
    }
    public String getLast_name() {
        return last_name;
    }


    public void setRole(int role) {
        this.role = role;
    }
    public int getRole() {
        return role;
    }


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }




    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }
    public String getPhoto_url() {
        return photo_url;
    }



    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged_in() {
        return logged_in;
    }
    public void setLogged_in(boolean logged_in) {
        this.logged_in = logged_in;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user)) return false;
        user user = (user) o;
        return Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, email, password,
                logged_in);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + user_id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", logged_in=" + logged_in +
                '}';
    }



}