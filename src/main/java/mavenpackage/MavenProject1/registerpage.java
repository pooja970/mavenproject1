package mavenpackage.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
 
public class registerpage {
	WebDriver driver;
	
	public registerpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
	}
	public void registerloginmethod() {
		
	
	WebElement result = driver.findElement(By.id("id_gender1"));
	result.click();
	WebElement firstname = driver.findElement(By.id("customer_firstname"));
	firstname.sendKeys("pooja");
	WebElement lastname = driver.findElement(By.id("customer_lastname"));
	lastname.sendKeys("gore");
	WebElement pwd = driver.findElement(By.id("passwd"));
	pwd.sendKeys("poojsdsed@123454");
	 WebElement day = driver.findElement(By.id("days"));
	Select select = new Select(day);
	select.selectByValue("2");
	WebElement month = driver.findElement(By.id("months"));
	Select selectMonth = new Select(month);
	selectMonth.selectByValue("4");
	WebElement year = driver.findElement(By.id("years"));
	Select select2 = new Select(year);
	select2.selectByValue("2016");
	WebElement signup = driver.findElement(By.id("newsletter"));
	signup.click();
	WebElement offer = driver.findElement(By.id("optin"));
	offer.click();
	WebElement comp = driver.findElement(By.id("company"));
	comp.sendKeys("Avegen");
	WebElement address = driver.findElement(By.id("address1"));
	address.sendKeys("baner");
	WebElement address1 = driver.findElement(By.id("address2"));
	address1.sendKeys("Krupa apartment");
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("Krupa apartment");
	WebElement statename= driver.findElement(By.id("id_state"));
	Select state = new Select(statename);
	state.selectByValue("1");
	WebElement code= driver.findElement(By.id("postcode"));
	code.sendKeys("00000");
	WebElement country = driver.findElement(By.id("id_country"));
	Select selectcontry = new Select(country);
	selectcontry.selectByIndex(1);
	WebElement number= driver.findElement(By.id("phone_mobile"));
	number.sendKeys("7030466066");
	WebElement add= driver.findElement(By.id("alias"));
	add.sendKeys("highway");
	WebElement register= driver.findElement(By.id("submitAccount"));
	register.click();
	}
}
