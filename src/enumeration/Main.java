package enumeration;

enum Planet {
    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO;
}

public class Main {
    public static void main(String[] args) {
        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        //Planet myPlanet = Planet.MARS; //case default
        Planet myPlanet = Planet.EARTH;

        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet){
        switch (myPlanet){
            case EARTH:
                System.out.println("You can live here ");
                break;
                default:
                    System.out.println("You can't live here...yet");
                    break;
        }
    }
}
