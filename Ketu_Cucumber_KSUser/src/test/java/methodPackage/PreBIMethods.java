package methodPackage;
 
import java.io.IOException;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
 
import dataPackage.PAData;
//import dataPackage.PayorData;
import dataPackage.PreBIData;
 
public class PreBIMethods extends PreBIData {
 
	String PIName = DpPayor_tab.getRow(1).getCell(3).getStringCellValue();
//			DpPayor_tab.getRow(25).getCell(3).getStringCellValue();
	String SIName = DpPayor_tab.getRow(2).getCell(3).getStringCellValue();
//			DpPayor_tab.getRow(26).getCell(3).getStringCellValue();
	String PrimaryBilledAmount = DpPreBI_tab.getRow(1).getCell(3).getStringCellValue();
	String SecondaryBilledAmount = DpPreBI_tab.getRow(7).getCell(3).getStringCellValue();
	String PreBiPermision = DpModulePermission.getRow(15).getCell(1).getStringCellValue();
 
	PAData padata1 = PageFactory.initElements(driver, PAData.class);
 
	public void verify_Case_Management_tab() throws Exception {
 
		clickCaseManagement();
 
		handlingAlert();
 
	}
 
	public void verify_PreBI_With_Valid_Data() throws Exception {
//		parent = report.createTest("Pre-BI");
//		test = report.createTest("Verify PreBI With Valid Data");
 
		if (PreBiPermision.equalsIgnoreCase("YES")) {

			try {
//			padata1.patientSearchMethod();
//			patientCarePopUp();
//			patientAlertPopUp();
//			
//			padata1.caseManagementTabClick();
//			padata1.clickonCase();
//			
//			padata1.patientSearchMethod();
//			padata1.caseManagementTabClick();
//			padata1.clickonCase();
 
				caseOpenSessionPopup();
				Thread.sleep(2000);
				clickIntake();
				Thread.sleep(500);
				clickPreBiAdjudication();
 
				selectPrimaryInsurance(PIName);
				selectInitialclaimAdj1();
				selectPARequired();
				enterPrimaryBilled(PrimaryBilledAmount);
				clickOutSide();
 
				try {
 
					selectSecInsurance(SIName);
					selectSecInitialClaimAdj();
					enterSecondaryBilled(SecondaryBilledAmount);
				} catch (Exception er) {
 
					System.out.println(er.getMessage());
				}
				selectNAforCopayandFoundation();
				clickSaveButton();
				captureScreenshot();
 
			} catch (Exception e) {
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
				System.out.println("PreBI Permission is NO");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
			//parent.appendChild(test);
			//report.endTest(parent);
		}
	}
 
	public void verify_PreBi_With_Invalid_Data() throws Exception {
		//test = report.createTest("Verify_PreBi_With_Invalid_Data");
 
		clickOnCase();
//		handlingAlert();
		clickIntake();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		selectPrimaryInsurance(PIName);
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		selectInitialclaimAdj1();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		enterPrimaryBilled(PrimaryBilledAmount);
		clickOutSide();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		selectSecInsurance(SIName);
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		selectSecInitialClaimAdj();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		enterSecondaryBilled(SecondaryBilledAmount);
		clickOutSide();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		selectCopayCard();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		selectCopayInitialClaim();
		clickSaveButton();
		passFailStatus();
 
		clickPreBiAdjudication();
		enterCopayBilled();
		clickOutSide();
		clickSaveButton();
		passFailStatus();
 
		//parent.appendChild(test);
	}
 
}