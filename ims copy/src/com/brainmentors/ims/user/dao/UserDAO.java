package com.brainmentors.ims.user.dao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.brainmentors.ims.common.ConnectionUtils;
import com.brainmentors.ims.common.Encrypt;
import com.brainmentors.ims.common.QueryConstants;
import com.brainmentors.ims.user.dto.UserDTO;

public class UserDAO {
	
	public boolean register(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionUtils.createConnection();
			pstmt = con.prepareStatement(QueryConstants.USER_INSERT_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			int recordCount = pstmt.executeUpdate();
			if(recordCount>0) {
				return true;
			}
			
		}
		finally {
			
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return false;
	}
	
	public UserDTO login(UserDTO userDTO) throws SQLException, ClassNotFoundException, NoSuchAlgorithmException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtils.createConnection();
			pstmt = con.prepareStatement(QueryConstants.LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			String plainPassword = userDTO.getPassword();
			String encryptedPassword = Encrypt.generatePassword(plainPassword);
			System.out.println("encryptedPassword "+encryptedPassword+" plainPassword "+plainPassword);
			//pstmt.setString(2, encryptedPassword);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				userDTO.setPassword(rs.getString("password"));
				System.out.println("DB Password "+userDTO.getPassword());
				userDTO.setLoginSuccess(true);
				userDTO.setStatus(rs.getString("status"));
				
			}
			else {
				userDTO.setLoginSuccess(false);
			}
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return userDTO;
	}
	void register() {
		
	}
	public int changePassword(String tempPassword, String userid) throws SQLException, ClassNotFoundException {
		
		int updateCount = 0;
		try(Connection con = ConnectionUtils.createConnection()){
			try (PreparedStatement pstmt = con.prepareStatement(QueryConstants.PASSWORD_UPDATE_SQL)){
				pstmt.setString(1, tempPassword);
				pstmt.setString(2, userid);
				updateCount = pstmt.executeUpdate();
				
			}
		}
		return updateCount;
	}
	void deleteUser() {
		
	}

}
