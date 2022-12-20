
package com.mycompany.MyOnlineShop;


public abstract class Product {
   
    private double PriceOfBook;

    
    public double getPriceOfBook() {
        return PriceOfBook;
    }

    public void setPriceOfBook(double PriceOfBook) {
        this.PriceOfBook = PriceOfBook;
    }

    public Product( double PriceOfBook) {
        
        this.PriceOfBook = PriceOfBook;
    }

    public Product() {
    }
    
    
    
}
