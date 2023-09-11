package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.orangehrm.base.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase {

	public boolean getTimeWorkSectionPresent() {
		System.out.println("Dashboard Page Landed");
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	
	public boolean myinfotabPresent() {
		System.out.println("My Info Tab Present in Left side panel ");

		return driver.findElement(By.xpath("//span[text()='My Info']")).isDisplayed();
	}
	
	public MyinfoPage getmyinfopage() {
		System.out.println("Personal Details Tab Clicked");

	 	driver.findElement(By.xpath("//span[text()='My Info']")).click();
	 	return new MyinfoPage();
	}

}
