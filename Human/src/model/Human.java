package model;

public class Human {
    private String name;
    private String surName;
    private int age;

    public Human(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name : "+ name);
        System.out.println("SurName : "+ surName);
        System.out.println("Age : "+ age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
