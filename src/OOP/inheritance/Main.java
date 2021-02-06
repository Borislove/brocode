package OOP.inheritance;

public class Main {
    public static void main(String[] args) {

        //inheritance =  the process where one class acquires,
        //               the attributes and methods of another.

        Car car = new Car();
//        car.go();
        Bicycle bike = new Bicycle();
        //bike.stop();
//        System.out.println(car.speed);
//        System.out.println(bike.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}

class Vehicle {
    double speed;

    void go() {
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("This vehicle is stopped");
    }
}

class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;
}

class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;
}