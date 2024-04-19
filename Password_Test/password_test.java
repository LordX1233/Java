package Password_Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class password_test {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        while (true) {
            try {
                System.out.print("Enter a password: ");
                String password = scanner.nextLine();
                List<String> password_list = new ArrayList<>();

                for (var i = 0; i < password.length(); i++){
                    password_list.add(password.substring(i, i + 1));
                }
                checkPassword(password, password_list);
                System.out.println("Password is valid!");
                break;
            } catch (InternalError e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }

    public static void checkPassword(String password, List<String> password_list) {
        Integer num_amount = 0;
        Boolean condition1 = false;
        Boolean condition2 = false;
        Boolean condition3 = false;
        String[] lowercase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] symbols = {"`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", ",", "-", ",", "=", "+", "[", "{", "]", "}","|",":",";","\"","<",",",">",".", "?","/"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};


        if (password.length() < 10) {
            throw new InternalError("Password must have at least 10 characters.");
        }


        for (var i = 0; i < password_list.size(); i++) {
            for (var e = 0; e < lowercase.length; e++){
                if (password_list.get(i).equals(lowercase[e])) {
                    condition1 = true;
                }
            }
        }
        if (condition1 == false){
            throw new InternalError("Password must include a lowercase letter.");
        }


        if (password.toLowerCase() == password) {
            throw new InternalError("Password must include an uppercase letter.");
        }


        for (var i = 0; i < password.length(); i++) {
            for (var e = 0; e < numbers.length; e++){
                if (password_list.get(i).equals(numbers[e])) {
                    condition2 = true;
                }
            }
        }
        if (condition2 == false){
            throw new InternalError("Password must include a number.");
        }

        for (var i = 0; i < password.length(); i++) {
            for (var e = 0; e < numbers.length; e++){
                if (password_list.get(i).equals(numbers[e])) {
                    num_amount += 1;
                }
            }
        }
        if (num_amount < 6){
            throw new InternalError("Password must include at least 6 numbers.");
        }

        for (var i = 0; i < password.length(); i++) {
            for (var e = 0; e < symbols.length; e++){
                if (password_list.get(i).equals(symbols[e])) {
                    condition3 = true;
                }
            }
        }
        if (condition3 == false){
            throw new InternalError("Password must include a symbol.");
        }

        //If you can, could you teach me to use this? Cause my java wont accept emojis :(
        // if (!(password_list.contains("🦇"))){
        //     throw new InternalError("Password must include a bat emoji");
        // }
    }
}
