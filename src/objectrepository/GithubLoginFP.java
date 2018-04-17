package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GithubLoginFP {
	WebDriver driver;
	
	@FindBy(name="login")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement submitButton;
	

	public GithubLoginFP(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement emailId() {
		return username;
	}
	
	public WebElement passWordField() {
		return password;
	}
	
	public WebElement submitButton() {
		return submitButton;
	}
	
	
	

}
