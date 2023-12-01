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

import dataPackage.PayorData;

public class PayorInsuranceMethods extends PayorData {

	String PayorTabpermission = DpModulePermission.getRow(6).getCell(1).getStringCellValue();
	String PayorInsuranceTypePermission = DpPayor_tab.getRow(1).getCell(1).getStringCellValue();
	String winHandleBefore = driver.getWindowHandle();

	public void PayorTab_WithoutData() {
//		parent = report.createTest("PayorTab / Insurance");
//		test = report.createTest("Add Payor / Add Insurance without fill data");

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
				
				if (PayorTabpermission.equalsIgnoreCase("YES")) {
					patientSearchMethod();
					payorTabClick();
					if (PayorInsuranceTypePermission.equals("ADD")) {
						addInsuranceLinkClick();
						for (String winHandle : driver.getWindowHandles()) {
							driver.switchTo().window(winHandle);
							driver.manage().window().maximize();
						}
						savePayorBtnClick();
						err_msg();
						Thread.sleep(1000);
						driver.close();
						driver.switchTo().window(winHandleBefore);
					}
				}
			}
		} catch (Exception e) {

		}
		//parent.appendChild(test);
	}

	public void payorTabOnlyInsuranceTypeSelected() throws InterruptedException, IOException {
		//test = report.createTest("Verify click on save button after select only insurance type");
		try {
			
		
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				for (int i = 1; i <= 4; i++) {
					addInsuranceLinkClick();
					String Insurancetype = DpPayor_tab.getRow(i).getCell(0).getStringCellValue();
					for (String winHandle : driver.getWindowHandles()) {
						driver.switchTo().window(winHandle);
						driver.manage().window().maximize();
					}
					insuranceTypeClick(Insurancetype);
					Thread.sleep(2000);
					savePayorBtnClick();
					System.out.println("Insurance Type is : " + Insurancetype);
					ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Insurance type is : " + Insurancetype);
					err_msg();
					Thread.sleep(1000);
					driver.close();
					driver.switchTo().window(winHandleBefore);
				}
			}
		}
		
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Insurance type is : ");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
		//parent.appendChild(test);
	}

	public void PayorTabNotAcceptAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("Payor Tab some fields should not accept alphabets");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}

				String Insurancetype = DpPayor_tab.getRow(16).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(16).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(16).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(16).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(16).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(16).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(16).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(16).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(16).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(16).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(16).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				try {
					insuranceTypeClick(Insurancetype);
				} catch (Exception e) {
				}
				try {
					insuranceBINClick(BIN);
				} catch (Exception e) {
				}
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				try {
					insuranceCoverageTypeClick(Coveragetype);
				} catch (Exception e) {
				}
				try {
					InsEffectiveDateClick(CashInsEffectiveDate);
				} catch (Exception e) {
				}
				try {
					InsEndDateClick(InsEndDate);
				} catch (Exception e) {
				}
				try {
					insurancePhoneNumberClick(PhoneNumber);
				} catch (Exception e) {
				}
				try {
					insurancePayorPlanClick(Payorplan);
				} catch (Exception e) {
				}
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
	}

	public void PayorTabNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		//test = report.createTest("Payor Tab some fields should not accept special characters");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				String Insurancetype = DpPayor_tab.getRow(17).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(17).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(17).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(17).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(17).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(17).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(17).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(17).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(17).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(17).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(17).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				try {
					insuranceTypeClick(Insurancetype);
				} catch (Exception e) {
				}
				try {
					insuranceBINClick(BIN);
				} catch (Exception e) {
				}
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				try {
					insuranceCoverageTypeClick(Coveragetype);
				} catch (Exception e) {
				}
				try {
					InsEffectiveDateClick(CashInsEffectiveDate);
				} catch (Exception e) {
				}
				try {
					InsEndDateClick(InsEndDate);
				} catch (Exception e) {
				}
				try {
					insurancePhoneNumberClick(PhoneNumber);
				} catch (Exception e) {
				}
				try {
					insurancePayorPlanClick(Payorplan);
				} catch (Exception e) {
				}
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
	}

	public void PayorTabNotAcceptSpace() throws IOException, InterruptedException {
		//test = report.createTest("Payor Tab some fields should not accept space");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				String Insurancetype = DpPayor_tab.getRow(18).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(18).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(18).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(18).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(18).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(18).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(18).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(18).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(18).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(18).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(18).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				try {
					insuranceTypeClick(Insurancetype);
				} catch (Exception e) {
				}
				try {
					insuranceBINClick(BIN);
				} catch (Exception e) {
				}
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				try {
					insuranceCoverageTypeClick(Coveragetype);
				} catch (Exception e) {
				}
				try {
					InsEffectiveDateClick(CashInsEffectiveDate);
				} catch (Exception e) {
				}
				try {
					InsEndDateClick(InsEndDate);
				} catch (Exception e) {
				}
				try {
					insurancePhoneNumberClick(PhoneNumber);
				} catch (Exception e) {
				}
				try {
					insurancePayorPlanClick(Payorplan);
				} catch (Exception e) {
				}
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
	}

	public void PayorTabNotAcceptNumericValue() throws IOException, InterruptedException {
		//test = report.createTest("Payor Tab some fields should not accept numeric values");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				String Insurancetype = DpPayor_tab.getRow(21).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(21).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(21).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(21).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(21).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(21).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(21).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(21).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(21).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(21).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(21).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				try {
					insuranceTypeClick(Insurancetype);
				} catch (Exception e) {
				}
				insuranceBINClick(BIN);
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				try {
					insuranceCoverageTypeClick(Coveragetype);
				} catch (Exception e) {
				}
				InsEffectiveDateClick(CashInsEffectiveDate);
				InsEndDateClick(InsEndDate);
				insurancePhoneNumberClick(PhoneNumber);
				try {
					insurancePayorPlanClick(Payorplan);
				} catch (Exception e) {
				}
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
	}

	public void PayorTabBINSize() throws IOException, InterruptedException {
		//test = report.createTest("Payor Tab BIN value should not accept less than 6 digit");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				String Insurancetype = DpPayor_tab.getRow(19).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(19).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(19).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(19).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(19).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(19).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(19).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(19).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(19).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(19).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(19).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				insuranceTypeClick(Insurancetype);
				insuranceBINClick(BIN);
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				insuranceCoverageTypeClick(Coveragetype);
				InsEffectiveDateClick(CashInsEffectiveDate);
				InsEndDateClick(InsEndDate);
				insurancePhoneNumberClick(PhoneNumber);
				insurancePayorPlanClick(Payorplan);
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
	}

	public void PayorTabPhoneSize() throws IOException, InterruptedException {
	//	test = report.createTest("Payor Tab phone number should not accept less than 10 digit");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				String Insurancetype = DpPayor_tab.getRow(20).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(20).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(20).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(20).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(20).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(20).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(20).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(20).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(20).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(20).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(20).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				insuranceTypeClick(Insurancetype);
				insuranceBINClick(BIN);
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				insuranceCoverageTypeClick(Coveragetype);
				InsEffectiveDateClick(CashInsEffectiveDate);
				InsEndDateClick(InsEndDate);
				insurancePhoneNumberClick(PhoneNumber);
				insurancePayorPlanClick(Payorplan);
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
	}

	public void PayorTabDateNotAcceptInvalidData() throws IOException, InterruptedException {
		//test = report.createTest("Payor Tab insurance effective date and end date should not accept invalid data");
		if (PayorTabpermission.equalsIgnoreCase("YES")) {
			if (PayorInsuranceTypePermission.equals("ADD")) {
				addInsuranceLinkClick();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				String Insurancetype = DpPayor_tab.getRow(22).getCell(0).getStringCellValue();
				String CashInsEffectiveDate = DpPayor_tab.getRow(22).getCell(11).getStringCellValue();
				String InsEndDate = DpPayor_tab.getRow(22).getCell(12).getStringCellValue();
				String BIN = DpPayor_tab.getRow(22).getCell(7).getStringCellValue();
				String PCN = DpPayor_tab.getRow(22).getCell(9).getStringCellValue();
				String GroupID = DpPayor_tab.getRow(22).getCell(10).getStringCellValue();
				String PlanName = DpPayor_tab.getRow(22).getCell(3).getStringCellValue();
				String InsuranceID = DpPayor_tab.getRow(22).getCell(8).getStringCellValue();
				String Coveragetype = DpPayor_tab.getRow(22).getCell(5).getStringCellValue();
				String PhoneNumber = DpPayor_tab.getRow(22).getCell(4).getStringCellValue();
				String Payorplan = DpPayor_tab.getRow(22).getCell(6).getStringCellValue();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
				insuranceTypeClick(Insurancetype);
				insuranceBINClick(BIN);
				insurancePCNClick(PCN);
				insuranceGroupIdClick(GroupID);
				insurancePlanNameClick(PlanName);
				insuranceInsuranceIdClick(InsuranceID);
				insuranceCoverageTypeClick(Coveragetype);
				InsEffectiveDateClick(CashInsEffectiveDate);
				InsEndDateClick(InsEndDate);
				insurancePhoneNumberClick(PhoneNumber);
				insurancePayorPlanClick(Payorplan);
				savePayorBtnClick();
				err_msg();
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}

	public void PayorTabWithValidData() throws IOException, InterruptedException {
//		parent = report.createTest("PayorTab / Insurance");
		//test = report.createTest("Payor Tab insurance add Valid data");
		System.out.println("Valid data method :- ");
	Thread.sleep(2000);
	try {
		patientSearchMethod();
		Thread.sleep(2000);
		payorTabClick();
	}
	catch (Exception e)
	{
		System.out.println("Payor Tab already Open");
	}

	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Payor_tabHTML.getLocation().y + ")");
	Payor_tabHTML.click();
	int row = 7 ;
	
   
		if (PayorInsuranceTypePermission.equals("ADD")) {	
			
			for (int i = 1; i <= 5; i++) {
				
				// String PayorInsuranceTypePermission1 = DpPayor_tab.getRow(i).getCell(1).getStringCellValue();
				
		AddInsuranceLinkHTML.click();
			// Get Parent window handle
			String winHandleBefore = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				// Switch to child window
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
			try {
				Thread.sleep(2000);
			String Insurancetype = DpPayor_tab.getRow(i).getCell(0).getStringCellValue();
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InsurancetypeHTML.getLocation().y + ")");
				Select instypeelement = new Select(InsurancetypeHTML);
				Thread.sleep(1000);
				instypeelement.selectByVisibleText(Insurancetype);
				if (Insurancetype.equals("Cash"))
				{
					Thread.sleep(2000);
					String CashInsEffectiveDate = DpPayor_tab.getRow(i).getCell(11).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CashInsEffectiveDateHTML.getLocation().y + ")");
					CashInsEffectiveDateHTML.sendKeys(CashInsEffectiveDate);
					Thread.sleep(1000);
					((JavascriptExecutor) driver).executeScript(
							"window.scrollTo(0," + SavePayorHTML.getLocation().y + ")");
					SavePayorHTML.click();

				}
				else {
					Thread.sleep(1000);
					String BIN = DpPayor_tab.getRow(i).getCell(7).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BINHTML.getLocation().y + ")");
					BINHTML.click();
					BINHTML.sendKeys(BIN);

					try {
						Thread.sleep(1000);
						String PCN = DpPayor_tab.getRow(i).getCell(9).getStringCellValue();
						((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PCNHTML.getLocation().y + ")");
						PCNHTML.click();
						PCNHTML.sendKeys(PCN);

						Thread.sleep(1000);
						String GroupID = DpPayor_tab.getRow(i).getCell(10).getStringCellValue();
						((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + GroupIDHTML.getLocation().y + ")");
						GroupIDHTML.click();
						GroupIDHTML.sendKeys(GroupID);
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Insurance is added");
					}

					Thread.sleep(1000);
					String Planname = DpPayor_tab.getRow(i).getCell(3).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PlanNameHTML.getLocation().y + ")");
					PlanNameHTML.click();
					PlanNameHTML.sendKeys(Planname);

					Thread.sleep(1000);
					String InsuranceID = DpPayor_tab.getRow(i).getCell(8).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InsuranceIdHTML.getLocation().y + ")");
					PlanNameHTML.click();
					InsuranceIdHTML.clear();
					InsuranceIdHTML.sendKeys(InsuranceID);

					Thread.sleep(1000);
					//String CoveragetypeHTML = OrPayor_tab.getRow(6).getCell(3).getStringCellValue();
					String Coveragetype = DpPayor_tab.getRow(i).getCell(5).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CoverageTypeHTML.getLocation().y + ")");
					Select coverageTypeelement = new Select(CoverageTypeHTML);
					coverageTypeelement.selectByVisibleText(Coveragetype);

					Thread.sleep(1000);
					String Phonenumber = DpPayor_tab.getRow(i).getCell(4).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PhoneNumberHTML.getLocation().y + ")");
					PhoneNumberHTML.click();
					PhoneNumberHTML.sendKeys(Phonenumber);

					Thread.sleep(1000);
					String Payorplan = DpPayor_tab.getRow(i).getCell(6).getStringCellValue();
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PayorPlanHTML.getLocation().y + ")");
					Select Payortypeelement = new Select(PayorPlanHTML);
					Payortypeelement.selectByVisibleText(Payorplan);

					Thread.sleep(1000);
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SavePayorHTML.getLocation().y + ")");
					SavePayorHTML.click();

					Thread.sleep(2000);
					try {
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectRadioButtonHTML.getLocation().y + ")");
					SelectRadioButtonHTML.click();

					Thread.sleep(2000);
					((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ConfirmationOkButtonHTML.getLocation().y + ")");
					ConfirmationOkButtonHTML.click();
					}
					catch (Exception e) {
						System.out.println("No Poppup");
					}	
				}	
//		
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						DpPayor_tab.getRow(i).getCell(0).getStringCellValue() + " Insurance is added");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, DpPayor_tab.getRow(i).getCell(0).getStringCellValue() + " FAIL to add Insurance");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			driver.switchTo().window(winHandleBefore);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
			
			
		}else if (PayorInsuranceTypePermission.equals("NOTHING")) {

			System.out.println("Permission is NOTHING for Insurance");
		} else {
			System.out.println("Payor tab permission is wrong");
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}

}
