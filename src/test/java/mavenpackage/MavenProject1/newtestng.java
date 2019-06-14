package mavenpackage.MavenProject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class newtestng {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		loginpage log = new loginpage(driver);
		log.loginmethod();
		registerpage reg = new registerpage(driver);
		reg.registerloginmethod();
		WomenSection wds = new WomenSection(driver);
		wds.WomendressSection();
		checkout COT = new checkout(driver);
		COT.checkoutprocedure();
		logout LT = new logout(driver);
		LT.logoutmethod();

	}

	@Parameters("myBrowser")
	@BeforeTest
	public void beforeTest(String valueXyz) {
		String browser = valueXyz;
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else
		{
			throw new RuntimeException("browser is not available");
		}

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
