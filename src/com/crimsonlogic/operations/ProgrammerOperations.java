package com.crimsonlogic.operations;

import java.util.Scanner;

import com.crimsonlogic.EMS.Programmer;
import com.crimsonlogic.EMS.SeniorProgrammer;

public class ProgrammerOperations extends Programmer {
	
	Scanner in = new Scanner(System.in);
	SeniorProgrammer sp = new SeniorProgrammer();

	public void addBonus() {
		if (getYears() > 0 && getYears()<=2) {
			setSalary(getSalary() + (getSalary() * (getBonus()*getYears())/100));
			
			System.out.println("Your salary after bonus after working for " + getYears() + " years: " + getSalary());
		}else if(getYears()>2){
			System.out.print("Enter no. of shares you hold: ");
			sp.setShares(in.nextInt());
			sharesOption();
		} else {
			System.out.println("You need to have at least 1 year of experience");
		}
	}
	
	public void sharesOption() {
		setSalary(getSalary() + (getSalary() * (getBonus()*getYears())/100)+sp.getShares()*getValuation_shares());
		System.out.println("Salary after bonus and stocks option(for senior developers): " + getSalary());
	}
}
