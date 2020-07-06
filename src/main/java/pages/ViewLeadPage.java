package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Page", "FAIL");
		}
		
		
		
		
	}

	public ViewLeadPage cnVerify(String data)
	{
		verifyTextContainsById("viewLead_companyName_sp",data);
		return this;
	}
	public ViewLeadPage fnVerify(String data)
	{
		verifyTextContainsById("viewLead_firstName_sp",data);
		return this;
	}
	public FindLeadsPage clickFindLeads(){
		clickByLink("Find Leads");
		return new FindLeadsPage(driver,test);
	}
	
	public EditLeadPage clickEditLeads(){
		clickByLink("Edit");
		return new EditLeadPage(driver,test);
	}
	public DuplicateLeadPage clickDuplicateLeads(){
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver,test);
	}
	public MyLeadsPage clickDeleteLead(){
		clickByLink("Delete");
		return new MyLeadsPage(driver,test);
	}
}














