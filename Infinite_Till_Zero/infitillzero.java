package Infinite_Till_Zero;
import java.util.Scanner;

public class infitillzero {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Number: ");        
        Integer num = ask.nextInt();
        Integer alls = 0;
        do{
            alls = alls + num;
            System.out.println("Number: "); 
            num = ask.nextInt();
        }
        while (num != 0);
        System.out.println(alls);
        ask.close();
    }
}
