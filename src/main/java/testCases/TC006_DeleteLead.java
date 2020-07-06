package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_DeleteLead extends LeafTapsWrappers{
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Delete Lead";
		testDescription = "Delete a Lead";
		category = "smoke";
		authors = "Bala";
		dataSheetName = "TC006";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void DeleteLead(String un,String pass,String data,String data1){
		String s=new LoginPage(driver,test)
		.enterUsername(un)
		.enterPassword(pass)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterLeadName(data)
		.clickFindLead()
		.getFirstLinkId();
		
		new FindLeadsPage(driver, test)
		.clickFirstLinkLeadId()
		.clickDeleteLead()
		.clickFindLeads()
		.enterLeadId(s)
		.clickFindLead()
		.verifyNoLead(data1);
	}

}
