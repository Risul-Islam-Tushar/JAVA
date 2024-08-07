import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Value:");
        int value1 = input.nextInt();

        System.out.println("Enter Seccond Value:");
        int value2 = input.nextInt();

        if (value1>value2){
            System.out.println("value1 is big");
        }
        else {
            System.out.println("Value2 is bigger");
        }
    }
}
