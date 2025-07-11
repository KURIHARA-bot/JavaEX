package jp.co.rakuspartners.java.basic.exam8;

public class Ex08 {
    public static void main(String[] args) {
        int i =1;
        int j =0;

        while (i<=1000){
            System.out.print(i);
            int sum = i + j;
            j=i;
            i = sum;
        }
    }

}
