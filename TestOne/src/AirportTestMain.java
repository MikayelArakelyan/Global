import model.Plane;
import service.PlaneService;

public class AirportTestMain {
    public static void main(String[] args) {
        Plane plane = new Plane("Boing", "Avstria", 2020, 5000, false, 54578, 30, 1500, 180, 225.5);
        Plane plane1 = new Plane("airbus", "rus", 2019, 4000, false, 66578, 40, 1001, 18, 22555.5);
        Plane plane2 = new Plane("Stinger", "US", 2009, 10000, true, 6657, 10, 5000, 1, 2255500);
        Plane[] planes = {plane, plane1, plane2};
        plane.task1();
        System.out.println("11111111111111111111111-----------------------");
        plane.task2();
        System.out.println("8888888888888888888888////////////////////////");
        System.out.println(plane.task3(plane, plane1));
        System.out.println(plane.task4(plane, plane1));
        System.out.println();
        plane.task5(plane, plane1, plane2);
        plane.task6(planes);
        System.out.println("----*************************-------------");
        plane.task7(planes);
    }
}