
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("end")) {
                break;
            }

            list.add(text);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String text = scanner.nextLine();
        if (text.equals("n")) {
            double average = list.stream().mapToInt(x -> Integer.valueOf(x)).filter(x -> x < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (text.equals("p")) {
            double average = list.stream().mapToInt(x -> Integer.valueOf(x)).filter( x -> x > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }

    }
}
