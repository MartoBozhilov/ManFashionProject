package com.manfashion.manfashion.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserRegistrationDTO {

    @Email
    @NotEmpty
    @NotNull(message = "Email cannot be empty!")
    private String email;

//    private String username;
//
//    @NotNull
//    @NotEmpty(message = "Password cannot be empty!")
//    private String password;
//
//    @NotNull
//    @NotEmpty(message = "Confirm password cannot be empty!")
//    private String confirmPassword;
//
//    @NotNull
//    @NotEmpty(message = "First name cannot be empty!")
//    private String firstName;
//
//    @NotNull
//    @NotEmpty(message = "Last name cannot be empty!")
//    private String lastName;
//
//    @NotNull
//    @NotEmpty(message = "Phone number cannot be empty!")
//    private String phoneNumber;

    public UserRegistrationDTO() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getConfirmPassword() {
//        return confirmPassword;
//    }
//
//    public void setConfirmPassword(String confirmPassword) {
//        this.confirmPassword = confirmPassword;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}
