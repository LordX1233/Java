package Bigger_Than_Three;
import java.util.Scanner;

public class Biggerthanthree{
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);        
        System.out.println("Number 1: ");
        Integer num1 = ask.nextInt();
        System.out.println("Number 2: ");
        Integer num2 = ask.nextInt();
        System.out.println("Number 3: ");
        Integer num3 = ask.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("The first one is the biggest");
        }else if (num2 > num1 && num2 > num3){
            System.out.println("The second one is the biggest");
        }else if (num1 == num2 && num2 == num3){
            System.out.println("They are all the same value");
        }else{
            System.out.println("The third one is the biggest");
        }
        ask.close();
    }
}