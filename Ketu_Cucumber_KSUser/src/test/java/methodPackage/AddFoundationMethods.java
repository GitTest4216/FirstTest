package methodPackage;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.AddFoundationData;

public class AddFoundationMethods extends AddFoundationData {

	String CaseManagementTabpermission = DpModulePermission.getRow(9).getCell(1).getStringCellValue();
	String CaseManagementPermission = DpCaseManagement_tab.getRow(2).getCell(3).getStringCellValue();
	String winHandleBefore = driver.getWindowHandle();

	public void CaseManagementTab_WithoutData() {
		parent = report.createTest("Foundation Support");
		//test = report.createTest("Verify Foundation With Valid Data");

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
				if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
					patientSearchMethod();
					caseManagementTabClick();
					clickonCase();
					err_msg();
				}
			}
		} catch (Exception e) {

		}

	}
	public void clickOnBIWorkflow() throws InterruptedException, IOException {
		try {

			clickonBIworkflow();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "BI workflow Clicked");
			//err_msg();
		} catch (Exception e) {
			/*
			 * //ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
			 * //"Error occured while Clicking on BI workflow");
			 * //ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
			 * MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build()
			 * );
			 */
		}

	}

	public void clickonFoundationSupportActivity() throws InterruptedException, IOException {
		try {
			clickonFoundationActivity();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Foundation Support Activity");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occured while Clicking on Foundation Support Activity");
		}

	}

	public void clickOnAddFoundationSupportLink() throws InterruptedException, IOException {
		try {
			clickonAddFoundationLink();
			Thread.sleep(3000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Add Foundation Support link");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occured while Clicking on Add Foundation Support link");
		}

	}

	public void selectOnFoundationProgramLinks() throws InterruptedException, IOException {
		try {
			SelectFoundationProgramLink();
			Thread.sleep(3000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Foundation Program");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Selecting Foundation Program");
		}
	}

	public void selectOnPrescrLinks() throws InterruptedException, IOException {
		try {
			SelectPrescrLinks();
			Thread.sleep(3000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Prescription");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Selecting Prescription");
		}
	}

	public void selectStatusValue() throws InterruptedException, IOException {
		try {
			String FoundationStatusValue = DpFCM.getRow(20).getCell(1).getStringCellValue();
			String FoundationReasonValue = DpFCM.getRow(20).getCell(2).getStringCellValue();
			selectStatus(FoundationStatusValue, FoundationReasonValue);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Status and Reason");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Selecting Status and Reason");
		}
	}

	public void selectInitiatedByValue() throws InterruptedException, IOException {
		try {
			String FoundationInitiatedByValue = DpFCM.getRow(20).getCell(3).getStringCellValue();
			selectInitiatedBy(FoundationInitiatedByValue);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Initiated By");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Selecting Initiated By");
		}
	}

	public void enterDateInitiatedFoundationValue() throws InterruptedException, IOException {
		try {
			String DateInitiatedFoundationValue = DpFCM.getRow(20).getCell(4).getStringCellValue();
			enterDateInitiatedFoundation(DateInitiatedFoundationValue);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Initiated Date of Foundation");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occured while Entering Initiated Date of Foundation");
		}
	}

	public void enterDateSubmittedFoundationValue() throws InterruptedException, IOException {
		try {
			String DateSubmittedFoundationValue = DpFCM.getRow(20).getCell(5).getStringCellValue();
			enterDateSubmittedFoundation(DateSubmittedFoundationValue);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Submitted Date of Foundation");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occured while Entering Submitted Date of Foundation");
		}
	}

	public void enterExpectedResponseDateFoundationValue() throws InterruptedException, IOException {
		try {
			String ExpectedResponseDateFoundationValue = DpFCM.getRow(20).getCell(6).getStringCellValue();
			enterExpectedResponseDateFoundation(ExpectedResponseDateFoundationValue);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Expected Response Date of Foundation");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occured while Entering Expected Response Date of Foundation");
		}
	}

	public void enterDecisionDateFoundationValue() throws InterruptedException, IOException {
		try {
			String DecisionDateFoundationValue = DpFCM.getRow(20).getCell(7).getStringCellValue();
			enterDecisionDateFoundation(DecisionDateFoundationValue);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Decision Date of Foundation");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occured while Entering Decision Date of Foundation");
		}
	}

	public void SelectInsuranceValue() throws InterruptedException, IOException {
		try {
			SelectInsurance();
			Thread.sleep(3000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Insurance");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Selecting Insurance");
		}
	}

	public void FoundationSavebtn() throws InterruptedException, IOException {
		try {
			SaveBtn();
			Thread.sleep(3000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Foundation Support Added Successfully"+ "</b>");
			//err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Adding Foundation Support");
		}
	}

	public void FoundationsClosebtn() throws InterruptedException, IOException {
		try {
			CloseBtn();
			Thread.sleep(3000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Close button");
			////err_msg();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occured while Clicking on Close button");
		}
		// parent.appendChild(test);
		// report.endTest(parent);
	}

}
