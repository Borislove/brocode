import java.util.Scanner;

public class ExampleWhile {
    public static void main(String[] args) {

        // while loop = executes a block of code as long as a it's condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";


       /* while (name.isBlank()){
            System.out.print("Enter your name:");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
    }*/

        do {
            System.out.print("Enter your name:");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("Hello " + name);
    }
}
