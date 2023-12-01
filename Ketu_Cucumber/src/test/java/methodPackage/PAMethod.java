package methodPackage;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.PAData;

public class PAMethod extends PAData {

	String PreBIPermision1 = DpModulePermission.getRow(15).getCell(1).getStringCellValue();

	String PATypeValue = DpFCM.getRow(42).getCell(1).getStringCellValue();
	String PAStatusValue = DpFCM.getRow(44).getCell(2).getStringCellValue();
	String PAReasonValue = DpFCM.getRow(44).getCell(3).getStringCellValue();
	String PAInitiatedBy = DpFCM.getRow(42).getCell(4).getStringCellValue();
	String PADateInitiatedValue = DpFCM.getRow(42).getCell(6).getStringCellValue();
	String PADateSubmittedValue = DpFCM.getRow(42).getCell(7).getStringCellValue();
	String PAExpectedResponseDateValue = DpFCM.getRow(42).getCell(8).getStringCellValue();
	String PADecisionDateValue = DpFCM.getRow(42).getCell(9).getStringCellValue();
	String PAExpirationDateValue = DpFCM.getRow(42).getCell(10).getStringCellValue();
	String PARefCaseNumberValue = DpFCM.getRow(42).getCell(11).getStringCellValue();

	public void verify_AddPAWithValidData() throws IOException, InterruptedException {

		parent = report.createTest("Prior Authorization");
		test = report.createTest("Verify Prior Authorization With Valid Data");
		try {
//			patientSearchMethod();
			patientCarePopUp();
			patientAlertPopUp();
//			caseManagementTabClick();
//			clickonCase();
			caseOpenSessionPopup();

		} catch (Exception error) {

			error.printStackTrace();
		}

		BIWorkflowClick();
		ClickPAActivity();
		System.out.println("PreBI Permission = " + PreBIPermision1);
		if (PreBIPermision1.equals("YES")) {

			AddPALink();
			selectPAType(PATypeValue);

			selectPAStatus(PAStatusValue);

			selectPAReason(PAReasonValue);

			selectPAInitiatedBy(PAInitiatedBy);
			try {
				SelectPrescrLinks();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Prescription");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Selecting Prescription");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				selectInsurance();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Insurance");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Selecting Insurance");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				enterPADateInitiated(PADateInitiatedValue);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Date Initiated - " + PADateInitiatedValue);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Entering Date Initiated");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				enterPADateSubmitted(PADateSubmittedValue);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Date Submitted - " + PADateSubmittedValue);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Entering Date Submitted");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				enterPAExpectedResponseDate(PAExpectedResponseDateValue);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered Expected Date - " + PAExpectedResponseDateValue);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Entering Expected Date");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				enterPAExpirationDate(PAExpirationDateValue);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered PA Expiration Date - " + PAExpirationDateValue);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering PA Expiration Date");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				enterPADecisionDate(PADecisionDateValue);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered PA Decision Date - " + PADecisionDateValue);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering PA Decision Date");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				enterPARefCaseNumber(PARefCaseNumberValue);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"Entered PA Case Reference Number - " + PARefCaseNumberValue);
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Entering PA Case Reference Number");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				PASaveBtn();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Save Button");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Clicking on Save Button");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			try {
				PACloseBtn();
				System.out.println("Prior Authorization Added Successfully");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						"<b>" + "Prior Authorization Added Successfully" + "</b>");
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						"Error occured while Adding Prior Authorization to the Case");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
		}
		// parent.appendChild(test);
		// report.endTest(parent);
	}

}