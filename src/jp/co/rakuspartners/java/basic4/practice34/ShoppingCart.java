package jp.co.rakuspartners.java.basic4.practice34;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<Item>();
    }

    public void addItem(Item item){
       itemList.add(item);
    }

    public int  getItemSize(){
       return itemList.size();
    }

    public int getTotalPrice(){
        int totalPrice =0;
        for(Item item :itemList){
            totalPrice = totalPrice+ item.getPrice();
        }
        return totalPrice;
    }

    public double getAverage(){
        return  getTotalPrice() / getItemSize();
    }

    public void removeItem(int index){
         itemList.remove(index);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

        
    }

    



    
