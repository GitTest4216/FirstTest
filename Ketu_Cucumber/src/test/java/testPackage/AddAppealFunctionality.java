package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.AddAppealMethods;

public class AddAppealFunctionality extends PAFunctionality {

	@Test(priority = 18)

	public void AddAppealModule() throws InterruptedException, IOException {

		System.out.println("In AppealModule");
		AddAppealMethods p5 = PageFactory.initElements(driver, AddAppealMethods.class);
//

		p5.clickOnBIWorkflow();
		p5.clickonAppealActivity();
		p5.clickOnAddAppealLink();
		p5.selectStatusValue();
		p5.selectReasonValue();
		p5.selectInitiatedByValue();
		p5.enterPANumberValue();
		p5.selectOnPrescrLinks();
		p5.selectInsuranceValue();
		p5.enterPADateOnInitiated();
		p5.selectLevelOfAppealValue();
		p5.selectPAContestedReasonValue();
		p5.selectYesRadioValue();
		p5.AppealDraftedByValue();
		p5.enterAppealDateSubmittedValue();
		p5.enterDecisionReceivedDateValue();
		p5.enterApprovalDateValue();
		p5.enterExpirationDateValue();
		p5.enterAppealNumberValue();
		p5.appealSavebtn();
		p5.appealClosebtn();

	}
}