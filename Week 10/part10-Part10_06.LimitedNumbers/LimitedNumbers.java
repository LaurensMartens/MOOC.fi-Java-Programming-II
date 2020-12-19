
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();
        
        while(true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            if(number < 0) {
                break;
            }
            
            inputList.add(number);
        }
        inputList.stream().filter(x -> x > 0 && x < 6).forEach(x -> System.out.println(x));
    }
}
