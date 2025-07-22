package jp.co.rakuspartners.java.basic4;

public class Ex14 {

    public static void method1() throws ClassNotFoundException {
        Class.forName("java.lang.NonExistClass");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            System.out.println("クラスが見つかりません");
            e.printStackTrace();
        }

    }
}
