package comm.java.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MegentoTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://magento.com/");
		driver.findElement(By.id("gnav_557")).click();
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("firstname")).sendKeys("Bhavana");
		driver.findElement(By.id("lastname")).sendKeys("Jupalli");
		driver.findElement(By.id("email_address")).sendKeys("asha1117@gmail.com");
		driver.findElement(By.id("self_defined_company")).sendKeys("Cyient");
		Select selectlang= new Select(driver.findElement(By.id("company_type")));
		selectlang.selectByVisibleText("Tech Partner");
		Select selectlang2= new Select(driver.findElement(By.id("country")));
		selectlang2.selectByVisibleText("India");
		driver.findElement(By.id("agree_terms")).click();
		driver.findElement(By.xpath("//button[@title='Submit']")).click();
		

	}

}
