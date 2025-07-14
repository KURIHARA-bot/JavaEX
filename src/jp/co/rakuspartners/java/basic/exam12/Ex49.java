package jp.co.rakuspartners.java.basic.exam12;

public class Ex49 {
    public static void main(String[] args) {
        
        System.out.println(calcTax(2000));
        System.out.println(calcIncludTax(2000));
        System.out.println(calcHalfPrice(2000));
        System.out.println(calcTimeServicePrice(2000,0.8));

        
    }

    static int calcTax(int price){
        return price *10/100;
    }
    static int calcIncludTax(int price){
        return price +(price*10/100);
    }
    static int calcHalfPrice(int price){
         return price/2;
    }
    static int calcTimeServicePrice(int price,double discountRate) {
        return (int)(price *discountRate);
    }    
}
