package Test;

import org.testng.annotations.Test;

public class TC_04_Deposits extends BaseTest {

	@Test
	public void addDeposit() {
		logger.info("OPEN URL");
		OpenUrl();
		logger.info("USER INPUT"); 
		lgPage.userInput(userId);

		logger.info("PASSWORD INPUT");
		lgPage.passwordInput(password);

		logger.info("CLICK SUBMIT");
		lgPage.clickSubmit();

		logger.info("CLICK DEPOSIT");
		deposit.clickDeposit();

		logger.info("INPUNT ACCOUNT");
		deposit.inputAcct("909515551");
		
		logger.info("INPUT AMOUNT");
		deposit.inputAmnt("1000000");
		
		logger.info("INPUT DESCRIPTION");
		deposit.inputDesc("checking");
		
		logger.info("CLICK SUBMIT");
		deposit.clckSubmit();
		
		logger.info("SWITCH ALERT");
		driver.switchTo().alert().accept();

	}

}

//WebDriverWait wait = new WebDriverWait(driver, 10);
//
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name = 'accountno']")));
