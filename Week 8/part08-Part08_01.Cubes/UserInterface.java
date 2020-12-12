/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Gebruiker
 */
public class UserInterface {
    private Scanner s;
    
    public UserInterface(Scanner scanner) {
        this.s = scanner;
    }
    
    public void start() {
        while (true) {
            String input = s.nextLine();
            if (input.equals("end")) {
                break;
            }
            int num = Integer.valueOf(input);
            System.out.println(num*num*num);
        }
    }
}
