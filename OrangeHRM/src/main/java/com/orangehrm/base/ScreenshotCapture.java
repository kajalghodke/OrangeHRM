package com.orangehrm.base;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCapture extends OrangeHRMBase {

	public static void captureScreenshot(String tcname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrnshot = ts.getScreenshotAs(OutputType.FILE);
		String filePath = "./Screenshots/" + tcname + ".png";
		try {
			FileHandler.copy(scrnshot, new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
