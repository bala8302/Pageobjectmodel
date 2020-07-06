package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_EditLead extends LeafTapsWrappers{
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Edit Lead";
		testDescription = "To Edit Lead";
		category = "smoke";
		authors = "Bala";
		dataSheetName = "TC003";
		
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
		.enterLeadName("bala")
		.clickFindLead()
		.clickFirstLinkLeadId()
		.clickEditLeads()
		.editCompanyname(data)
		.clickEditSUbmit()
		.cnVerify(data);
		
	}
	
	
}
