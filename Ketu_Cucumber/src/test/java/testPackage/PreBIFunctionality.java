package testPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import methodPackage.PreBIMethods;

public class PreBIFunctionality extends CaseBannerFunctionality {

	@Test(priority = 15)
	public void preBIModule() throws Exception {

		System.out.println("In preBIModule");
		PreBIMethods cmm = PageFactory.initElements(driver, PreBIMethods.class);

		
		cmm.verify_PreBI_With_Valid_Data();
		
	}

}
