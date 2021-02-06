package OOP;

import java.util.Random;

public class ExampleVariableScope {
    public static void main(String[] args) {

        //Local =   declared inside a method
        //          visible only to that method

        //global =  declared outside a method, but whithin a class
        //          visible to all parts of a class

        DiceRoller diceRoller = new DiceRoller();
    }
}
/*
class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }*/

class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
