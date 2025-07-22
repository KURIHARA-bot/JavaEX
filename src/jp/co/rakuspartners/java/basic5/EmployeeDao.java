package jp.co.rakuspartners.java.basic5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {
    //テーブル名を定数で定義する→テーブル名変更に対応している
    private static final String TABLE_NAME = "employees";
    /**
     * 
     * @param id　主キー
     *  
     * @return　従業員情報
     */

     //接続処理はDBManager
    public Employee load(int id){
        Connection con = DBManager.createConnection();


        String sql = "SELECT id,name,age,gender,department_id FROM "
        + TABLE_NAME + " WHERE id =?;";

        try{
            PreparedStatement pstmt= con.prepareStatement(sql);
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){

                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setAge(rs.getInt("age"));
                employee.setGender(rs.getString("gender"));
                employee.setDapartmantID(rs.getInt("department_id"));
                return employee;
            }
            return null;

        }catch(SQLException ex){
            System.err.println("SQL="+sql);
            throw new RuntimeException("load処理に失敗しました",ex);
        }finally{
            DBManager.closeConnection(con);
        }

    }


    //public List<Employee> findByDepartmentID(int departmentId){
        

    //}
    
    /**
     * 従業員情報の追加
     * @param employee　従業員情報
     * @return　更新した行数
     */
    public int insert(Employee employee){
        Connection con = DBManager.createConnection();

        String sql = "INSERT INTO "+ TABLE_NAME
        + "(       name,age,gender,department_id)"
        + "VALUES(    ?,  ?,    ?,             ?)";

        try{
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, employee.getName());
            pstmt.setInt(2, employee.getAge());
            pstmt.setString(3, employee.getGender());
            pstmt.setInt(4, employee.getDapartmantID());

            int affected = pstmt.executeUpdate();
            return affected;

        }catch(SQLException ex){
            System.err.println("SQL="+sql);
            throw new RuntimeException("insert処理に失敗しました");
        }finally{
            DBManager.closeConnection(con);
        }


        
         

    }

    //public int update(Employee employee){

   //}

    //public int deleteByDepartmentId(int departmentId){

    //}
}
