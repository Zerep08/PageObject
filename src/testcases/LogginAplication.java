package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.GithubLoginFP;

public class LogginAplication {
	String driverPath = "C:\\Users\\1459751\\Documents\\Libraries\\chromedriver_win32\\chromedriver.exe";

	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login?return_to=%2Fjoin%3Fsource%3Dheader-home");

		GithubLoginFP git = new GithubLoginFP(driver);
		
		git.emailId().sendKeys("hello");
		git.passWordField().sendKeys("123345");
		git.submitButton().click();
		
		
		
	}
	
	

}
