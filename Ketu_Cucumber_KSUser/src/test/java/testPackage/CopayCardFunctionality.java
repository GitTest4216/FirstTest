package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.CopayMethods;

public class CopayCardFunctionality extends AddAppealFunctionality {

	@Test(priority = 19)
	public void CopayModule() throws InterruptedException, IOException {
		System.out.println("In CopayModule");

		CopayMethods c1 = PageFactory.initElements(driver, CopayMethods.class);
		c1.CopayCardLogValidData();
	}
}
