package mavenpackage.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class checkout {
  WebDriver driver;
	
public checkout(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	driver = driver2;
}

public void checkoutprocedure() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement checkot= driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	checkot.click();
	WebElement chkot = driver.findElement(By.xpath("(//a[@title= 'Proceed to checkout'])[2]"));
	chkot.click();
	WebElement chkout = driver.findElement(By.xpath("//button[@type='submit'][@name='processAddress']"));
	chkout.click();
	WebElement condition = driver.findElement(By.id("cgv"));
	condition.click();
	WebElement checkout = driver.findElement(By.xpath("//button[@type='submit'][@name ='processCarrier']"));
	checkout.click();
	WebElement payBywire = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	payBywire.click();
	WebElement confirmorder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	confirmorder.click();
}
}
