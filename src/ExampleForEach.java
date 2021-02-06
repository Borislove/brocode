import java.util.ArrayList;

public class ExampleForEach {
    public static void main(String[] args) {

        // for-each = 	traversing technique to iterate through the elements in an array/collection
        //				less steps, more readable
        //				less flexible

        //////////////
//        String[]animals = {"cat", "dog", "rat", "bird"};
        /*for(String i: animals){
            System.out.println(i);
        }*/
        //////////////
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("gog");
        animals.add("rat");
        animals.add("bird");

        for(String i: animals){
            System.out.println(i);
        }
    }
}
