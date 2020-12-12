
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        for(String item: hashmap.keySet()) {
            System.out.println(item);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String item: hashmap.keySet()) {
            if(item.contains(text)) {
                System.out.println(item);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String item: hashmap.keySet()) {
            if(item.contains(text)) {
                System.out.println(hashmap.get(item));
            }
        }        
    }

}
