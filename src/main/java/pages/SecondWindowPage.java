package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class SecondWindowPage  extends LeafTapsWrappers{
	public SecondWindowPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		switchToLastWindow();
		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Page", "FAIL");
		}
	}
	
	public SecondWindowPage enterLeadId(){
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","10");
		return this;
	}
	
	public SecondWindowPage clickFindLeads(){
		clickByXpath("//button[contains(text(),'Find Leads')]");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public MergeLeadPage clickFirstLeadIdLink(){
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}
	
}
