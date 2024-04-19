import java.util.Scanner;

public class future {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer age = scanner.nextInt();
        System.out.println("Your name is: " + name + ", and your age is: " + age + ".");
        scanner.close();
    }
}
