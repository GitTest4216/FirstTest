package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.ServicePrefMethods;

public class ServicePreferenceFunctionality extends PayorInsuranceFunctionality {

//	private static final WebDriver driver = null;

	@Test(priority = 5)

	public void ServicePreferenceModule() throws InterruptedException, IOException {
		System.out.println("In ServicePreferenceModule");

		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		 sp1.verify_ServicePreferenceTabIsDisplayed();
		 
		 sp1.SaveTherapeuticProgramWithoutEnterData();
		 
		 sp1.SaveOnlyEnterTherapeuticProgram();
		 
		 sp1.SaveTCandStatus();
		 
		 sp1.SaveTCStatusReason();
		 
		 sp1.SaveTCStatusReasonandNewtoPharmacy();
		 
		 sp1.verify_ServicePreference_With_Valid_Data();


	}
}