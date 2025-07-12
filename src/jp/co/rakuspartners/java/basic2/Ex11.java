package jp.co.rakuspartners.java.basic2;

public class Ex11 {
    public static void main(String[] args) {
        int[] numbers = {5,6,1,3,9};


    System.out.println(numbers[3]);
    
    for(int number:numbers){
        System.out.print(number);
    }
    System.out.println();

    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]);
    }
        System.out.println();

    for(int i=0;i< numbers.length;i++){
        if(numbers[i]%2!=0){
        System.out.print(numbers[i]);
    }
    }
    System.out.println();
}
}
