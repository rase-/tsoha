/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.domain;

import java.util.List;

/**
 *
 * @author tonykovanen
 */
public class ShoppingCart {
    private User user;
    private List<Purchase> purchases;
    
    public ShoppingCart(User user) {
        this.user = user;
    }
    
    public void addPurchase(Purchase purchase) {
        int index = purchases.indexOf(purchase);
        if (index != -1) {
            purchases.get(index).buyMore(1);
        } else {
            purchases.add(purchase);
        }
    }
    
    public void removeProducts(Purchase purchase, int number) {
        int index = purchases.indexOf(purchase);
        
        if (index != -1) {
            purchases.get(index).buyLess(number);
            if (purchases.get(index).getNumberOfProducts() == 0) {
                this.purchases.remove(index);
            }
        }
    }
    
    public List<Purchase> getPurchases() {
        return purchases;
    }

    public User getUser() {
        return user;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}