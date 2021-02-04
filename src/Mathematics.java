public class Mathematics {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y);
        System.out.println("Max = " + z);

        z = Math.min(x,y);
        System.out.println("Min = "+z);

        System.out.println(Math.abs(y));

        System.out.println("Math.round "+Math.round(x));
        System.out.println("Math.ceil "+Math.ceil(x));
        System.out.println("Math.floor "+Math.floor(x));
    }
}
