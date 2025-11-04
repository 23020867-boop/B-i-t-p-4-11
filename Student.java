package org.example;

public class Student {
    private String studentName;
    private String studentId;
    private String studentEmail;

    public Student(String studentName, String studentId, String studentEmail) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEmail = studentEmail;
    }

    public String toString() {
        return "Student Name: " + studentName + ", Student ID: " + studentId + ", Student Email: " + studentEmail;
    }
}
