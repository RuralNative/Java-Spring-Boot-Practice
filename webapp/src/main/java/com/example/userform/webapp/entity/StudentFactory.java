package com.example.userform.webapp.entity;

public class StudentFactory {
    public Student createStudent(String name, String course, int yearLevel, char classSection) {
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setCourse(course);
        newStudent.setYearLevel(yearLevel);
        newStudent.setClassSection(classSection);
        return newStudent;
        return new Student(name, course, yearLevel, classSection);
    }
}
