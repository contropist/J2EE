package com.lntu.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class FormAction {
	private String username;
	private String password;
	private String gender;
	private String school;
	private String aihao;
	
	
	
	public String getAihao() {
		return aihao;
	}


	public void setAihao(String aihao) {
		this.aihao = aihao;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	private List<String> list;
	
	

	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public String execute(){
		
		list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		Map<String,Object> request = (Map) ActionContext.getContext().get("session");
		
		//request.put("lists", list);
		
		return "success";
	}
	
	public String login(){
		
		
		return "login";
	}

}
