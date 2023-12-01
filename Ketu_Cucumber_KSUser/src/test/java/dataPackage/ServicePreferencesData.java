package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class ServicePreferencesData extends Base {

	protected WebDriverWait wait = new WebDriverWait(Base.driver, 15);
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

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-menu\"]/li[3]/a")
	protected WebElement ServicePreferencesTabHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"enrollPatient\"]/a[1]")
	protected WebElement EnrollHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-therapeuticProgram-container\"]")
	protected WebElement ClickTCdropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input")
	protected String TCSearchBar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"therapeuticProgram\"]")
	protected String TherapaticProgramHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"statusCode\"]")

	protected String StatusHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-statusCode-container\"]")
	protected WebElement StatusSearch;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"subStatusCode\"]")
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-subStatusCode-container\"]")

	protected WebElement ReasonHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input")
	protected WebElement ReasonSearch;
	@FindBy(how = How.XPATH, using = "//*[@id=\"isPatientNewToPharmacyYes\"]")
	protected WebElement PatientNewToPharmacyYesHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"isPatientNewToPharmacyNo\"]")
	protected WebElement PatientNewToPharmacyNoHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"isPatientNewToSpecialtyProgramYes\"]")
	protected WebElement PatientNewToSepcialityYesHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"isPatientNewToSpecialtyProgramNo\"]")
	protected WebElement PatientNewToSepcialityNoHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"saveBtn\"]/input")
	protected WebElement SaveBtnHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"therapeuticProgModal\"]/div/div/div[3]/button")
	protected WebElement CloseTherapaticHTML;

	protected String Status1 = DpServicePreferences_tab.getRow(1).getCell(1).getStringCellValue();
	protected String Reason = DpServicePreferences_tab.getRow(1).getCell(2).getStringCellValue();

	public void patientSearchMethod() throws InterruptedException {
		String PatientFirstName = DpPatient.getRow(1).getCell(1).getStringCellValue();
		String PatientLastName = DpPatient.getRow(1).getCell(2).getStringCellValue();
		String PatientDOB = DpPatient.getRow(1).getCell(3).getStringCellValue();

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (driver.getTitle().equalsIgnoreCase("KloudScript")) {
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
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + firstpatientrecord.getLocation().y + ")");
				Thread.sleep(2000);
				firstpatientrecord.click();
			} catch (Exception e) {
				System.out.println("Patient Not Found for Payor Tab");
			}
		}
	}

	public void ServicePreference() throws InterruptedException, IOException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ServicePreferencesTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Service Preferences tab");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Service Preferences tab.");
		}
	}

	public void EnrollTC() throws InterruptedException, IOException {
		try {
			
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + EnrollHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		EnrollHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Enroll Link");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Enroll Link.");
		}
	}

	public void TherapaticProgramHTML() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"therapeuticProgram\"]")));
	}

	public void SaveTherepy(String TherapaticProgram) throws InterruptedException, IOException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SaveBtnHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Patient Successfully Enrolled to - " + TherapaticProgram);
		Thread.sleep(1000);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error while enrolling Patient to -  " + TherapaticProgram);
		}
	}

	public void TherapeuticProgram(String TherapaticProgram) throws InterruptedException, IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickTCdropdown.click();
//		
//	}

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ClickTCdropdown")));
//	public void TherapeuticDropDownSelect(String TherapaticProgram) throws InterruptedException, IOException {
		try {
			
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input")));
		WebElement resTCSearchElement = driver
				.findElement(By.xpath("//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input"));

		resTCSearchElement.clear();
		resTCSearchElement.sendKeys(TherapaticProgram);
		Thread.sleep(1000);
		WebElement ele2 = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id=\"select2-therapeuticProgram-results\"]")), TherapaticProgram);
		ele2.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Therapeutic Program - " + TherapaticProgram);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Therapeutic Program - " + TherapaticProgram);
		}
	}

	public void CloseBtnClick(String TherapaticProgram) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CloseTherapaticHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Patient is already enrolled to Therapatic Program " + TherapaticProgram);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error : Patient is already enrolled to Therapatic Program " + TherapaticProgram);
		}
	}

	public void TCStatus() throws InterruptedException, IOException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		StatusSearch.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input")));
		WebElement resTCStatusElement = driver
				.findElement(By.xpath("//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input"));
		resTCStatusElement.clear();
		resTCStatusElement.sendKeys(Status1);
		Thread.sleep(2000);

		WebElement ele3 = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id=\"select2-statusCode-results\"]")), Status1);
		ele3.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Therapeutic Status - " + Status1);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Therapeutic Status - " + Status1);
		}
	}

	public void TCReason() throws InterruptedException, IOException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ReasonHTML.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input")));
		WebElement resTCReasonElement = driver
				.findElement(By.xpath("//*[@id=\"therapeuticProgModal\"]/span/span/span[1]/input"));
		resTCReasonElement.clear();
		resTCReasonElement.sendKeys(Reason);
		Thread.sleep(2000);
		WebElement ele4 = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id=\"select2-subStatusCode-results\"]")), Reason);
		ele4.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Therapeutic Reason - " + Reason);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Therapeutic Reason - " + Reason);
		}
	}

	public void CheckPatientNewToPharmacy() throws InterruptedException, IOException {
		try {
			
		if (PatientNewToPharmacyYesHTML.isSelected()) {

			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Patient New To Pharmacy Radio is already Selected");
			PatientNewToPharmacyNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Patient New To Pharmacy Radio button is already Selected ");

		}
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientNewToPharmacyYesHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Patient New To Pharmacy - " + "Yes");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Patient New To Pharmacy ");
		}

	}

	public void CheckNewToSpacialty() throws InterruptedException, IOException {
		try {
		
		if (PatientNewToSepcialityYesHTML.isSelected()) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PatientNewToSepcialityNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Patient New To Specialty Radio button is already Selected ");
		}

		else {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			PatientNewToSepcialityYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Patient New To Specialty - " + "Yes");
		}
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Patient New To Specialty");

		}

	}
	
	public void ServicePreferenceErrMsg() throws IOException, InterruptedException {
			String Error_msg = driver.findElement(By.xpath("//*[@id=\"therapeuticErrors\"]/ul")).getText();
			System.out.println();
			System.out.println("Add Service preferences with invalid data :-");
			System.out.println(Error_msg);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
}

