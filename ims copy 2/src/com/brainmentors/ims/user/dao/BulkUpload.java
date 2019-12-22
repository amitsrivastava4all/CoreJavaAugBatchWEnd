package com.brainmentors.ims.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.brainmentors.ims.common.ConnectionUtils;
import com.brainmentors.ims.common.QueryConstants;
import com.brainmentors.ims.user.dto.StudentDTO;

public interface BulkUpload {
	public static boolean isUpload(ArrayList<StudentDTO> students) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		con = ConnectionUtils.createConnection();
		con.setAutoCommit(false);
		pstmt = con.prepareStatement(QueryConstants.STUDENT_INSERT_SQL);
		for(StudentDTO student : students) {
			pstmt.setString(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setDouble(3, student.getFees());
			pstmt.setDouble(4, student.getPendingFees());
			java.sql.Date date = new java.sql.Date(student.getDueDate().getTime());
			pstmt.setDate(5, date);
			pstmt.addBatch();
			
		}
		int results [] = pstmt.executeBatch();
		if(results.length>0) {
		for(int result : results) {
			if(result<=0) {
				con.rollback();
				return false;
			}
		}
		con.commit();
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
}
