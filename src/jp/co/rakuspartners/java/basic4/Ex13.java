package jp.co.rakuspartners.java.basic4;

public class Ex13 {
    public static void main(String[] args) {
        
        try{
            Class.forName("java.lang. java.lang.NotFoundClass");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("クラスが見つかりません");

        }
    }

}
