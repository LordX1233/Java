package Bigger_Than_Two;
import java.util.Scanner;

public class Biggerthantwo{
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);        
        System.out.println("Number 1: ");
        Integer num1 = ask.nextInt();
        System.out.println("Number 2: ");
        Integer num2 = ask.nextInt();
        if (num1 > num2){
            System.out.println("The first one is the biggest");
        }else if (num1 == num2){
            System.out.println("They are the same value");
        }else{
            System.out.println("The second one is the biggest");
        }
        ask.close();
    }
}