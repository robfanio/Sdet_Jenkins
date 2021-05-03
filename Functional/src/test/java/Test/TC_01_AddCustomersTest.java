package Test;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TC_01_AddCustomersTest extends BaseTest {

	@Test
	public void AddCust() throws IOException {
		OpenUrl();
		lgPage.userInput(userId);
		lgPage.passwordInput(password);
		lgPage.clickSubmit();
		addCustomers.clickAddNewCustomer();
		addCustomers.custName("Robinson Fanio");
		addCustomers.custgender("Male");
		addCustomers.custaddress("314 S Ash Avenue");
		addCustomers.custcity("Galloway");
		addCustomers.custstate("New Jersey");
		addCustomers.custpinno("0820511");
		addCustomers.custdob("04", "19", "1985");
		addCustomers.custtelephoneno("123456789");
		
		String email =randomestring()+"@gmail.com";
		
		addCustomers.custemailid(email);
		
		String password = randomeNum();
		
		addCustomers.custpassword(password);
		
		addCustomers.custsubmit();
		
		//VALIDATING THE REGISTRATION
		
		boolean registration = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		
		if(registration== true) {
			
			Assert.assertTrue(true);
			logger.info("Assert Passed");
		}else {
			
			captureScreen(driver, " AddCust");
			Assert.assertTrue(false);
			logger.info("Assert Fails");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
