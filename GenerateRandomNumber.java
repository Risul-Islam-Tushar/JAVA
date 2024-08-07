import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
//        Random random = new Random();
//        int rand = random.nextInt(99999999);
//        System.out.println(rand);

        double rand = Math.random();
        int min = 10000;
        int max = 99999;
        int myValue = (int) (rand*(max-min)+1);
        System.out.println(myValue);


    }
}
