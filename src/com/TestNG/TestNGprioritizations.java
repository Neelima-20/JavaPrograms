package com.TestNG;

import org.testng.annotations.Test;

public class TestNGprioritizations {
	
@Test(priority=1)
public void AddEmployee()
{
	System.out.println("Add employee");
}

@Test(priority=4)
public void EditEmployee()
{
	System.out.println("Edit employee");
}

@Test(priority=5)
 public void DeleteEmployee()
 
{
	System.out.println("Delete Employee");
}

@Test(priority=2)
public void UpdateEmployee()
{
	System.out.println("Update Employee");
}

@Test(priority=3)
public void SelectEmployee()
{
	System.out.println("Select Employee");
}
}
