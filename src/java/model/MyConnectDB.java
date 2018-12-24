/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MinhMan
 */
public class MyConnectDB {
    public static Connection getConnection() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://node44040-quanlydulieu.jelastic.skali.net/java","root","oRvKXSRgtc");
        }catch (Exception e ){
            e.printStackTrace();
        }
       return conn;
    }
public ResultSet chonDuLieuTuDTB(String sql) throws Exception{
		Connection connection = MyConnectDB.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs =stmt.executeQuery(sql);
		return rs;
	}
public void thucThiCauLenhSQL(String sql) throws Exception{
		Connection connect = MyConnectDB.getConnection();
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
	}

public static void main(String[] args){
    System.out.println(getConnection());
}
}
