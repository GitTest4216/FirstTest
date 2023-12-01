package methodPackage;

import java.io.IOException;

import dataPackage.ServicePreferencesData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ServicePrefMethods extends ServicePreferencesData {

	String ServicePreferencesTabpermission = DpModulePermission.getRow(7).getCell(1).getStringCellValue();
	String PatientFirstName = DpPatient.getRow(1).getCell(1).getStringCellValue();
	String PatientLastName = DpPatient.getRow(1).getCell(2).getStringCellValue();
	String PatientDOB = DpPatient.getRow(1).getCell(3).getStringCellValue();
	String TherapaticProgram = DpServicePreferences_tab.getRow(1).getCell(0).getStringCellValue();

	String Status1 = DpServicePreferences_tab.getRow(1).getCell(1).getStringCellValue();
	String Reason = DpServicePreferences_tab.getRow(1).getCell(2).getStringCellValue();
//	String PatientNewToPharmacy = DpServicePreferences_tab.getRow(1).getCell(3).getStringCellValue();
	String PatientNewToSpeciality = DpServicePreferences_tab.getRow(1).getCell(4).getStringCellValue();
//	String PatientNewToPharmacy = DpServicePreferences_tab.getRow(1).getCell(3).getStringCellValue();

	public void verify_ServicePreferenceTabIsDisplayed() throws IOException, InterruptedException {
//		parent = report.createTest("Service Preferences Tab");
//		test = report.createTest("Service Preferences Permission");
		String HomePagetitle = driver.getTitle();
		if (!HomePagetitle.equals("Login")) {
			new WebDriverWait(driver, 15);
			int ii = 0;
			while (ii < 1) {
				Thread.sleep(2000);
				if (notificationDialogCloseBtn.isDisplayed()) {
					notificationDialogCloseBtn.click();
				} else {
					ii = 1;
				}
			}
 
			if (ServicePreferencesTabpermission.equals("YES")) {
				try {

					if (ServicePreferencesTabHTML.isDisplayed()) {

						ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Service Preferences tab is visible");
					}

				}

				catch (Exception e) {

					patientSearchMethod();
					ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Service Preferences tab is Not visible");
				}

			}

		} else {
			System.out.println("Patient Permission is NO");
		}
		//parent.appendChild(test);
	}
	
	public void SaveTherapeuticProgramWithoutEnterData() throws InterruptedException, IOException {
		//test = report.createTest("Validate Save Therapeutic Program Without Enter Data ");
		ServicePreference();
		Thread.sleep(1000);
		EnrollTC();
		Thread.sleep(2000);
		SaveTherepy(TherapaticProgram);
        Thread.sleep(1000);
        ServicePreferenceErrMsg();
		}
	
	public void SaveOnlyEnterTherapeuticProgram() throws InterruptedException, IOException {
		//test = report.createTest("Validate Save TC Only Enter Therapeutic Program ");
		TherapeuticProgram(TherapaticProgram);
		Thread.sleep(1000);
		SaveTherepy(TherapaticProgram);
		Thread.sleep(1000);
		ServicePreferenceErrMsg();
	}
	
	public void SaveTCandStatus() throws InterruptedException, IOException {
		//test = report.createTest("Validate Save TC and Status ");
		TherapeuticProgram(TherapaticProgram);
		Thread.sleep(1000);
		TCStatus();
		Thread.sleep(1000);
		SaveTherepy(TherapaticProgram);
		Thread.sleep(1000);
		ServicePreferenceErrMsg();
	}
	
	public void SaveTCStatusReason() throws InterruptedException, IOException {
		TherapeuticProgram(TherapaticProgram);
		Thread.sleep(1000);
		TCStatus();
		Thread.sleep(1000);
		TCReason();
		Thread.sleep(1000);
		SaveTherepy(TherapaticProgram);	
		Thread.sleep(1000);
		ServicePreferenceErrMsg();
	}
	
	public void SaveTCStatusReasonandNewtoPharmacy() throws InterruptedException, IOException {
		//test = report.createTest("Validate Save TC and Status ");
		TherapeuticProgram(TherapaticProgram);
		Thread.sleep(1000);
		TCStatus();
		Thread.sleep(1000);
		TCReason();
		Thread.sleep(1000);
		CheckPatientNewToPharmacy();
		Thread.sleep(1000);
		SaveTherepy(TherapaticProgram);
		Thread.sleep(1000);
		ServicePreferenceErrMsg();
		Thread.sleep(1000);
		CloseTherapaticHTML.click();
	}
	
	public void verify_ServicePreference_With_Valid_Data() throws IOException, InterruptedException {
		//test = report.createTest("Service Preferences With Valid Data");
		ServicePreference();
		Thread.sleep(1000);
		EnrollTC();
		Thread.sleep(2000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		TherapeuticProgram(TherapaticProgram);
		Thread.sleep(1000);
		TCStatus();
		Thread.sleep(1000);
		TCReason();
		Thread.sleep(1000);		
		CheckPatientNewToPharmacy();
		Thread.sleep(1000);
		CheckNewToSpacialty();
		Thread.sleep(1000);
		SaveTherepy(TherapaticProgram);
		Thread.sleep(1000);
//		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
//				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		//parent.appendChild(test);
		//report.endTest(parent);
	}

}
