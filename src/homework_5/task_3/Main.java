package homework_5.task_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> houseCatalog = new ArrayList<>();
        ApartmentBuildings apartment1 = new ApartmentBuildings("Star St.", 1, 1, 1, 3);
        houseCatalog.add(apartment1);
        CountryHouse countryHouse = new CountryHouse("Oak St.", 3, 1, 2, 5);
        houseCatalog.add(countryHouse);
        System.out.println(houseCatalog);
    }

}
