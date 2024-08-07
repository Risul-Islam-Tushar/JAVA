import java.util.Scanner;

public class MyFunction {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        sayHello(input);
    }
    static void sayHello(String name){
        System.out.println(name);
    }
}
