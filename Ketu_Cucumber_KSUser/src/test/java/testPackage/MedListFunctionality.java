package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.MedListMethods;

public class MedListFunctionality extends HealthHistoryFunctionality {

	@Test(priority = 11)
	public void medListClinicalModule() throws InterruptedException, IOException {
		System.out.println("In MedList Module");
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		m1.medListClinicalWithoutData();
		m1.dropdownnotAcceptOtherAlphabets();
		m1.dropdownnotAcceptNumeric();
		m1.dropdownnotAcceptSpecialCharacters();
		m1.dropdownnotAcceptSpace();
		m1.medListDateValueInvaid();
		m1.medListMedicationNameNotAcceptNumeric();
		m1.medListAllTextFieldNotAcceptSpace();
		m1.medListSomeFieldNotAcceptAlphabets();
		m1.medListSomeFieldNotAcceptSpecialCharacters();
		m1.medListValidData();
	}
}
