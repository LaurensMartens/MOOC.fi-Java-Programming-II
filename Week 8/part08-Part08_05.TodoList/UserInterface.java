
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class UserInterface {

    private TodoList taskList;
    private Scanner s;

    public UserInterface(TodoList list, Scanner scan) {
        this.s = scan;
        this.taskList = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = s.nextLine();

            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("To add: ");
                String addItem = s.nextLine();
                taskList.add(addItem);
            }
            if (input.equals("list")) {
                taskList.print();
            }
            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int removeIndex = Integer.valueOf(s.next());
                taskList.remove(removeIndex);
            }
        }
    }
}
