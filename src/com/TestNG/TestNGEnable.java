package com.TestNG;

import org.testng.annotations.Test;

public class TestNGEnable {
	@Test()
	public void AddEmployee()
	{
		System.out.println("Add Employee");
	}
	@Test(enabled=false)
	public void DeleteEmployee()
	{
		System.out.println("Delete Employee");
	}
	@Test()
	public void SelectEmployee()
	{
		System.out.println("Select Employee");
	}
	@Test()
	public void UpdateEmployee()
	{
		System.out.println("Update Employee");
	}
	@Test(enabled=false)
	public void EditEmployee()
	{
		System.out.println("Edit Employee");
	}
	

}
