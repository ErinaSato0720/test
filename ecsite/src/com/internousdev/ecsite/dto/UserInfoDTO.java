package com.internousdev.ecsite.dto;

public class UserInfoDTO {

	private String id;
	private String loginId;
	private String loginPassword;
	private String userName;
	private String insert_name;
	private String update_date;

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassworf(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getInsert_name(){
		return insert_name;
	}
	public void setInsert_name(String insert_name){
		this.insert_name = insert_name;
	}
	public String getUpdate_date(){
		return update_date;
	}
	public void setUpdate_date(String update_date){
		this.update_date = update_date;
	}
}
