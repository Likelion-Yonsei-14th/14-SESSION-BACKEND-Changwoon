package com.example.demo.member;

public class Member {
    private String n;
    private String grade;

    public Member(String name, String grade) {
        this.n = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
