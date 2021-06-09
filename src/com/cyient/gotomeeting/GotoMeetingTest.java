package com.cyient.gotomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.xpath.internal.operations.Div;

//import com.sun.org.apache.xpath.internal.operations.Div;

public class GotoMeetingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gotomeeting.com/en-in");
		driver.findElement(By.linkText("Start for Free")).click();
		driver.findElement(By.id("first-name")).sendKeys("Bhavana");
		driver.findElement(By.id("last-name")).sendKeys("Jupalli");
		driver.findElement(By.id("login__email")).sendKeys("asha@gmail.com");
		driver.findElement(By.id("contact-number")).sendKeys("44444444");
		Select selectjob=new Select(driver.findElement(By.id("JobTitle")));
		selectjob.selectByVisibleText("Help Desk");
		driver.findElement(By.id("login__password")).sendKeys("Ash1234567");
		//driver.findElement(By.xpath("//input[@value='10-99']")).click();
		driver.findElement(By.xpath("(//div[@class='form-fields__radio'])[2]")).click();
		driver.findElement(By.xpath("//button[@data-button='trial-submit']")).click();

	}

}
