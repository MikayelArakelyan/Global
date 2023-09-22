package model;

public class Teacher extends Human {
    private int experience;
    private double salary;

    public Teacher(String name, String surName, int age, int experience, double salary) {
        super(name, surName, age);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Experience : " + experience);
        System.out.println("Salary : " + salary);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
