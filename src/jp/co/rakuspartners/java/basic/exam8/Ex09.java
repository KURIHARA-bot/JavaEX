package jp.co.rakuspartners.java.basic.exam8;

public class Ex09 {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }

        for(int i =3;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
        System.out.println();
        }
    }

}
