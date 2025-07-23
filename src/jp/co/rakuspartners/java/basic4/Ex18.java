package jp.co.rakuspartners.java.basic4;

import java.util.ArrayList;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        list.add("伊賀");
        list.add("山田");
        list.add("佐藤");
        list.add("田中");

        for(int i =0;i<list.size();i++){
            String element = list.get(i);
            System.out.println(element);
        }

    }

}
