package com.hibernanteapp.hibernateapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "users_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(length = 30, name = "user_name")
    private String name;
    private String age;
    private String address;
    private String city;
    @Column(name = "STATUS")
    private Boolean isOpen;
    private double salary;
    // @Column(name = "Reg_Date")
    // @Temporal(TemporalType.DATE)
    // private Date addedDate;
    @Lob
    private byte[] image;
    @Transient
    private Double x;

    public double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public User(int id, String name, String age, String address, String city, Boolean isOpen, double salary,
            byte[] image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.isOpen = isOpen;
        this.salary = salary;

        this.image = image;
    }

    // Default Constructor
    public User() {
    }

    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

}
