package variables;

public class Example {
    public static void main(String[] args) {

        String x = "water";
        String y = "lemon";

        //x=y; //lemon
      // y = x; //water
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        String temp;
        temp = x;
        x=y;
        y =temp;
        System.out.println(temp); //water
    }
}
