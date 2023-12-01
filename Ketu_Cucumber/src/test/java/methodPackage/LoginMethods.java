package methodPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



import dataPackage.LoginData;

public class LoginMethods extends LoginData{
	
	public void verify_login_incorrect_correct() throws InterruptedException, IOException {
		
		parent = report.createTest("Login");
		test = report.createTest("Login With incorrect username and correct password");
		verify_username_incorrect();
		verify_password_correct();
		signInBtn();
		passFailStatus();
//		parent.appendChild(test);
	
	}
	
	public void verify_login_correct_incorrect() throws InterruptedException, IOException {
		test = report.createTest("Login With incorrect username and correct password");
		verify_username_correct();
		verify_password_incorrect();
		signInBtn();
		passFailStatus();
//		parent.appendChild(test);
	}

	public void verify_login_incorrect_incorrect() throws InterruptedException, IOException {
		test = report.createTest("Login With incorrect username and incorrect password");
		verify_username_incorrect();
		verify_password_incorrect();
		signInBtn();
		passFailStatus();
//		parent.appendChild(test);
	}
	
	public void verify_login_correct_correct() throws InterruptedException, IOException {
		//parent = report.createTest("Login");
		test = report.createTest("Login With correct username and correct password");
		verify_username_correct();
		verify_password_correct();
		signInBtn();
		String PageTitle = driver.getTitle();
		try {

			if (PageTitle.equalsIgnoreCase("Select Pharmacy Location")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/button/span[1]")).click();// click
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/input")).sendKeys(Keys.DOWN); // Click
																														// on
				driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/input")).sendKeys(Keys.DOWN); 																					// First
																														// Option
				driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/input")).sendKeys(Keys.ENTER); // Click
																														// on
																														// First
																														// Option
				driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[2]/input")).click(); // Click
																											// on
																											// Proceed
																											// Button
			} else {
				// test.log(LogStatus.PASS, "Pharmacy has a single store");
			}

		}

		catch (Exception e) {

			e.getMessage();
		}
	
//		parent.appendChild(test);
//		report.endTest(parent);
	}
	
}