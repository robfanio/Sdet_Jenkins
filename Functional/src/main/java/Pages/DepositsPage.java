package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepositsPage {
	WebDriver driver;
	
	public DepositsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//----------------Element Locators-----------//
	
	@FindBy(xpath="//ul[@class='menusubnav']/li[8]") public WebElement deposit;
	@FindBy(xpath="//input[@name = 'accountno']") public WebElement account;
	@FindBy(xpath="//input[@name = 'ammount']")public WebElement amount;
	@FindBy(xpath="//input[@name = 'desc']")	public WebElement description;
	@FindBy(xpath="//input[@name = 'AccSubmit']") public WebElement submit;
	
	
	//---------------------METHODS--------//
	
	
	public void clickDeposit() {
		deposit.click(); 
	}
		
	
	public void inputAcct(String number) {
		
		
		account.sendKeys(String.valueOf(number));
		
	}
	
	
	
	public void inputAmnt(String number) {
		amount.sendKeys(String.valueOf(number));
	}
	
	public void inputDesc(String txt) {
		description.sendKeys(txt);
	}
	 public void clckSubmit() {
		 submit.click();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@FindBy(xpath="//ul[@class = 'menusubnav']/li") public List<WebElement> sideBar;
	//List <WebElement> side2 = driver.findElements(By.xpath("//ul[@class = 'menusubnav']/li"));

//	public void prntText() {
//		for(WebElement bar:sideBar) {
//			System.out.println(bar.getText());
//		}
//	}
//	
	
	
	
//public void clickDesposit(String txt) {
//		
//		for(WebElement pckSide:sideBar) {
//			if(pckSide.getText().trim().contains(txt)) {
//				pckSide.click();
//			}
//		}
		
	}
	
	
	
	
	
	
	
	

	
	