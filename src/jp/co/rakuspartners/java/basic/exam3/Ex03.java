package jp.co.rakuspartners.java.basic.exam3;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("小計金額");
        System.out.println(500*4 + 350*8);
        System.out.println("消費税");
        System.out.println((500*4 + 350*8)* 10/100);
        System.out.println("合計金額");
        System.out.println((500*4 + 350*8) + (500*4 + 350*8)* 10/100);

    }

}
