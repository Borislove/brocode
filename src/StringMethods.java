public class StringMethods {
    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly

        Car car = new Car();
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.color);
//        System.out.println(car.year);

       // System.out.println(car.toString());
        System.out.println(car);
    }
}
class Car{
    String make = "Ford";
    String model  ="Mustang";
    String color = "red";
    int year = 2021;

    public String toString(){
//        String myString = make + "\n"+model+"\n"+color+"\n"+year;
//        return myString;
        return make + "\n"+model+"\n"+color+"\n"+year;
    }
}
