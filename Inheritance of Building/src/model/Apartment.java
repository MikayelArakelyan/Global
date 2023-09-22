package model;

public class Apartment extends Building {
    private String type;
    private int parkingLot;
    private int floor;
    private int entry;
    private boolean yard;

    public Apartment(String name, double areaInSquareMeter, int kindergarten, int school) {
        super(name, areaInSquareMeter, kindergarten, school);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(int parkingLot) {
        this.parkingLot = parkingLot;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public boolean isYard() {
        return yard;
    }

    public void setYard(boolean yard) {
        this.yard = yard;
    }
}
