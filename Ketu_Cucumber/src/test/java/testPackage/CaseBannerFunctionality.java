package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.CaseBannerMethods;

public class CaseBannerFunctionality extends AddPrescriptionfunctionality {

	@Test(priority = 14)

	public void caseBannerModule() throws InterruptedException, IOException {

		System.out.println("In CaseBannerModule");

		CaseBannerMethods casebanner = PageFactory.initElements(driver, CaseBannerMethods.class);

		casebanner.verify_casebanner();

		casebanner.verify_casebaneer_withoutdata();

		casebanner.verify_casebaneer_InvalideData();
		casebanner.verify_casebaneer_correct_data();

	}

}
