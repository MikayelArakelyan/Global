import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("Enter Surname: ");
        String surname=scanner.next();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter StudentID: ");
        String studentId = scanner.next();
        System.out.println("Enter Faculty: ");
        String faculty = scanner.next();

        Student s1 = new Student(name,surname,age,studentId,faculty);
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        s1.printInfo();
    }
}