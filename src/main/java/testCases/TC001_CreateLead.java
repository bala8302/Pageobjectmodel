package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Create Lead";
		testDescription = "Create a New Lead";
		category = "smoke";
		authors = "Bala";
		dataSheetName = "TC001";
		
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd,String cn,String fn,String ln){		
		new LoginPage(driver, test)
		.enterUsername(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()		
		.enterCompanyName(cn)
		.enterFirstName(fn)
		.enterLastName(ln)
		.clickSubmitButtonInCL()
		.cnVerify(cn);
		
		
		
		
	}

}












