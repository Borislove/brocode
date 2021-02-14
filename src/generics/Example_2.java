package generics;

import java.util.ArrayList;

public class Example_2 {
    public static void main(String[] args) {

//        MyIntegerClass myInt = new MyIntegerClass(1);
//        MyDoubleClass myDouble = new MyDoubleClass(3.14);
//        MyCharacterClass myChar = new MyCharacterClass('@');
//        MyStringClass myString = new MyStringClass("Hello");

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
