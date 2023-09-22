package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hour;
    private boolean military;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2021) {
            this.year = year;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 10000) {
            this.hour = hour;
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 10000 && weight <= 160000) {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }

    public Plane(String model, String country, int year, int hour, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hour = hour;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public void task1() {
        System.out.println("Name of the plane: " + model);
        System.out.println("Country the plane belong to: " + country);
        System.out.println("Year of publishing: " + year);
        System.out.println("Hours in air: " + hour);
        System.out.println("Is Military: " + (military ? "Yes" : "No"));
        System.out.println("Weight of plane: " + weight + " KG");
        System.out.println("The maximum extent across the wings of an aircraft: " + wingspan + " Metre");
        System.out.println("Maximal speed per hour: " + topSpeed + " km/h");
        System.out.println("Number of seats: " + seats);
        System.out.println("Cost of the plane ticket: " + cost + " $");
    }

    public void task2() {
        if (this.military == true) {
            System.out.println("Name of the plane: " + model + "\n" +
                    "Country the plane belong to: " + country);
        } else {
            System.out.println("Cost of the plane ticket: " + cost + " $" + "\n" +
                    "Maximal speed per hour: " + topSpeed + " km/h");
        }
    }

    public Plane task3(Plane plane1, Plane plane2) {
        if (plane1.getYear() > plane2.getYear()) {
            return plane1;
        } else return plane2;
    }

    public String task4(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() >= plane2.getWingspan()) {
            return plane1.getModel();
        } else {
            return plane2.getModel();
        }
    }

    public void task5(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            System.out.println(plane1.getCountry());
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() < plane3.getSeats()) {
            System.out.println(plane2.getCountry());
        } else {
            System.out.println(plane3.getCountry());
        }
    }

    public void task6(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() == false) {
                planes[i].task1();
                System.out.println("--------------------");
            } else {
                System.out.println();
            }
        }
    }

    public void task7(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() == true) {
                if (planes[i].getHour() > 100) {
                    planes[i].task1();
                }
            }
        }
    }
}

