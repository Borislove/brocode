import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you?"); //Сколько вам лет?
        int age = scanner.nextInt();
        //scanner.nextLine(); //  TODO: 04.02.2021, без этого дальше не будет сканировать, только вывод \n
        System.out.println("What is your favorite food?"); //какая ваша любимая еда?
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

        scanner.close();
    }
}
