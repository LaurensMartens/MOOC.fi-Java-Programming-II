
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class TodoList {
    private List<String> taskList;
    
    public TodoList() {
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.taskList.add(task);
    }
    
    public void print() {
        taskList.forEach(n -> System.out.println((taskList.indexOf(n) + 1) + ": " + n));
    }
    
    public void remove(int number) {
        this.taskList.remove(number - 1);
    }
}
