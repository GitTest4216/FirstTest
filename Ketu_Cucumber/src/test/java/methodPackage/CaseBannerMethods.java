package methodPackage;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.CaseBannerData;
import dataPackage.PayorData;

public class CaseBannerMethods extends CaseBannerData {

	private String CaseBannerPermission = DpModulePermission.getRow(20).getCell(1).getStringCellValue();
//	private String CaseBannerFieldLevelPermission = DpModulePermission.getRow(19).getCell(1).getStringCellValue();
//	private String PhRxIdDropdown = DpModulePermission.getRow(19).getCell(1).getStringCellValue();
	private String FirstFollowupDate = DpCaseBanner.getRow(1).getCell(6).getStringCellValue();
	private String PastFirstFollowupDate = DpCaseBanner.getRow(10).getCell(6).getStringCellValue();

	private String workflow0value = DpCaseBanner.getRow(1).getCell(0).getStringCellValue();
	private String followupstatus0value = DpCaseBanner.getRow(1).getCell(1).getStringCellValue();
	private String followupreason0value = DpCaseBanner.getRow(1).getCell(2).getStringCellValue();
	private String followupnote0value = DpCaseBanner.getRow(1).getCell(3).getStringCellValue();
	private String SecondFollowupDate = DpCaseBanner.getRow(1).getCell(6).getStringCellValue();

	private String workflow1value = DpCaseBanner.getRow(2).getCell(0).getStringCellValue();
	private String followupstatus1value = DpCaseBanner.getRow(2).getCell(1).getStringCellValue();
	private String followupreason1value = DpCaseBanner.getRow(2).getCell(2).getStringCellValue();
	private String note1value = DpCaseBanner.getRow(2).getCell(3).getStringCellValue();
	private String ThirdFolloupDate = DpCaseBanner.getRow(1).getCell(6).getStringCellValue();
	private String workflow2value = DpCaseBanner.getRow(3).getCell(0).getStringCellValue();
	private String followupstatus2value = DpCaseBanner.getRow(3).getCell(1).getStringCellValue();
	private String followupreason2value = DpCaseBanner.getRow(3).getCell(2).getStringCellValue();
	private String note2value = DpCaseBanner.getRow(3).getCell(3).getStringCellValue();
	private String assignedrolevalue = DpCaseBanner.getRow(1).getCell(4).getStringCellValue();
	private String assigneduservalue = DpCaseBanner.getRow(1).getCell(5).getStringCellValue();
//	PayorData p1 = PageFactory.initElements(driver, PayorData.class);

	public void verify_casebanner() throws IOException, InterruptedException {
//		p1.patientSearchMethod();
		parent = report.createTest("Case Banner");
		test = report.createTest("Case Banner Permission");
		Thread.sleep(2000);
		caseOpenSessionPopup();
		patientCarePopUp();
		patientAlertPopUp();
		Thread.sleep(1000);
		try {
			
		
		if (CaseBannerPermission.equalsIgnoreCase("YES")) {

			System.out.println("Case Banner Verification Permission is YES");
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Case Banner Verification Permission is YES");
			Thread.sleep(3000);
			openCaseBanner();
		}
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occure due to Case Banner Permission");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
		
		//parent.appendChild(test);
	}

	public void verify_casebaneer_withoutdata() throws IOException, InterruptedException {

		try {
			test = report.createTest("Save Case Banner without Enter Any Data");
//		openCaseBanner();
			Thread.sleep(2000);
			saveButtonClick();
			Thread.sleep(2000);
			err_msg();
			Thread.sleep(1000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Screenshot of Save Case Banner without entering mandatory fields");
			Thread.sleep(1000);
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Taking the Screenshot of Save Case Banner without entering mandatory fields");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
		System.out.println("End of Verify Case Banner without data");
		//parent.appendChild(test);
	}

	public void verify_casebaneer_InvalideData() throws IOException, InterruptedException {

		try {
			test = report.createTest("Save Case Banner with Invalid Data");
			Thread.sleep(1000);
			FirstFollowupDateTime(PastFirstFollowupDate);
			Thread.sleep(1000);
			RemoveFirstWorkFlow();
			Thread.sleep(1000);
			saveButtonClick();
			Thread.sleep(1000);
			err_msg();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Screenshot of Save Case Banner with Past Date, Without Followup Workflow and Reason , Without Assigned Role and User");
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					"Error occured while Taking the Screenshot of Save Case Banner with Past Date, Without Followup Workflow and Reason , Without Assigned Role and User");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
		System.out.println("End of Verify Case Banner - Invalid data");
		//parent.appendChild(test);
	}

	public void verify_casebaneer_correct_data() throws IOException, InterruptedException {
//		
		try {
			test = report.createTest("Save Case Banner with Valid Data");
             try {openCaseBanner();}
            catch (Exception e) {};
            Thread.sleep(2000);
			FirstFollowupDateTime(FirstFollowupDate);
			Thread.sleep(2000);
			FirstWorkFlow(workflow0value);
			Thread.sleep(2000);
			FirstFollowupStatus(followupstatus0value);
			Thread.sleep(2000);
			FirstFollowupReason(followupreason0value);
			Thread.sleep(2000);
			FirstFollowupNote(followupnote0value);
			Thread.sleep(2000);
			SecondFollowupDateTime(SecondFollowupDate);
			Thread.sleep(2000);
			SecondWorkFlow(workflow1value);
			Thread.sleep(2000);
			SecondFollowupStatus(followupstatus1value);
			Thread.sleep(2000);
			SecondFollowupReason(followupreason1value);
			Thread.sleep(2000);
			System.out.println(note1value);
			SecondFollowupNote(note1value);
			Thread.sleep(2000);
			ThirdFollowupDateTime(ThirdFolloupDate);
			Thread.sleep(2000);
			ThirdWorkFlow(workflow2value);
			Thread.sleep(2000);
			ThirdFollowupStatus(followupstatus2value);
			Thread.sleep(2000);
			ThirdFollowupReason(followupreason2value);
			Thread.sleep(2000);
			ThirdFollowupNote(note2value);
			Thread.sleep(2000);

//			AssignUser(assignedrolevalue, assigneduservalue);Thread.sleep(1000);
			saveButtonClick();
			Thread.sleep(2000);
			capture_Screenshot();
		} catch (Exception e) {

		}
		System.out.println("End of Verify Case Banner - valid data");
		//parent.appendChild(test);
		//report.endTest(parent);
	}

}
