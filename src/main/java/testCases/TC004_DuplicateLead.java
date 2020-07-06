package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_DuplicateLead extends LeafTapsWrappers{
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Duplicate Lead";
		testDescription = "To DuplicateLead";
		category = "smoke";
		authors = "Bala";
		dataSheetName = "TC004";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void editLead(String un,String pass,String data){
		new LoginPage(driver,test)
		.enterUsername(un)
		.enterPassword(pass)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterLeadName(data)
		.clickFindLead()
		.clickFirstLinkLeadId()
		.clickDuplicateLeads()
		.clickSubmit()
		.fnVerify(data);
}
}