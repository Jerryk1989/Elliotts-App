package com.Elliotts.Elliotts.domain;

import javax.persistence.*;

/**
 * Created by Jerry on 8/10/2017.
 */
@Entity
public class Inquiries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Version
    private Integer Version;

    String firstName;
    String lastName;
    String emailAddress;
    int phoneNumber;
    String city;
    String state;
    int zipCode;
    String message;

    public Inquiries() {

    }

    public Inquiries(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Inquiries(int id, String firstName, String lastName, String emailAddress, int phoneNumber, String city, String state, int zipCode, String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.message = message;
    }



    //region getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //endregion
}
