public class ExampleMethods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        String name = "name";
        int age = 12;

        hello();
        helloString("hello?");
        helloStrInt(name,age);

        int x = 3;
        int y = 4;

        add(x,y);
    }

    //без аргументов
    static void hello(){
        System.out.println("Hello");
    }

    //со строковым аргументом
    static void helloString(String  name){
        System.out.println("Hello" +name);
    }

    //два аргумента
    static void helloStrInt(String  name, int age){
        System.out.println("Hello " +name);
        System.out.println("You are " +age);
    }

    //с возвращаемым значением
    static int add(int x , int y){
        int z = x+y;
        return z;
    }
}
