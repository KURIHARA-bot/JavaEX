package jp.co.rakuspartners.java.basic4;

import java.util.ArrayList;
import java.util.List;

public class Ex20 {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("伊賀", 30));
        list.add(new Employee("山田", 30));
        list.add(new Employee("佐藤", 30));
        list.add(new Employee("田中", 30));

        list.remove(1);

        list.add(1,new Employee("鈴木", 30));
        //Employee employee = list.get(2);
        System.out.println("3番目の社員は" + list.get(2).getName()+ "です");

        for (Employee employee2 : list) {
            System.out.println(employee2.getName());

        }
    }
}
