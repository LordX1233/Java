abstract class Fruit {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void display();
}

class Apple extends Fruit {
    private int calories;

    public Apple(String color, int calories) {
        super(color);
        this.calories = calories;
    }

    @Override
    public void display() {
        System.out.println("Displaying a " + getColor() + " Apple with " + calories + " calories");
    }
}

class Pear extends Fruit {
    private int calories;

    public Pear(String color, int calories) {
        super(color);
        this.calories = calories;
    }

    @Override
    public void display() {
        System.out.println("Displaying a " + getColor() + " Pear with " + calories + " calories");
    }
}

public class OOP {
    public static void main(String[] args) {
        Fruit apple = new Apple("Red", 52);
        Fruit pear = new Pear("Green", 100);
        apple.display();
        pear.display();
        apple = null;
    }
}