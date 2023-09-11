package com.orangehrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrangeHRMBase {

	public static WebDriver driver;
	public static Properties prop;

	public void initialization() {
		readPropertyFile();
		// how to read the browser variable?
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		ScreenshotCapture.captureScreenshot("loginpage");
	}

	public void tearDown() {
		//driver.quit();
		driver.close();

	}

	public void readPropertyFile() {
		prop = new Properties();
		String propFilePath = "./src/main/java/com/orangehrm/config/config.properties";
		FileInputStream fis;
		try {
			fis = new FileInputStream(propFilePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
