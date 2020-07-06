package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers{


	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Page", "FAIL");
		}
	}

	public FindLeadsPage enterLeadId(String data){
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", data);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	
	public FindLeadsPage enterLeadName(String data){
		enterByXpath("(//label[text()='Lead ID:']/following::input)[2]",data);
		return this;
	}

	public FindLeadsPage clickFindLead(){
		clickByXpath("//button[contains(text(),'Find Leads')]");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public FindLeadsPage verifyNoLead(String data){
		verifyTextByXpath("//div[contains(text(),'No records to display')]",data);
		return this;
	}

	public ViewLeadPage clickFirstLinkLeadId(){
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new ViewLeadPage(driver,test);
	}

	public EditLeadPage clickEditButton(){
		clickByLink("Edit");
		return new EditLeadPage(driver,test);
	}
	public String getFirstLinkId(){
		return 	getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");

	}

	

}
