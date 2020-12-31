
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        //some code to test Checker class
        Scanner scanner = new Scanner(System.in);
        Checker check = new Checker();

        System.out.println("check:");
        String text = scanner.nextLine();
        //System.out.println(check.isDayOfWeek(text));
        //System.out.println(check.allVowels(text));
        System.out.println(check.timeOfDay(text));
    }
}
