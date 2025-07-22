package jp.co.rakuspartners.java.basic5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    /**
     * DB接続と切断を管理するクラス
     * 
     * @author nanakurihara
     */

    private final static String URL = "jdbc:postgresql://localhost:5432/student";
    private final static String USER_NAME = "postgres";
    private final static String PASSWORD = "Napost7";

    /**
     * データベースに接続
     */

    public static Connection createConnection() {
        try {
            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            return con;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DBの接続に失敗しました", e);
        }
    }

    /*
     * 切断
     */

    public static void closeConnection(Connection con) {

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("DBとの接続に失敗しました", e);
        }
    }

}
