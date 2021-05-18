package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Account {
	WebDriver driver;
	
	public  Delete_Account(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	//-------------------ELEMENT LOCATORS-------------//
	@FindBy(xpath="//ul[@class='menusubnav']/li") public List<WebElement> sidebars;
	@FindBy(css = "input[type='text']") public WebElement txtbox;
	@FindBy(css="input[type='submit']") public WebElement submit;
	@FindBy(xpath = "//ul[@class='menusubnav']/li[7]") public WebElement delete;
	
	
	//---------------------------------METHODS------------------//
	public void sideBarInput(String text) {
		for(WebElement sidebar:sidebars) {
			if(sidebar.getText().trim().contains(text)) {
				sidebar.click();
			}
		}
	}
	
	public void inputText(String txt) {
		txtbox.sendKeys(txt);
	}
	public void clckSubmit() {
		submit.click();
	}
	
	public void clickDelete() {
		delete.click();
	}
	
}
