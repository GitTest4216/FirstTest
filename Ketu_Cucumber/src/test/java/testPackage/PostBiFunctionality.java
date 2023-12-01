package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.PostBIMethod;

public class PostBiFunctionality extends AddFoundationFunctionality  {

	@Test(priority = 21)
	public void PostBI() throws IOException, InterruptedException {
		System.out.println("In PostBIModule");

		PostBIMethod p1 = PageFactory.initElements(driver, PostBIMethod.class);
		p1.verifyPostBI();
		p1.VerifyPostBIWithValidData();
		

	}
}
