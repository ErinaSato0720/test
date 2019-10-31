package com.internousdev.javaKeijiban.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.javaKeijiban.dao.OutPutDAO;
import com.internousdev.javaKeijiban.dto.InputDTO;
import com.opensymphony.xwork2.ActionSupport;

public class OutPutAction extends ActionSupport implements SessionAware {

	private Map<String, Object>session;
	private ArrayList<InputDTO>inputDTOList = new ArrayList<InputDTO>();

	public String execute() throws SQLException{
		OutPutDAO outPutDAO = new OutPutDAO();
		inputDTOList = outPutDAO.getCommentsList();
		if(!(inputDTOList.size()>0)){
			inputDTOList = null;
		}
		String result = SUCCESS;
		return result;
	}
	public Map<String, Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String, Object>session){
		this.session = session;
	}
	public ArrayList<InputDTO>getInputDTOList(){
		return inputDTOList;
	}
	public void seiInputDTOList(ArrayList<InputDTO>inputDTOList){
		this.inputDTOList = inputDTOList;
	}
}
