package com.example.userform.webapp.entity;

public class Student {
    private String name;
    String course;
    int yearLevel;
    char classSection;

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
