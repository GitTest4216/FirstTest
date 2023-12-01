package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataPackage.PayorData;
import methodPackage.AddCaseMethods;
import methodPackage.AllergyMethods;
import methodPackage.CommunicationMethods;
import methodPackage.PatientMethods;

public class CommunicationLogFuntionality extends POSFunctionality {

	@Test(priority = 23)
	public void CommunicationModule() throws InterruptedException, IOException {

		CommunicationMethods c1 = PageFactory.initElements(driver, CommunicationMethods.class);
		
		System.out.println("communication log");
		  c1.verify_communicationLog_withoutData();
		  c1.verify_communicationLog_withInvalidData();
		  c1.verify_communicationLogNotAcceptNumeric();
		  c1.verify_communicationLogtNotAcceptSpecialCharacters();
		  c1.CommunicationLogValidData();
		
	}
}
