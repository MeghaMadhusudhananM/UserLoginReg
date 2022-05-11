package com.register.bean;

public class RegisterBean {
	  String Name;
	  String EMail;
	  String userName;
	  String pasword;
	  public RegisterBean(String name, String eMail, String userName, String pasword) {
	    super();
	    Name = name;
	    EMail = eMail;
	    this.userName = userName;
	    this.pasword = pasword;
	  }
	  public RegisterBean() {
	    super();
	    // TODO Auto-generated constructor stub
	  }
	  public String getName() {
	    return Name;
	  }
	  public void setName(String name) {
	    Name = name;
	  }
	  public String getEMail() {
	    return EMail;
	  }
	  public void setEMail(String eMail) {
	    EMail = eMail;
	  }
	  public String getUserName() {
	    return userName;
	  }
	  public void setUserName(String userName) {
	    this.userName = userName;
	  }
	  public String getPasword() {
	    return pasword;
	  }
	  public void setPasword(String pasword) {
	    this.pasword = pasword;
	  }
	}