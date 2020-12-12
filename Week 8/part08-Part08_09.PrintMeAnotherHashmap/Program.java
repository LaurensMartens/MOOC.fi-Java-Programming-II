
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashmap) {
        for(Book item: hashmap.values()) {
            System.out.println(item);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for(Book item: hashmap.values()) {
            if(item.getName().contains(text)) {
                System.out.println(item);
            }
        }
    }
}
