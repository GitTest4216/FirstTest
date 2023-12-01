package methodPackage;

import java.io.IOException;
import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import dataPackage.PAData;
import dataPackage.PayorData;
import dataPackage.PostBIData;
import testPackage.Base;

public class PostBIMethod extends PostBIData {

	String PostBIPermissioncell = DpModulePermission.getRow(16).getCell(1).getStringCellValue();
//	String PIName = DpPayor_tab.getRow(25).getCell(3).getStringCellValue();
	String PIName = DpPayor_tab.getRow(1).getCell(3).getStringCellValue();
//	String SecInsName = DpPayor_tab.getRow(26).getCell(3).getStringCellValue();
	String SecInsName = DpPayor_tab.getRow(2).getCell(3).getStringCellValue();
//	String CopayInsName = DpPayor_tab.getRow(27).getCell(3).getStringCellValue();
//	String FoundInsName = DpPayor_tab.getRow(28).getCell(3).getStringCellValue();

//	 String PrimaryInsValue = DpPostBI_tab.getRow(17).getCell(1).getStringCellValue();
//	String SecInsName = DpPostBI_tab.getRow(19).getCell(1).getStringCellValue();
	String DefaultInsValue = DpPostBI_tab.getRow(3).getCell(0).getStringCellValue();
	String PrimaryBilledAmount = DpPostBI_tab.getRow(1).getCell(3).getStringCellValue();
//	 String PrimaryBilledAmount = DpPostBI_tab.getRow(22).getCell(1).getStringCellValue();
	String PrimaryPaid = DpPostBI_tab.getRow(1).getCell(5).getStringCellValue();
	String CopayPaid = DpPostBI_tab.getRow(12).getCell(2).getStringCellValue();
	String FoundationPaid = DpPostBI_tab.getRow(15).getCell(2).getStringCellValue();
//	String SecondaryBilled = DpPostBI_tab.getRow(7).getCell(3).getStringCellValue();
	String SecondarypaidAmount = DpPostBI_tab.getRow(7).getCell(5).getStringCellValue();
	String PatientCopayAmount = DpPostBI_tab.getRow(18).getCell(2).getStringCellValue();
	String DrugAcquisitionAmount = DpPostBI_tab.getRow(20).getCell(2).getStringCellValue();
	String InvalidText = DpPostBI_tab.getRow(33).getCell(1).getStringCellValue();
	String InvalidDate = DpPostBI_tab.getRow(33).getCell(2).getStringCellValue();
	String InvalidPastDate = DpPostBI_tab.getRow(33).getCell(3).getStringCellValue();
	String InvalidSpecialChars = DpPostBI_tab.getRow(33).getCell(4).getStringCellValue();
//	String InvalidPrimaryAmount = DpPostBI_tab.getRow(21).getCell(2).getStringCellValue();
//	String PostBIPermission = DpModulePermission.getRow(16).getCell(2).getStringCellValue();

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	PayorData p1 = PageFactory.initElements(driver, PayorData.class);

	public void verifyPostBI() throws IOException, InterruptedException {

//		parent = report.createTest("PostBI");
//		test = report.createTest("Verify Post BI");
		// p1.patientSearchMethod();

		try {

			String HomePageTitle = driver.getTitle();
			if (!(HomePageTitle.equalsIgnoreCase("Login"))) {
				int ii = 0;
				while (ii < 1) {
					if (notificationDialogCloseBtn.isDisplayed()) {
						notificationDialogCloseBtn.click();
					} else {
						ii = 1;
					}
				}
			}

			if (PostBIPermissioncell.equalsIgnoreCase("YES")) {

				System.out.println("PostBI Verification Permission is YES");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Post BI Verification Permission is YES");
				System.out.println("Navigating to open Post BI");
				openPostBI();

			} else {
				System.out.println("PostBI Verification Permission is NO");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "PostBI Verification Permission is NO");
			}
		} catch (Exception e) {
			// ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "PostBI Verification
			// Permission is NO");
		}
		System.out.println("End of Verify Post BI");
		// parent.appendChild(test);
	}

	public void openPostBI() throws IOException, InterruptedException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
		System.out.println("In Open post BI");
		PAData padata1 = PageFactory.initElements(driver, PAData.class);
		// test = report.createTest("Open Post BI tab");
		try {

			// p1.patientSearchMethod();
			// System.out.println("Patient Search Successful");
			patientCarePopUp();
			patientAlertPopUp();
			// caseOpenSessionPopup();
			Thread.sleep(3000);

			// *********************** Check for COC Management Tab is display or not
		
			try {

				WebElement CoCWorkflowElement = driver
						.findElement(By.xpath("//*[@documenttag=\"CORDINATION_OF_CARE\"]"));

				Thread.sleep(1000);
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + CoCWorkflowElement.getLocation().y + ")");
				wait.until(
						ExpectedConditions.elementToBeClickable(By.xpath("//*[@documenttag=\"CORDINATION_OF_CARE\"]")));
				Thread.sleep(4000);
				CoCWorkflowElement.click();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on CoC Workflow");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Clicking on CoC Workflow");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			Thread.sleep(3000);
			try {
				WebElement PostBIAdjudicationActivity = driver.findElement(By.partialLinkText("Post-BI Adjudication"));
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + PostBIAdjudicationActivity.getLocation().y + ")");
				PostBIAdjudicationActivity.click();

				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Post BI Activity");
				Thread.sleep(2000);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Clicking on Post BI Activity");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}

			driver.findElement(By
					.xpath("//*[@id=\"activityPost-BI Adjudication\"]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[1]"))
					.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Open Post BI Task");
		} catch (Exception e) {

			e.printStackTrace();
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Opening Post BI Task");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
		//// parent.appendChild(test);
		System.out.println("End of Open Post Bi Method");
	}

	public void VerifyPostBIWithValidData() throws IOException, InterruptedException {
		try {

			//test = report.createTest("Verify Post BI with valid Data");
			System.out.println("Verify Post BI with valid Data");
			try {

				// -------Add valid date in RX Dispense date field

				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				Date date = new Date();
				String date1 = dateFormat.format(date);
				System.out.println(date1 + "  Today's Date");

				enterRXDispenseDate(date1);
				System.out.println("RXDispenseDate added");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Rx Dispensed Date - " + "<b>" + date1 + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Rx Dispensed Date");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ====== Select Primary Insurance
			try {
				selectInsurance(primaryInsurance, insuranceSearchElement, PIName);
				System.out.println("Selected primary insurance");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Selected Primary Insurance - " + "<b>" + PIName + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Selecting Primary Insurance");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}

			// Select on Yes radio button on primary
			try {
				clickOnRadioButton(PrimaryInsYesbtn);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Final Claim Adjudicated Successfully? - " + "<b>" + "Yes" + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Clicking on Final Claim Adjudicated Successfully? radio");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ===========Primary billed amount
			try {
				enterTextInTextBox(PrimaryAmount, PrimaryBilledAmount);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Primary Insurance Billed Amount - " + "<b>" + PrimaryBilledAmount + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Primary Insurance Billed Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ===========Primary Insurance Paid
			try {
				enterTextInTextBox(PrimaryInsPaid, PrimaryPaid);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Primary Insurance Paid Amount - " + "<b>" + PrimaryPaid + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Primary Insurance Billed Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// =======Select Secondary Insurance
			try {
				selectInsurance(SecondaryInsurance, SecondarySearch, SecInsName);
				System.out.println("Selected Secondary insurance");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Selected Secondary Insurance - " + "<b>" + SecInsName + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Selecting Secondary Insurance");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}

			// Select on Yes radio button on Secondary
			try {
				clickOnRadioButton(SecondaryInsYesbtn);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Final Claim Adjudicated Successfully? - " + "<b>" + "Yes" + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Clicking on Final Claim Adjudicated Successfully? radio button");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// Secondary Insurance Paid Amount
			try {
				enterTextInTextBox(SecondaryInsPaid, SecondarypaidAmount);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Secondary Insurance Paid Amount - " + "<b>" + SecondarypaidAmount + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Secondary Insurance Paid Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// Click on PAP section to locate element
			clickOnButton(PostBIClickPAP);

			// =======Select Copay Insurance
			try {
				Thread.sleep(2000);
				CopayInsurance.click();

				List<WebElement> CopayInsuranceValue = driver
						.findElements(By.id("select2-postBIActivityList0copayCard-results"));

				for (int i = 0; i < CopayInsuranceValue.size(); i++) {

					int x = CopayInsuranceValue.get(i).getLocation().getX();
					if (x != 0) {

						CopayInsuranceValue.get(i).click();
						break;

					}
				}
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Co-Pay Card");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Selecting Co-Pay Card");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ===========Click on Yes Radio==================
			try {
				clickOnRadioButton(CopayInsYesbtn);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Final Claim Adjudicated Successfully? - " + "<b>" + "Yes" + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured whileClicking on Final Claim Adjudicated Successfully? radio button");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ===========Copay Insurance Paid
			try {
				enterTextInTextBox(CopayInsPaid, CopayPaid);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Co-Pay Card Paid Amount - " + "<b>" + CopayPaid + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Co-Pay Card Paid Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// =======Select Foundation Insurance
			try {
				Thread.sleep(2000);
				FoundationInsurance.click();
				List<WebElement> FoundVal = driver
						.findElements(By.id("select2-postBIActivityList0foundationSupport-results"));

				for (int i = 0; i < FoundVal.size(); i++) {

					int x = FoundVal.get(i).getLocation().getX();
					if (x != 0) {

						FoundVal.get(i).click();
						break;
					}
				}
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Foundation Support ");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured whileSelecting Foundation Support");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ===========Click on Yes Radio==================
			try {
				clickOnRadioButton(FoundInsYesbtn);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Final Claim Adjudicated Successfully? - " + "<b>" + "Yes" + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Clicking on Final Claim Adjudicated Successfully? radio button");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}

			// ===========Foundation Insurance Paid
			try {
				enterTextInTextBox(FoundInsPaid, FoundationPaid);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Foundation Support Paid Amount - " + "<b>" + FoundationPaid + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Foundation Support Paid Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ============Patient Copay amount
			try {
				enterTextInTextBox(CopayAmount, PatientCopayAmount);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Patient Co-Pay Amount - " + "<b>" + PatientCopayAmount + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Patient Co-Pay Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// ============DrugAmount
			try {
				enterTextInTextBox(DrugAmount, DrugAcquisitionAmount);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Drug Acquisition Amount - " + "<b>" + DrugAcquisitionAmount + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering Drug Acquisition Amount");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			// Click on Complete button
			clickOnButton(Completebtn);

			// Click on Save button
			clickOnButton(Savebtn);
			Thread.sleep(1000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Post Bi Added Successfully");
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error Occured while Adding Post Bi");
		}
	}

	public void verifyPostBIwithoutData() throws InterruptedException, IOException {
		System.out.println("Verify PostBI without Data");

//		test = report.createTest("Verify Post BI without Data");
		// ============Click On Complete and Save button Button
		try {
			completePostBI();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Verified Post BI Without adding any data");
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					"Error occured while verifying Post BI without adding data");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	
			WebElement PostBIAdjudicationActivity = driver.findElement(By.partialLinkText("Post-BI Adjudication"));
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + PostBIAdjudicationActivity.getLocation().y + ")");
			PostBIAdjudicationActivity.click();

			// ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Post BI
			// Activity");
			Thread.sleep(2000);
		
		driver.findElement(
				By.xpath("//*[@id=\"activityPost-BI Adjudication\"]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[1]"))
				.click();
	}
}
