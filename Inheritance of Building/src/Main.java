import model.AdministrativeRegion;
import model.Building;
import model.District;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AdministrativeRegion administrativeRegion = new AdministrativeRegion("Ajapnyak",23.7,6,8);
        administrativeRegion.printInfo();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        District district = new District("ajapnyak",123,6,8,"Shinararner",
                "Arakelyan 32",2,8,50,true);
        district.printInfo();
        System.out.println("-----------------------------------------------------");
        Building building = new Building("Ajapnyak", 25, 8,9,"kvartal",
                "Shinararner",2,9,99,true, 32,3,false,34,1,false);
building.printInfo();
        System.out.println("*****************************************************");

        AdministrativeRegion admin1 = new AdministrativeRegion(name,area);

        admin1.scanner();
    }
}