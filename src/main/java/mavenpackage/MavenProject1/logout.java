package mavenpackage.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logout {
	WebDriver driver;
	public logout(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
	}
	public void logoutmethod() {
		WebElement logoutpage = driver.findElement(By.xpath("//a[@class='logout']"));
		logoutpage.click();
	}

}
