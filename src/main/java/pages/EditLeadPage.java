package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers {

	

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Page", "FAIL");
		}
	}

	public EditLeadPage editCompanyname(String data){
		enterById("updateLeadForm_companyName", data);
		return this;
	}
	
	public ViewLeadPage clickEditSUbmit(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver,test);
	}
}
