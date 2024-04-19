import java.text.DecimalFormat;
import java.util.Scanner;

public class bmicalc {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");  

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        clearScreen();
        String choice = "";
        while(true){
            try{
                System.out.println("Choose a system: (Imperial/Metric)");
                choice = ask.nextLine();
                if (!(choice.toLowerCase().equals("imperial") || choice.toLowerCase().equals("metric"))) {
                    clearScreen();
                    throw new InternalError("Choose a proper system");
                }
                if (choice.toLowerCase().equals("imperial")){
                    System.out.println("Enter weight: (Pounds)");
                    double weight = ask.nextDouble();
                    System.out.println("Enter height: (Inches)");
                    double height = ask.nextDouble();
                    double bmi = 703 * (weight / (height*height));
                    System.out.println("Your BMI: " + decfor.format(bmi));

                    if (bmi > 8 && bmi <= 18){
                        System.out.println("You are underweight");
                        break;
                    }else if (bmi > 18 && bmi <= 24){
                        System.out.println("You are healthy");
                        break;
                    }else if (bmi > 24 && bmi <= 29){
                        System.out.println("You are overweight");
                        break;
                    }else if (bmi > 29 && bmi <= 39){
                        System.out.println("You are obese");
                        break;
                    }else if (bmi > 39 && bmi <= 65){
                        System.out.println("You are extremely obese");
                        break;
                    }else{
                        System.out.println("You're dead");
                        break;
                    }

                    
                }
                if (choice.toLowerCase().equals("metric")){
                    System.out.println("Enter weight: (Kilograms)");
                    double weight = ask.nextDouble();
                    System.out.println("Enter height: (Meters)");
                    double height = ask.nextDouble();
                    double bmi = weight / (height*height);
                    System.out.println("Your BMI: " + decfor.format(bmi));

                    if (bmi > 8 && bmi <= 18){
                        System.out.println("You are underweight");
                        break;
                    }else if (bmi > 18 && bmi <= 24){
                        System.out.println("You are healthy");
                        break;
                    }else if (bmi > 24 && bmi <= 29){
                        System.out.println("You are overweight");
                        break;
                    }else if (bmi > 29 && bmi <= 39){
                        System.out.println("You are obese");
                        break;
                    }else if (bmi > 39 && bmi <= 65){
                        System.out.println("You are extremely obese");
                        break;
                    }else{
                        System.out.println("You're dead");
                        break;
                    }
                    
                }
                
            }catch (InternalError e){
                System.out.println(e);
                ask.nextLine();
                choice="";
                
            }catch (Exception e){
                clearScreen();
                System.out.println("Your answer must be a number");
                ask.nextLine();
            }
        }
        ask.close();
    }
}
