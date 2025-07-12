package jp.co.rakuspartners.java.basic2;

public class Ex15VendingMachine {
    static final int PRICE =120;
    int money;
    int stock;
    
    Ex15VendingMachine(int money,int stock){
        this.money = money;
        this.stock = stock;
    }

    void refillStock(int stock){
        if(this.stock >= 10){
            System.out.println("商品がいっぱいです");
        }else{this.stock += stock;
            System.out.println("在庫が" + this.stock + "個になりました");
            } 
    }

    void putMoney(int money){
        this.money += money; 
        System.out.println("入金金額が" + this.money + "円になりました");

    }

    void buyItem(){
        if(this.stock<=0){
            System.out.println("在庫を追加してください");  
        }
        else if(this.money <= 0){
            System.out.println("お金を入れてください");
        }
        else if(money < PRICE){
            System.out.println("お金が足りません。(現在の残高" + this.money + "円)");

        
        }else{this.stock= stock-1;this.money= money - PRICE;
            {System.out.println("商品を購入しました");
        }
         if(this.stock ==0){
            System.out.println("在庫切れになりました");}
        
    }

}
}
