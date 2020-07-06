package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead Page", "FAIL");
		}
	}

	public FirstWindowPage clickFirstIcon(){
		clickByXpath("(//img[@alt='Lookup'])[1]");
		return new FirstWindowPage(driver,test);
	}

	public SecondWindowPage clickSecondIcon(){
		clickByXpath("(//img[@alt='Lookup'])[2]");
		return new SecondWindowPage(driver,test);
	}

	public ViewLeadPage clickMerge(){
		clickByLink("Merge");
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
	
}
