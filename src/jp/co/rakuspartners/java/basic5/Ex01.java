package jp.co.rakuspartners.java.basic5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex01 {

    /**
     * departmentsの検索
     */
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "Napost7";
        Connection con =null;
        PreparedStatement pstmt =null;
        ResultSet  rs = null;
        String sql = null;

        //データベースに接続
        try{
        con = DriverManager.getConnection(url, user, password);

        //SQL文を作成

        sql = "SELECT id,name from departments;";

        //sql実行準備

        pstmt = con.prepareStatement(sql);

        //SQL実行
        rs = pstmt.executeQuery();

        //結果の出力

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");

            System.out.print("id="+id);
            System.out.print("name="+name);
            System.out.println();

        }
        }catch(SQLException e){
            System.err.println("SQL関連の例外が発生しました");
            e.printStackTrace();
        }finally{

            try{
                if(con != null){
                    con.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
                if(rs !=null){
                    rs.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
