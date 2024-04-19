package Rock_Paper_Scissors;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void rps(){
        System.out.println("1 == Rock");
        System.out.println("2 == Paper");
        System.out.println("3 == Scissor");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        clearScreen();
        int computer_points = 0;
        int player_points = 0;
        while (true) {
            try {
                rps();
                System.out.print("ROCK! PAPER! SCISSOR!: ");
                String selection = scanner.nextLine();
                if (selection.equals("0")){
                    clearScreen();
                    System.out.println("");
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    break;
                }

                checkPassword(selection);
                System.out.println("SHOOT!");
                System.out.println("");
                int computer = rand.nextInt(3);
                if (computer == 0){
                    System.out.println("Computer: Rock");
                    System.out.println("");
                }else if (computer == 1){
                    System.out.println("Computer: Paper");
                    System.out.println("");
                }else{
                    System.out.println("Computer: Scissor");
                    System.out.println("");
                }

                if (computer == 2 && selection.equals("1")){
                    player_points += 1;
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                }else if (computer == 0 && selection.equals("2")){
                    player_points += 1;
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                }else if (computer == 1 && selection.equals("3")){
                    player_points += 1;
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                }else if (selection.equals("0")){
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                    break;
                }else if (computer == Integer.parseInt(selection)){
                    System.out.println("Its a tie, so no points");
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                }else{
                    computer_points += 1;
                    System.out.println("Player points: " + player_points);
                    System.out.println("Computer points: " + computer_points);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                }
                
            } catch (InternalError e) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
    public static void checkPassword(String selection) {
        if (!(selection.equals("1") || selection.equals("2") || selection.equals("3") || selection.equals("0"))) {
            throw new InternalError("Your answer must be one of the choices");
        }
    }
}


// Using you knowledge create a script that simulates a Rock, Paper, Scissors game.

// Requirements:
// Keep track of the score against the computer
// Use try-except structure and the raise statement (for when you lose for example)
// Let the player decide in some way or another to exit the game

// Hints:
// On your program you should include these lines to make your life easier:

//  (This one must go on the first line)

// int computer = random.nextInt(3); 
// (This line chooses a random number between 0 and 2 (3 excluded) I'll 