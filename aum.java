import java.util.Scanner;

public class aum {
    public static void clear() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static boolean method(int result){
        if(result == 19 || result == 21){
            return true;
        }else{
            return false;
        }
    }

    public static boolean method(String name){
        Scanner read = new Scanner(System.in);
        System.out.println("Whats 9+10?");
        Integer result = read.nextInt();
        if(method(result) || name.equals("Obama")){
            return true;
        }else{
            return false;
        }

    }    
    public static void main(String[] args) {
        clear();
        Scanner read = new Scanner(System.in);
        System.out.println("Real quick, could you tell me your name?");
        String name = read.nextLine();
        if(method(name)){
            clear();
            System.out.println("You win");
        }else{
            clear();
            System.out.println("You lose");
        }
    }
}
