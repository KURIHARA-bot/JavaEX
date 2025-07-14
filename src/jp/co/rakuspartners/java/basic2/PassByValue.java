package jp.co.rakuspartners.java.basic2;

public class PassByValue {
    public static void main(String[] args) {
        int num =10;
        add10(num);
        System.out.println("main()メソッドの値:" + num);
    }
    static void add10(int newNum){
        newNum = newNum +10;
        System.out.println("add10()メソッドの内の値"+ newNum);
    }
}
