package mavenpackage.MavenProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WomenSection {
	WebDriver driver;

	public WomenSection(WebDriver driver2) {
		driver=driver2;
	}

	public void WomendressSection() throws InterruptedException {

		WebElement women = driver.findElement(By.className("sf-with-ul"));
		women.click();
		WebElement top = driver.findElement(By.xpath("(//a[contains(@title , 'long sleeves, tank tops')])[1]"));
		top.click();
		
		WebElement imgs = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		imgs.click();
		
		WebElement fra= driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(fra);
		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']//parent::span"));
		quantity.click();
		  
		WebElement size = driver.findElement(By.id("group_1"));
		Select selectsize = new Select(size);
		selectsize.selectByIndex(2);
	
		WebElement colors = driver.findElement(By.name("Blue"));
		colors.click();
		Thread.sleep(1000);
		WebElement addToCart =driver.findElement(By.name("Submit"));
		addToCart.click();
		driver.switchTo().defaultContent();
	}
}