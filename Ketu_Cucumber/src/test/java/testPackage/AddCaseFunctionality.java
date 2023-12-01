package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.AddCaseMethods;

public class AddCaseFunctionality extends MedListFunctionality {

	@Test(priority = 12)

	public void AddCaseModule() throws InterruptedException, IOException {
		System.out.println("In AddCaseModule");

		AddCaseMethods p5 = PageFactory.initElements(driver, AddCaseMethods.class);
		p5.addNewCase();
		p5.caseManagementTabOnlyPharmacyStoreSelected();
		p5.therapeuticValue();
		p5.caseManagementTabOnlyStoreandTCSelected();
		p5.caseManagementTabOnlyServicesSelected();
		p5.careplanValue();
		p5.caseManagementTabOnlyCarePlanSelected();
		//p5.caseManagementTabOnlyCaseTypeSelected();

	}
}