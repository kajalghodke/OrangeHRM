package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;

public class LoginPageTest {

	LoginPage lp;
	//LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateTitleTest() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

	@Test
	public void validateUserNameFieldPresent() {
		Assert.assertTrue(lp.getUserNameFieldPresent());
	}

	@Test
	public void validatePasswordFieldPresent() {
		Assert.assertTrue(lp.getPasswordFieldPresent());
	}

	@Test
	public void validateLogin() {
		dp = lp.login();
		Assert.assertTrue(dp.getTimeWorkSectionPresent());
	}
	@Test
	public void validateInvalidLogin() {
		lp.invalidlogin();
		Assert.assertTrue(lp.verifywarningmsg());
		//Assert.assertFalse(dp.getTimeWorkSectionPresent());

	}
	@Test
	public void validateBlankLogin() {
		lp.blanklogin();
		Assert.assertTrue(lp.validateblankfield_warningmsg());

	}
	@Test
	public void validateForgotlink() {
		lp.forgotpasswordlink();
	}
	

	@AfterMethod
	public void closeBrowserSetup() {
		lp.tearDown();
	}

}
