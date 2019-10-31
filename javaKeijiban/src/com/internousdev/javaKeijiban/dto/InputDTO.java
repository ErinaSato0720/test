package com.internousdev.javaKeijiban.dto;

public class InputDTO {

	private String id;
	private String name;
	private String title;
	private String comments;
	private String insert_date;
	private String update_date;

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getComments(){
		return comments;
	}
	public void setComments(String comments){
		this.comments = comments;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}
	public String getUpdate_date(){
		return update_date;
	}
	public void setUpdate_date(String update_date){
		this.update_date = update_date;
	}

}
