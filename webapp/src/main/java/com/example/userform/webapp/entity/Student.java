package com.example.userform.webapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String course;
    private int yearLevel;
    private char classSection;

    protected Student() {}

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getCourse() {
        return this.course;
    }

    protected void setCourse(String course) {
        this.course = course;
    }

    protected int getYearLevel() {
        return this.yearLevel;
    }

    protected void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    protected char getClassSection() {
        return this.classSection;
    }

    protected void setClassSection(char classSection) {
        this.classSection = classSection;
    }
}
