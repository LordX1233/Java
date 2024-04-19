import java.util.Scanner;

public class AgeIn1975 {
    static void printAnswer(String name, Integer age){
        Integer born_year = 2023 - age;
        Integer differ = born_year - 1975;
        Integer current_year = 2023 - 1975;

        if (differ < 0){
            Integer too_m_or_l = age - current_year; 
            System.out.println(name + ", you are " + too_m_or_l + " year/s too old.");

        } else if (differ > 1){
        Integer too_m_or_l = age - current_year; 
            System.out.println(name + ", you are " + -too_m_or_l + " year/s too young.");
        } else {
            System.out.println(name + ", you were born in 1975!.");
        }
    }

    public static void main(String[] args){
    Scanner ask = new Scanner(System.in);
    System.out.println("Whats your name?: ");        
    String name = ask.nextLine();
    System.out.println("Whats your age?: ");
    Integer age = ask.nextInt();
    printAnswer(name, age);
    ask.close();
    }
}
