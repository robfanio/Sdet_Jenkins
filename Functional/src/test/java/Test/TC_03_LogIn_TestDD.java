package Test;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.XlUtils;


public class TC_03_LogIn_TestDD extends BaseTest {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		logger.info("OPEN THE URL");
		OpenUrl();
		String path = System.getProperty("user.dir");
		System.out.println(path);
		lgPage.userInput(user);
		logger.info("user name provided");
		lgPage.passwordInput(pwd);
		logger.info("password provided");
		lgPage.clickSubmit();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lgPage.clickLogout();
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
		
	}
	
	//user defined method created to check alert is presence or not
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
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException 
	{
		
		String path="C:\\Users\\robfa\\Desktop\\Sdet\\Functional\\src\\main\\java\\TestData\\Book1.xlsx";
		XlUtils xl=new XlUtils(path);
		
		int totalrows=xl.getRowCount("Sheet1");
		int totalcols=xl.getCellCount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xl.getCellData("Sheet1", i, j);
				
			}
				
		}
		
		return loginData;
		
//		String loginData[][]= {
//		{"mngr319346","Amyvupy"},
//		{"mngr319346","Amyvupy"},
//		{"mngr319346","Amyvupy"},
//		{"mngr323566","EbAdyse"}
//		};
//		
//		return loginData;
//	}
	
	
}

}




