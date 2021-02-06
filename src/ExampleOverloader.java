public class ExampleOverloader {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        //						method name + parameters = method signature

        double x = add(1.0,2.0,3.0,4.0);
        System.out.println(x);
        
        int z = add(1,2,3,4);
        System.out.println("z = " + z);

    }

    static int add(int a, int b) {
        System.out.println("This is overloader method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloader method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloader method #3");
        return a + b + c+d;
    }

    static double add(double a, double b) {
        System.out.println("This is overloader method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloader method #5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloader method #6");
        return a + b + c+d;
    }
}
