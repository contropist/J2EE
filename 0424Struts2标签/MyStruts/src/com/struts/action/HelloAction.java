package com.struts.action;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.struts.model.Users;

public class HelloAction {
	private Users u;
	private String name;
	
	public String execute(){
		System.out.println(u.getName());
		String u1=u.getName();
		Map<String,Object> request=(Map<String, Object>) ActionContext.getContext().get("session");
		request.put("u2", u1);
		if(u1.equals("456")){
			return "success";
		}
		return "error";
	}
	
	public String add(){
		
		return "add";
	}
	
	public String jump(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String name=request.getParameter("name");
		return "jump";
	}

	public void setU(Users u) {
		this.u = u;
	}

	public Users getU() {
		return u;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
