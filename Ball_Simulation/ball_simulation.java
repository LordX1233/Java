package Ball_Simulation;
public class ball_simulation {
    public static void clear() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void main(String[] args) {
        clear();
        int number = 0;
        try{
            while(true){
                if (number < 30){
                    System.out.println("          Loading");
                    for (var i = 0; i < number; i++){
                        System.out.print(" ");
                    }
                    System.out.print("o o o");
                    System.out.println("");
                    Thread.sleep(50);
                    number += 1;
                    clear();
                }
                
                if (number == 30){
                    while(number > 1){
                        System.out.println("          Loading");
                        for (var i = 0; i < number; i++){
                            System.out.print(" ");
                        }
                        System.out.print("o o o");
                        System.out.println("");
                        Thread.sleep(50);
                        number -= 1;
                        clear();
                    }
                    
                }

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
