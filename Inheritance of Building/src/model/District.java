package model;

public class District extends AdministrativeRegion {

    private String districtName;
    private String address;
    private int swimmingPoolCount;
    private int playground;
    private int shop;
    private boolean GreenArea;

    public District(String name, double areaInSquareMeter, int kindergarten, int school, String districtName,
                    String address, int swimmingPoolCount, int playground, int shop, boolean greenArea) {
        super(name, areaInSquareMeter, kindergarten, school);
        this.districtName = districtName;
        this.address = address;
        this.swimmingPoolCount = swimmingPoolCount;
        this.playground = playground;
        this.shop = shop;
        GreenArea = greenArea;
    }

    public District(String name, double areaInSquareMeter, int kindergarten, int school) {
        super(name, areaInSquareMeter, kindergarten, school);
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSwimmingPoolCount() {
        return swimmingPoolCount;
    }

    public void setSwimmingPoolCount(int swimmingPoolCount) {
        this.swimmingPoolCount = swimmingPoolCount;
    }

    public int getPlayground() {
        return playground;
    }

    public void setPlayground(int playground) {
        this.playground = playground;
    }

    public int getShop() {
        return shop;
    }

    public void setShop(int shop) {
        this.shop = shop;
    }

    public boolean isGreenArea() {
        return GreenArea;
    }

    public void setGreenArea(boolean greenArea) {
        GreenArea = greenArea;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("District name: " + districtName);
        System.out.println("Address: " + address);
        System.out.println("Swimming pool count: " + swimmingPoolCount);
        System.out.println("Playground: " + playground);
        System.out.println("Shop: " + shop);
        System.out.println("Green Area: " + isGreenArea());
    }
}
