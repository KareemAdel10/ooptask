package com.mycompany.MyOnlineShop;
import java.util.*;
public class OopTask1 {

    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);   
    Product [] products=new Product[5];
    
    products[0]=new ChildrenBook("how to conquer",50.5);  
    products[1]=new Book("exchange life",67.8);
    products[2]=new ChildrenBook("the art of self conscious",40.7);
    products[3]=new ChildrenBook("abc",25.9);
    products[4]=new ChildrenBook("soul expenses",80.5);
    
    double sum=0;
    for (int i =0;i<5;i++)
    {
     sum += products[i].getPriceOfBook();       
    }
    System.out.println("sum is:"+sum);
    }
}
