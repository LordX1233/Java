








import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                //! 1- Calculate the average of 3 numbers
                System.out.println("Number 1: ");
                int num1 = scanner.nextInt();
                System.out.println("Number 2: ");
                int num2 = scanner.nextInt();
                System.out.println("Number 3: ");
                int num3 = scanner.nextInt();
                double average = ((num1+num2+num3) / 3.0);
                System.out.println("Average: " + average);
                scanner.nextLine();

                //! 2- Convert temperature from Celsius to Fahrenheit and vice versa (According to user choice)
                System.out.println("Choose Celsius (c) or Fahrenheit (f) as the temperature you want to convert from");
                String type = scanner.nextLine();
                if (type.toLowerCase().equals("c")){
                    System.out.println("Temperature: ");
                    int temp = scanner.nextInt();
                    double newtemp = (temp * (9/5)) + 32.0;
                    System.out.println("In Fahrenheit: " + newtemp);

                }else if (type.toLowerCase().equals("f")){
                    System.out.println("Temperature: ");
                    int temp = scanner.nextInt();
                    double newtemp = ((32 * temp) - 32.0) * (5/9);
                    System.out.println("In Celsius: " + newtemp);
                
                }else{
                    throw new Exception("You messed up boi!");
                }
                //! 3- Swap the value of two variables
                
                int x = 7;
                int y = 3;
                int z;
                z = x;
                x = y;
                y = z;
                System.out.println(x + " " + y);

                //! 4- Print the first 30 natural numbers using a for loop

                for (var i = 1; i < 31; i++){
                    System.out.println(i);
                }

                //! 5- Print the multiplication table of a number chosen by the user
                System.out.println("Choose a number: ");
                int number = scanner.nextInt();
                for (var i = 0; i < 13; i++){
                    System.out.println(number + " x " + i + " = " + (i*number));
                }

                //! 6- Calculate the area of a rectangle (values given by the user)
                System.out.println("Rectangle length: ");
                int rect1 = scanner.nextInt();
                System.out.println("Rectangle width: ");
                int rect2 = scanner.nextInt();
                System.out.println("Rectangle area: " + (rect1*rect2));

                //! 7- Calculate the area of a circle (values given by the user)
                System.out.println("Circle radius: ");
                int circ = scanner.nextInt();
                System.out.println("Area of the circle: " + (3.14*(circ*circ)));

                //! 8- Calculate the area of a square (values given by the user)
                System.out.println("Side of a square: ");
                int squa = scanner.nextInt();
                System.out.println("Area of a square: " + (squa*squa));

                //! 9- Calculate the area of a triangle (values given by the user)
                System.out.println("Base of a triangle: ");
                int tri1 = scanner.nextInt();
                System.out.println("Height of a triangle: ");
                int tri2 = scanner.nextInt();
                System.out.println("Area of a triangle: " + ((tri1*tri2)/2));

                //! 10- Print true or false if a year (given by the user) is a leap year
                System.out.println("Year: ");
                int year = scanner.nextInt();
                if (year % 4 == 0){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                break;

            }catch (Exception e){
                scanner.nextLine();
                System.out.println("For messing up, you will try eveything from the beginning now!");
            }
        }
        
        scanner.close();
        
    }
}
