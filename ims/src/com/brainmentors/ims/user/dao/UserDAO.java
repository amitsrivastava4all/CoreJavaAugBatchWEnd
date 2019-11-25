package com.brainmentors.ims.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.brainmentors.ims.common.ConnectionUtils;
import com.brainmentors.ims.common.QueryConstants;
import com.brainmentors.ims.user.dto.UserDTO;

public class UserDAO {
	
	public UserDTO login(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtils.createConnection();
			pstmt = con.prepareStatement(QueryConstants.LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
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
	void changePassword() {
		
	}
	void deleteUser() {
		
	}

}
