package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MediBuddyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.linkText("Signup")).click();
		driver.findElement(By.name("firstName")).sendKeys("Bhavana");
		driver.findElement(By.name("phone")).sendKeys("777777");
		driver.findElement(By.name("username")).sendKeys("Jupalli@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ashs117");
		driver.findElement(By.xpath("//input[@ng-model='logInUser.isChecked']")).click();
		driver.findElement(By.name("employeeId")).sendKeys("Ashs117");
		driver.findElement(By.name("password")).sendKeys("Ashs117");
		Select selectlang= new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
		selectlang.selectByVisibleText("2019");
		Select selectlang1= new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
		selectlang1.selectByVisibleText("04");
		Select selectlang2= new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
		selectlang2.selectByVisibleText("03");
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		driver.findElement(By.xpath("span[@class='option radio m-t-0 m-b-0'])[2]")).click();
//		Select selectlang2= new Select(driver.findElement(By.id("country")));
//		selectlang2.selectByVisibleText("India");
//		driver.findElement(By.id("agree_terms")).click();
//		driver.findElement(By.xpath("//button[@title='Submit']")).click();
//		 Select selectYear = new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
//         selectYear.selectByVisibleText("1998");
//		  driver.findElement(By.xpath("//span[text()='Male']")).click();
		//span[@class='option radio m-t-0 m-b-0'])[2]
	}

}
