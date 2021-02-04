import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        ///////rand max/min
        //int x = random.nextInt();
        //System.out.println(x);

        int x = random.nextInt(10);
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);
        
        boolean z = random.nextBoolean();
        System.out.println("z = " + z);
    }
}
