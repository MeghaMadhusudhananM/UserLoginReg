package com.register.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.register.bean.RegisterBean;
import com.register.conn.DBConnect;
public class RegisterDao {
  public String Regiterindb(RegisterBean bean) {
    //Connection con = DBConnect.getConn();
	  Connection con = null;
	    String loadDriver = "com.mysql.cj.jdbc.Driver";
	    String dbURL = "jdbc:mysql://localhost:3306/registration_form";
	    String dbUSERNAME = "root";
	    String dbPASSWORD = "password";
	    try {
	      Class.forName(loadDriver);
	      con = DriverManager.getConnection(dbURL, dbUSERNAME, dbPASSWORD);
	      System.out.println(con);
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    System.out.println("connection established");
	    String sql = "insert into users(Id,Name,Email) values (NULL,?,?) ";
	    int i = 0;
	    try {
	      PreparedStatement preparedStatement = con.prepareStatement(sql);
	      preparedStatement.setString(1, bean.getName());
	      preparedStatement.setString(2, bean.getEMail());
	      i = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    if (i != 0) {
	    	String sql1 = "insert into user_credentials(userId,Id,userName,password) values (?,NULL,?,?) ";
	    	try {
	    	      PreparedStatement preparedStatement = con.prepareStatement(sql1);
	    	      preparedStatement.setInt(1, i);
	    	      preparedStatement.setString(2, bean.getUserName());
	    	      preparedStatement.setString(3, bean.getPasword());
	    	      i = preparedStatement.executeUpdate();
	    	    } catch (SQLException e) {
	    	      // TODO Auto-generated catch block
	    	      e.printStackTrace();
	    	    }  
	    	
	      return "User is registered";
	    } else {
	      return "Error!!!!";
	    }
	  }
	}