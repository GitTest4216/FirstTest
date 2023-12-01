package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.LoginMethods;

public class LoginFunctionality extends Base {

	@Test(priority = 2)
	public void loginModule() throws InterruptedException, IOException {
		LoginMethods addLogin = PageFactory.initElements(driver, LoginMethods.class);

		addLogin.verify_login_incorrect_correct();
		addLogin.verify_login_correct_incorrect();
		addLogin.verify_login_incorrect_incorrect();
		addLogin.verify_login_correct_correct();
	}

}
