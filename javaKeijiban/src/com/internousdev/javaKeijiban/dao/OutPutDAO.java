package com.internousdev.javaKeijiban.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.javaKeijiban.dto.InputDTO;
import com.internousdev.javaKeijiban.util.DBConnector;

public class OutPutDAO {

	 public ArrayList<InputDTO> getCommentsList() throws SQLException{

		 DBConnector db = new DBConnector();
		 Connection con = db.getConnection();
		 ArrayList<InputDTO>inputDTOList = new ArrayList<InputDTO>();

		 String sql = "SELECT * FROM comment_info ORDER BY id DESC";

		 try{
			 PreparedStatement ps = con.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();

			 while(rs.next()){
				 InputDTO dto = new InputDTO();
				 dto.setId(rs.getString("id"));
				 dto.setName(rs.getString("name"));
				 dto.setTitle(rs.getString("title"));
				 dto.setComments(rs.getString("comments"));
				 dto.setInsert_date(rs.getString("insert_date"));
				 dto.setUpdate_date(rs.getString("update_date"));
				 inputDTOList.add(dto);
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 con.close();
		 }
		 return inputDTOList;
	 }
}
