
package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import methodPackage.PayorInsuranceMethods;

public class PayorInsuranceFunctionality extends PatientFunctionality {

	@Test(priority = 4)

	public void payorInsuranceModule() throws InterruptedException, IOException {

		System.out.println("In PayorModule");
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);

		p2.PayorTab_WithoutData();
		p2.payorTabOnlyInsuranceTypeSelected();
		p2.PayorTabNotAcceptAlphabets();
		p2.PayorTabNotAcceptSpecialCharacters();
		p2.PayorTabNotAcceptSpace();
		p2.PayorTabNotAcceptNumericValue();
		p2.PayorTabBINSize();
		p2.PayorTabPhoneSize();
		p2.PayorTabDateNotAcceptInvalidData();

		p2.PayorTabWithValidData();

	}
}
