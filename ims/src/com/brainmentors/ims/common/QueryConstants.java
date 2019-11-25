package com.brainmentors.ims.common;

public interface QueryConstants {
	String LOGIN_SQL = "select userid,status from users where userid=? and password=?";

}
