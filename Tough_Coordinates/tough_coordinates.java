import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class tough_coordinates {
    public static void year1(){
        Set<String> checked = new HashSet<>();
        int houses = 1;
        int localx = 0;
        int localy = 0;
        try {
            File file = new File("Java/Tough_Coordinates/puzzleKey2.txt");
            Scanner scanner = new Scanner(file);
            String data = scanner.nextLine();
            char[] chars = data.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '^') {
                    localy += 1;
                } else if (chars[i] == 'v') {
                    localy -= 1;
                } else if (chars[i] == '>') {
                    localx += 1;
                } else if (chars[i] == '<') {
                    localx -= 1;
                }
                String coordinate = localx + "," + localy;
                if (!checked.contains(coordinate)) {
                    checked.add(coordinate);
                    houses += 1;
                }
            }
            scanner.close();
            System.out.println(houses);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void year2(){
        Set<String> checked = new HashSet<>();
        checked.add("0,0");
        int houses = 1;
        int localx = 0;
        int localy = 0;
        int robotx = 0;
        int roboty = 0;
        boolean man = true;
        try {
            File file = new File("Java/Tough_Coordinates/puzzleKey2.txt");
            Scanner scanner = new Scanner(file);
            String data = scanner.nextLine();
            char[] chars = data.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char move = chars[i];
                if (man) {
                    if (move == '^') {
                        localy += 1;
                    } else if (move == 'v') {
                        localy -= 1;
                    } else if (move == '>') {
                        localx += 1;
                    } else if (move == '<') {
                        localx -= 1;
                    }
                    String coordinate = localx + "," + localy;
                    if (checked.add(coordinate)) {
                        houses += 1;
                    }
                } else {
                    if (move == '^') {
                        roboty += 1;
                    } else if (move == 'v') {
                        roboty -= 1;
                    } else if (move == '>') {
                        robotx += 1;
                    } else if (move == '<') {
                        robotx -= 1;
                    }
                    String coordinate = robotx + "," + roboty;
                    if (checked.add(coordinate)) {
                        houses += 1;
                    }
                }
                man = !man;
            }
            scanner.close();
            System.out.println(houses);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        year1();
        year2();
    }
}