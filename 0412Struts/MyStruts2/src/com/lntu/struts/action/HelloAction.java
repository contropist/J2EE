package com.lntu.struts.action;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class HelloAction {
	private Hello h;

	public Hello getH() {
		return h;
	}

	public void setH(Hello h) {
		this.h = h;
	}
	public String execute(){
		String n=h.getName();
		Map<String,Object> request = (Map) ActionContext.getContext().get("session");
		request.put("n", h);
		return "success";
	}

}
