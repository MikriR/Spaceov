package br.com.several;

import java.util.ArrayList;

public class Ship {

    private static double shipIntegrity = 50.0;
    private static double shipNewIntegrity = 25.0;

    private static ArrayList<String> typeShip = new ArrayList<>();
    public static ArrayList<String> getTypeShip() {
        typeShip.add("Scrap Wing");
        return typeShip;
    }

    public double integrityMore() {
        return shipIntegrity += shipNewIntegrity;
    }

    public double integrityLoss() {
        return shipIntegrity -= shipNewIntegrity;
    }

    public static double getShipIntegrity() {
        return shipIntegrity;
    }

    public static double getShipNewIntegrity() {
        return shipNewIntegrity;
    }
}
