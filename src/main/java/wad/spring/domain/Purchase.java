/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.domain;

/**
 *
 * @author tonykovanen
 */
public class Purchase {
    private int numberOfProducts;
    private Beer beer;
    
    public Purchase(Beer beer) {
        this.beer = beer;
        this.numberOfProducts = 0;
    }
    public Purchase() {
        this.numberOfProducts = 0;
    }
    
    public void buyMore(int number) {
        this.numberOfProducts += number;
    }
    
    public void buyLess(int number) {
        this.numberOfProducts -= number;
        if (numberOfProducts < 0) {
            numberOfProducts = 0;
        }
    }
    
    public boolean equals(Purchase purchase) {
        if (this.beer == purchase.getBeer()) return true;
        return false;
    }
    
    public Beer getBeer() {
        return beer;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
    
}
