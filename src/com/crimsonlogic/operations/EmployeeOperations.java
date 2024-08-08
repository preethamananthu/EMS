package com.crimsonlogic.operations;

import java.util.Scanner;

import com.crimsonlogic.EMS.Programmer;

public class EmployeeOperations extends Programmer{
	public void readData() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ID: ");
		setEmpId(in.nextInt());
		System.out.print("Enter your name: ");
		in.nextLine();
		setEmpName(in.nextLine());
		System.out.print("Enter your designation: ");
//		in.nextLine();
		setDesignation(in.nextLine());
		System.out.print("Enter your salary: ");
		setSalary(in.nextFloat());
		System.out.print("Enter years worked: ");
		setYears(in.nextInt());
	}
}
