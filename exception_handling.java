import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean test = true;
        while (test){
            try{
                System.out.print("Number: ");
                Integer number = scanner.nextInt();
                if (number <= 0){
                    throw new NoSuchFieldError("Number must be larger than 0");
                }
                else{
                    test = false;
                }
                

            }catch (NoSuchFieldError e){
                System.out.println(e);


            }catch (Exception e){
                System.out.println("Thats not a number" + e);
                
                
                
            }finally{
                if (test == true){
                    System.out.println("Please try again");
                }else{
                    System.out.println("Good job");
                }
            }
        }   
    }
}