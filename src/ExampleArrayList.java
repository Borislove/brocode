import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        // ArrayList = 	a resizable array.
        //				Elements can be added and removed after compilation phase
        //				store reference data types

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi"); //уставновить в 0 индекс
        food.remove(2); //удалить элемент
        food.clear(); //очистка листа

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
