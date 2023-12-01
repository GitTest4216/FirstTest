package methodPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import dataPackage.AddCaseData;
import testPackage.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class AddCaseMethods extends AddCaseData {

	String CaseManagementTabpermission = DpModulePermission.getRow(9).getCell(1).getStringCellValue();
	String CaseManagementPermission = DpCaseManagement_tab.getRow(2).getCell(3).getStringCellValue();
	String winHandleBefore = driver.getWindowHandle();

	public void addNewCase() throws IOException {
		
		//parent = report.createTest("Add Case");
		//System.out.println("Verfiy the click on Add Case button in Case management");

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
					addCaseClick();
					
				}
				
			}
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Successfully Clicked on Add Case button");
		}		
		catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occured while Clicking on Add Case button");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	
	}

	public void caseManagementTabOnlyPharmacyStoreSelected() throws InterruptedException, IOException {
		//System.out.println("Verify Add Case with only Pharmacy Store");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			try {

				String PharmacyStore = DpCaseManagement_tab.getRow(1).getCell(0).getStringCellValue();

				Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PharmacystoreHTML.getLocation().y + ")");

				Select PSelement = new Select(PharmacystoreHTML);

				System.out.println("stage1");
		if (PSelement.getFirstSelectedOption().getText().equalsIgnoreCase("Select"));

				{

				selectPharmacyStore(PharmacyStore);

				}
			createCaseClick();
			Thread.sleep(1000);
			err_msg();

		}
			
			catch(Exception e) {
			
		}
		}
	}

	public void therapeuticValue() throws InterruptedException, IOException {
		putDataInsideTCDropDown(DpCaseManagement_tab.getRow(11).getCell(1).getStringCellValue(),
				"Verify that Therapeutic Program should not accept numeric values");
		putDataInsideTCDropDown(DpCaseManagement_tab.getRow(12).getCell(1).getStringCellValue(),
				"Verify that Therapeutic Program should not accept Alphabets values");
		putDataInsideTCDropDown(DpCaseManagement_tab.getRow(13).getCell(1).getStringCellValue(),
				"Verify that Therapeutic Program should not accept Special Characters values");
	}

	private void putDataInsideTCDropDown(String therapeutic, String message) throws InterruptedException, IOException {
		//System.out.println(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterTcValue(therapeutic);
			System.out.println("Add value in Therapeutic Program: " + therapeutic);
			createCaseClick();
			Thread.sleep(1000);
			err_msg();

		}
	}

	public void caseManagementTabOnlyStoreandTCSelected() throws InterruptedException, IOException {
	//test = report.createTest("Verify click on create case button after select Pharmacy Store and Therapeutic Program ");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			String Therapeuticprogram = DpCaseManagement_tab.getRow(1).getCell(1).getStringCellValue();
			selectTherapeuticProgram(Therapeuticprogram);
			System.out.println("Therapeutic program is : " + Therapeuticprogram);
			Thread.sleep(2000);
			createCaseClick();
			Thread.sleep(1000);
			err_msg();
		}
	}

	public void caseManagementTabOnlyServicesSelected() throws InterruptedException, IOException {
		//System.out.println("Verify click on create case button after select Pharmacy Store,Therapeutic Program and Select Services ");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			selectServiceValue();
			createCaseClick();
			Thread.sleep(1000);
			err_msg();
			//parent.appendChild(test);
		}
	}

	public void careplanValue() throws InterruptedException, IOException {
		putDataInsideCarePlanDropDown(DpCaseManagement_tab.getRow(11).getCell(2).getStringCellValue(),
				"Verify that CarePlan should not accept numeric values");
		putDataInsideCarePlanDropDown(DpCaseManagement_tab.getRow(12).getCell(2).getStringCellValue(),
				"Verify that CarePlan should not accept Alphabets values");
		putDataInsideCarePlanDropDown(DpCaseManagement_tab.getRow(13).getCell(2).getStringCellValue(),
				"Verify that CarePlan should not accept Special Characters values");
	}

	private void putDataInsideCarePlanDropDown(String careplan, String message)
			throws InterruptedException, IOException {
		//System.out.println(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterCarePlanValue(careplan);
			System.out.println("Add value in CarePlan: " + careplan);
			createCaseClick();
			Thread.sleep(1000);
			err_msg();
			//parent.appendChild(test);

		}
	}

	public void caseManagementTabOnlyCarePlanSelected() throws InterruptedException, IOException {
	//	System.out.println(
		//		"Verify click on create case button after select Pharmacy Store,Therapeutic Program,Select Services and CarePlan ");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			String CarePlan = DpCaseManagement_tab.getRow(1).getCell(2).getStringCellValue();
			selectCareplan(CarePlan);
			System.out.println("CarePlan is : " + CarePlan);
			Thread.sleep(2000);
			createCaseClick();
			Thread.sleep(1000);
			err_msg();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			for (int i = 0; i <10; i++) {
				driver.navigate().back();
		        Thread.sleep(1000);
			}
			Thread.sleep(5000);
		}
		
			
	}

//	public void caseManagementTabOnlyCaseTypeSelected() throws InterruptedException, IOException {
//		System.out.println(
//				"Verify click on create case button after select Pharmacy Store,Therapeutic Program,Select Services,CarePlan and Case Type ");
//		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
//			CaseTypeHTML.click();
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			try {
//				driver.switchTo().alert().accept();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//			for (int i = 0; i <10; i++) {
//				driver.navigate().back();
//		        Thread.sleep(1000);
//			}
//			Thread.sleep(5000);
//			/*
//			 * parent.appendChild(test); report.endTest(parent);
//			 */
//		}
//	}
	
	public void caseManagementAllValiddata() throws InterruptedException, IOException {
		//System.out.println("Verify click on create case with All Valid Data");
		caseManagementTabClick();
		Thread.sleep(2000);
		addCaseClick();
		Thread.sleep(2000);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			try {

				String PharmacyStore = DpCaseManagement_tab.getRow(1).getCell(0).getStringCellValue();

				Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PharmacystoreHTML.getLocation().y + ")");

				Select PSelement = new Select(PharmacystoreHTML);

				System.out.println("stage1");
		if (PSelement.getFirstSelectedOption().getText().equalsIgnoreCase("Select"));

				{

				selectPharmacyStore(PharmacyStore);

				}
				Thread.sleep(1000);
				String Therapeuticprogram = DpCaseManagement_tab.getRow(1).getCell(1).getStringCellValue();
				selectTherapeuticProgram(Therapeuticprogram);
				Thread.sleep(1000);
				selectServiceValue();
				Thread.sleep(1000);
				String CarePlan = DpCaseManagement_tab.getRow(1).getCell(2).getStringCellValue();
				selectCareplan(CarePlan);
				Thread.sleep(1000);
				CaseTypeHTML.click();
				Thread.sleep(1000);
				createCaseClick();
				Thread.sleep(1000);
		
		}
			catch(Exception e) {
				
			}
	}

}

}
