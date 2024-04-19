import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;  


public class myfries {

    //Used for rounding
    private static final DecimalFormat decfor = new DecimalFormat("0.00");  
    //Not 100% sure how it works

    static void getoutnow(){
        System.out.println("⠀⠀⠀⢀⣤⣶⣿⣿⣿⣷⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⣾⣿⣷⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠈⠛⠿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⣠⣤⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⠿⠋⠀⣚⣫⣭⣶⣮⡝⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⢀⣴⣿⣿⠿⠿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣭⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⠇⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⣰⣿⣿⡟⣱⣿⣿⣦⡙⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⣛⣥⣾⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀");
        System.out.println("⠀⣰⣿⣿⣿⣧⢻⣿⣿⣿⣿⣌⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⢛⣛⣭⣵⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀");
        System.out.println("⢠⣿⣿⣿⣿⣿⣎⢿⣿⣿⣿⣿⣷⣥⣀⣀⣀⣀⣤⣤⣤⣤⡀⠀⠀⠀⠀⠀⠙⣛⣛⣛⣋⣭⣭⣥⣶⣶⡿⠿⠟⠛⠋⠉⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀");
        System.out.println("⣼⣿⣿⣿⣿⣿⣿⣦⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠀⠀⠀⠀⠀⠀⠉⠙⠛⠛⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀");
        System.out.println("⣿⣿⣿⣿⠹⣿⣿⣿⣿⣶⣭⣙⡻⠿⠿⠿⠿⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⣀⣀⣤⣤⣴⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆");
        System.out.println("⣿⣿⣿⣿⡀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⢀⣀⣤⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇");
        System.out.println("⢹⣿⣿⣿⣧⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇");
        System.out.println("⠈⢿⣿⣿⣿⠆⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠛⠛⠛⠉⠉⠉⠉⠉⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠀");
        System.out.println("⠀⠈⠛⠛⠋⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠉⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⡿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    static void gigachad(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⢉⠉⠉⢉⣉⣩⣉⢉⡉⠉⡉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣾⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⡟⣿⣿⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⣿⣇⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣻⣿⡄⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠍⠙⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⣱⣾⠟⠀⢠⠉⠉⠉⠻⣿⣿⡇⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣽⣿⣿⣿⣿⣿⡿⠛⣡⣶⣿⣧⣤⠸⡟⠂⠀⠀⠀⢹⣿⡇⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⠇⠀⢈⣥⣿⣿⣿⣿⣿⣷⣆⢰⣆⠀⢸⡏⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣏⣿⡏⠀⣾⣾⣿⣿⣿⣿⣿⣿⣿⣿⢻⣿⣷⣾⡃⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣷⡄⠘⠹⢿⣿⣍⠉⢛⣿⣿⣿⠸⣿⣿⠿⠁⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⢿⣿⣿⣿⣿⣦⣀⣿⣿⣿⣶⣾⣿⣿⣿⡇⠁⠈⡄⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⢺⣿⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⡺⠁⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⢸⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣏⣻⡶⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⣿⡏⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣬⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⣀⣀⣤⣤⣤⣤⣀⣀⣠⣤⣤⣶⣶⣿⣿⡛⠻⠿⣿⡿⠛⠁⢰⣿⣿⠃⢘⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⣩⣿⣿⡿⠿⣻⣿⣿⣿⣿⣿⣿⣅⠄⢉⣙⣿⣿⡟⠀⠀⠀⠘⣿⡇⠀⠀⣿⣦⣿⣿⣿⣿⣿⣿⣿⣟⣻⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠟⠋⢱⣦⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⣸⠀⡇⢠⣿⣧⠀⢠⣿⡿⢿⠿⠋⠙⠛⠛⠛⠛⠋⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⣶⠶⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⠏⣸⣿⣿⣿⣧⠀⠀⠀⣷⠸⣿⠃⣴⣿⡟⠙⠁⠀⠀⠀⠀⠀⣾⣄⣀⡀⠉⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⡇⠀⢉⣹⣾⣿⣿⣿⣿⣿⣿⣿⣶⣬⣿⣿⣿⣿⣦⡄⣀⡿⠀⣿⣿⣇⠹⣷⣤⣾⠇⠀⠀⠀⣰⣿⣿⣿⣿⣆⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢰⣿⣿⡿⢶⣿⣿⡟⢀⣤⠀⣰⣿⣿⣿⣿⡿⣭⣷⣄⡀⠘⢄⠀⠀⠀⠀⠀");
        System.out.println("⣠⣾⣿⣿⢋⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣼⣿⣿⣧⣾⣿⢿⡷⠟⠉⠀⠹⠟⠛⢉⠁⡀⠈⠉⠉⠑⢦⡈⠳⡀⠀⠀⠀");
        System.out.println("⡏⠀⠘⣳⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⠙⢿⣿⣿⣿⣿⠉⠀⢀⡉⡦⠄⠀⠀⠀⠀⣿⠀⠠⠄⠀⠀⠀⠀⠑⠠⠉⠒⢄⡀");
        System.out.println("⣷⡆⢸⡯⠤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⢘⣿⣿⢋⠍⢿⣶⣽⣿⡿⢿⡄⠀⠀⣸⡯⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙");
        System.out.println("⣿⣿⣄⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣾⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣷⣶⣾⣿⣤⣷⣶⣄⣰⣤⣀⣀⣀⣀⣀⣀⣀⣀");
    }

    static void cash(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠞⠉⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠁⠀⠀⠀⠀⠉⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠙⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⢀⣴⣏⢤⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡜⠁⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⣼⣿⣿⣿⡟⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠯⠤⢤⣀⠀⠀⠀⠀⠀⠈⢳⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⣰⣿⣿⣿⣿⣿⣿⡁⠀⠀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⣰⣶⣿⠙⢦⠀⠀⢀⡴⠋⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠹⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⢠⣾⠁⠀⣄⢀⣿⣿⠙⠇⠈⢧⣠⠞⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀");
        System.out.println("⠀⠈⠻⣿⣿⣿⣿⡿⣿⣿⣦⡀⠀⡴⠋⢹⡀⢸⣿⣿⣋⣿⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⢀⣠⣌⢳⣄⠀⠀");
        System.out.println("⠀⠀⠀⠈⠻⣿⣿⡿⢮⡳⣝⢿⣞⠁⠀⠀⠙⢮⣙⠉⠉⠀⣀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢿⣿⣽⣷⡄");
        System.out.println("⠀⠀⠀⠀⠀⠙⢿⡛⣦⡙⠎⢻⣿⠳⣄⠀⠀⠀⠈⠉⠉⡽⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢋⣿⡇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠙⢦⡙⠆⣼⠛⢺⠿⢧⡀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⠋⡇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⣿⣶⠚⡆⠀⠙⢦⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠁⠀⡇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣇⣃⠀⠀⢸⠛⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠛⣁⠀⣠⠞⡇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣄⠀⣿⠀⢮⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⢋⡴⢊⡤⢞⡿⢿⡇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⣟⠳⣦⣼⣿⣷⣄⠀⢀⣼⣃⣤⢞⣹⢖⣩⠖⣩⠖⣉⡴⠋⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣯⡻⣟⢿⣍⠉⢛⡵⣫⠕⢋⣴⣎⣵⠞⠁⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣾⡳⣝⣷⠿⠋⣠⣾⣿⡿⠋⠁⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣮⣷⣠⠜⣿⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⣻⣿⡴⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    static void card(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣶⣾⣿⣿⣦⡀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⠿⠗⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢀⣀⣤⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⢠⣶⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠛⠋⠉⠁⠀⠀⠀⠀⢀⣀⣀⣤⣴⣶⠀⠀⠀");
        System.out.println("⠀⢹⣿⣿⡿⠿⠛⠋⠉⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣶⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀");
        System.out.println("⠀⠈⠉⠀⠀⠀⠀⠀⠀⣀⣠⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀");
        System.out.println("⠀⠀⠀⣀⣠⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀");
        System.out.println("⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠀");
        System.out.println("⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠉⠁⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠈⠻⣿⣿⡿⠿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    static void shrek(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⢀⣴⠟⠉⠀⠀⠀⠈⠻⣦⡀⠀⠀⠀⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣀⢀⣾⠿⠻⢶⣄⠀⠀⣠⣶⡿⠶⣄⣠⣾⣿⠗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢻⣿⣿⡿⣿⠿⣿⡿⢼⣿⣿⡿⣿⣎⡟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡟⠉⠛⢛⣛⡉⠀⠀⠙⠛⠻⠛⠑⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣧⣤⣴⠿⠿⣷⣤⡤⠴⠖⠳⣄⣀⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣀⣟⠻⢦⣀⡀⠀⠀⠀⠀⣀⡈⠻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡿⠉⡇⠀⠀⠛⠛⠛⠋⠉⠉⠀⠀⠀⠹⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⠀⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠈⠑⠪⠷⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣦⣼⠛⢦⣤⣄⡀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠢⡀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⠲⠖⠛⠻⣿⡿⠛⠉⠉⠻⠷⣦⣽⠿⠿⠒⠚⠋⠉⠁⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⢀⣾⠛⠁⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣰⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣑⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⠀⠀");
        System.out.println("⠀⠀⠀⣰⣿⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣧⣄⠀⠀⠀⠀⠀⠀⢳⡀⠀");
        System.out.println("⠀⠀⠀⣿⡾⢿⣀⢀⣀⣦⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⣫⣿⡿⠟⠻⠶⠀⠀⠀⠀⠀⢳⠀");
        System.out.println("⠀⠀⢀⣿⣧⡾⣿⣿⣿⣿⣿⡷⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⢀⡴⢿⣿⣧⠀⡀⠀⢀⣀⣀⢒⣤⣶⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇");
        System.out.println("⠀⠀⡾⠁⠙⣿⡈⠉⠙⣿⣿⣷⣬⡛⢿⣶⣶⣴⣶⣶⣶⣤⣤⠤⠾⣿⣿⣿⡿⠿⣿⠿⢿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇");
        System.out.println("⠀⣸⠃⠀⠀⢸⠃⠀⠀⢸⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⠟⡉⠀⠀⠀⠈⠙⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇");
        System.out.println("⠀⣿⠀⠀⢀⡏⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠛⠉⠁⠀⠀⠀⠀⠀⠉⠠⠿⠟⠻⠟⠋⠉⢿⣿⣦⡀⢰⡀⠀⠀⠀⠀⠀⠀⠁");
        System.out.println("⢀⣿⡆⢀⡾⠀⠀⠀⠀⣾⠏⢿⣿⣿⣿⣯⣙⢷⡄⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣿⣻⢿⣷⣀⣷⣄⠀⠀⠀⠀⢸⠀");
        System.out.println("⢸⠃⠠⣼⠃⠀⠀⣠⣾⡟⠀⠈⢿⣿⡿⠿⣿⣿⡿⠿⠿⠿⠷⣄⠈⠿⠛⠻⠶⢶⣄⣀⣀⡠⠈⢛⡿⠃⠈⢿⣿⣿⡿⠀⠀⠀⠀⠀⡀");
        System.out.println("⠟⠀⠀⢻⣶⣶⣾⣿⡟⠁⠀⠀⢸⣿⢅⠀⠈⣿⡇⠀⠀⠀⠀⠀⣷⠂⠀⠀⠀⠀⠐⠋⠉⠉⠀⢸⠁⠀⠀⠀⢻⣿⠛⠀⠀⠀⠀⢀⠇");
        System.out.println("⠀⠀⠀⠀⠹⣿⣿⠋⠀⠀⠀⠀⢸⣧⠀⠰⡀⢸⣷⣤⣤⡄⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡆⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⢼⡇");
        System.out.println("⠀⠀⠀⠀⠀⠙⢻⠄⠀⠀⠀⠀⣿⠉⠀⠀⠈⠓⢯⡉⠉⠉⢱⣶⠏⠙⠛⠚⠁⠀⠀⠀⠀⠀⣼⠇⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⡇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠻⠄⠀⠀⠀⢀⣿⠀⢠⡄⠀⠀⠀⣁⠁⡀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⢀⣐⡟⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⢠⡇");
    }

    static void stop(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ████████████████  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ██████████  ████████  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ████████  ██  ██  ██████  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░██  ██████████  ██  ██  ████████  ██░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░██  ████████  ██  ██  ██  ██████████  ██░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████  ██  ██  ██  ████████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████  ██  ██  ██  ████████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████  ██  ██  ██  ████████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████  ██          ██  ████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████              ██  ████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████              ██  ████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████                  ████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░██  ██████████                  ████████  ██░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░██  ████████                  ██████  ██░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░██  ████████              ██████  ██░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ████████          ██████  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ████████████████████  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██  ████████████████  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████████████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }
    
    static void bubbles(){
        System.out.println("                                        ▒▒▓▓▓▓▒▒                    ");
        System.out.println("                                      ▒▒░░▒▒▒▒▒▒▒▒                  ");
        System.out.println("                                    ▒▒░░  ░░░░▒▒▒▒▒▒                ");
        System.out.println("                                  ▒▒░░    ░░░░▒▒▒▒▒▒▒▒              ");
        System.out.println("                                  ▓▓░░  ░░░░▒▒▒▒▒▒▒▒▓▓              ");
        System.out.println("                                  ▓▓░░░░░░▒▒▒▒▒▒▒▒░░▓▓              ");
        System.out.println("                                  ▒▒░░░░▒▒▒▒▒▒▒▒░░░░▓▓              ");
        System.out.println("                                    ▒▒▒▒░░▒▒▒▒░░░░▒▒                ");
        System.out.println("                                      ▓▓▒▒▒▒░░░░▓▓                  ");
        System.out.println("                                        ▒▒▓▓▓▓▒▒                    ");
        System.out.println("            ▓▓▓▓▓▓▒▒                                                   ");   
        System.out.println("         ░░▓▓░░░░░░░░▓▓                                                   "); 
        System.out.println("        ▒▒░░  ░░░░░░▒▒▓▓                                                  ");
        System.out.println("        ▒▒  ░░░░▒▒▒▒▒▒▓▓                                                  ");
        System.out.println("        ▒▒░░░░▒▒▒▒▒▒▒▒▓▓                                                  ");
        System.out.println("        ▓▓░░▒▒▒▒▒▒▒▒░░▓▓                                                  ");
        System.out.println("        ░░▓▓▒▒▒▒▒▒░░▒▒░░                                                  ");
        System.out.println("          ░░▒▒▓▓▓▓▒▒░░                                          ▒▒▒▒▒▒    ");
        System.out.println("                                                              ▒▒  ░░▒▒▒▒  ");
        System.out.println("                                                              ▓▓  ░░▒▒▓▓  ");
        System.out.println("                                                              ▒▒░░▒▒░░▒▒  ");
        System.out.println("                                                                ▓▓▓▓▒▒    ");
        System.out.println("                                        ▒▒▓▓▓▓▓▓▓▓▓▓                         ");     
        System.out.println("                                    ▒▒▓▓  ░░░░▒▒▒▒▒▒▓▓▒▒                        ");  
        System.out.println("                                  ▓▓░░      ░░░░▒▒▒▒▒▒▒▒▒▒                        ");
        System.out.println("                                ▒▒░░          ░░░░▒▒▒▒▒▒▒▒▒▒                      ");
        System.out.println("                              ▒▒░░        ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒                    ");
        System.out.println("                              ▓▓          ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                    ");
        System.out.println("                            ▒▒▒▒        ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓                  ");
        System.out.println("                            ▓▓░░      ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓                  ");
        System.out.println("                            ▓▓░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓                  ");
        System.out.println("                            ▓▓░░▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓                  ");
        System.out.println("                            ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒▓▓                  ");
        System.out.println("                              ▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒                    ");
        System.out.println("                              ▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒                    ");
        System.out.println("                              ░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒░░                    ");
        System.out.println("                                ░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒░░                      ");
        System.out.println("                                  ░░▓▓▓▓▒▒▒▒▒▒░░░░▒▒▒▒▒▒░░                        ");
        System.out.println("                                        ▒▒▓▓▓▓▓▓▓▓▒▒                              ");
        System.out.println("                                        ░░░░░░░░  ░░                                 ");                                                                        
    }

    static void paysponge(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡷⠚⠛⠓⠶⠞⠋⠉⠁⠈⠙⠳⣤⣤⠶⠛⠉⠙⠛⠶⣤⣤⡶⠞⠋⠉⠉⠓⠶⣤⠶⠞⠋⠉⠙⠳⠶⠴⠶⠒⢶⣄⠀⠀⠀⠀⠀⠀⠀⠀⢾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡟⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⣿⠁⠀⠀⠀⠀⠀⠀⠀⢸⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣾⠃⠘⢳⡄⠀⠀⠀⠀⠀⠀⠀⣀⡄⢀⣠⣤⣤⣽⣍⡉⠛⠳⠤⣤⢀⠀⠀⠀⠀⠀⣠⡴⠚⡋⢩⣯⣽⣛⠦⣄⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢤⡟⠛⢀⠀⠀⣽⠀⠀⠀⠀⠀⠀⢸⣿⡟⠉⠠⣿⣿⣿⣿⡏⠹⠦⡄⠁⠀⠀⠀⠀⠀⣾⣥⠖⠛⣿⣿⣿⣿⡟⢻⣿⣇⠀⢻⣆⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡟⠀⢀⣾⣆⢠⡏⠀⠀⠀⠀⠀⠀⠘⠳⢧⣄⡀⠈⠉⠙⢉⣀⣤⠖⠃⠀⠀⠀⠀⠀⠀⠘⠻⢥⣄⡉⠉⠛⠛⠃⠉⠁⠛⠀⣸⡏⠀⠀⠀⠀⠀⠀⠀⢘⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠇⠀⣼⣿⣿⠘⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⡄⠉⠉⠉⠉⠉⠁⠀⠀⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠿⠋⠀⠀⣿⣿⡟⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠋⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⢺⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⠀⠀⠀⠘⠋⠁⠀⠀⠈⡇⠀⠀⠀⠀⠀⠀⢀⣀⡤⠖⠋⠁⠀⠀⠀⠈⠉⠉⠛⠓⠲⠶⠄⠀⠶⠶⠶⠀⠙⠲⣄⠀⠀⠀⠀⠸⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣦⠀⠀⠀⠀⣀⠀⠀⠀⢰⡏⠀⠀⠀⠀⢀⡴⠋⠁⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡄⠀⠀⣼⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣾⠇⠀⠀⢸⣿⡇⠀⠀⢸⡁⠀⠀⠀⠀⣺⠀⠀⣰⠶⢲⢻⡛⢿⠁⠉⢹⠉⠉⠉⠉⠉⢉⡙⠛⠛⠟⠛⡻⣶⣦⠀⠘⠇⠀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣆⠀⠀⠸⠟⠀⠀⠀⠈⢳⡀⠀⠀⠀⡟⠀⠀⠙⢿⣾⣼⡅⡼⠀⠀⠼⠰⣄⠸⠤⠤⣀⣁⣀⡀⢀⠀⢠⣿⠋⠀⠀⠀⠸⣇⠀⠀⠀⠀⡀⡀⠀⠀⠀⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠋⣷⠀⠀⠀⠀⢀⣦⡀⠀⣷⠀⠀⠀⢻⡀⠀⠀⠀⠽⣿⣶⣀⠐⠀⠀⠄⡈⢷⡀⠀⢀⡀⠠⠀⡋⣿⣿⠇⠀⠀⠀⠀⠀⢹⡆⠀⣰⠟⠉⠻⣆⠀⠀⠀⠀⣟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⠀⣾⣿⡇⢠⡟⠀⠀⠀⠈⠣⠀⠀⠀⠀⠷⣟⣀⡞⢲⡤⢤⡤⢬⣿⠀⣀⣄⠠⡦⠰⣿⠋⠀⠀⠀⠀⠀⠀⣼⣧⠞⠁⢰⡄⠀⠘⣇⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⣿⣿⠃⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⢧⣼⣀⢸⡇⠀⣸⠀⡟⠀⢀⣰⠤⠛⠀⠀⠀⠀⠀⠀⣴⣿⠟⠀⢀⡼⢧⠀⠀⢻⡀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠫⢷⡀⠀⢀⣼⡇⠀⠘⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠉⠛⠛⠛⠋⠁⠀⠀⠀⣴⣶⣆⠀⣼⡽⠃⣀⣴⣯⣀⠸⡇⠀⢸⡇⠀⠀⢼⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⡇⠀⠘⠿⠁⠀⠀⢨⡇⠀⠀⠀⢠⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⢀⠀⠀⠀⣼⢿⣿⠏⠀⢸⣶⠞⠁⣠⠀⠈⠛⢧⡀⢸⡇⠀⠀⢺⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⢰⣿⣿⡇⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣤⣤⣾⣿⠀⢸⠃⢀⡞⠀⠀⠛⣸⣿⣄⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢷⡄⠀⠀⠀⣀⣀⣹⡄⠀⠀⢸⣿⡿⠃⠀⠀⠀⠀⠀⠙⠦⣤⣤⠤⠒⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣿⣤⣼⣧⣼⣿⣿⣿⣿⡏⠀⠘⠧⠄⠠⠄⠤⠠⠤⠤⠤⠤⠠⠄⠐⠐⠂⠐⠒⠐⠒⠂");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣠⡾⠛⠋⠉⠉⠛⡷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣯⣿⣾⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠘⣧⠀⠀⠀⢠⡾⣯⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣯⣷⣿⣻⣿⣾⣟⣿⣿⣿⡿⣿⣿⣿⢿⣯⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⣈⣧⡀⠀⢸⣄⡀⠈⠹⠧⣀⡀⢀⣀⣠⠤⣄⡀⠀⣀⣀⣀⣼⣿⣿⣿⣿⣏⣿⡿⣧⣿⣿⡿⠀⢹⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠠⠤⠤⠤⠄⠤⠤⠤⠠⠄⠤⠤⠤⠠⠤⠤⠄⠦⠄⠆⠤⠠⠄⠰⠠⠒⢶⠾⣿⠉⠀⠙⠲⢤⣤⡟⠓⠦⢄⣀⡉⠛⠻⠦⠤⠬⠽⠯⠿⠿⠿⠷⠛⠛⠯⠉⠛⠛⠿⠿⣿⡿⠁⠀⡼⠀⡸⢩⣿⣿⣿⣿⡿⠿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⢹⣶⣤⣄⣀⣀⢸⡇⠀⠀⠀⠈⠉⠓⠶⠦⢤⣀⣠⠤⣤⣶⣦⣴⠶⠖⠒⠒⠒⣶⣤⣤⡤⣤⣤⣞⣁⡼⠷⠋⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⡀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⣹⠀⢸⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣻⣻⣿⣿⣿⣿⣿⡿⣽⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

    }


    static boolean inlists(String var, String[] list){
        Integer index = Arrays.binarySearch(list, var);
        if(index == -1){
            return false;
        }else{
            return true;
        }
    }

    static void showmenu(){
        System.out.println("");
        System.out.println("          Food:");
        System.out.println("Baby back ribs ----- $14.99");
        System.out.println("Soup of the day ----  $8.99");
        System.out.println("Filet mignon ------- $20.00");
        System.out.println("Chicken risotto ---- $14.99");    
        System.out.println("Beef lasagna ------- $12.99");
        System.out.println("");
        System.out.println("         Drinks:");
        System.out.println("Soda ---------------  $2.99");
        System.out.println("Water --------------  $1.99");
        System.out.println("Juice --------------  $3.99");
        System.out.println("");
        System.out.println("         Sides:");
        System.out.println("Green olive salad --  $3.40");
        System.out.println("French fries -------  $5.50");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


    static void showsecondmenu(){
        System.out.println("");
        System.out.println("         Desserts:");
        System.out.println("Chocolate cake -----  $9.99");
        System.out.println("Creme Brulee -------  $6.99");
        System.out.println("Fruits -------------  $3.00");
        System.out.println("Ice cream ----------  $5.99");
        System.out.println("");    
        System.out.println("         Coffees:");
        System.out.println("Cappuccino ---------  $2.99");
        System.out.println("Espresso -----------  $2.99");
        System.out.println("Macchiato ----------  $2.99");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    static void cashOrCard(Double totals, Double amountOfCash, Double amountOfCard, String name, String type){
        if (type.equals("card")){
            Scanner scanner = new Scanner(System.in);
            if (totals - amountOfCash <= 0){
                System.out.println("The bank accepted the transaction");  
                System.out.println("");
                System.out.println("Goodbye " + name + " and thank you for your visit.");
                System.out.println("");
                card();
            }else{
                System.out.println("Hmm thats weird, the bank has denied the transaction, do you have any");
                System.out.println("cash on you?");
                String acardtotry = scanner.nextLine();
                if (acardtotry.toLowerCase().equals("yes") || acardtotry.toLowerCase().equals("y")){
                    if ((totals - amountOfCash) - amountOfCard <= 0){
                        clearScreen();
                        System.out.println("Awesome, and you are left with: ");
                        if ((int)((amountOfCard + amountOfCash) - totals) > 0){
                            System.out.println((int)((amountOfCard + amountOfCash) - totals) + " dollars");
                        }
                        if ((((((amountOfCard + amountOfCash) - totals) - ((int)((amountOfCard + amountOfCash) - totals)) * 1.00)) * 100) > 0 && (int)((amountOfCard + amountOfCash) - totals) > 0){
                            System.out.println("and");  
                        }
                        if ((((((amountOfCard + amountOfCash) - totals) - ((int)((amountOfCard + amountOfCash) - totals)) * 1.00)) * 100) > 0){
                            
                            System.out.println(Math.round((((((amountOfCard + amountOfCash) - totals) - ((int)((amountOfCard + amountOfCash) - totals)) * 1.00)) * 100)) + " cents");
                        }
                        if ((((((amountOfCard + amountOfCash) - totals) - ((int)((amountOfCard + amountOfCash) - totals)) * 1.00)) * 100) > 0 && (int)((amountOfCard + amountOfCash) - totals) > 0){
                            System.out.println("Or: $" + decfor.format((amountOfCard + amountOfCash) - totals));
                        }
                        System.out.println(""); 
                        System.out.println("Goodbye " + name + " and thank you for your visit.");
                        System.out.println("");
                        Random rand = new Random();
                        int judge = rand.nextInt(1, 6);
                        if (judge < 3){
                            cash();
                        }else{
                            paysponge();
                        }    
                    }else{
                        clearScreen();
                        System.out.println("Well, of to wash the dishes then");
                        System.out.println("");
                        bubbles();

                    }
                }else if (acardtotry.toLowerCase().equals("no") || acardtotry.toLowerCase().equals("n")){
                    clearScreen();
                    System.out.println("Well, of to wash the dishes then");
                    System.out.println("");
                    bubbles();
                }else{
                    while (!(acardtotry.toLowerCase().equals("yes") || acardtotry.toLowerCase().equals("y") || (acardtotry.toLowerCase().equals("no") || acardtotry.toLowerCase().equals("n")))){
                        System.out.println("Please answer with a yes or no: ");
                        acardtotry = scanner.nextLine();
                    }

                }
            }
        }    
        
        if (type.equals("cash")){
            System.out.println("So you have " + ((int)(amountOfCash * 1.00)) + " dollars in cash.");
            Scanner scanner = new Scanner(System.in);
            if (totals - amountOfCash <= 0){
                System.out.println("Awesome, and you are left with: ");
                if ((int)(amountOfCash - totals) > 0){
                    System.out.println((int)(amountOfCash - totals) + " dollars");
                }
                if ((((amountOfCash - totals) - ((int)(amountOfCash - totals) * 1.00)) * 100) > 0 && ((int)(amountOfCash - totals) > 0)){
                    System.out.println("and");  
                }
                if ((((((amountOfCash + amountOfCard) - totals) - ((int)((amountOfCash + amountOfCard) - totals)) * 1.00)) * 100) > 0){  
                    System.out.println(Math.round(((((amountOfCash - totals) - ((int)(amountOfCash - totals)) * 1.00)) * 100)) + " cents");
                }
                if ((((amountOfCash - totals) - ((int)(amountOfCash - totals) * 1.00)) * 100) > 0 && ((int)(amountOfCash - totals) > 0)){
                    System.out.println("Or: $" + decfor.format(amountOfCash - totals));
                }
                System.out.println("");
                System.out.println("Goodbye " + name + " and thank you for your visit.");
                System.out.println("");
                Random rand = new Random();
                int judge = rand.nextInt(1, 6);
                if (judge < 3){
                    cash();
                }else{
                    paysponge();
                } 
            }else{
                System.out.println("Hmm thats weird, you dont seem to have enough money, is there a card");
                System.out.println("you would like to try?");
                String acardtotry = scanner.nextLine();
                if (acardtotry.toLowerCase().equals("yes") || acardtotry.toLowerCase().equals("y")){
                    if ((totals - amountOfCash) - amountOfCard <= 0){
                        clearScreen();
                        System.out.println("The bank accepted the transaction");  
                        System.out.println("Goodbye " + name + " and thank you for your visit.");
                        System.out.println("");
                        card();          
                    }else{
                       clearScreen();
                        System.out.println("The bank denied the transaction"); 
                        System.out.println("Well, of to wash the dishes then"); 
                    }
                }else if (acardtotry.toLowerCase().equals("no") || acardtotry.toLowerCase().equals("n")){
                    clearScreen();
                    System.out.println("Well, of to wash the dishes then");
                    System.out.println("");
                    bubbles();
                }else{
                    while (!(acardtotry.toLowerCase().equals("yes") || acardtotry.toLowerCase().equals("y") || (acardtotry.toLowerCase().equals("no") || acardtotry.toLowerCase().equals("n")))){
                        System.out.println("Please answer with a yes or no: ");
                        acardtotry = scanner.nextLine();
                    }

                }

            }
        }
    }

    static void paynow(String name, String total){
        // if (out == false){
        Scanner scanner = new Scanner(System.in);
        Double amountOfCash = 50.00;
        Double amountOfCard = 200.00;
        Boolean paid = false;
        System.out.println("");
        System.out.println("So, will you be paying with cash or card?");
        String cash_or_card = scanner.nextLine();
        double totals = Double.parseDouble(total);
            
        while (!paid){
            if (cash_or_card.toLowerCase().equals("cash")){
                paid = true;
                clearScreen();
                cashOrCard(totals, amountOfCash, amountOfCard, name, "cash");

            }else if (cash_or_card.toLowerCase().equals("card")){
                paid = true;
                clearScreen();
                cashOrCard(totals, amountOfCard, amountOfCash, name, "card");

            }else if(cash_or_card.toLowerCase().equals("egg") || cash_or_card.toLowerCase().equals("eggs")){
                paid = true;
                clearScreen();
                System.out.println("Only a true chad pays with eggs.");
                System.out.println("");
                gigachad();
                System.out.println("");
                System.out.println("Have an amazing day.");

            }else{
                clearScreen();
                System.out.println("Please select a proper payment method.");
                System.out.println("");
                System.out.println("Will you be paying with cash or card?");
                cash_or_card = scanner.nextLine();      
            }
        }
        scanner.close();
    }
    static void description(String numero){
        Random rand = new Random();
        int judge = rand.nextInt(1, 5);
        switch(numero){
            case "baby back ribs?":
                clearScreen();
                System.out.println("Baby Back Ribs");
                System.out.println("Our famous ribs dipped in our own delicious");
                System.out.println("barbeque sauce and tossed with a multitude ");
                System.out.println("of herbs and spices.");
                break;

            case "soup of the day?":
                clearScreen();
                System.out.println("Soup of the day");
                System.out.println("Our delicious onion soup topped with large ");
                System.out.println("slices or cubes of garlic bread.           ");
                break;

            case "filet mignon?":
                clearScreen();
                System.out.println("Filet mignon");
                System.out.println("A high quality cut of meat seared with herbs");
                System.out.println("to perfection and served with butter. ");
                break;

            case "chicken risotto?":
                clearScreen();
                System.out.println("Chicken risotto");
                System.out.println("Mixed butter and rice serverd with pieces of");
                System.out.println("chicken and topped with shredded parmesan");
                break;
                
            case "beef lasagna?":
                clearScreen();
                System.out.println("Beef lasagna");
                judge = rand.nextInt(1, 6);
                if (judge < 3){
                    System.out.println("A saucey lasagna filled with ground beef and");
                    System.out.println("topped with shredded parmesan ");
                }else{
                    System.out.println("The stuff garfield eats");
                }
                break;

            case "soda?":
                clearScreen();
                System.out.println("Soda");
                System.out.println("Our own carbonated concoction with hints of ");
                System.out.println("sweetness and a cherry flavor");
                break;

            case "water?":
                clearScreen();
                System.out.println("Water");
                judge = rand.nextInt(1, 6);
                if (judge < 3){
                    System.out.println("Refreshing spring water straight from the");
                    System.out.println("source with a multitude of minerals");
                }else{
                    System.out.println("You know what water is");
                }
                break;

            case "juice?":
                clearScreen();
                System.out.println("Juice");
                System.out.println("A cup of freshly squeezed fruit punch juice");
                break;

            case "green olive salad?":
                clearScreen();
                System.out.println("Green olive salad");
                System.out.println("A salad of lettuce, tomato and green olives");
                System.out.println("drenched in vinegar and olive oil ");
                break;

            case "french fries?":
                clearScreen();
                System.out.println("French fries");
                System.out.println("Salted potato slices deep fried to perfection");
                System.out.println("with ketchup on the side ");
                break;

            case "chacolate cake?":
                clearScreen();
                System.out.println("Chocolate cake");
                System.out.println("A chocolate delight with strawberries around");
                System.out.println("the rim of the pastry ");
                break;
            
            case "creme brulee?":
                clearScreen();
                System.out.println("Creme Brulee");
                System.out.println("Dessert with a rich custard base topped with");
                System.out.println("a layer of hardened caramelized sugar ");
                System.out.println("of herbs and spices.");
                break;

            case "fruits?":
                clearScreen();
                System.out.println("Fruits");
                System.out.println("A bowl of fruit consiting of apples, mangos,");
                System.out.println("watermelon, melon and pineapple ");
                break;

            case "ice cream?":
                clearScreen();
                System.out.println("Ice cream");
                System.out.println("A neopolitan blend of vanilla, strawberry and");
                System.out.println("chocolate served with sprinkles and chocolate ");
                System.out.println("sauce with a cherry on top");
                break;

            case "cappuccino?":
                clearScreen();
                System.out.println("Cappuccino");
                System.out.println("A coffee with equal parts espresso as steamed");
                System.out.println("milk and milk foam ");
                break;
            
            case "espresso?":
                clearScreen();
                System.out.println("Espresso");
                System.out.println("A coffee with no milk served in a small");
                System.out.println("shot-like cup ");
                break;
            
            case "macchiato?":
                clearScreen();
                System.out.println("Macchiato");
                System.out.println("A coffee with small amounts of foamed milk");
                break;

            
        }
    }



    
    static void menupower(String name){
        // String[] regularmenu = {"baby back ribs", "soup of the day", "filet mignon", "chicken risotto", "beef lasagna", "soda", "water", "juice", "green olive salad", "french fries"};
        // //Double[] regularmenuprices = {, 12.99, 2.99, 1.99, 3.99, 3.40, 5.50};
        Scanner ask = new Scanner(System.in);
        clearScreen();
        Integer counter1 = 1;
        Random rand = new Random();
        int table = rand.nextInt(1, 101);
        System.out.println("Good");
        System.out.println("So, your table number is " + table);
        System.out.println("Would you like to see our menu? ");
        String ask4menu = ask.nextLine();
        

        while (counter1 == 1){
            if (ask4menu.toLowerCase().equals("y") || ask4menu.toLowerCase().equals("yes")){
                clearScreen();
                counter1 = 0;
                
                
                //THE MENU!!!!!!

                Boolean counter2 = false;
                Boolean counter3 = true;
                Boolean detector1 = true;

                ArrayList<String> bought = new ArrayList<String>();
                ArrayList<String> bought2 = new ArrayList<String>();
                
                double totalCost = 0.0;
                double totalCost2 = 0.0;

                Map<String, Double> regularmenu = new HashMap<>();
                regularmenu.put("baby back ribs", 14.99);
                regularmenu.put("soup of the day", 8.99);
                regularmenu.put("filet mignon", 20.00);
                regularmenu.put("chicken risotto", 14.99);
                regularmenu.put("beef lasagna", 12.99);
                regularmenu.put("soda", 2.99);
                regularmenu.put("water", 1.99);
                regularmenu.put("juice", 3.99);
                regularmenu.put("green olive salad", 3.40);
                regularmenu.put("french fries", 5.50);

                Map<String, Double> secondmenu = new HashMap<>();
                secondmenu.put("chocolate cake", 9.99);
                secondmenu.put("creme brulee", 6.99);
                secondmenu.put("fruits", 3.00);
                secondmenu.put("ice cream", 5.99);
                secondmenu.put("cappuccino", 2.99);
                secondmenu.put("espresso", 2.99);
                secondmenu.put("macchiato", 2.99);

                boolean charging = true;
                System.out.println("This is our list of dishes today: ");
                showmenu();                
                System.out.println("What would you like to order? ");
                String item = ask.nextLine();

                while(item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                    clearScreen();
                    System.out.println("You came to this restaurant, you made a reservation, so you better order something!");
                    System.out.println("");
                    showmenu();
                    System.out.println("What would you like to order? ");
                    item = ask.nextLine();
                }

                Boolean stagehazard = true;
                while (regularmenu.containsKey(item.toLowerCase()) != true && !(item.toLowerCase().contains("?") && regularmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1)))){
                    clearScreen();
                    showmenu();
                    System.out.println("Im sorry, that doesnt seem to be in the menu, could you try again? ");
                    System.out.println("What would you like to order? ");
                    item = ask.nextLine();
                    if (item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                        counter2 = false;
                        stagehazard = false;
                        charging = false;
                        clearScreen();
                        item = ("soda");
                    }
                }
                
                Boolean confirmed = true;
                String ask2menu = "";

                if (stagehazard){

                    if ((item.toLowerCase().contains("?")) && regularmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                        description(item.toLowerCase());
                        item = item.toLowerCase().replace("?", "");
                        System.out.println("Would you like to order it? ");
                        String yers = ask.nextLine();
                        if (yers.toLowerCase().equals("yes") || yers.toLowerCase().equals("Yes")){
                            clearScreen();
                            showmenu();
                            confirmed = true;
                        }else{
                            clearScreen();
                            showmenu();
                            System.out.println("What would you like to order?");
                            item = ask.nextLine();
                            confirmed = false;
                        }
                    }
                    if (confirmed == true){
                        clearScreen();
                        System.out.println("Anything else? ");
                        ask2menu = ask.nextLine();
                    }

                    confirmed = true;

                    while (charging == true){

                        if ((item.toLowerCase().contains("?")) && regularmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                            description(item.toLowerCase());
                            item = item.toLowerCase().replace("?", "");
                            System.out.println("Would you like to order it? ");
                            String yers = ask.nextLine();
                            if (yers.toLowerCase().equals("yes") || yers.toLowerCase().equals("Yes")){
                                clearScreen();
                                showmenu();
                                confirmed = true;
                            }else{
                                clearScreen();
                                showmenu();
                                System.out.println("What would you like to order?");
                                item = ask.nextLine();
                                confirmed = false;
                            }
                        }

                        if (regularmenu.containsKey(item.toLowerCase()) || (item.toLowerCase().contains("?")) && regularmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                            clearScreen();

                            if(counter2){
                                
                                if (confirmed == true){
                                    clearScreen();
                                    System.out.println("Anything else? ");
                                    ask2menu = ask.nextLine();
                                }
                            }

                            counter2 = false;

                            if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                bought.add(item.toLowerCase());
                                // totalCost += regularmenu.get(item.toLowerCase());
                                clearScreen();
                                showmenu();
                                System.out.println("What would you like to order? ");
                                item = ask.nextLine();
                                counter2 = true;

                                if (item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                                    counter2 = false;
                                    ask2menu = "n";
                                }
                                
                                
                            }else if (ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no")){
                                charging = false;
                                bought.add(item.toLowerCase());
                                // totalCost += regularmenu.get(item.toLowerCase());
                                

                                //Start of coffee and desserts

                                clearScreen();
                                System.out.println("Would you like any coffee or desserts? ");
                                String truesecond = ask.nextLine();


                                while (!(truesecond.toLowerCase().equals("y") || truesecond.toLowerCase().equals("yes") || truesecond.toLowerCase().equals("n") || truesecond.toLowerCase().equals("no"))){
                                    clearScreen();
                                    System.out.println("Please answer with a yes or no");
                                    System.out.println("");
                                    System.out.println("Would you like any coffee or desserts? ");
                                    truesecond = ask.nextLine();
                                    
                                } 

                                if (truesecond.toLowerCase().equals("y") || truesecond.toLowerCase().equals("yes")){
                                    clearScreen();
                                    System.out.println("This is our list of coffees and desserts: ");
                                    showsecondmenu();
                                    while (counter3 == true){         
                                        System.out.println("What would you like to order? ");
                                        item = ask.nextLine();

                                        if ((item.toLowerCase().contains("?")) && secondmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                                            description(item.toLowerCase());
                                            item = item.toLowerCase().replace("?", "");
                                            System.out.println("Would you like to order it? ");
                                            String yers = ask.nextLine();
                                            if (yers.toLowerCase().equals("yes") || yers.toLowerCase().equals("Yes")){
                                                clearScreen();
                                                showsecondmenu();
                                                confirmed = true;
                                            }else{
                                                clearScreen();
                                                showsecondmenu();
                                                System.out.println("What would you like to order?");
                                                item = ask.nextLine();
                                                confirmed = false;
                                            }
                                        }

                                        if (secondmenu.containsKey(item.toLowerCase())){
                                            bought2.add(item.toLowerCase());
                                            clearScreen();
                                            
                                            if (confirmed == true){
                                                clearScreen();
                                                System.out.println("Anything else? ");
                                                ask2menu = ask.nextLine();
                                            }
                                            confirmed = true;

                                            
                                            if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                                 clearScreen();
                                                 showsecondmenu();
                                            }else if (ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no")){
                                                counter3 = false;
                                            }else{
                                                while(!(ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no") || ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes"))){
                                                    clearScreen();
                                                    System.out.println("Please answer with a yes or a no");
                                                    System.out.println("Anything else? ");
                                                    ask2menu = ask.nextLine();
                                                    
                                                    }
                                                }
                                                if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                                    clearScreen();
                                                    showsecondmenu();
                                                }else{
                                                    counter3 = false;
                                            }

                                        }else{
                                            if (item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                                                counter3 = false;
                                            }else{
                                                clearScreen();
                                                showsecondmenu();
                                                System.out.println("Im sorry, that doesnt seem to be in the menu, could you try again? ");
                                            }
                                        }
                                    }
                                }
                                if (truesecond.toLowerCase().equals("n") || truesecond.toLowerCase().equals("no")){
                                     counter3 = false;
                                }
                                
                                //End of coffee and desserts

                                //PRINT FINAL
                                clearScreen();
                                System.out.println("Table number: " + table);
                                System.out.println("");

                                Set<String> set = new LinkedHashSet<>(bought);
                                List<String> sets = new ArrayList<>(set);

                                Set<String> set2 = new LinkedHashSet<>(bought2);
                                List<String> sets2 = new ArrayList<>(set2);

                                for (int i = 0; i < sets.size(); i++){
                                    System.out.println(Collections.frequency(bought, bought.get(i)) + " " + sets.get(i).substring(0, 1).toUpperCase() + sets.get(i).substring(1) + " $" + regularmenu.get(sets.get(i)) * Collections.frequency(bought, bought.get(i)));
                                            totalCost += regularmenu.get(sets.get(i)) * Collections.frequency(bought, bought.get(i));
                                }

                                for (int i = 0; i < sets2.size(); i++){
                                    System.out.println(Collections.frequency(bought2, bought2.get(i)) + " " + sets2.get(i).substring(0, 1).toUpperCase() + sets2.get(i).substring(1) + " $" + secondmenu.get(sets2.get(i)) * Collections.frequency(bought2, bought2.get(i)));
                                            totalCost2 += secondmenu.get(sets2.get(i)) * Collections.frequency(bought2, bought2.get(i));
                                }
                                
                                System.out.println("");
                                // System.out.println(bought);
                                // System.out.println(bought2);
                                System.out.println("Total: " + decfor.format(totalCost + totalCost2));
                                double rounded = (totalCost + totalCost2)*1.28;
                                System.out.println("Total with taxes: " + decfor.format(rounded));
                                String tax = decfor.format(rounded - (totalCost + totalCost2));
                                System.out.println("Your tax is: " + tax);
                                paynow(name, decfor.format(rounded));

                            }else{
                                bought.add(item.toLowerCase());
                                while (counter2 == false){
                                    clearScreen();
                                    //System.out.println(ask4menu);

                                    if ((item.toLowerCase().contains("?")) && regularmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                                        description(item.toLowerCase());
                                        item = item.toLowerCase().replace("?", "");
                                        System.out.println("Would you like to order it? ");
                                        String yers = ask.nextLine();
                                        if (yers.toLowerCase().equals("yes") || yers.toLowerCase().equals("Yes")){
                                            clearScreen();
                                            showmenu();
                                            confirmed = true;
                                        }else{
                                            clearScreen();
                                            showmenu();
                                            System.out.println("What would you like to order?");
                                            item = ask.nextLine();
                                            confirmed = false;
                                        }
                                    }
                                    if (confirmed == true){
                                        clearScreen();
                                        System.out.println("Please answer with a yes or a no");
                                        System.out.println("Anything else? ");
                                        ask2menu = ask.nextLine();
                                    }
                                    // System.out.println(bought);  

                                    if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                        counter2 = true;

                                    }else if (ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no")){
                                        charging = false;
                                        counter2 = true;
                                        clearScreen();

                                        //Start of coffee and desserts

                                        System.out.println("Would you like any coffee or desserts? ");
                                        String truesecond = ask.nextLine();


                                        while (!(truesecond.toLowerCase().equals("y") || truesecond.toLowerCase().equals("yes") || truesecond.toLowerCase().equals("n") || truesecond.toLowerCase().equals("no"))){
                                            clearScreen();
                                            System.out.println("Please answer with a yes or no");
                                            System.out.println("");
                                            System.out.println("Would you like any coffee or desserts? ");
                                            truesecond = ask.nextLine();
                                            
                                        } 

                                        if (truesecond.toLowerCase().equals("y") || truesecond.toLowerCase().equals("yes")){
                                            clearScreen();
                                            System.out.println("This is our list of coffees and desserts: ");
                                            showsecondmenu();
                                            while (counter3 == true){         
                                                System.out.println("What would you like to order? ");
                                                item = ask.nextLine();

                                                if ((item.toLowerCase().contains("?")) && secondmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                                                    description(item.toLowerCase());
                                                    item = item.toLowerCase().replace("?", "");
                                                    System.out.println("Would you like to order it? ");
                                                    String yers = ask.nextLine();
                                                    if (yers.toLowerCase().equals("yes") || yers.toLowerCase().equals("Yes")){
                                                        clearScreen();
                                                        showsecondmenu();
                                                        confirmed = true;
                                                    }else{
                                                        clearScreen();
                                                        showsecondmenu();
                                                        System.out.println("What would you like to order?");
                                                        item = ask.nextLine();
                                                        confirmed = false;
                                                    }
                                                }
                                                if (secondmenu.containsKey(item.toLowerCase())){
                                                    bought2.add(item.toLowerCase());
                                                    clearScreen();
                                                    
                                                    if (confirmed == true){
                                                        clearScreen();
                                                        System.out.println("Anything else? ");
                                                        ask2menu = ask.nextLine();
                                                    }
                                                    confirmed = true;
                                                    
                                                    if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                                        clearScreen();
                                                        showsecondmenu();
                                                    }else if (ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no")){
                                                        counter3 = false;
                                                    }else{
                                                        while(!(ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no") || ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes"))){
                                                            clearScreen();
                                                            System.out.println("Please answer with a yes or a no");
                                                            System.out.println("Anything else? ");
                                                            ask2menu = ask.nextLine();
                                                               
                                                        }
                                                        if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                                            clearScreen();
                                                            showsecondmenu();
                                                        }else{
                                                            counter3 = false;
                                                        }
                                                    }

                                                }else{
                                                    if (item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                                                         counter3 = false;
                                                    }else{
                                                        clearScreen();
                                                        showsecondmenu();
                                                        System.out.println("Im sorry, that doesnt seem to be in the menu, could you try again? ");
                                                    }
                                                }
                                            }
                                        }
                                        if (truesecond.toLowerCase().equals("n") || truesecond.toLowerCase().equals("no")){
                                             counter3 = false;
                                        }
                                        
                                        //End of coffee and desserts

                                        //PRINT FINAL
                                        clearScreen();
                                        System.out.println("Table number: " + table);
                                        System.out.println("");

                                        Set<String> set = new LinkedHashSet<>(bought);
                                        List<String> sets = new ArrayList<>(set);

                                        Set<String> set2 = new LinkedHashSet<>(bought2);
                                        List<String> sets2 = new ArrayList<>(set2);

                                        for (int i = 0; i < sets.size(); i++){
                                            System.out.println(Collections.frequency(bought, bought.get(i)) + " " + sets.get(i).substring(0, 1).toUpperCase() + sets.get(i).substring(1) + " $" + regularmenu.get(sets.get(i)) * Collections.frequency(bought, bought.get(i)));
                                                    totalCost += regularmenu.get(sets.get(i)) * Collections.frequency(bought, bought.get(i));
                                        }

                                        for (int i = 0; i < sets2.size(); i++){
                                            System.out.println(Collections.frequency(bought2, bought2.get(i)) + " " + sets2.get(i).substring(0, 1).toUpperCase() + sets2.get(i).substring(1) + " $" + secondmenu.get(sets2.get(i)) * Collections.frequency(bought2, bought2.get(i)));
                                                    totalCost2 += secondmenu.get(sets2.get(i)) * Collections.frequency(bought2, bought2.get(i));
                                        }
                                        
                                        System.out.println("");
                                        // System.out.println(bought);
                                        // System.out.println(bought2);
                                        System.out.println("Total: " + decfor.format(totalCost + totalCost2));
                                        double rounded = (totalCost + totalCost2)*1.28;
                                        System.out.println("Total with taxes: " + decfor.format(rounded));
                                        String tax = decfor.format(rounded - (totalCost + totalCost2));
                                        System.out.println("Your tax is: " + tax);
                                        paynow(name, decfor.format(rounded));

                                    }
                                
                                }
                                
                                counter2 = false;
                            
                            }
                            
                        }else{

                            if (item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                                counter2 = false;
                                stagehazard = false;
                                charging = false;
                                clearScreen();
                                item = ("soda");

                                //Start of coffee and desserts

                                clearScreen();
                                System.out.println("Would you like any coffee or desserts? ");
                                String truesecond = ask.nextLine();


                                while (!(truesecond.toLowerCase().equals("y") || truesecond.toLowerCase().equals("yes") || truesecond.toLowerCase().equals("n") || truesecond.toLowerCase().equals("no"))){
                                    clearScreen();
                                    System.out.println("Please answer with a yes or no");
                                    System.out.println("");
                                    System.out.println("Would you like any coffee or desserts? ");
                                    truesecond = ask.nextLine();
                                    
                                } 

                                if (truesecond.toLowerCase().equals("y") || truesecond.toLowerCase().equals("yes")){
                                    clearScreen();
                                    System.out.println("This is our list of coffees and desserts: ");
                                    showsecondmenu();
                                    while (counter3 == true){         
                                        System.out.println("What would you like to order? ");
                                        item = ask.nextLine();

                                        if ((item.toLowerCase().contains("?")) && secondmenu.containsKey(item.toLowerCase().substring(0, item.toLowerCase().length() - 1))){
                                            description(item.toLowerCase());
                                            item = item.toLowerCase().replace("?", "");
                                            System.out.println("Would you like to order it? ");
                                            String yers = ask.nextLine();
                                            if (yers.toLowerCase().equals("yes") || yers.toLowerCase().equals("Yes")){
                                                clearScreen();
                                                showsecondmenu();
                                                confirmed = true;
                                            }else{
                                                clearScreen();
                                                showsecondmenu();
                                                System.out.println("What would you like to order?");
                                                item = ask.nextLine();
                                                confirmed = false;
                                            }
                                        }

                                        if (secondmenu.containsKey(item.toLowerCase())){
                                            bought2.add(item.toLowerCase());
                                            clearScreen();

                                            
                                            
                                            if (confirmed == true){
                                                clearScreen();
                                                System.out.println("Anything else? ");
                                                ask2menu = ask.nextLine();
                                            }
                                            confirmed = true;


                                            if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                                 clearScreen();
                                                 showsecondmenu();
                                            }else if (ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no")){
                                                counter3 = false;
                                            }else{
                                                while(!(ask2menu.toLowerCase().equals("n") || ask2menu.toLowerCase().equals("no") || ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes"))){
                                                    clearScreen();
                                                    System.out.println("Please answer with a yes or a no");
                                                    System.out.println("Anything else? ");
                                                    ask2menu = ask.nextLine();

                                                }
                                                if (ask2menu.toLowerCase().equals("y") || ask2menu.toLowerCase().equals("yes")){
                                                    clearScreen();
                                                    showsecondmenu();
                                                }else{
                                                    counter3 = false;
                                                }
                                            }

                                        }else{
                                            if (item.toLowerCase().equals("nothing") || item.toLowerCase().equals("no") || item.toLowerCase().equals("n")){
                                                 counter3 = false;
                                            }else{
                                                clearScreen();
                                                showsecondmenu();
                                                System.out.println("Im sorry, that doesnt seem to be in the menu, could you try again? ");
                                            }
                                        }
                                    }
                                }
                                if (truesecond.toLowerCase().equals("n") || truesecond.toLowerCase().equals("no")){
                                     counter3 = false;
                                }
                                
                                //End of coffee and desserts

                                //PRINT FINAL
                                clearScreen();
                                System.out.println("Table number: " + table);
                                System.out.println("");

                                Set<String> set = new LinkedHashSet<>(bought);
                                List<String> sets = new ArrayList<>(set);

                                Set<String> set2 = new LinkedHashSet<>(bought2);
                                List<String> sets2 = new ArrayList<>(set2);

                                for (int i = 0; i < sets.size(); i++){
                                    System.out.println(Collections.frequency(bought, bought.get(i)) + " " + sets.get(i).substring(0, 1).toUpperCase() + sets.get(i).substring(1) + " $" + regularmenu.get(sets.get(i)) * Collections.frequency(bought, bought.get(i)));
                                            totalCost += regularmenu.get(sets.get(i)) * Collections.frequency(bought, bought.get(i));
                                }

                                for (int i = 0; i < sets2.size(); i++){
                                    System.out.println(Collections.frequency(bought2, bought2.get(i)) + " " + sets2.get(i).substring(0, 1).toUpperCase() + sets2.get(i).substring(1) + " $" + secondmenu.get(sets2.get(i)) * Collections.frequency(bought2, bought2.get(i)));
                                            totalCost2 += secondmenu.get(sets2.get(i)) * Collections.frequency(bought2, bought2.get(i));
                                }
                                
                                System.out.println("");
                                // System.out.println(bought);
                                // System.out.println(bought2);
                                System.out.println("Total: " + decfor.format(totalCost + totalCost2));
                                double rounded = (totalCost + totalCost2)*1.28;
                                System.out.println("Total with taxes: " + decfor.format(rounded));
                                String tax = decfor.format((rounded - (totalCost + totalCost2)));
                                System.out.println("Your tax is: " + tax);
                                detector1 = false;
                                paynow(name, decfor.format(rounded));
                            
                            }

                            if(detector1 == true){
                                clearScreen();
                                showmenu();
                                System.out.println("Im sorry, that doesnt seem to be in the menu, could you try again? ");
                                System.out.println("What would you like to order? ");
                                item = ask.nextLine();
                            }
                            
                            //System.out.println(bought);
                        }
                    }       
                
                }
                if (!stagehazard && detector1 == true){
                    clearScreen();
                    System.out.println("Get out!");
                    System.out.println("");
                    getoutnow();
                    // out = true;
                    System.out.println("");
                } 

                //END OF MENU!!!!!!!!


            }else if (ask4menu.toLowerCase().equals("n") || ask4menu.toLowerCase().equals("no")){

                clearScreen();
                counter1 = 0;
                System.out.println("What are you doing in our restaurant then, get out!");
                System.out.println(""); 
                getoutnow();
                // out = true;
                System.out.println("");

            }else{

                clearScreen();
                // System.out.println(ask4menu);
                while (!(ask4menu.toLowerCase().equals("n") || ask4menu.toLowerCase().equals("no") || ask4menu.toLowerCase().equals("y") || ask4menu.toLowerCase().equals("yes"))){
                    clearScreen();
                    System.out.println("Please answer with a yes or a no");
                    System.out.println("Would you like to see our menu? ");
                    ask4menu = ask.nextLine();
                }
            }
        }
    }   

    public static void main(String[] args){
        //String[] bill = {};
        
        clearScreen();
        Scanner asks = new Scanner(System.in);
        
        System.out.println("Hello good sir or miss, welcome to the Chou-fleur, do you have a reservation with us? ");
        String yesorno = asks.nextLine();
        System.out.println("");
        if (yesorno.toLowerCase().equals("y") || yesorno.toLowerCase().equals("yes")){
            clearScreen();
            System.out.println("And whats the name on your reservation? ");
            String name = asks.nextLine();
            if (name.toLowerCase().equals("shrek")){
                clearScreen();
                shrek();
                System.out.println("");
                System.out.println("Shrek will now judge your soul");
                System.out.println("");
                Random rand = new Random();
                int judge = rand.nextInt(1, 5);
                if (judge < 4){
                    System.out.println("You are not worthy");
                }else{
                    System.out.println("You are worthy");
                }

                
            }else{
                menupower(name);
            }
           

        }else if (yesorno.toLowerCase().equals("no") || yesorno.toLowerCase().equals("no")){
            clearScreen();
            System.out.println("Then, youre not welcomed.");
            System.out.println("");
            stop();
        }else{
            while (!(yesorno.toLowerCase().equals("y") || yesorno.toLowerCase().equals("yes") || yesorno.toLowerCase().equals("n") || yesorno.toLowerCase().equals("no"))){
                clearScreen();
                System.out.println("Im not sure I understand, please answer with yes or no.");
                System.out.println("Do you have a reservation with us?");
                yesorno = asks.nextLine();
            }
            if (yesorno.toLowerCase().equals("y") || yesorno.toLowerCase().equals("yes")){
                clearScreen();
                System.out.println("And whats the name on your reservation? ");
                String name = asks.nextLine();
                menupower(name);

            }else if (yesorno.toLowerCase().equals("no") || yesorno.toLowerCase().equals("no")){
                clearScreen();
                System.out.println("Then, youre not welcomed.");
                System.out.println("");
                stop();

            }      
        }
        asks.close();
    }
}
