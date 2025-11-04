package org.example;

public class Teacher {
    private String teacherName;
    private String teacherId;
    private String teacherEmail;
    private String title;

    public Teacher(String teacherName, String teacherId, String teacherEmail, String title) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.teacherEmail = teacherEmail;
        this.title = title;
    }

    public String toString() {
        return "Teacher Name: " + teacherName + ", Teacher ID: " + teacherId + ", Teacher Email: " + teacherEmail + ", Title: " + title;
    }
}
