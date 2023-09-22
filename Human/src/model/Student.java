package model;

public class Student extends Human {
    private String studentId;
    private String faculty;

    public Student(String name, String surName, int age, String studentId, String faculty) {
        super(name,surName,age);
        this.studentId = studentId;
        this.faculty = faculty;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("StudentID : " + studentId);
        System.out.println("Faculty : " + faculty);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
