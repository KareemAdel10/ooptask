
package com.mycompany.ooptask3;

public class Circle {
   private static double radius;
   private static String colour; 

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Circle.colour = colour;
    }

  
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle() {
    }
   


    public Circle(double radius) {
        this.radius = radius;
    }
   
   void area ()
     {
            
            double area=3.14*getRadius()*getRadius();
            System.out.println("area of circle is :"+area);
     }
}
