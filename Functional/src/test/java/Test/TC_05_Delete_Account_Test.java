package Test;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_05_Delete_Account_Test extends BaseTest{
	@Test
	public void delete_Accnt(){
		logger.info("OPEN URL");
		OpenUrl();
		logger.info("USER INPUT"); 
		lgPage.userInput(userId);

		logger.info("PASSWORD INPUT");
		lgPage.passwordInput(password);

		logger.info("CLICK SUBMIT");
		lgPage.clickSubmit();
		
//	
		delete_account.clickDelete();
		
//		WebDriverWait  wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeSelected(delete_account.txtbox));
		
		delete_account.inputText("0000000");
		delete_account.clckSubmit();
		isAlertPresent();
	}
	public boolean isAlertPresent() 
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}

}
