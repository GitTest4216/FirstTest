package methodPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.FaxSentData;

public class FaxSendMethods extends FaxSentData {

	String FaxSendpermission = DpModulePermission.getRow(11).getCell(1).getStringCellValue();
	String receiverfaxnumber = DpFaxSend.getRow(1).getCell(2).getStringCellValue();
	String Faxpermission = DpModulePermission.getRow(10).getCell(1).getStringCellValue();

	public void FaxSend() throws InterruptedException, IOException {
//		parent = report.createTest("Fax Management");
//		test = report.createTest("Send Fax");
		Thread.sleep(5000);
		navigateToHomePage();
		String HomePageTitle = driver.getTitle();
try {
	
		if (HomePageTitle.equals("KloudScript")) { // Check the Page title if we are reach at home page or not.

			int i = 0;
			while (i < 1) {
				Thread.sleep(2000);
				if (Notification.isDisplayed()) {
					Notification.click();
				} else {
					i = 1;
				}
			}
			openFaxSend(FaxSendpermission);

			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Open Fax Send");
		}
} catch (Exception e) {
	ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Opening Fax Send");
}
try {
		if (CTUser == false) {
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait1.until(ExpectedConditions.elementToBeClickable(Organization1));
			String Organization = selectOrganization();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Organization - " + "<b>" + Organization + "</b>");
		}
} catch (Exception e) {
	ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Selecting Organization");
}
try {
		String template = selectTemplate();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Fax Template - " + "<b>" + template + "</b>");

		Thread.sleep(2000);
		enterTextinTextbox(To, "ToContent");
		enterTextinTextbox(Attention, "AttentionContent");
		enterTextinTextbox(From, "FromContent");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered data in textbox");
} catch (Exception e) {
	ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Entering data in textbox");
}
try {
		// ========Click on Next button
		wizardSteps(receiverfaxnumber);

		// ======Click on Send Fax
		clickOnSendFax();

		// ================Capture Screenshot
//		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, CaptureScreen(driver));
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Fax sent Successfully");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());

		Thread.sleep(5000);

		Thread.sleep(3000);
		// =======Navigate back to Home Page
		navigateToHomePage();
		//parent.appendChild(test);
} catch (Exception e) {
	ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Sending FAX");
	ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
			MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
}
	}

	public void FaxInbox() throws InterruptedException, IOException {
		//test = report.createTest("Assign Fax");
		String Loginpermission = DpModulePermission.getRow(2).getCell(1).getStringCellValue();
		String KSClientsearch = DpFaxInbox.getRow(1).getCell(1).getStringCellValue();
		String FaxStatus = DpFaxInbox.getRow(1).getCell(2).getStringCellValue();
		String PatientId = DpFaxInbox.getRow(1).getCell(3).getStringCellValue();
		String CallerValue = DpFaxInbox.getRow(1).getCell(4).getStringCellValue();
		String Lognotesvalue = DpFaxInbox.getRow(1).getCell(5).getStringCellValue();
		String FaxAction = DpFaxInbox.getRow(1).getCell(0).getStringCellValue();

		try {
			Thread.sleep(4000);

			String HomePageTitle = driver.getTitle();

			// Thread.sleep(2000);
			if (HomePageTitle.equals("KloudScript")) { // Check the Page title if we are reach at home page or not.
				// System.out.println("Ctuser"+CTUser);

				int i = 0;
				while (i < 1) {
					if (notificationDialogCloseBtn.isDisplayed()) {
						notificationDialogCloseBtn.click();
					} else {
						i = 1;
					}
				}

				if (Faxpermission.equals("YES")) {

					Thread.sleep(2000);
					try {

						// Click on Fax Inbox Button
						FaxInbox.click();

						Thread.sleep(1000);
						// The reason for checking the user

						verifyLoginPermission(Loginpermission, KSClientsearch);

						// select fax status
						selectStatus(FaxStatus);

						clickOnSearch();

						Thread.sleep(2000);

						if (FaxAction.equals("VIEW") || FaxAction.equals("ASSIGN")) {

							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + PharmacyTitleView.getLocation().y + ")");

							if (PharmacyTitleView.getAttribute("title").equalsIgnoreCase("View")) {

								verifyView(PatientId, CallerValue, Lognotesvalue);

							} else {
								verifyAssign(PatientId, CallerValue, Lognotesvalue);

								System.out.println("Fax is assign to Patient Successfully.");
								ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Fax is assign to Patient Successfully.");
							}

						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
						ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Fax is assign to Patient Successfully.");
					}

				}
				System.out.println("Fax is assign to Patient Successfully.");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Fax is assign to Patient Successfully");

			} else {
				// Patient Permission is no than come here
				System.out.println("Fax Permission is NO");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Fax Permission is NO");
			}
			// =======Navigate back to Home Page
			navigateToHomePage();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Fax Assigned Successfully");
			//parent.appendChild(test);
			//report.endTest(parent);

		} catch (Exception e) {
			e.getMessage();
			
			  ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
			  MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build()
			  );
			 
		}
		
	}
}