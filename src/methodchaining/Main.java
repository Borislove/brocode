package methodchaining;

public class Main {
    public static void main(String[] args) {
        // method chaining = 	a common syntax for invoking multiple method calls in OOP
        //						condense code into less lines

        String name = "     name";
//
//        name = name.concat(" noname       ");
//        System.out.println(name);
//
//        name = name.toUpperCase();
//        System.out.println("name = " + name);
//
//        name = name.trim();
//        System.out.println(name);
        
        name = name.concat(" noname").toUpperCase().trim();
        System.out.println("name = " + name);
    }
}
