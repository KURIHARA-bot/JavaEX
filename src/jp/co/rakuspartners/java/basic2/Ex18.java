package jp.co.rakuspartners.java.basic2;

public class Ex18 {
    public static void main(String[] args) {
        int[] numbers ={0,1,2,3,4};

        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println();

        String[] names ={"栗原",null,null,null,null,"栗原",null,null,null,null};
         
        for(String name:names){
         if(name==null){
            System.out.print("  空");
        }else{System.out.print(" "+name);}
        
    }
}

}
