package com.jisuan;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Test_juint {
	
	@Test
	public void testAddNum(){
		
		Test1 ts=new Test1();
		ts.addNum(3, 6);
	}
	
	@After
	public void testm2(){
		Test1 ts=new Test1();
		ts.method2();
	}
	
	@Ignore
	public void testm3(){
		Test1 ts=new Test1();
		ts.method3();
	}
	
	@Before
	public void testm4(){
		Test1 ts=new Test1();
		ts.method4();
	}

}
