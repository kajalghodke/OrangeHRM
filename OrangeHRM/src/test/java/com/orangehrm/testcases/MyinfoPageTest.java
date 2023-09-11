package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.MyinfoPage;

public class MyinfoPageTest {
	
	LoginPage lp;
	DashboardPage dp;
	MyinfoPage mp;
	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validate_personal_details_tab_present() {
		dp = lp.login();
		mp=dp.getmyinfopage();
		Assert.assertTrue(mp.personaldetailsPresent());
	}
	@Test
	public void validate_default_myinfo() throws InterruptedException {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		mp.personaldetailsPresent();
		//mp.mandatefieldPresent();
		Assert.assertTrue(mp.mandatefieldPresent());

	}
	@Test
	public void validate_firstnamefield_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.firstnamePresent());

		
	}
	@Test
	public void validate_midnamenamefield_present() {
		
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.middlenamePresent());

	}
	@Test
	public void validate_lastnamefield_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.lastnamePresent());

	}
	
	@Test
	public void validate_nicknamefield_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.nicknamePresent());

	}
	@Test
	public void validate_employeeIDfield_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.employeeIDPresent());

	}
	@Test
	public void validate_otherIDfield_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.otherIDPresent());

	}
	@Test
	public void validate_driving_license_no_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.drivinglicNoPresent());

	}
	@Test
	public void validate_license_Expiry_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.licExpiryPresent());

	}
	@Test
	public void validate_ssno_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.ssnoPresent());

	}
	@Test
	public void validate_sino_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.sinoPresent());

	}
	@Test
	public void validate_dob_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.dateOfBirthPresent());

	}
	@Test
	public void validate_gender_present() {
		dp = lp.login();
		
		mp = dp.getmyinfopage();
		Assert.assertTrue(mp.genderFieldPresent());

	}
	
	
	
	@Test
	public void validate_filldetails() throws InterruptedException{
		dp = lp.login();
		mp=dp.getmyinfopage();
		
		Assert.assertTrue(mp.firstnamePresent());

		mp.firstname();
		Assert.assertTrue(mp.middlenamePresent());

		mp.middlename();
		Assert.assertTrue(mp.lastnamePresent());

		mp.lastname();
		Assert.assertTrue(mp.nicknamePresent());

		mp.nickname();
		Assert.assertTrue(mp.employeeIDPresent());

		mp.employeeid();
		Assert.assertTrue(mp.otherIDPresent());

		mp.otherid();
		Assert.assertTrue(mp.licExpiryPresent());

		//mp.drivingLicenseNumber();
		mp.licenseExpiry();
		Assert.assertTrue(mp.ssnoPresent());

		mp.ssnNumber();
		Assert.assertTrue(mp.sinoPresent());

		mp.sinNumber();
		Assert.assertTrue(mp.dateOfBirthPresent());

		mp.dateOfBirth();
		Assert.assertTrue(mp.genderFieldPresent());

		mp.genderSelection();
		Assert.assertTrue(mp.nationalityFieldPresent());

		mp.nationality();
		Assert.assertTrue(mp.maritalstatusFieldPresent());

		mp.maritalstatus();
		Assert.assertTrue(mp.bloodtypeFieldPresent());
		mp.basicdetailssubmit();

		mp.bloodgroup();
		mp.customsavebtn();

		
		Assert.assertTrue(mp.addAttachmentBtnPresent());

		mp.addattachment();
		
		mp.browseAttachment();
		Assert.assertTrue(mp.addCommentSectionPresent());

		mp.addcomment();
		
		mp.attacmentsubmit();
	}
	
	@Test
	public void validate_add_attachment() throws InterruptedException {
		dp = lp.login();
		mp=dp.getmyinfopage();
		mp.addattachment();
		mp.browseAttachment();
		mp.addcomment();
		mp.attacmentsubmit();
		mp.viewattachment();
	}
	@Test
	public void validate_edit_attachmentinfo() throws InterruptedException {
		dp = lp.login();
		mp=dp.getmyinfopage();
		mp.viewattachment();
		mp.editMyinfoAttachment();
		mp.browseAttachment();
		//mp.addcomment();
		mp.attacmentsubmit();
		

	}
	@Test
	public void validate_view_attachmentinfo() throws InterruptedException {
		dp = lp.login();
		mp=dp.getmyinfopage();
		mp.viewattachment();
	}
	@Test
	public void validate_add_profile_photo() throws Exception {
		dp =lp.login();
		mp=dp.getmyinfopage();
		mp.add_profile_onmyinfo();
		mp.profilepicsubmit();
	}
	
	@AfterMethod
	public void closeSetup() {
		lp.tearDown();
	}
	
}
