import model.Student;
import model.Teacher;

public class Test {
    public static void main(String[] args) {
        System.out.println("//////////////////////////////////");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        Student student= new Student("Mikayel", "Arakelyan",34,"AB123456","Cyber");
        student.setName("Vazgen");
        student.setSurName("Grigoryan");
        student.setAge(23);
        student.setStudentId("AQ741852");
        student.setFaculty("Cyber");
        student.printInfo();
        System.out.println("//////////////////////////////////");
        Teacher teacher = new Teacher("Vigen","Gevorgyan",33,4,45612.365);
        teacher.setName("Vigen");
        teacher.setSurName("Gevorgyan");
        teacher.setAge(34);
        teacher.setExperience(4);
        teacher.setSalary(1500.1);
        teacher.printInfo();
        System.out.println("//////////////////////////////////");
    }
}
