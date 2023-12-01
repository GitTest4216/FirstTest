package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.FaxSendMethods;

public class FaxSendFunctionality extends CommunicationLogFuntionality{

	@Test(priority = 24)

	public void FaxSend() throws InterruptedException, IOException {
		
		System.out.println("In Fax Module");
		FaxSendMethods FS1 = PageFactory.initElements(driver, FaxSendMethods.class);
		FS1.FaxSend();
		FS1.FaxInbox();
	}
}
