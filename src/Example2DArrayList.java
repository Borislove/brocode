import java.util.ArrayList;

public class Example2DArrayList {
    public static void main(String[] args) {
    //2D ArrayList = a dynamic list of lists
    //You can change the size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        //System.out.println(bakeryList.get(0));
        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomato");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
       // System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0)); //получить с 0 индекса 2D, 0 элемент
    }
}
