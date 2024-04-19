package Class_Example;
abstract class Human{

    String name;

    String color;

    Integer size;

    public void setSize(Integer size) {
        this.size = size;
    }

    Integer limbs;

    public void setLimbs(Integer limbs) {
        this.limbs = limbs;
    }

    Integer weight;

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public abstract void sizecalc();

}

class Man extends Human{

    public Man(String name, String color, Integer size, Integer limbs, Integer weight) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.limbs = limbs;
        this.weight = weight;
    }

    public void sizecalc(){
        if (size <= 7 && size >= 5 && limbs == 4 && weight <= 220 && weight >= 150){
            System.out.println(name + " is a usual man");
        }else{
            mistake();
        }
    }
    public void mistake(){
        System.out.println(name + " is not a usual man");
        System.out.println("Heres an example of what he should be: ");
        
        if(!(size <= 7 && size >= 5)){
            size = 6;
        }
        if(limbs != 4){
            limbs = 4;
        }
        if(!(weight <= 220 && weight >= 150)){
            weight = 180;
        }
        System.out.println("Size: " + size);
        System.out.println("Limbs: " + limbs);
        System.out.println("Weight: " + weight);
        
    }
}

class Baby extends Human{

    public Baby(String name, String color, Integer size, Integer limbs, Integer weight) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.limbs = limbs;
        this.weight = weight;
    }

    public void sizecalc(){
        if (size <= 2 && size >= 1 && limbs == 4 && weight <= 8 && weight >= 5){
            System.out.println(name + " is a usual baby");
        }else{
            mistake();
        }
    }
    public void mistake(){
        System.out.println(name + " is not a usual baby");
        System.out.println("Heres an example of what he should be: ");
        
        if(!(size <= 2 && size >= 1)){
            size = 1;
        }
        if(limbs != 4){
            limbs = 4;
        }
        if(!(weight <= 8 && weight >= 5)){
            weight = 6;
        }
        System.out.println("Size: " + size);
        System.out.println("Limbs: " + limbs);
        System.out.println("Weight: " + weight);
        
    }
}

public class appClass {
    public static void main(String[] args) {
        Human baby = new Baby("Jonathan", "Black", 2, 3, 20); 
        Human man = new Man("Jerry", "White", 6, 4, 210); 
        baby.sizecalc();
        man.sizecalc();
        
        baby = null;
        man = null;
    }
}
