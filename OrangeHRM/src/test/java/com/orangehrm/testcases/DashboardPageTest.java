package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;

public class DashboardPageTest {

	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validate_DashboardLanded_TimeWorkSectionPresent() {
		dp = lp.login();
		Assert.assertTrue(dp.getTimeWorkSectionPresent());
	}
	
	@Test
	public void validate_myinfotabPresent() {
		dp = lp.login();
		Assert.assertTrue(dp.myinfotabPresent());
	}
	

	@AfterMethod
	public void closeSetup() {
		lp.tearDown();
	}
}
