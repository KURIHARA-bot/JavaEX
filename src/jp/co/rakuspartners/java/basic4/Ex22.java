package jp.co.rakuspartners.java.basic4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex22 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("東京","東京");
        map.put("埼玉","さいたま");
        map.put("茨城","水戸");
        map.put("沖縄","那覇");

        Set<String> keySet = map.keySet();
        for(String key :keySet){
            String n = map.get(key);
            System.out.println(n);
        }


    }

}
