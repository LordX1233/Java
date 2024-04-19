package Trivia;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class trivia {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void check(String category, String question, String answers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Category: " + category);
        System.out.println(question);
        String answer = scanner.nextLine();
        if (answer.toLowerCase().equals(answers)){
            clearScreen();
            System.out.println("CORRECT!");
        }else{
            clearScreen();
            //scanner.close();
            throw new NoSuchFieldError("Wrong Answer");
        }
    }
    
    public static void questions(Integer number){
        switch (number){
            case 1:
            check("Movies", "Whats the first name of the boy who lived?", "harry");
            break;

            case 2:
            check("Movies", "What is the highest-grossing animated movie of all time?", "the lion king");
            break;

            case 3:
            check("Movies", "Which actor played the character of Jack Dawson in the movie 'Titanic'?", "leonardo dicaprio");
            break;
            
            case 4:
            check("Movies", "Who directed the science fiction film 'Inception'?", "christopher nolan");
            break;

            case 5:
            check("History", "In what year did the Berlin Wall fall, symbolizing the end of the Cold War?", "1989");
            break;

            case 6:
            check("History", "In what year did Christopher Columbus arrive to the Americas?", "1492");
            break;

            case 7:
            check("History", "Which Archduke's assasination marked the start of World War I?", "franz ferdinand");
            break;

            case 8:
            check("History", "Who was the first woman to win a Nobel Prize?", "marie curie");
            break;

            case 9:
            check("Music", "Who is often referred to as the 'King of Pop'?", "michael jackson");
            break;

            case 10:
            check("Music", "What is the name of The Beatles' final studio album, released in 1970?", "let it be");
            break;

            case 11:
            check("Music", "In what year did Elvis Presley pass away?", "1977");
            break;

            case 12:
            check("Music", "Which legendary rock band performed at the Live Aid concert in 1985?", "queen");
            break;

            case 13:
            check("Geography", "What is the capital of Australia?", "canberra");
            break;

            case 14:
            check("Geography", "Which river is the longest in the world?", "nile river");
            break;

            case 15:
            check("Geography", "Which desert is the largest hot desert in the world?", "sahara desert");
            break;
            
            case 16:
            check("Geography", "What is the smallest country in the world by land area?", "vatican city");
            break;

            case 17:
            check("Internet", "What does the acronym 'URL' stand for?", "uniform resource locator");
            break;
            
            case 18:
            check("Internet", "Which video-sharing platform was acquired by Google in 2006?", "youtube");
            break;
            
            case 19:
            check("Internet", "Which company is known for its search engine that uses a distinctive, colorful logo?", "google");
            break;

            case 20:
            check("Obvious", "Who is the best computer teacher?", "braulio");
            break;

            case 21:
            check("Quantum Physics", "When does a light beam have only a single frequency?", "it doesnt");
            break;
        }
    }

    public static void main(String[] args){
        int score = 0;
        clearScreen();
        List<Integer> a_list = new ArrayList<>();
        Random random = new Random();

        while (a_list.size() < 10){
            int randomInt = random.nextInt(1,22);
            if (!(a_list.contains(randomInt))){
                a_list.add(randomInt);
            }
        }
        //System.out.println(a_list);

        for (var i = 0; i < a_list.size(); i++){
            try{
                if (i > 0){
                    System.out.println("");
                    System.out.println("Your score: " + score + "/10");
                }
                questions(a_list.get(i));
                score += 1;
            }catch (NoSuchFieldError e){
                System.out.println(e);
            }catch (Exception e){
                System.out.println(e);
            }

        }
        clearScreen();
        if (score >= 7){
            System.out.println("YOU WIN!");
            System.out.println("");
            System.out.println("You got " + score + " right, and " + (10-score) + " wrong");
            System.out.println("");
        }else{
            System.out.println("You lose!");
            System.out.println("");
            System.out.println("You got " + score + " right, and " + (10-score) + " wrong");
            System.out.println("");
        }
    }
}