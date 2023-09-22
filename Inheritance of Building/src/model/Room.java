package model;

public class Room extends Apartment {
    private int window;
    private String furniture;
    private int balcony;
    private boolean ventilation;

    public Room(String name, double areaInSquareMeter, int kindergarten, int school) {
        super(name, areaInSquareMeter, kindergarten, school);
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public int getBalcony() {
        return balcony;
    }

    public void setBalcony(int balcony) {
        this.balcony = balcony;
    }

    public boolean isVentilation() {
        return ventilation;
    }

    public void setVentilation(boolean ventilation) {
        this.ventilation = ventilation;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Windows: " + window);
        System.out.println("Furniture type: " + furniture);
        System.out.println("Balcony: " + balcony);
        System.out.println("Ventilation: " + ventilation);
    }
}
