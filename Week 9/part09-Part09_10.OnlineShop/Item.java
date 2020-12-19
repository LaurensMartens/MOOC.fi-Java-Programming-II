
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Item {

    private String productName;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        productName = product;
        quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return quantity * unitPrice;
    }

    public void increaseQuantity() {
        quantity += 1;
    }

    @Override
    public String toString() {
        return productName + ": " + quantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.productName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        return true;
    }
}
