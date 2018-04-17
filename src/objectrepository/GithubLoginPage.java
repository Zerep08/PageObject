package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubLoginPage {
	WebDriver driver;
	By username = By.name("login");
	By password = By.name("password");
	By signButton = By.name("commit");
	public GithubLoginPage(WebDriver driver) {

		this.driver = driver;
	}
	
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	
	public WebElement passWordField() {
		return driver.findElement(password);
	}
	
	public WebElement submitButton() {
		return driver.findElement(signButton);
	}
	
	
	

}
