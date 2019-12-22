package com.brainmentors.ims.common;

public interface QueryConstants {
	String LOGIN_SQL = "select userid,status,password from users where userid=?";
	String PASSWORD_UPDATE_SQL = "update users set password=?, status='A' where userid=?";
	String USER_INSERT_SQL = "insert into users (userid,password) values(?,?)";
	String STUDENT_INSERT_SQL = "insert into students (regno, name, fees ,pendingfees,duedate) values(?,?,?,?,?)";
}
