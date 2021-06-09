package com.cyient.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HdfcLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();//img[@alt='continue'][1]
		//driver.findElement(By.c)
		//driver.ge
		
//		driver.findElement(By.name("firstName")).sendKeys("Bhavana");
//		driver.findElement(By.name("phone")).sendKeys("777777");
	}

}
