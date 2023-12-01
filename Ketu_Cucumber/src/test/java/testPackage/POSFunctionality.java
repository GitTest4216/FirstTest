package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.POSMethod;

public class POSFunctionality extends PostBiFunctionality {

//	private static final WebDriver driver = null;

	@Test(priority = 22)

	public void pointOfSaleModule() throws InterruptedException, IOException {
		System.out.println("In pointOfSaleModule");

		POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);

		pos1.verify_POS_With_Valid_Data();
		pos1.completeIntake();
		pos1.completeBI();
		pos1.completeCOC();
		pos1.completeCoD();
		pos1.completePOS();
		pos1.completePE();
		pos1.refillCase();

	}
}