package OOP.Building;
public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding residentialBuilding = new ResidentialBuilding("123 Main St", 5, 2000, 10);
        residentialBuilding.setRentPerApartment(1000);
        residentialBuilding.displayInfo();
        System.out.println();
        CommercialBuilding commercialBuilding = new CommercialBuilding("456 Elm St", 10, 5000, 2000, 5);
        commercialBuilding.displayInfo();
    }
}
