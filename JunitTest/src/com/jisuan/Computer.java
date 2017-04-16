package com.jisuan;

public class Computer {
	private int a;
	private int b;
	public Computer(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int add(){
		return a+b;
	}
	public int minus(){
		return a-b;
	}
	public int multiply(){
		return a*b;
	}
	public int divide(){
	if(b!=0)
		return a/b;
	else
		return 0;
	}
}
