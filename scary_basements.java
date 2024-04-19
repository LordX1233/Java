import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scary_basements {
    public static void main(String[] args) {
        Integer level = 0;
        Integer base = 0;
        Boolean checked = false;
        try {
            File file = new File("puzzleKey.txt");
            Scanner scanner = new Scanner(file);
            String data = scanner.nextLine();
            char[] chars = data.toCharArray();
            for (int i = 0; i < chars.length; i++){
                if(chars[i] == '('){
                    level += 1;
                }else{
                    level -= 1;
                }
                if(level == -1 && checked == false){
                    checked = true;
                    base = i + 1;
                }  
            }
            System.out.println("Your level: " + level);
            if(base == 0){
                System.out.println("You never entered the basement");
            }else{
                System.out.println("You entered the basement at level: " + base);
            }
        }catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
