package com.qa.tests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoTest {
@Test
public void sum() {
	System.out.println("sum");
	int a=20;
	int b=10;
	Assert.assertEquals(30, a+b);
}
}
