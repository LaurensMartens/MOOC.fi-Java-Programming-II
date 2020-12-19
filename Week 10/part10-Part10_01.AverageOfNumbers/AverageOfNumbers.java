
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true) {
            String text = scanner.nextLine();
            if (text.equals("end")) {
                break;
            }
            
            list.add(text);
        }
        
        double averageOfList = list.stream().mapToInt(x -> Integer.valueOf(x)).average().getAsDouble();
        System.out.println("average of the numbers: " + averageOfList);
    }
}
