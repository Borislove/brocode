package recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Recursion = the process in which a method calls itself continuously
        // A method that calls itself is called a recursive method

        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to say hello?");
        int number = scan.nextInt();
        HelloWorld(number);
    }

    static void HelloWorld(int n) {
        if (n > 0) {
            System.out.println("Hello World!" + n);
            n--;
            HelloWorld(n);
        }
    }
}
