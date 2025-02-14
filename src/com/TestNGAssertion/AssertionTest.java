package com.TestNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	@Test
	public void testAssertion()
	{
		float Actualsalary=5.5f;
		float Expectedsalary=5.5f;
		
		Assert.assertEquals(Actualsalary, Expectedsalary, "Both are Equal");
		Assert.assertTrue(Actualsalary>2.5f, "Condition is True");
		Assert.assertFalse(Actualsalary<3.5f, "Condition is True");
		
		Assert.assertNotNull(Actualsalary, "Object is not null");
	}

}
