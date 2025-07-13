package jp.co.rakuspartners.java.basic2;

public class Ex18 {
    public static void main(String[] args) {
        int[] numbers={0,1,2,3,4};

        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }

        String[]names ={"栗原菜奈","空","空","空","空","栗原菜奈","空","空","空","空"};

       for(String name:names){
        System.out.print(" "+name);
       }


    }

}
