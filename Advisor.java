package org.example;

public class Advisor {
    private String advisorName;
    private String advisorEmail;

    public Advisor(String advisorName, String advisorEmail) {
        this.advisorName = advisorName;
        this.advisorEmail = advisorEmail;
    }

    public String toString() {
        return "Advisor Name: " + advisorName + ", Advisor Email: " + advisorEmail;
    }
}
