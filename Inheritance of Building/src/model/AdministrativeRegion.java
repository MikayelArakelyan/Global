package model;

import java.util.Scanner;

public class AdministrativeRegion {
    private String name;
    private double areaInSquareMeter;
    private int kindergarten;

    private int school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaInSquareMeter() {
        return areaInSquareMeter;
    }

    public void setAreaInSquareMeter(double areaInSquareMeter) {
        this.areaInSquareMeter = areaInSquareMeter;
    }

    public int getKindergarten() {
        return kindergarten;
    }

    public void setKindergarten(int kindergarten) {
        this.kindergarten = kindergarten;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public AdministrativeRegion(String name, double areaInSquareMeter, int kindergarten, int school) {
        this.name = name;
        this.areaInSquareMeter = areaInSquareMeter;
        this.kindergarten = kindergarten;
        this.school = school;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Area in Square Meter : " + areaInSquareMeter);
        System.out.println("Kindergarten : " + kindergarten);
        System.out.println("School : " + school);
    }

    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Administrative Region Name: ");
        String name = scanner.next();
        System.out.println("Enter Administrative Region Size In Square Kilometres: ");
        double areaInSquareMeter = scanner.nextDouble();
        System.out.println("Enter Kindergartens count: ");
        int kindergarten = scanner.nextInt();
        System.out.println("Enter Schools number: ");
        int school = scanner.nextInt();

    }
}
