package com.internousdev.javaKeijiban.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.javaKeijiban.util.DBConnector;
import com.internousdev.javaKeijiban.util.DateUtil;


public class InputDAO {

	public void createComments(String name, String title, String comments) throws SQLException{

	 	DBConnector db = new DBConnector();
	 	Connection con = db.getConnection();
	 	DateUtil dateUtil = new DateUtil();

	 	String sql = "INSERT INTO comment_info(name, title, comments, insert_date) VALUES(?,?,?,?)";

	 	try{
	 		PreparedStatement ps = con.prepareStatement(sql);
	 		ps.setString(1, name);
	 		ps.setString(2, title);
	 		ps.setString(3, comments);
	 		ps.setString(4, dateUtil.getDate());

	 		ps.execute();
	 	}catch(Exception e){
	 		e.printStackTrace();
	 	}finally{
	 		con.close();
	 	}

	}
}
