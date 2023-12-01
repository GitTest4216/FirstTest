package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.PatientMethods;

public class PatientFunctionality extends LoginFunctionality {

	@Test(priority = 3)
	public void patientModule() throws InterruptedException, IOException {
		System.out.println("In patientModule");
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);

		p1.verify_patient_withoutData();
		p1.patientTabSomeFieldNotAcceptAlphabets();
		p1.patientNotAcceptNumeric();
		p1.patientNotAcceptSpecialCharacters();
		p1.patientNotAcceptSpace();
		p1.Patient_with_valid_data();
	}
}
