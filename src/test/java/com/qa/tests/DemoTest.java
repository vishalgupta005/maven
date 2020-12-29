package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	
	@Test
	public void Sum()
	{
		System.out.println("Sum");
		int a=10;
		int b=20;
		
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void Sub()
	{
		System.out.println("Sub");
		int a=10;
		int b=20;
		
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void Div()
	{
		System.out.println("Div");
		int a=10;
		int b=20;
		
		Assert.assertEquals(2, b/a);
	}
	
	@Test
	public void Mul()
	{
		System.out.println("Mul");
		int a=10;
		int b=20;
		
		Assert.assertEquals(200, a*b);
	}
}
