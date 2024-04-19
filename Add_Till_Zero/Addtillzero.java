import java.util.Scanner;

public class Addtillzero {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Number: ");        
        Integer num = ask.nextInt();
        Integer till = 0;
        for (int i = 0; i < num; i++){
            till = till + (num - i);
            System.out.println(till);
        }
        System.out.println(till);
        ask.close();
    }
}
