package jp.co.rakuspartners.java.basic4;

import java.util.HashMap;
import java.util.Map;

public class CollectionSample3 {

    public static void main(String[] args) {

        // キーがStringでバリューがEmployeeのHashMapを作成
        Map<String, Employee> map = new HashMap<>();

        map.put("ID0001", new Employee("有賀", 10));
        map.put("ID0002", new Employee("伊賀", 30));
        map.put("ID0003", new Employee("宇賀", 18));

        Employee employee = map.get("ID0002");

        if (employee != null) {
            System.out.println(employee);
        }
    }

}
