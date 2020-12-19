
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class Warehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.product = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        if (this.product.containsKey(product)) {
            return this.product.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        } else {
            return 0;
        }

    }

    public boolean take(String product) {
        if (productStock.containsKey(product) && productStock.get(product) > 0) {
            int remainingStock = productStock.get(product) - 1;
            productStock.remove(product);
            productStock.put(product, remainingStock);
            return (productStock.get(product) > 0);
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        Set<String> productSet = new HashSet<>();
        for (String product: product.keySet()) {
            productSet.add(product);
        }
        return productSet;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (!(obj instanceof Warehouse)) {
//            return false;
//        }
//        Warehouse comparedObj = (Warehouse) obj;
//        
//        if (this.product.string)
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode(); 
//    }
}
