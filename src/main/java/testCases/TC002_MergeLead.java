package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FirstWindowPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_MergeLead extends LeafTapsWrappers{
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Merge Lead";
		testDescription = "Merge two Leads";
		category = "smoke";
		authors = "Bala";
		dataSheetName = "TC002";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void mergeLead(String un,String pass,String data){
		String s=new LoginPage(driver, test)
		.enterUsername(un)
		.enterPassword(pass)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFirstIcon()
		.enterLeadId()
		.clickFindLeads()
		.getFirstLinkId();
		
		new FirstWindowPage(driver, test)
		.clickFirstLeadIdLink()
		.clickSecondIcon()
		.enterLeadId()
		.clickFindLeads()
		.clickFirstLeadIdLink()
		.clickMerge()
		.clickFindLeads()
		.enterLeadId(s)
		.clickFindLead()
		.verifyNoLead(data);
		
	}
}
