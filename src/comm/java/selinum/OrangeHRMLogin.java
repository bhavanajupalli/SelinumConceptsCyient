package comm.java.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();	
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("test123");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.id("emgcontacts_name")).sendKeys("Bhavana");	
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Sister");
		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("010789022");
		driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("7986302002");
		driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("01042233677");
		driver.findElement(By.id("btnSaveEContact")).click();
		
	}

}
