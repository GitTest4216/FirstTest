package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.AddFoundationMethods;

public class AddFoundationFunctionality extends CopayCardFunctionality {

	@Test(priority = 20)

	public void AddFoundationModule() throws InterruptedException, IOException {

		System.out.println("In AddFoundationModule");
		AddFoundationMethods p5 = PageFactory.initElements(driver, AddFoundationMethods.class);

		p5.clickOnBIWorkflow();
		p5.clickonFoundationSupportActivity();
		p5.clickOnAddFoundationSupportLink();
		p5.selectOnFoundationProgramLinks();
		p5.selectOnPrescrLinks();
		p5.selectStatusValue();
		p5.selectInitiatedByValue();
		p5.enterDateInitiatedFoundationValue();
		p5.enterDateSubmittedFoundationValue();
		p5.enterExpectedResponseDateFoundationValue();
		p5.enterDecisionDateFoundationValue();
		p5.SelectInsuranceValue();
		p5.FoundationSavebtn();
		p5.FoundationsClosebtn();

	}
}