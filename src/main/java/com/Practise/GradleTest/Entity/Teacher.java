package com.Practise.GradleTest.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TeacherInfo")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String address;

    public Teacher(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Teacher() {
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
