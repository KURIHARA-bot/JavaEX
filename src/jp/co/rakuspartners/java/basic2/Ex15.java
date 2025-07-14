package jp.co.rakuspartners.java.basic2;

public class Ex15 {
    public static void main(String[] args) {
        Ex15VendingMachine v =new Ex15VendingMachine(0,0);

        v.buyItem();
        v.refillStock(3);
        v.buyItem();
        v.putMoney(500);
        v.buyItem();
        v.buyItem();
        v.buyItem();
        v.refillStock(3);
        v.buyItem();
        v.buyItem();
        v.buyItem();





    }

}
