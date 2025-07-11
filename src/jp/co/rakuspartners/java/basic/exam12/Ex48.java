package jp.co.rakuspartners.java.basic.exam12;

public class Ex48 {
    public static void main(String[] args) {
        int result =amount(10);
        System.out.println(result);
    }
 static int amount(int j){
    int sum =0;

    for(int i =1;i<=j;i++){
        sum = sum +i;
    }
    return sum;
 }
 
}
