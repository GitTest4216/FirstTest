package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.HealthHistoryMethods;

public class HealthHistoryFunctionality extends SocialHistoryFunctionality{

	@Test(priority = 10)
	public void healthHistoryClinicalModule() throws InterruptedException, IOException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		h1.healthHistoryFamilyClinicalWithoutData();	
		h1.familyHistoryNotAcceptAlphabets();
		h1.familyHistoryNotAcceptSpecialCharacters();
		h1.familyHistoryNotAcceptNumeric();
		h1.familyHistoryNotAcceptSpace();
		 h1.familyHistoryValidData();
		 
		h1.healthHistoryMedicalClinicalWithoutData();
		h1.medicalHistoryNotAcceptAlphabets();
		h1.medicalHistoryNotAcceptspecialCharacters();
		h1.medicalHistoryNotAcceptNumeric();
		h1.medicalHistoryNotAcceptSpace();
	    h1.medicalHistoryValidData();
	
		h1.healthHistoryROSClinicalWithoutData();
		h1.ROSwithAlphabets();
		h1.ROSShouldNotAcceptNumeric();
		h1.ROSShouldNotAcceptSpecialCharacters();
		h1.ROSShouldNotAcceptSpace();
		h1.ROSValidData();
		
		h1.healthHistorySurgicalClinicalWithoutData();
		h1.surgicalNotAcceptOtherAlphabets();
		h1.surgicalNotAcceptNumeric();
		h1.surgicalNotAcceptSpecialCharacters();
		h1.surgicalNotAcceptSpace();
		h1.surgicalValidData();
	}
}
