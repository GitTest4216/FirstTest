package testPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.AddPrescriptionMethod;

import java.io.IOException;

public class AddPrescriptionfunctionality extends AddCaseFunctionality {

	@Test(priority = 13)

	public void AddPrescription() throws InterruptedException, IOException {
		System.out.println("In PrescriptionModule");

		AddPrescriptionMethod addRx = PageFactory.initElements(driver, AddPrescriptionMethod.class);
		addRx.AddPrescriptionfromInatke();
		addRx.AddRx_WithValidData();

	}
}