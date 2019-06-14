package mavenpackage.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class loginpage {
	WebDriver driver;
	public loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
	}
	public void loginmethod() {
	WebElement username = driver.findElement(By.id("email_create"));
	username.sendKeys("poojakfmjhfr06@gmail.com");
	WebElement rudra= driver.findElement(By.id("SubmitCreate"));
	rudra.click();
}
}