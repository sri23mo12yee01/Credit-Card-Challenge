package com.Project.CreditCard.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("customers")
public class Customer {


//    public Customer(ObjectId id, int customerId, String firstName, String lastName, String country, char gender, String dob, String job) {
//        this.id = id;
//        this.customerId = customerId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.country = country;
//        this.gender = gender;
//        this.dob = dob;
//        this.job = job;
//    }

    @Id
    private ObjectId id;
    private int customerId;
    private String firstName;
    private String lastName;
    private String country;
    private char gender;
    @Field("DateOfBirth")
    private String dob;
    private String job;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId _id) {
        this.id = _id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String _country) {
        this.country = _country;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char _gender) {
        this.gender = _gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String _dob) {
        this.dob = _dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String _job) {
        this.job = _job;
    }
}
