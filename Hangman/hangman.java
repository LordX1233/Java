package Hangman;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class hangman {
    public static void stickman(Integer lives){
        switch (lives){
            case 6:
            System.out.println("  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========");
            break;

            case 5:
            System.out.println("  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========");
            break;

            case 4:
            System.out.println("  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========");
            break;
            
            case 3:
            System.out.println("  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========");
            break;
            
            case 2:
            System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n========= ");
            break;
            
            case 1:
            System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========");
            break;
            
            case 0:
            System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========");
            break;
        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] alphabet = {"a","b","c","d","e","f","g","h", "i", "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int wins = 0;
        int loses = 0;
        String option = "";

        while (!(option.toLowerCase().equals("end"))){
            clearScreen();
            
            List<String> wrongs = new ArrayList<>();
            int lives = 6;
            Random rand = new Random();
            
            int selc = rand.nextInt(1,21);
            // clearScreen();
            // stickman(lives);
            try{
                FileInputStream words = new FileInputStream("Java/Hangman/words.txt");
                BufferedReader data = new BufferedReader(new InputStreamReader(words));
                for(int i = 1; i < selc; i++){
                    data.readLine();
                }
                String word = data.readLine();

                List<String> wordl = new ArrayList<>();
                for (var i = 0; i < word.length(); i++){
                    wordl.add(word.substring(i, i + 1));
                }

                List<String> answer = new ArrayList<>();
                for (var i = 0; i < wordl.size(); i++){
                    answer.add("_");
                }

                while (!(answer.toString().equals(wordl.toString()))){
                    try{
                        stickman(lives);
                        //System.out.println(word);
                        System.out.println("");
                        System.out.println("Word:");
                        System.out.println(answer);
                        //System.out.println(lives);
                        System.out.println("Wrongs: " + wrongs.toString());
                        String letter = scanner.nextLine();
                        
                        if (letter.length() > 1 || letter.equals("")){
                            clearScreen();
                            throw new IndexOutOfBoundsException("Your answer must be 1 character");
                        }

                        if (!(Arrays.asList(alphabet).contains(letter.toLowerCase()))){
                            clearScreen();
                            throw new IndexOutOfBoundsException("Your answer must be a letter");
                        }

                        if (wrongs.contains(letter.toLowerCase())){
                            clearScreen();
                            throw new IndexOutOfBoundsException("Your answer can't be repeated twice");
                        }
                        
                        if (wordl.contains(letter.toLowerCase())){
                            System.out.println("YES");
                            for (var i = 0; i < wordl.size(); i++){
                                if (wordl.get(i).equals(letter.toLowerCase())){
                                    answer.set(i, letter.toLowerCase());
                                }
                            }
                            clearScreen();
                        }else{
                            wrongs.add(letter.toLowerCase());
                            lives -= 1;
                            clearScreen();
                        }
                        if (lives <= 0){
                            clearScreen();
                            stickman(lives);
                            System.out.println("");
                            System.out.println("Word:");
                            //System.out.println(word);
                            System.out.println(answer);
                            //System.out.println(lives);
                            System.out.println("Wrongs: " + wrongs.toString());
                            break;
                        }
                        
                        data.close();
                    }catch (IndexOutOfBoundsException e){
                        System.out.println(e);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                
                if (lives > 0){
                    stickman(lives);
                    System.out.println("");
                    System.out.println("Word:");
                    System.out.println(answer);
                    System.out.println("Wrongs: " + wrongs.toString());
                    System.out.println("");
                    System.out.println("GOOD JOB!");
                    wins += 1;
                }else{
                    System.out.println("");
                    System.out.println("Sorry, you didnt get it right");
                    System.out.println("The word was: " + word);
                    loses += 1;
                }
                while (true){
                    System.out.println("Would you like to Continue/End?");
                    option = scanner.nextLine();
                    if (option.toLowerCase().equals("continue") || option.toLowerCase().equals("end")){
                        break;
                    }else{
                        clearScreen();
                        System.out.println("You must select Continue or End");
                    }
                }
                
            }catch (IOException e){
                System.out.println(e);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        scanner.close();
        clearScreen();
        System.out.println("Your wins: " + wins);
        System.out.println("Your losses: " + loses);
    }
}
