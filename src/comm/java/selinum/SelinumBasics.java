package comm.java.selinum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelinumBasics {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
