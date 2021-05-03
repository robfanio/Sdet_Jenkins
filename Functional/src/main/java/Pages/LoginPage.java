package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='uid']") public WebElement userName;
	@FindBy(xpath="//input[@name='password']") public WebElement passwordName;
	@FindBy(xpath="//input[@type='submit']") public WebElement submit;
	@FindBy(xpath="//div[@class ='logo']") public WebElement logo;
	@FindBy(xpath="//img[@src='../images/1.gif']") public WebElement Guru;
	@FindBy(xpath="//a[text()='Log out']") public WebElement logout;
	
	//------INPUT THE USERNAME----//
	
	public void userInput(String user) {
		userName.sendKeys(user);
	}

	
	public void passwordInput(String password) { 
		passwordName.sendKeys(password);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	//combination of userName, passwordName and submit
	public void SignIn(String name, String pass) {
		userName.sendKeys(name);
		passwordName.sendKeys(pass);
		submit.click();
	}
	public void clickLogout() {
		logout.click();
	}

}

