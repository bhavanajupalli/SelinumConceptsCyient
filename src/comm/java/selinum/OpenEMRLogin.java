package comm.java.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenEMRLogin {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectlang= new Select(driver.findElement(By.name("languageChoice")));
		selectlang.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.className("authUser")).sendKeys("admin");
		
		//driver.findElement(By.xpath("//li[text()='Logout']")).click();
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Billy']"))).perform();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}

}
