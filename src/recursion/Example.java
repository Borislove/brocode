package recursion;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How far do you want to walk(meters)?: ");
        int distance = scan.nextInt();

        takeAStep(0, distance);
    }

    static void takeAStep(int i, int distance) {
        if (i < distance) {
            i++;
            System.out.println("*You take a step* : " + i + " meter/s");
            takeAStep(i, distance);
        }
        else {
            System.out.println("You are done walking! ");
        }
    }
}
