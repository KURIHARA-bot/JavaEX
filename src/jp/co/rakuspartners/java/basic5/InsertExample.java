package jp.co.rakuspartners.java.basic5;

public class InsertExample {
    public static void main(String[] args) {
        
        EmployeeDao dao = new EmployeeDao();

        //追加するデータを表すEntitiy

    Employee employee = new Employee();

    //employee.setId(1000);
    employee.setName("テスト太朗");
    employee.setAge(22);
    employee.setGender("男");
    employee.setDapartmantID(2);

    //先ほど作成したEntitiyをテーブル時に追加

    dao.insert(employee);




    }

}
