package jp.co.rakuspartners.java.basic4;

public class Ex12 {
    public static void main(String[] args) {
        

    try{
        int answer =10/0;
        System.out.println("例外が発生しませんでした");
    }catch(ArithmeticException e){
        e.printStackTrace();
        System.out.println("0で割ることができません");
    }

    }

    }
