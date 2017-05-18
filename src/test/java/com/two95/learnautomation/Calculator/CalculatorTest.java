package com.two95.learnautomation.Calculator;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator c = null;
	@Before
	public void setup(){
//		private Calculator c=null;
		c=new Calculator();
	}
	@Test
	public void sumTest(){
	int sum= c.Sum(5, 4);
System.out.println(sum);
	}
@After
public void setUpAfter(){
	c=null;
}

}
