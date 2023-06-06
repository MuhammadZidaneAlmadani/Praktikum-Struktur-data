/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_MuhammadZidaneAlmadani;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Product {
      public String name;
    public int stok;
    public int price;
    
    public product(String name,int stok, int price){
        this.name = name;
        this.stok = stok;
        this.price = price;
    }
    
    public void display(){
        System.out.println("===============");
        System.out.println("Product Name: "+name);
        System.out.println("Stock: "+stok);
        System.out.println("Price: "+price);
        System.out.println("===============");
    }
}
