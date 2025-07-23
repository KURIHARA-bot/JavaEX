package jp.co.rakuspartners.java.basic4.practice34;

import java.util.ArrayList;

public class ShoppingCart2 extends ArrayList<Item>{

    public int getTotalPrice(){
        int totalPrice =0;
        for(Item item :this){
            totalPrice = totalPrice+ item.getPrice();
        }
        return totalPrice;
    }

    public double getAverage(){
        return  getTotalPrice() / size();
    }



}
