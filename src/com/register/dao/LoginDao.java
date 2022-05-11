package com.register.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.register.bean.LoginBean;

public class LoginDao {
  public boolean vaildate(LoginBean bean)
  {
    boolean result = false;
    //Connection connection=DBConnect1.getConn();
    Connection con = null;
    String loadDriver = "com.mysql.cj.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/registration_form";
    String dbUSERNAME = "root";
    String dbPASSWORD = "password";
    try {
      Class.forName(loadDriver);
      con = DriverManager.getConnection(dbURL, dbUSERNAME, dbPASSWORD);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("connection established");
    String sql="select * from user_register where userName=? and password=?";
    try {
      PreparedStatement ps=con.prepareStatement(sql);
      ps.setString(1, bean.getUserName());
      ps.setString(2, bean.getPassword());
      ResultSet rs=ps.executeQuery();
      result=rs.next();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }    
    return result;
  }
}