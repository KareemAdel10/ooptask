package com.mycompany.MyOnlineShop;
public class Book extends Product {
    
    private String NameOfBook;

    public String getNameOfBook() {
        return NameOfBook;
    }

    public void setNameOfBook(String NameOfBook) {
        this.NameOfBook = NameOfBook;
    }

    public Book(String NameOfBook, double PriceOfBook) {
        super(PriceOfBook);
        this.NameOfBook = NameOfBook;
    }

    public Book(double PriceOfBook) {
        super(PriceOfBook);
    }
 
    public Book() {
    }
    
   
    
}
