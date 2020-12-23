
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if(bookName.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int recommendedAge = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(bookName, recommendedAge));
        }
        Comparator<Book> comparator = Comparator.comparing(Book::getRecAge).thenComparing(Book::getName);
        Collections.sort(bookList, comparator);
        System.out.println(bookList.size() + " books in total. \n");
        System.out.println("Books:");
        bookList.stream().forEach(n -> System.out.println(n));
    }

}
