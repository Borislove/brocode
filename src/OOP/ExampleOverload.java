package OOP;

public class ExampleOverload {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature

        //Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        //Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella");
        //Pizza pizza = new Pizza("thicc crust", "tomato");
        //Pizza pizza = new Pizza("thicc crust" );
        Pizza pizza = new Pizza();
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}

class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza() {
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
