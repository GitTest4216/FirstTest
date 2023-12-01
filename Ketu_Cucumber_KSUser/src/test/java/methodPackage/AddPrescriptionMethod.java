package methodPackage;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.AddPrescriptionData;

public class AddPrescriptionMethod extends AddPrescriptionData {

	public void AddPrescriptionfromInatke() throws InterruptedException, IOException {
		//parent = report.createTest("Add Prescription");
		//test = report.createTest("Open Prescription Inatke Activity");
		PrescriptionInatke();
		Thread.sleep(2000);
		PrescriptionIntakeActivity();
		Thread.sleep(2000);
		AddNewPrescriptionLink();
		//parent.appendChild(test);
		//ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,CaptureScreen(driver));
		Thread.sleep(2000);
	}

	public void AddRx_WithValidData() throws InterruptedException, IOException {
		//test = report.createTest("Fill Prescription with positive data");
		try{
			String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}
		AddRxMethod();
		Thread.sleep(2000);
		AddReceiveDate();
		Thread.sleep(2000);
		RxNeedDate();
		Thread.sleep(2000);
		AddDrugType();
		Thread.sleep(2000);
		AddPrescriberdrug();
		Thread.sleep(2000);
		AddNDC();
		Thread.sleep(2000);
		AddDrugDetails();
		Thread.sleep(2000);
		AddPrescriber();
		Thread.sleep(2000);
		AddRxType();
		Thread.sleep(2000);
		SaveNewPrescription();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
		//parent.appendChild(test);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Prescription Added Successfully to the Case");
		captureScreenshot();
		//report.endTest(parent);
	} catch (Exception e) {
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Adding Prescription to the Case");
		ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

	}

}