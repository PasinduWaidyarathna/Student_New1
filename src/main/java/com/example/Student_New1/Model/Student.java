package com.example.Student_New1.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Document(collection="students")
@Data
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String  department;
    private int yearOfEnrollment;
    /*public void setId(String id) {
        this.id = id;
    }*/
    // Getters and Setters
    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }
    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

}