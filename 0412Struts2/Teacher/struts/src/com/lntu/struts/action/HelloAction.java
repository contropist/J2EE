package com.lntu.struts.action;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;



public class HelloAction {
/*	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}*/

	private Hello h;

	public Hello getH() {
		return h;
	}

	public void setH(Hello h) {
		this.h = h;
	}

	public String execute(){
		
	
	 /* HttpServletRequest request = ServletActionContext.getRequest();
	  String name = request.getParameter("name");*/
	  System.out.println(h.getName());
		String n = h.getName();
		Map<String,Object> request = (Map) ActionContext.getContext().get("session");
		request.put("n1", n);
		return "success";
	}

}
