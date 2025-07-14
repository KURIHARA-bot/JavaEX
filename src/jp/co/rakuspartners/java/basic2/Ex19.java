package jp.co.rakuspartners.java.basic2;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    
    int[] num =new int [10];

     for (int i=0;i<num.length;i++){

        num[i] = s.nextInt();
    }

    for(int i =0;i<num.length;i++){
        System.out.println(num[i]*2);
    }

    for(int i=0;i<num.length;i++){
        if(num[i]%2 ==0){
            System.out.println("偶数:");
        }
    }

s.close();
}
}
