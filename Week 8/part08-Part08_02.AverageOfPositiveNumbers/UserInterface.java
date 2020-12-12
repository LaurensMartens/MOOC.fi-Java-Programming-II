
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
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

    private Scanner s;
    private List<Integer> numList;

    public UserInterface(Scanner scan) {
        this.s = scan;
        this.numList = new ArrayList<>();
    }

    public void start() {
        while (true) {
            int num = Integer.valueOf(s.nextLine());
            if (num == 0) {
                calcAverage();
                break;
            }
            this.numList.add(num);

        }
    }

    public void calcAverage() {
        if (this.numList.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = this.numList.stream().filter(x -> x > 0).mapToInt(x -> x).average().getAsDouble();
            System.out.println(average);
        }
    }
}
