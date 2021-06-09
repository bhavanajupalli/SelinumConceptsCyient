package com.cyient.royalcaribbean;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//import com.sun.tools.javac.util.Assert;

public class InvalidCredintial extends SignIn{

	public static void test() throws InterruptedException {
		
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='highlight__content']/..")).click();
		Thread.sleep(1000);
		//div[@class='headerMainToolbar__menu__icon']
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		driver.findElement(By.id("rciFirstName")).sendKeys("Dennis");
		driver.findElement(By.id("rciLastName")).sendKeys("Rich");
		//driver.findElement(By.id("rciEmailAddress")).sendKeys("Bhav@gmail.com");
		driver.findElement(By.xpath("//select[@class='md-input']")).click();
		driver.findElement(By.xpath("//option[@value='IND']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		
		//Assert.assertEquals( driver.getTitle(),"My Account");		
		
	}
	
	//https://www.royalcaribbean.com/account/

}
