package jp.co.rakuspartners.java.basic4;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {

        // 文字列を格納するためのArrayListを作成
        List<String> list = new ArrayList<>();
        //↑ジェネリクスを使用してStrig型の要素を格納するArrayListを作成
        //↑右辺の<>の中のStringは省略可能！

        //ArrayListオブジェクトにaddメソッドで要素を追加
        list.add("スイム");//添え字0
        list.add("バイク");//添え字1
        list.add("ラン");//添え字2

        for (int i = 0; i < list.size(); i++) {
           // String element = list.get(i);

            System.out.println(i);
        }
     
        for (String element : list) {
            System.out.println(element);
        //elementはlistの要素を格納する変数、右辺はListの参照変数
        }
    }

}
