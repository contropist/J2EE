package com.lntu.hello.web.test;

import java.util.ArrayList;
import java.util.List;

public class StudyList {
	public static void main(String[] args) {
		
		List<String>  list = null;
		list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		list.add("1");
		
		for(String s : list){
			System.out.println(s);
		}
	}

}
