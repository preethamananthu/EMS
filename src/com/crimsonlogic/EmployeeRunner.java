package com.crimsonlogic;

import java.util.Scanner;

import com.crimsonlogic.operations.EmployeeOperations;
import com.crimsonlogic.operations.ProgrammerOperations;

public class EmployeeRunner {

	public static void main(String[] args) {
		EmployeeOperations eo = new EmployeeOperations();
		ProgrammerOperations po = new ProgrammerOperations();
		Scanner in = new Scanner(System.in);
		
		eo.readData();
		po.addBonus();
		
	}

}


