package com.cyient.royalcaribbean;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIn {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.royalcaribbean.com/account/create");
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Dennis");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Rich");
		
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[text()=' December ']")).click();
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[text()=' 5 ']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("1997");
		
		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		driver.findElement(By.xpath("//span[text()=' India ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("rasi@gmail.com");
		driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("meGha1234567");
		
		driver.findElement(By.xpath("(//span[text()='Select one security question'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='What elementary school did you go to?']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("As123456");
		
		Actions mouse= new Actions(driver);
		mouse.clickAndHold();
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']
		driver.findElement(By.xpath("//input[@type='checkbox'] /..")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Done ']")).click();
		InvalidCredintial.test();
	
	}

}
