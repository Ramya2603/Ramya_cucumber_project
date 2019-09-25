package POMwithPageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageImplementation {

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   PageClass locateElements=PageFactory.initElements(driver, PageClass.class);
		   locateElements.loginMethod("ramyakasireddy.3@gmail.com","ramya123");
	}
}
