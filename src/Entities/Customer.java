package Entities;

import Abstracts.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Customer implements Entity {
    private String  customerId;
    private String fullName;
    private String surname;
    private String nationalId;
    private LocalDate dateOfBirth;

    public Customer(){ }

    public Customer(String customerId, String fullName, String surname, String nationalId, LocalDate dateOfBirth) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.surname = surname;
        this.nationalId = nationalId;
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
