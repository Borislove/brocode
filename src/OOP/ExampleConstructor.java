package OOP;

public class ExampleConstructor {
    public static void main(String[] args) {

        //constructor = special method that is called when an object is instantiated(created)

        Human human1 = new Human("pups", 20, 108.2);
        System.out.println("human1.name = " + human1.name);

        Human human2 = new Human("pups2", 30, 68.2);
        System.out.println("human2.name = " + human2.name);

        human2.eat();
        human1.dring();
    }
}

class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat(){
        System.out.println(this.name+" is eating");
    }

    void dring(){
        System.out.println(this.name+" is drinking *burp*");
    }
}
