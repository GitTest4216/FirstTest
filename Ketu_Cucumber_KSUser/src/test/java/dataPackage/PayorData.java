package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class PayorData extends Base{
	
	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patientBlock']/div/div[2]/div/a[1]")
	protected static WebElement SearchPatientHomeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='searchFirstName']")
	protected static WebElement PatientSearchFirstnameHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='searchLastName']")
	protected static WebElement PatientSearchLastnameHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='searchDateOfBirth']")
	protected static WebElement PatientSearchDOBHTML;
	
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary search-btn selePatientSearch']")
	protected static WebElement PatientSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[2]/a")
	protected WebElement Payor_tabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='addInsurance']/a")
	protected WebElement AddInsuranceLinkHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='insEffectiveDate']")
	protected WebElement CashInsEffectiveDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='insuranceType']")
	protected WebElement InsurancetypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='BIN']")
	protected WebElement BINHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='PCN']")
	protected WebElement PCNHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='groupId']")
	protected WebElement GroupIDHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='planName']")
	protected WebElement PlanNameHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patientInsuranceID']")
	protected WebElement InsuranceIdHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='coverageType']")
	protected WebElement CoverageTypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
	protected WebElement PhoneNumberHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='insEndDate']")
	protected WebElement InsEndDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='payorPlan']")
	protected WebElement PayorPlanHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='selectedPyor0']")
	protected WebElement SelectRadioButtonHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='confirmModal']")
	protected WebElement ConfirmationOkButtonHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='searchMaster']")
	protected WebElement SavePayorHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='buttonGroup']/div/a")
	protected WebElement ResetPayorHTML;
	
	public void patientSearchMethod() throws InterruptedException {
		String PatientFirstName = DpPatient.getRow(1).getCell(1).getStringCellValue();
		String PatientLastName = DpPatient.getRow(1).getCell(2).getStringCellValue();
		String PatientDOB = DpPatient.getRow(1).getCell(3).getStringCellValue();
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		if(driver.getTitle().equalsIgnoreCase("KloudScript")) {
			try {
				
			
			Thread.sleep(2000);
			SearchPatientHomeHTML.click();
			PatientSearchFirstnameHTML.click();
			PatientSearchFirstnameHTML.clear();
			PatientSearchFirstnameHTML.sendKeys(PatientFirstName);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered First Name of Patient for search - " +PatientFirstName);
			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering First Name of Patient for search - " +PatientFirstName);
			}
			try {
				
			PatientSearchLastnameHTML.click();
			PatientSearchLastnameHTML.clear();
			PatientSearchLastnameHTML.sendKeys(PatientLastName);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Last Name of Patient for search - " +PatientLastName);
			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Last Name of Patient for search - " +PatientLastName);
			}
			try {
				
			
			PatientSearchDOBHTML.click();
			PatientSearchDOBHTML.clear();
			PatientSearchDOBHTML.sendKeys(PatientDOB);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Date Of Birth for search - " +PatientDOB);
			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Date Of Birth for search - " +PatientDOB);
			}
			PatientSearchHTML.click();
			
			try {
				Thread.sleep(3000);
				WebElement firstpatientrecord = driver
						.findElement(By.xpath("//*[@id=\'listGridDiv\']/div[1]/table/tbody/tr[1]/td[2]/a"));
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + firstpatientrecord.getLocation().y + ")");
				Thread.sleep(2000);
				firstpatientrecord.click();
			} catch (Exception e) {
				System.out.println("Patient Not Found for Payor Tab");
			}
		}	
	}
	
	public void payorTabClick() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Payor_tabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Payor_tabHTML.click();
	}
	
	public void addInsuranceLinkClick() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		AddInsuranceLinkHTML.click();
	}
	
	public void childOpen() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}
	}
	
	public void childClose(String winHandleBefore) throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().window(winHandleBefore);
		driver.close();
		Thread.sleep(2000);
	}
	
	public void insuranceTypeClick(String Insurancetype) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InsurancetypeHTML.getLocation().y + ")");
		Select instypeelement = new Select(InsurancetypeHTML);
		instypeelement.selectByVisibleText(Insurancetype);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected insurance type - " +Insurancetype);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting insurance type - " +Insurancetype);
		}
	}
	
	
	
	public void InsEffectiveDateClick(String CashInsEffectiveDate) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CashInsEffectiveDateHTML.getLocation().y + ")");
		CashInsEffectiveDateHTML.click();
		CashInsEffectiveDateHTML.clear();
		CashInsEffectiveDateHTML.sendKeys(CashInsEffectiveDate);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered insurance effective date - " +CashInsEffectiveDate);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering insurance effective date - " +CashInsEffectiveDate);
		}
	}
	
	public void InsEndDateClick(String InsEndDate) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InsEndDateHTML.getLocation().y + ")");
		InsEndDateHTML.click();
		InsEndDateHTML.clear();
		InsEndDateHTML.sendKeys(InsEndDate);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered insurance end date - " +InsEndDate);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering insurance end date - " +InsEndDate);
		}
	}
	
	public void insuranceBINClick(String BIN) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BINHTML.getLocation().y + ")");
		BINHTML.click();
		BINHTML.clear();
		BINHTML.sendKeys(BIN);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered BIN - " +BIN);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering BIN - " +BIN);
		}
	}
	
	public void insurancePCNClick(String PCN) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PCNHTML.getLocation().y + ")");
		PCNHTML.click();
		PCNHTML.clear();
		PCNHTML.sendKeys(PCN);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered PCN - " +PCN);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering PCN - " +PCN);
		}
	}
	
	public void insuranceGroupIdClick(String GroupID) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + GroupIDHTML.getLocation().y + ")");
		GroupIDHTML.click();
		GroupIDHTML.clear();
		GroupIDHTML.sendKeys(GroupID);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered GroupID - " +GroupID);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering GroupID - " +GroupID);
		}
	}
	
	public void insurancePlanNameClick(String PlanName) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PlanNameHTML.getLocation().y + ")");
		PlanNameHTML.click();
		PlanNameHTML.clear();
		PlanNameHTML.sendKeys(PlanName);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Plan name - " +PlanName);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Plan name - " +PlanName);
		}
	}
	
	public void insuranceInsuranceIdClick(String InsuranceID) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InsuranceIdHTML.getLocation().y + ")");
		InsuranceIdHTML.click();
		InsuranceIdHTML.clear();
		InsuranceIdHTML.sendKeys(InsuranceID);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Insurance id - " +InsuranceID);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Insurance id - " +InsuranceID);
		}
	}
	
	public void insurancePhoneNumberClick(String PhoneNumber) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PhoneNumberHTML.getLocation().y + ")");
		PhoneNumberHTML.click();
		PhoneNumberHTML.clear();
		PhoneNumberHTML.sendKeys(PhoneNumber);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Phone number - " +PhoneNumber);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Phone number - " +PhoneNumber);
		}
	}
	
	public void insuranceCoverageTypeClick(String Coveragetype) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CoverageTypeHTML.getLocation().y + ")");
		Select coverageTypeelement = new Select(CoverageTypeHTML);
		coverageTypeelement.selectByVisibleText(Coveragetype);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected coverage type - " +Coveragetype);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting coverage type - " +Coveragetype);
		}
	}
	
	public void insurancePayorPlanClick(String Payorplan) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PayorPlanHTML.getLocation().y + ")");
		Select Payortypeelement = new Select(PayorPlanHTML);
		Payortypeelement.selectByVisibleText(Payorplan);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Payor plan - " +Payorplan);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Payor plan - " +Payorplan);		
			}
	}
	
	public void savePayorBtnClick() {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SavePayorHTML.getLocation().y + ")");
		SavePayorHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on save button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on save button");
		}
	}
	
	public void selectRadioBtnClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectRadioButtonHTML.getLocation().y + ")");
		SelectRadioButtonHTML.click();
	}
	
	public void confirmationBtnClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ConfirmationOkButtonHTML.getLocation().y + ")");
		ConfirmationOkButtonHTML.click();
	}
	
	public void resetPayorBtnClick() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ResetPayorHTML.getLocation().y + ")");
		ResetPayorHTML.click();
	}
	
	public void err_msg() throws IOException {
		String status = driver.findElement(By.xpath("//*[@id='insuranceValidationDiv']")).getText();
		System.out.println();
		System.out.println("Add new payor without data or invalid data :-");
		System.out.println(status);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation Messages are:-" + "</b>" + status);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}		
}
