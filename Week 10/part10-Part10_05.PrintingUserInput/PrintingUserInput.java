
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        
        while(true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            inputList.add(text);          
        }
        inputList.stream().forEach(textString -> System.out.println(textString));
    }
}
