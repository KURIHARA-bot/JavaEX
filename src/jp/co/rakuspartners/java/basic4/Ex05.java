package jp.co.rakuspartners.java.basic4;

public class Ex05 {
    public static void main(String[] args) {
        String bigNumber = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量大数(むりょうたいすう)";
       
         String[] nums = bigNumber.split(":");

         for(String num : nums){
               System.out.println(num);

         }
    }

}
