package jp.co.rakuspartners.java.basic4.practice34;

import java.util.HashMap;

public class Ex04 {
    public static void main(String[] args) {

        String text = "I am honored to be with you today at your commencement from one of the finest universities in the world. I never graduated from college. Truth be told, this is the closest I’ve ever gotten to a college graduation. Today I want to tell you three stories from my life. That’s it. No big deal. Just three stories.\r\n"
                + //
                "The first story is about connecting the dots.\r\n" + //
                "I dropped out of Reed College after the first 6 months, but then stayed around as a drop-in for another 18 months or so before I really quit. So why did I drop out?";

        text = text.replaceAll("[.,?'\\r\\n" + //
                "]", " ");

        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        // 結果を出力
        for (String word : map.keySet()) {
            System.out.println(word + ":" + map.get(word));
        }
    }

}
