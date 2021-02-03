package variables;

//выражения
public class Expressions {
    public static void main(String[] args) {

        //expression = operands & operators
        //operands =  values, variables, numbers,quantity //значения, переменные, числа,количество
        //operators = + - * / %

        int friends = 10;
        friends = friends + 4;
        System.out.println(friends);

        friends++;
        System.out.println(friends);

        double friendsD = friends;
        friendsD = friends/4;
        System.out.println("friendsD = " + friendsD); //3.0
        
        double friendsTest = 10;
        friendsTest = friendsTest/3;
        System.out.println("friendsTest = " + friendsTest); //3.3333333333333335
    }
}
