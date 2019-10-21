package com.acorp.travel.test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTestCode {

	public static void main(String[] args) throws Exception {
		String url = "https://www.monsterindia.com/seeker/registration?utm_expid=.iO1Vg59kR7udg4RYmnvdsA.0&utm_referrer=";
		System.setProperty("webdriver.chrome.driver", "/Users/amit/Documents/selenium-things/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElements(By.className("box")).get(0).click();
		Thread.sleep(3000);
		ScreenShotDemo.takeScreenShot(driver);
		//((JavascriptExecutor)driver).executeScript("document.querySelector('#file-upload').click();");
		//driver.findElement(By.id("file-upload")).click();
//		String path = "/Users/amit/Downloads/winter.jpg";
//		try {
//			//RobotForMac.upload(path);
//			FileUploadBySikuli.uploadIt(path);
//			System.out.println("Uploaded.....");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Error in File Upload ");
//			e.printStackTrace();
//			return ;
//		}
		System.out.println("Done...");
		
	}

}
