package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By lin=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By log=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickLink()
	{
		driver.findElement(lnc).click();
	}
	public void typeuname(String username)
	{
		driver.findElement(uname).sendKeys("ramyakasireddy.3@gmail.com");
	}
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("ramya123");
	}
	public void clickonLogin()
	{
		driver.findElement(lin).click();
	}
	public void clickonLogout()
	{
		driver.findElement(log).click();
	}
	

}
