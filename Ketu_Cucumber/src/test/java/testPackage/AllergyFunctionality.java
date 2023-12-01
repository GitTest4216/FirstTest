package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import methodPackage.AllergyMethods;

public class AllergyFunctionality extends ServicePreferenceFunctionality {

	@Test(priority = 6)
	public void allergyClinicalModule() throws InterruptedException, IOException {
		System.out.println("In allergyClinicalModule");
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
	   a1.allergyTabClinicalWithoutData();
		a1.allergenTypeNotSelected();
		a1.allergyNameNotSelected();
		a1.allergyNoteNotSelected();
		a1.allergyNameNotAllowAlphaNumeric();
		a1.allergyNameNotAllowSpecialCharacter();
		a1.allergyNameNotAllowSpaceBetweenName();
		a1.allergyNameNotAllowSpace();
		a1.allergyNoteNotAllowOnlySpace();
		a1.allergyNameBasedOnType();
	a1.allergyTabClinicalWithValid();
	}
}
