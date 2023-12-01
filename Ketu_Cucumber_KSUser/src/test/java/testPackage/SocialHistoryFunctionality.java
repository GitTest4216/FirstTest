package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.LabsMethods;
import methodPackage.SocialHistoryMethods;

public class SocialHistoryFunctionality extends LabsFunctionality{

	@Test(priority = 9)
	public void socialHistoryClinicalModule() throws InterruptedException, IOException {
		System.out.println("In socialHistoryClinicalModule");
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		s1.socialHistoryClinicalWithoutData();
		s1.socialHistoryDropdownNotAcceptAlphabets();
		s1.socialHistoryDropdownNotAcceptNumeric();
		s1.socialHistoryDropdownNotAcceptSpecialCharacters();
		s1.socialHistoryAllFieldsNotAcceptSpace();
		s1.socialHistoryRadioButtonsNotAcceptAnyOtherValues();
	s1.socialHistoryAllFieldsWithValidData();
	}
}
