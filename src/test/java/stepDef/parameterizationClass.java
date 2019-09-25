package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameterizationClass {

	WebDriver driver=null;
	@Given("^User opens the application$")
	public void user_opens_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		 
	}
	    

	@When("^User clicks on signin link$")
	public void user_clicks_on_signin_link() throws Throwable {
		  driver.findElement(By.linkText("SignIn")).click();
		  System.out.println("title of the page is"+driver.getTitle());
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		driver.close();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		
	    System.out.println("Login Successfully");
	}
}
