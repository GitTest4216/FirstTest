package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.PAMethod;

public class PAFunctionality extends AddConsentFunctionality {

//	private static final WebDriver driver = null;

	@Test(priority = 17)

	public void PriorAuthorizationModule() throws InterruptedException, IOException {
		System.out.println("In PAModule");

		PAMethod pm1 = PageFactory.initElements(driver, PAMethod.class);
		pm1.verify_AddPAWithValidData();
	}
}