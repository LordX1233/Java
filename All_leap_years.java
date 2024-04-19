import java.util.ArrayList;

public class All_leap_years {
    public static void main(String[] args) {
        ArrayList<Integer> leapyears = new ArrayList<Integer>();
        for (int i = 1900; i < 2024; i += 4){
            leapyears.add(i);
        }
        System.out.println(leapyears);
  }
}
