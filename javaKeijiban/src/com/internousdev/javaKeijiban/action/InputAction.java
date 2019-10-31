package com.internousdev.javaKeijiban.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class InputAction extends ActionSupport implements SessionAware {

	private String name;
	private String title;
	private String comments;
	private String errorMessage;
	private Map<String, Object> session;

	public String execute(){

		String result = ERROR;

		if(!(comments.equals(""))){
			setErrorMessage("コメントを入力してください。");
			result = SUCCESS;

			return result;
		}


		//↓コテハン判定

			//@aaaaaaaa:bbbbbb


		return result;


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
		public String getErrorMessage(){
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage){
			this.errorMessage = errorMessage;
		}
		public Map<String, Object> getSession(){
			return session;
		}
		@Override
		public void setSession(Map<String, Object> session){
			this.session = session;
		}


}
