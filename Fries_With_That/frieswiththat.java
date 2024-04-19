package Fries_With_That;
//Sebastian

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class frieswiththat {

    private static final DecimalFormat decfor = new DecimalFormat("0.00"); 

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     }

    //Jose
    public static void cafe(double menutotal, ArrayList<String> bought) {
        clearScreen();

        String[] menuItems = {"expresso", "machiato", "cappuccino", "veneno", "bizcocho", "tres leches", "milhojas", "cangreburger"};
        double[] menuPrices = {2.50, 3.00, 3.50, 4.00, 3.00, 4.50, 3.50, 5.00};

        
 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            clearScreen();
            System.out.println("Desea usted postre o cafe?");
            String frecura = scanner.nextLine();
           
            if (frecura.equalsIgnoreCase ("si")){
                clearScreen();
                break;
            }
            
            else if (frecura.equalsIgnoreCase ("no")){
                clearScreen();
                for (int i = 0; i < bought.size(); i++) {
                    System.out.println(bought.get(i));
                }
                System.out.println("El costo total es: $" + decfor.format( + menutotal));
                System.out.println("Con impuestos: $" + decfor.format(menutotal * 1.28));
                double totalDOP = (int)(menutotal * 56.2);
                double totalDOPimp = (int)(((menutotal) * 1.18) * 56.2);
                System.out.println("Total Cost in Dominican Pesos (DOP): " + (int)totalDOP);
                System.out.println("Con impuestos: $" + totalDOPimp);
                System.out.println("How would you like to pay? (Cash or Card): ");
                String paymentMethod = scanner.nextLine();
            
                if (paymentMethod.equalsIgnoreCase("cash")) {
                    System.out.print("¿Con cuánto va a pagar en efectivo? $");
                    double payment = scanner.nextDouble();
                    double change = payment - (int)totalDOPimp;

                    if (change >= 0) {
                        System.out.println("Su cambio es: $" + (int)(change));
                        int[] denominations = {2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
                        System.out.println("Su cambio es:");
                        for (int i = 0; i < denominations.length; i++) {
                            int count = (int) (change / denominations[i]);
                            if (count > 0) {
                                if (denominations[i] <= 25){
                                    System.out.println(count + " x " + "Moneda/s de " + denominations[i]);
                                }
                                if (denominations[i] > 25){
                                    System.out.println(count + " x " + "Billete/s de " + denominations[i]);
                                }
                                
                                change %= denominations[i];
                            }
                        }
                    } else {
                        System.out.println("¡Fondos insuficientes! Por favor, proporcione suficiente efectivo.");
                    }

                
                } else if (paymentMethod.equalsIgnoreCase("card")) {
                    System.out.print("¿Cuanto dinero tiene en su targeta? $");
                    double payment = scanner.nextDouble();
                    double change = payment - (int)totalDOPimp;
                    if (change >= 0) {
                        System.out.println("¡Fondos suficientes! El banco aprobo su transaccion");
                    } else {
                        System.out.println("¡Fondos insuficientes! El banco nego su transaccion");
                    }
                }
                System.exit(0);

            }
            else{
                System.out.println("si o no peely");  
            } 
        }
    
        System.out.println("Bienvenido a la cafetería y pastelería. ¿Qué desea ordenar?");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i] + " - $" + menuPrices[i]);
        }

        String[] order = new String[menuItems.length];
        double pcTotal = 0.0;
        int orderCount = 0;

        while (true) {
            System.out.println("Escriba el nombre del artículo que desea (o escriba 'fin' para finalizar):");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("fin")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < menuItems.length; i++) {
                if (choice.equalsIgnoreCase(menuItems[i])) {
                    order[orderCount] = choice;
                    pcTotal += menuPrices[i];
                    orderCount++;
                    System.out.println("Se ha agregado " + choice + " a su orden.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Lo siento, ese artículo no está en el menú.");
            }
        }

        // Display the customer's order and total cost
        clearScreen();
        if (orderCount > 0) {
            System.out.println("Aquí está su orden:");
            for (int i = 0; i < bought.size(); i++) {
                System.out.println(bought.get(i));
            }
            for (int i = 0; i < orderCount; i++) {
                System.out.println(order[i]);
            }
            System.out.println("El costo total es: $" + decfor.format(pcTotal + menutotal));
            System.out.println("Con impuestos: $" + decfor.format((pcTotal + menutotal) * 1.28));
            double totalDOP = (int)(menutotal * 56.2);
            double totalDOPimp = (int)(((menutotal) * 1.18) * 56.2);
            System.out.println("Total Cost in Dominican Pesos (DOP): " + (int)totalDOP);
            System.out.println("Con impuestos: $" + totalDOPimp);
            System.out.println("How would you like to pay? (Cash or Card): ");
            String paymentMethod = scanner.nextLine();
            
            if (paymentMethod.equalsIgnoreCase("cash")) {
                System.out.print("¿Con cuánto va a pagar en efectivo? $");
                double payment = scanner.nextDouble();
                double change = payment - (int)totalDOPimp;

                if (change >= 0) {
                    System.out.println("Su cambio es: $" + (int)(change));
                    int[] denominations = {2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
                    System.out.println("Su cambio es:");
                    for (int i = 0; i < denominations.length; i++) {
                        int count = (int)(change / denominations[i]);
                        if (count > 0) {
                            if (denominations[i] <= 25){
                                System.out.println(count + " x " + "Moneda/s de " + denominations[i]);
                            }
                            if (denominations[i] > 25){
                                System.out.println(count + " x " + "Billete/s de " + denominations[i]);
                            }
                                
                            change %= denominations[i];
                        }
                    }
                } else {
                    System.out.println("¡Fondos insuficientes! Por favor, proporcione suficiente efectivo.");
                }

                
            } else if (paymentMethod.equalsIgnoreCase("card")) {
                System.out.print("¿Cuanto dinero tiene en su targeta? $");
                double payment = scanner.nextDouble();
                double change = payment - (int)totalDOPimp;
                if (change >= 0) {
                    System.out.println("¡Fondos suficientes! El banco aprobo su transaccion");
                } else {
                    System.out.println("¡Fondos insuficientes! El banco nego su transaccion");
                }

            }
        } else {
            System.out.println("No ha ordenado nada. ¡Gracias por visitarnos!");
        }

        scanner.close();
    }
    //Jose


    static boolean inlists(String var, String[] list){
        Integer index = Arrays.binarySearch(list, var);
        if(index == -1){
            return false;
        }else{
            return true;
        }
    }

    static void showmenu(){
        System.out.println("Food:");
        System.out.println("1- Baby back ribs- $14.99");
        System.out.println("2- Soup of the day- $8.99");
        System.out.println("3- Filet mignon- $20");
        System.out.println("4- Chicken risotto- $14.99");    
        System.out.println("5- Beef lasagna- $12.99");
        System.out.println("Drinks:");
        System.out.println("6- Soda- $2.99");
        System.out.println("7- Water- $1.99");
        System.out.println("8- Juice- $3.99");
        System.out.println("Sides");
        System.out.println("9- Green olive salad- $3.40");
        System.out.println("10- French fries- $5.50");
    }
    
    static void description(String numero){
        switch(numero){
            case "1?":
                clearScreen();
                System.out.println("Baby Back Ribs");
                System.out.println("Our famous ribs dipped in our own delicious");
                System.out.println("barbeque sauce and tossed with a multitude ");
                System.out.println("of herbs and spices.");
                break;
 
            case "2?":
                clearScreen();
                System.out.println("Soup of the day");
                System.out.println("Chef's daily creation, a comforting bowl of warmth and flavor");
                break;

            case "3?":
                clearScreen();
                System.out.println ("Filet Migron");
                System.out.println ("A premium cut of beef, expertly grilled and seasoned for a melt-in-your-mouth experience.");
                break;

            case "4?":
                clearScreen();
                System.out.println ("Chicken Risotto");
                System.out.println ("Creamy Arborio rice cooked with succulent chicken, herbs, and Parmesan cheese.");
                break;

            case "5?":
                clearScreen();
                System.out.println ("Beef Lasagna");
                System.out.println ("Layers of seasoned ground beef, pasta, and rich marinara sauce, baked to cheesy perfection.");
                break;
            
             case "6?":
                clearScreen();
                System.out.println ("Soda");
                System.out.println ("Carbonated beverage in various flavors to complement your meal.");
                break;
            
            case "7?":
                clearScreen();
                System.out.println ("Water");
                System.out.println (" Refreshing and hydrating, the classic choice for a simple and clean palate cleanser.");
                break;
            
            case "8?":
                clearScreen();
                System.out.println ("Juice");
                System.out.println (" Freshly squeezed fruit juice, a vibrant and flavorful option to accompany your dish.");
                break;
            
            case "9?":
                clearScreen();
                System.out.println ("Green Olive Salad");
                System.out.println (" Crisp greens combined with plump green olives, creating a zesty and refreshing salad.");
                break;
            
            case "10?":
                clearScreen();
                System.out.println ("French Fries");
                System.out.println (" Golden and crispy potato fries, a classic and satisfying side dish..");
                break;
            
        }
    }


    static void menupower(){

        Scanner lector = new Scanner(System.in);
        Boolean confirmed = true;
        //Jean
        String[] itemz = {"Baby back ribs", "Soup of the day", "Filet Mignon", "Chicken risotto", "Beef lasagna", "Soda", "Water", "Juice", "Green olive salad", "French fries"};
        double[] food = {14.99, 8.99, 20.00, 14.99, 12.99, 2.99, 1.99, 3.99, 3.40, 5.50 };
        ArrayList<String> bought = new ArrayList<>();
        //Jean

        clearScreen();
        Random rand = new Random();
        int table = rand.nextInt(101);
        System.out.println("Good");
        System.out.println("So, your table number is " + table);

        //Jean
        
        showmenu();
        System.out.println("What meal are you starving for?");
        String numero = lector.nextLine();
        if ((numero.endsWith("?"))){
            description(numero);
            numero = numero.replace("?", "");
            System.out.println("Would you like to order it? ");
            String yers = lector.nextLine();
            if (yers.equals("yes") || yers.equals("Yes")){
                clearScreen();
                showmenu();
                confirmed = true;
            }else{
                clearScreen();
                showmenu();
                System.out.println("What meal are you starving for?");
                numero = lector.nextLine();
                confirmed = false;
            }
        }
        
        double total = 0;
            
        while (Integer.valueOf(numero) != 0) {
            if (confirmed == true){
                clearScreen();
                showmenu();
                System.out.println("Anything Else?, if not press 0");
                Integer numero2 = Integer.valueOf(numero) - 1;
                bought.add(itemz[numero2]);
                total += food[numero2];
                numero = lector.nextLine();
                if ((numero.endsWith("?"))){
                    description(numero);
                    numero = numero.replace("?", "");
                    System.out.println("Would you like to order it? ");
                    String yers = lector.nextLine();
                    if (yers.equals("yes") || yers.equals("Yes")){
                        clearScreen();
                        showmenu();
                        confirmed = true;
                    }else{
                        clearScreen();
                        showmenu();
                        System.out.println("What meal are you starving for?");
                        numero = lector.nextLine();
                        confirmed = false;
                    }
                }
            }
            clearScreen();
            showmenu();
            confirmed = true;
            
        }

        double menutotal = total;
        System.out.println(menutotal);
        cafe(menutotal, bought);

        //Jean

    }
    public static void main(String[] args){
        clearScreen();
        Scanner ask = new Scanner(System.in);
        System.out.println("Hello good sir or miss, welcome to the Chou-fleur, whats the name on your reservation? ");        
        String name = ask.nextLine();
        // System.out.println("Alright " + name + ", and at what time is your reservation?");
        // String reservartion = ask.nextLine();
        // String[] allreserv = {"3:00", "3:30", "4:00", "4:30", "5:00", "6:00", "7:00", "8:00", "9:30", "10:00", "10:30", "11:00"};

        // if (inlists(reservartion, allreserv)){
        // System.out.println("Yes " + name + ", you have a reservation with us, come this way");
        menupower();

            //Anderfelix
        System.out.println("Goodbye, " + name + "! We hope you have a fantastic and wonderful day, please come back soon!");
            //Anderfelix

        // } else{
        //     System.out.println("Hmm, thats weird, it seems that we do not have you at that hour, maybe you made a mistake, could you repeat your time? ");
        //     reservartion = ask.nextLine();
        //     if (inlists(reservartion, allreserv)){
        //         System.out.println("Yes " + name + ", you have a reservation with us, come this way");
        //         menupower();

        //         //Anderfelix
        //         System.out.println("Goodbye, " + name + "! We hope you have a fantastic and wonderful day, please come back soon!");
        //         //Anderfelix

        //     } else{
        //         System.out.println("Im sorry " + name + ", but you do not have a reservation with us");
        //     }
        // }
        
        ask.close();
    }
}

//Sebastian




//Creators: Sebastian, Jose, Jean & Anderfelix