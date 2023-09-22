package model;

public class Building extends District {
    private int number;
    private int floor;
    private boolean toTheSun;
    private double surface;
    private int numberOfRoom;
    private boolean centralizedHeating;

    public Building(String name, double areaInSquareMeter, int kindergarten, int school) {
        super(name, areaInSquareMeter, kindergarten, school);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Building(String name, double areaInSquareMeter, int kindergarten, int school, String districtName,
                    String address, int swimmingPoolCount, int playground, int shop, boolean greenArea, int number,
                    int floor, boolean toTheSun, double surface, int numberOfRoom, boolean centralizedHeating) {
        super(name, areaInSquareMeter, kindergarten, school, districtName, address, swimmingPoolCount, playground, shop, greenArea);
        this.number = number;
        this.floor = floor;
        this.toTheSun = toTheSun;
        this.surface = surface;
        this.numberOfRoom = numberOfRoom;
        this.centralizedHeating = centralizedHeating;
    }

    public Building(String name, double areaInSquareMeter, int kindergarten, int school, int number, int floor,
                    boolean toTheSun, double surface, int numberOfRoom, boolean centralizedHeating) {
        super(name, areaInSquareMeter, kindergarten, school);
        this.number = number;
        this.floor = floor;
        this.toTheSun = toTheSun;
        this.surface = surface;
        this.numberOfRoom = numberOfRoom;
        this.centralizedHeating = centralizedHeating;
    }

    public boolean isToTheSun() {
        return toTheSun;
    }

    public void setToTheSun(boolean toTheSun) {
        this.toTheSun = toTheSun;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public boolean isCentralizedHeating() {
        return centralizedHeating;
    }

    public void setCentralizedHeating(boolean centralizedHeating) {
        this.centralizedHeating = centralizedHeating;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number: " + number);
        System.out.println("Floor: " + floor);
        System.out.println("To the sun: " + toTheSun);
        System.out.println("Surface in meter square: " + surface);
        System.out.println("Number of room: " + numberOfRoom);
        System.out.println("Heating method: " + centralizedHeating);
    }
}