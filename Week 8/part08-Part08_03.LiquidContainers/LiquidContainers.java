
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.contains("quit")) {
                break;
            }
            String[] inputStringArray = input.split(" ");
            String command = inputStringArray[0];
            int value = Integer.valueOf(inputStringArray[1]);

            if (command.equals("add")) {
                if (value >= 0 && first + value <= 100) {
                    first += value;
                } else {
                    first = 100;
                }
            }

            if (command.equals("move")) {
                if (value > first) {
                    if (second + first <= 100) {
                        second += first;
                        first = 0;
                    } else {
                        second = 100;
                        first = 0;
                    }
                } else {
                    if (value + second <= 100) {
                        second += value;
                        first -= value;
                    } else {
                        second = 100;
                        first -= value;
                    }
                }
            }

            if (command.equals("remove")) {
                if (value > second) {
                    second = 0;
                } else {
                    second -= value;
                }
            }

        }
    }

}
