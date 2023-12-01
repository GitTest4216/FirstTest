package methodPackage;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.AddAppealData;

public class AddAppealMethods extends AddAppealData {

	String CaseManagementTabpermission = DpModulePermission.getRow(9).getCell(1).getStringCellValue();
	String CaseManagementPermission = DpCaseManagement_tab.getRow(2).getCell(3).getStringCellValue();
	String winHandleBefore = driver.getWindowHandle();

	public void CaseManagementTab_WithoutData() throws InterruptedException {
		
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
		
		//parent = report.createTest("Appeal");
		//("Verify Appeal With Valid Data");
		caseOpenSessionPopup();
		clickonBIworkflow();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "BI workflow Clicked");
		// err_msg();
		
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Clicking on BI workflow");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	}

	public void clickOnAppealActivity() throws InterruptedException, IOException {
		try {
		clickonAppealActivity();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Appeal Activity");
		// err_msg();
		
	} catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Clicking on Appeal Activity");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

	}

	public void clickOnAddAppealLink() throws InterruptedException, IOException {
	try {
		clickonAddAppealLink();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Add Appeal link");
		// err_msg();
		
	} catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Clicking on Add Appeal link");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

	}

	public void selectStatusValue() throws InterruptedException, IOException {
		try{
		String AppealStatusValue = DpFCM.getRow(31).getCell(1).getStringCellValue();
		selectStatus(AppealStatusValue);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Status - " + AppealStatusValue);
		// err_msg();
	} catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Status - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void selectReasonValue() throws InterruptedException, IOException {
		try {
		String AppealReasonValue = DpFCM.getRow(31).getCell(2).getStringCellValue();
		selectReason(AppealReasonValue);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Reason - " + AppealReasonValue);
		// err_msg();
		}
		catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Reason - ");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	}

	public void selectInitiatedByValue() throws InterruptedException, IOException {
	try {
		String AppealInitiatedByValue = DpFCM.getRow(31).getCell(3).getStringCellValue();
		selectInitiatedBy(AppealInitiatedByValue);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Initiated By - " +AppealInitiatedByValue);
		// err_msg();
		
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Initiated By - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
		
	}

	public void enterPANumberValue() throws InterruptedException, IOException {
		try{
		String PANumber = DpFCM.getRow(31).getCell(4).getStringCellValue();
		enterPAnumber(PANumber);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered PA Number Value - " +PANumber);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Entering PA Number Value - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
		
	}

	public void selectOnPrescrLinks() throws InterruptedException, IOException {
		try{
			SelectPrescrLinks();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Prescription");
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Prescription - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
		
	}

	public void selectInsuranceValue() throws InterruptedException, IOException {
		try{
		selectInsurance();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Insurance Value");
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Insurance Value - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
		
		
	}

	public void enterPADateOnInitiated() throws InterruptedException, IOException {
		try{
		String PADateInitiatedValue = DpFCM.getRow(42).getCell(6).getStringCellValue();
		Thread.sleep(1000);
		enterPADateInitiated(PADateInitiatedValue);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected PAInitiated Date - " +PADateInitiatedValue);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting PAInitiated Date - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
		
	}

	public void selectLevelOfAppealValue() throws InterruptedException, IOException {
	try {
		String LevelofAppeal = DpFCM.getRow(31).getCell(6).getStringCellValue();
		selectLevelOfAppeal(LevelofAppeal);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Level of Appeal - " +LevelofAppeal);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Level of Appeal - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void selectPAContestedReasonValue() throws InterruptedException, IOException {
		try {
		String PAContestedReasonValue = DpFCM.getRow(31).getCell(8).getStringCellValue();
		selectPAContestedReason(PAContestedReasonValue);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected PA Contested Reason Value - " +PAContestedReasonValue);
		// err_msg();
		
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting PA Contested Reason Value - ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void selectYesRadioValue() throws InterruptedException, IOException {
		try {
		selectYesRadio();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Yes Radio");
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Yes Radio ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void AppealDraftedByValue() throws InterruptedException, IOException {
		try {
		AppealDraftedBy();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Appeal Drafted By");
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Appeal Drafted By ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void enterAppealDateSubmittedValue() throws InterruptedException, IOException {
		try {
		String AppealDateSubmitted = DpFCM.getRow(31).getCell(10).getStringCellValue();
		enterAppealDateSubmitted(AppealDateSubmitted);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Appeal Submitted Date - " +AppealDateSubmitted);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Appeal Submitted Date ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void enterDecisionReceivedDateValue() throws InterruptedException, IOException {
		try {
		String DecisionReceivedDate = DpFCM.getRow(31).getCell(11).getStringCellValue();
		enterDecisionReceivedDate(DecisionReceivedDate);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Decision Received Date - " +DecisionReceivedDate);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Decision Received Date ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void enterApprovalDateValue() throws InterruptedException, IOException {
		try {
		String ApprovalDate = DpFCM.getRow(31).getCell(12).getStringCellValue();
		enterApprovalDate(ApprovalDate);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Approval Date - " +ApprovalDate);
		// err_msg();
		}
		catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Approval Date ");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	}

	public void enterExpirationDateValue() throws InterruptedException, IOException {
		try {
		String ExpirationDate = DpFCM.getRow(31).getCell(13).getStringCellValue();
		enterExpirationDate(ExpirationDate);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Expiration Date - " +ExpirationDate);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Selecting Expiration Date ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}	
	}

	public void enterAppealNumberValue() throws InterruptedException, IOException {
		try {
		String AppealNumber = DpFCM.getRow(31).getCell(14).getStringCellValue();
		enterAppealNumber(AppealNumber);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Appeal Number - " +AppealNumber);
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Entering Appeal Number ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void appealSavebtn() throws InterruptedException, IOException {
		try {
		appealSave();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Save button");
		// err_msg();
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Clicking on Save button ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	}

	public void appealClosebtn() throws InterruptedException, IOException {
		try {
		appealClose();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Close button");
		// err_msg();
		/*
		 * parent.appendChild(test); report.endTest(parent);
		 */
	}
	catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occured while Clicking on Close button ");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
		
	}

}
