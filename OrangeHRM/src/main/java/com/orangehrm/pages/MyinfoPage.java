package com.orangehrm.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangehrm.base.OrangeHRMBase;
import com.orangehrm.base.ScreenshotCapture;

public class MyinfoPage extends OrangeHRMBase{
	
//xpath for all element
	
	By firstname=By.xpath("//input[@name='firstName']");
	By midname=By.xpath("//input[@name='middleName']");	
	By lastname=By.xpath("//input[@name='lastName']");
	By nikname= By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::label[text()='Nickname']//following::input[1]");
	By drivlino=By.xpath("//label[text()=\"Driver's License Number\"]//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By licExd=By.xpath("//label[text()='License Expiry Date']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By eid=By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::label[text()='Employee Id']//following::input[1]");
	By oid=By.xpath("//label[text()='Other Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By ssn =By.xpath("//label[text()='SSN Number']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By sin =By.xpath("//label[text()='SIN Number']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By dob=By.xpath("//label[text()='Date of Birth']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By button_save=By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//descendant::button[@type='submit']");
	By button_save_attac=By.xpath("//div[@class='orangehrm-attachment']//descendant::button[@type='submit']");
	By addcomment=By.xpath("//label[text()='Comment']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::textarea");
	By browsebtn = By.xpath("//input[@type='file']");
	By militaryservice=By.xpath("//label[text()='Military Service']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input");
	By addbtn=By.xpath("//button[text()=' Add ']");
	By personaldeatils=By.xpath("//h6[text()='Personal Details']");
	By edit_img=By.xpath("//img[@class='employee-image']");
	By btn_Profile_Save= By.xpath("//div[@class='oxd-form-actions']//descendant::button[@type='submit']");
	By upload_profile =By.xpath("//img[@class='employee-image']//parent::div[@class='employee-image-wrapper']");
	By gendersele=By.xpath("//label[text()='Female']");
	By marital_status=By.xpath("//div[text()='Married']//parent::div");
	
	By nati_status=By.xpath("(//div[@role='listbox']/div[@role='option'])[83]");
	By mariconfind=By.xpath("//label[text()='Marital Status']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::i");
	By mar_sele= By.xpath("(//div[@role='listbox']/div[@role='option'])[03]");
	By nationdropclick=By.xpath("//label[text()='Nationality']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::i");
	By bloodtypeclick=By.xpath("//label[text()='Blood Type']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::i");
	By blood_sele= By.xpath("(//div[@role='listbox']/div[@role='option'])[04]");
	By blood_save_btn=By.xpath("//div[@class='orangehrm-custom-fields']//descendant::button[@type='submit']");

	
	public boolean personaldetailsPresent() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Personal Details Tab Displayed");
		driver.findElement(personaldeatils).click();
		System.out.println("Personal Details Tab Clicked");

		return driver.findElement(personaldeatils).isDisplayed();
		
	}
	public boolean mandatefieldPresent() {
		 boolean fname=	driver.findElement(firstname).isDisplayed();
		 boolean lname=driver.findElement(lastname).isDisplayed();
		 return fname;
			
	}
	
	public boolean firstnamePresent() {
		
	return driver.findElement(firstname).isDisplayed();
	}
	public boolean middlenamePresent() {
		
		return driver.findElement(midname).isDisplayed();
		}
	public boolean lastnamePresent() {
		
		return driver.findElement(lastname).isDisplayed();
		}
	public boolean nicknamePresent() {
		
		return driver.findElement(nikname).isDisplayed();
		}
	public boolean employeeIDPresent() {
		
		return driver.findElement(eid).isDisplayed();
		}
	
	public boolean otherIDPresent() {
	
	return driver.findElement(oid).isDisplayed();
	}
	public boolean drivinglicNoPresent() {
	
	return driver.findElement(drivlino).isDisplayed();
	}
	public boolean licExpiryPresent() {
		
		return driver.findElement(licExd).isDisplayed();
	}
	public boolean ssnoPresent() {
		
		return driver.findElement(ssn).isDisplayed();
	}
	public boolean sinoPresent() {
	
	return driver.findElement(sin).isDisplayed();
	}
	public boolean dateOfBirthPresent() {
		
		return driver.findElement(dob).isDisplayed();
		}
	
	public boolean militaryServicePresent() {
		
		return driver.findElement(militaryservice).isDisplayed();
		}
public boolean basicinfoSaveBtnPresent() {
		
		return driver.findElement(button_save).isDisplayed();
		}
public boolean attachSaveBtnPresent() {
	
	return driver.findElement(button_save_attac).isDisplayed();
	}
public boolean addAttachmentBtnPresent() {
	
	return driver.findElement(addbtn).isDisplayed();
	}
public boolean addCommentSectionPresent() {
	
	return driver.findElement(addcomment).isDisplayed();
	}
public boolean genderFieldPresent() {
	
	return driver.findElement(gendersele).isDisplayed();

	
}
public boolean nationalityFieldPresent() {
	
	return driver.findElement(nationdropclick).isDisplayed();

	
}
public boolean bloodtypeFieldPresent() {
	
	return driver.findElement(bloodtypeclick).isDisplayed();

	
}
public boolean maritalstatusFieldPresent() {
	
	return driver.findElement(mariconfind).isDisplayed();

	
}

public boolean bloodsavebtnFieldPresent() {
	
	return driver.findElement(blood_save_btn).isDisplayed();

	
}
	
	
	
	
	public void firstname() throws InterruptedException  {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		Actions act = new Actions(driver);

		WebElement fname=driver.findElement(firstname);
			fname.click();
		
			act.moveToElement(fname).doubleClick(fname).sendKeys(fname, Keys.CONTROL,"a",Keys.BACK_SPACE)
			.build().perform();
		
			fname.sendKeys(prop.getProperty("firstname"));

	}
	public void middlename() throws InterruptedException  {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions act = new Actions(driver);
		WebElement mname=driver.findElement(midname);
		mname.click();
		act.moveToElement(mname).doubleClick(mname).sendKeys(mname, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
		mname.sendKeys(prop.getProperty("middlename"));
		
		
	}

	public void lastname() throws InterruptedException  {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	Actions act = new Actions(driver);

	WebElement lname=driver.findElement(lastname);
	lname.click();
	act.moveToElement(lname).doubleClick(lname).sendKeys(lname, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
	
	lname.sendKeys(prop.getProperty("lastname"));
	}
	public void nickname() throws InterruptedException  {
		
		Actions act = new Actions(driver);

		// for nick name
		WebElement nickname=driver.findElement(nikname);
		nickname.click();
		act.moveToElement(nickname).doubleClick(nickname).sendKeys(nickname, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
		
		nickname.sendKeys(prop.getProperty("nickname"));


		
	}
	public void employeeid() throws InterruptedException  {

		// for employee id
		Actions act = new Actions(driver);

		WebElement empid=driver.findElement(eid);
		empid.click();
act.moveToElement(empid).doubleClick(empid).sendKeys(empid, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
		
		empid.sendKeys(prop.getProperty("employeeid"));
		
	}
	public void otherid() throws InterruptedException {
		//for other id
		Actions act = new Actions(driver);

		WebElement otherid =driver.findElement(oid);
		otherid.click();
		act.moveToElement(otherid).doubleClick(otherid).sendKeys(otherid, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
		otherid.sendKeys(prop.getProperty("otherid"));
	}
	
	public void drivingLicenseNumber() throws InterruptedException {
		Actions act = new Actions(driver);

		// for Driver's License Number date
		//label[text()="Driver's License Number"]//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input
		WebElement drivlicno =driver.findElement(drivlino);
		drivlicno.click();
		act.moveToElement(drivlicno).doubleClick(drivlicno).sendKeys(drivlicno, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
		drivlicno.sendKeys(prop.getProperty("drivLicNo"));
	}
	public void licenseExpiry() throws InterruptedException {
		Actions act = new Actions(driver);

		// for License Expiry date
		
		WebElement licExpdate =driver.findElement(licExd);
		licExpdate.click();
		act.moveToElement(licExpdate).doubleClick(licExpdate).sendKeys(licExpdate, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
		licExpdate.sendKeys(prop.getProperty("licenseExpiry"));
		
		
	}
	public void ssnNumber() throws InterruptedException {
		Actions act = new Actions(driver);

		//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::div[@class='oxd-input-group__label-wrapper']/label[text()='SSN Number']//following::input[1]
		WebElement ssno =driver.findElement(ssn);
		ssno.click();
		act.moveToElement(ssno).doubleClick(ssno).sendKeys(ssno, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();

		ssno.sendKeys(prop.getProperty("ssnNumber"));
			
	}
	public void sinNumber() throws InterruptedException {

		// for sin no
		Actions act = new Actions(driver);

				WebElement sinno =driver.findElement(sin);
				sinno.click();
				act.moveToElement(sinno).doubleClick(sinno).sendKeys(sinno, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();

				sinno.sendKeys(prop.getProperty("sinNumber"));
	}
	public void dateOfBirth() throws InterruptedException {
		
		// for date of birth  
		Actions act = new Actions(driver);

				
				WebElement DateofBirth =driver.findElement(dob);
				DateofBirth.click();
				act.moveToElement(DateofBirth).doubleClick(DateofBirth).sendKeys(DateofBirth, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
				DateofBirth.sendKeys(prop.getProperty("dateOfBirth"));				
	}
	public void genderSelection() throws InterruptedException  {
		WebElement GenderSelect =driver.findElement(gendersele);
		GenderSelect.click();
	}
	
	
	
	public void militaryservice() throws InterruptedException {
		
		// for military
		Actions act = new Actions(driver);

				
				WebElement military_service =driver.findElement(militaryservice);
				military_service.click();
				act.moveToElement(military_service).doubleClick(military_service).sendKeys(military_service, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
				military_service.sendKeys(prop.getProperty("militaryservice"));				
	} 


public MyinfoPage basicdetailssubmit() throws InterruptedException {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println(" i am in Submitted");

	WebElement save_btn_form1 =driver.findElement(button_save);
	Actions act = new Actions(driver);

	act.moveToElement(save_btn_form1).click().build().perform();
	driver.navigate().refresh();
	//save_btn_form1.click();
	System.out.println("Submitted");
	ScreenshotCapture.captureScreenshot("basicdetailssubmit");

	return new MyinfoPage() ;
	
}
public MyinfoPage profilepicsubmit() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));

	System.out.println(" i am in  profilepicsubmit Submitted");

	WebElement profile_submit =driver.findElement(btn_Profile_Save);
	profile_submit.click();
	Actions act = new Actions(driver);

	act.moveToElement(profile_submit).click().build().perform();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));

	//driver.navigate().refresh();
	//save_btn_form1.click();
	System.out.println(" profile_submit Submitted");
	ScreenshotCapture.captureScreenshot("profilepicsubmit");

	return new MyinfoPage() ;
	
}
public MyinfoPage uploadprofilephoto() throws InterruptedException {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println(" i am in uploadprofilephoto ");
	WebElement uploadphoto =driver.findElement(upload_profile);
	Actions act = new Actions(driver);
	act.moveToElement(uploadphoto).doubleClick(uploadphoto).sendKeys("C:\\Users\\Shankar\\eclipse-workspace\\OrangeHRM\\wp4056773.jpg").build().perform();

	//uploadphoto.sendKeys("C:\\Users\\Shankar\\eclipse-workspace\\OrangeHRM\\wp4056773.jpg");

	System.out.println("Submitted");
	ScreenshotCapture.captureScreenshot("uploadprofilephoto");

	return new MyinfoPage() ;
	
	
	
}
public MyinfoPage profilephoto() throws InterruptedException {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println(" i am in Submitted");

	WebElement profilephoto =driver.findElement(edit_img);
	Actions act = new Actions(driver);

	act.moveToElement(profilephoto).click().build().perform();
	//driver.navigate().refresh();
	//save_btn_form1.click();
	System.out.println("Submitted");
	ScreenshotCapture.captureScreenshot("profilephoto");

	return new MyinfoPage() ;
	
}
public MyinfoPage attacmentsubmit() throws InterruptedException {
	Actions act = new Actions(driver);

	WebElement save_btn_form2 =driver.findElement(button_save_attac);

	act.moveToElement(save_btn_form2).click().build().perform();
	System.out.println("Attachment added");
	ScreenshotCapture.captureScreenshot("attachmentsubmit");

	
	return new MyinfoPage() ;
}
public void addcomment() throws InterruptedException {
	Actions act = new Actions(driver);

	
	WebElement add_comment =driver.findElement(addcomment);
	add_comment.click();
	act.moveToElement(add_comment).doubleClick(add_comment).sendKeys(add_comment, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();
	add_comment.sendKeys(prop.getProperty("addingcomment"));
	
}
public MyinfoPage addattachment() throws InterruptedException {
	
	System.out.println(" i am in attachmnet");

	WebElement add_btn =driver.findElement(addbtn);
	Actions act = new Actions(driver);

	act.moveToElement(add_btn).click().build().perform();
	
	
	return new MyinfoPage() ;
	
}

public MyinfoPage browseAttachment() throws InterruptedException {
	
	
	WebElement broswer_btn =driver.findElement(browsebtn);

	broswer_btn.sendKeys(prop.getProperty("browsefile"));

	
	return new MyinfoPage() ;
	
}
public MyinfoPage viewattachment() {
	System.out.println("Check Record found");
	//System.out.println(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText());
	String actresult= new String(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText());
	 System.out.println(actresult);
		String excpresult= new String("No Record Found");

		 if(excpresult.equals(actresult) ) {
				System.out.println("Failed :NO Record Found");
		 }
		 else {
				System.out.println("Passed: "+actresult);

		 }
	return new MyinfoPage() ;
}
	
public MyinfoPage editMyinfoAttachment() {
	By editattachinfo =By.xpath("//i[@class='oxd-icon bi-pencil-fill']");
	WebElement editbtn =driver.findElement(editattachinfo);
	editbtn.click();
	return new MyinfoPage() ;

}
	
	public void nationality() throws InterruptedException  
	{
		WebElement nationdrop =driver.findElement(nationdropclick);
		nationdrop.click();
		System.out.println("after click");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement na =driver.findElement(nati_status);
		na.click();
		//Actions act = new Actions(driver);

	}
	public void maritalstatus() throws InterruptedException  {
		
		WebElement clickdrop=driver.findElement(mariconfind);
		clickdrop.click();
		System.out.println("click on i");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));

		WebElement mar_status=driver.findElement(mar_sele);
		
		mar_status.click();
		//mar_status.sendKeys(prop.getProperty("Married"));
		
		
	}
public void bloodgroup() throws InterruptedException  {
		
		WebElement clickdrop=driver.findElement(bloodtypeclick);
		clickdrop.click();
		System.out.println("click on i");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));

		WebElement blood_status=driver.findElement(blood_sele);
		
		blood_status.click();
		//mar_status.sendKeys(prop.getProperty("Married"));
		
		
	}
public MyinfoPage customsavebtn() throws InterruptedException {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println(" i am in customsavebtn  Submitted");

	WebElement save_btn_form2 =driver.findElement(blood_save_btn);
	Actions act = new Actions(driver);

	act.moveToElement(save_btn_form2).click().build().perform();
	driver.navigate().refresh();
	//save_btn_form1.click();
	//System.out.println("Submitted");
	ScreenshotCapture.captureScreenshot("customsavebtn");

	return new MyinfoPage() ;
	
}
public void add_profile_onmyinfo() throws Exception {
	WebElement profilephoto =driver.findElement(edit_img);
	profilephoto.click();
	
	WebElement uploadphoto =driver.findElement(upload_profile);
	uploadphoto.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

	Robot rb =new Robot();
	//social-1206612_1920.png
	StringSelection str =new StringSelection("C:\\Users\\Shankar\\eclipse-workspace\\OrangeHRM\\wp4056773.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

	rb.keyPress(KeyEvent.VK_CONTROL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	rb.keyPress(KeyEvent.VK_V);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

	rb.keyRelease(KeyEvent.VK_CONTROL);

	rb.keyRelease(KeyEvent.VK_V);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

	

	rb.keyPress(KeyEvent.VK_ENTER);

	rb.keyRelease(KeyEvent.VK_ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	
	
}

}
