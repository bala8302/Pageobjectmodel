package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers{

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}

	public CreateLeadPage enterCompanyName(String data){
		enterById("createLeadForm_companyName", data);
		return this;
	}
	public CreateLeadPage enterFirstName(String data){
		enterById("createLeadForm_firstName", data);
		return this;
	}
	public CreateLeadPage enterLastName(String data){
		enterById("createLeadForm_lastName", data);
		return this;
	}

    
	public ViewLeadPage clickSubmitButtonInCL(){
		clickByName("submitButton");
		return new ViewLeadPage(driver,test);
	}

}














