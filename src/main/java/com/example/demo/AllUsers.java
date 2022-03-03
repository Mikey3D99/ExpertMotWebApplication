package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity()
public class AllUsers {

    @Id //make it a primary key
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public AllUsers(Long id,
                String firstName,
                String lastName,
                String email,
                String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
