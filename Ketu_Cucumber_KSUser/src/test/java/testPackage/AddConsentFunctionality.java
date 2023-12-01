package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.AddConsentMethods;

public class AddConsentFunctionality extends PreBIFunctionality {

	@Test(priority = 16)

	public void AddConsentModule() throws InterruptedException, IOException {
		System.out.println("In ConsentModule");
		AddConsentMethods p5 = PageFactory.initElements(driver, AddConsentMethods.class);

		p5.ClickonPatientConsentTab();
		p5.AddPatientConsentkElement();
		p5.relationshipValue();
		p5.userRoleValue();
		p5.userNameValue(); 
		p5.methodValue();
		p5.selectMethod();
		p5.consentTypeValue();
		p5.selectConsentType();
		p5.addConsentType();
		p5.selectAllActivity();

	}
}
