
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

 public void add(String product, int price) {
        Item temp = new Item(product, 1, price);
        if (cart.contains(temp)) {
            temp = cart.get(cart.indexOf(temp));
            temp.increaseQuantity();
        } else {
            cart.add(temp);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : cart) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart) {
            System.out.println(item.toString());
        }
    }
         
}
