package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   PageClass Pobject=new PageClass(driver);
		   driver.get("http://demowebshop.tricentis.com/");
		   driver.manage().window().maximize();
		   Pobject.clickLink();
		   String username=null;
		   Pobject.typeuname(username);
		   String password=null;
		   Pobject.typepassword(password);
		   Pobject.clickonLogin();
		   Pobject.clickonLogout();
		   System.out.println("Title of the page is "+driver.getTitle());

	}

}
