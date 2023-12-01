package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class AddCaseData extends Base {

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-menu\"]/li[7]/a")
	protected WebElement CaseManagement_tabHTML;

	@FindBy(how = How.XPATH, using = "/html/body/section/section[2]/a")
	protected WebElement AddcaseHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"pharmacyStore\"]")
	protected WebElement PharmacystoreHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"therapeuticProgram\"]")
	protected WebElement TCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Rx Processing\"]")
	protected WebElement SelectService;

	@FindBy(how = How.XPATH, using = "//*[@id=\"selectCarePlan\"]")
	protected WebElement CarePlanHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"New Rx\"]")
	protected WebElement CaseTypeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected WebElement CreateCaseHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-relationship-container\"]")
	protected WebElement Relationshipvalue;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-consentToRole-container\"]")
	protected WebElement ProvideToUserRole;

	@FindBy(how = How.XPATH, using = "//*[@id=\"consentToDiv\"]/div/div/div/span/span[1]/span")
	protected WebElement ProvideToUserName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"consentMethodbtnMultiselectDropdown\"]")
	protected WebElement Method;

	@FindBy(how = How.XPATH, using = "//*[@id=\"addNewConsent\"]")
	protected WebElement Addlink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-consentForList0_consentFor-container\"]")
	protected WebElement ConsentType;

	@FindBy(how = How.XPATH, using = "//*[@id=\"consentForList0_consentForActivityList0\"]")
	protected String PAclick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected WebElement SaveAllConsent;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[2]")
	protected WebElement CancelCase;
	

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
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter patient's first name - " + PatientFirstName);
			
			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while entering Patient Name " + PatientFirstName);
			}
			try {
				
			
			PatientSearchLastnameHTML.click();
			PatientSearchLastnameHTML.clear();
			PatientSearchLastnameHTML.sendKeys(PatientLastName);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter patient's last name- " + PatientLastName);
			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while entering Patient last Name " + PatientLastName);
			}
			try {
				
			
			PatientSearchDOBHTML.click();
			PatientSearchDOBHTML.clear();
			PatientSearchDOBHTML.sendKeys(PatientDOB);
			
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter patient's Date of Birth - " + PatientDOB);;
			PatientSearchHTML.click();
			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while entering Patient Date of Birth  " + PatientDOB);
			}

			try {
				Thread.sleep(3000);
				WebElement firstpatientrecord = driver
						.findElement(By.xpath("//*[@id=\'listGridDiv\']/div[1]/table/tbody/tr[1]/td[2]/a"));
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + firstpatientrecord.getLocation().y + ")");
				Thread.sleep(2000);
				firstpatientrecord.click();
			} catch (Exception e) {
				System.out.println("Patient Not Found for Case Management");
			}
		}
	}

	public void caseManagementTabClick() {
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + CaseManagement_tabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CaseManagement_tabHTML.click();
	}

	public void addCaseClick() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AddcaseHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddcaseHTML.click();
		Thread.sleep(2000);
	}

	public void enterTcValue(String TcValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TCHTML.getLocation().y + ")");
		TCHTML.sendKeys(TcValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered Value in TC dropdown  " + TcValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while entering Value in TC dropdown  " + TcValue);
		}
	}

	public void selectTherapeuticProgram(String TherapeuticProgram) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TCHTML.getLocation().y + ")");
		Select Tcelement = new Select(TCHTML);
		//Tcelement.deselectAll();
		Thread.sleep(2000);
		Tcelement.selectByVisibleText(TherapeuticProgram);
		
//		if (TCHTML.isSelected())
//		{
//			System.out.println("Therapeutic Program Alerady Selected");
//		}
//		else
//		{
//		Select Tcelement = new Select(TCHTML);
//		Thread.sleep(2000);
//		Tcelement.selectByVisibleText(TherapeuticProgram);
//		}
		
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected Therapeutic Program - " + TherapeuticProgram);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while selecting Therapeutic Program - " + TherapeuticProgram);
		}
	}

	public void selectServiceValue() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectService.getLocation().y + ")");
			SelectService.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected Service");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error Occured while selecting Service");
		}
	}

	public void enterCarePlanValue(String CarePlanValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CarePlanHTML.getLocation().y + ")");
		CarePlanHTML.sendKeys(CarePlanValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered Value in CarePlan dropdown" + CarePlanValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while enetring Value in CarePlan dropdown" + CarePlanValue);
		}
	}

	public void selectCareplan(String CarePlan) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CarePlanHTML.getLocation().y + ")");
		Select CarePlnelement = new Select(CarePlanHTML);
		//CarePlnelement.deselectAll();
		Thread.sleep(2000);
		CarePlnelement.selectByVisibleText(CarePlan);
		
//		if (CarePlanHTML.isSelected())
//		{
//			System.out.println("Care plan Alerady Selected");
//		}
//		else
//		{
//		
//		Select CarePlnelement = new Select(CarePlanHTML);
//		//CarePlnelement.deselectAll();
//		Thread.sleep(2000);
//		CarePlnelement.selectByVisibleText(CarePlan);
//		}
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Select CarePlan" + CarePlan);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while Selecting CarePlan" + CarePlan);
		}
	}

	public void selectCaseType() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CaseTypeHTML.getLocation().y + ")");
		CaseTypeHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Select Case Type");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while Selecting Case Type");
		}
	}

	public void createCaseClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CreateCaseHTML.getLocation().y + ")");
		CreateCaseHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on Create Case Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while clicking on Create Case Button");
		}
	}
	
	public void selectPharmacyStore(String PharmacyStore) throws IOException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PharmacystoreHTML.getLocation().y + ")");

		Select PSelement = new Select(PharmacystoreHTML);

		PSelement.selectByVisibleText(PharmacyStore);

		 
		  
		//test.log(LogStatus.PASS, test.addScreenCapture(CaptureScreen(driver)));

		// test.log(LogStatus.PASS, "Select Pharmacy store");

		}

//	public void enterRelationshipValue(String relationshipValue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		Relationshipvalue.click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
//		WebElement relationShipSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		relationShipSearchElement.clear();
//		relationShipSearchElement.sendKeys(relationshipValue);
//		test.log(LogStatus.PASS, "Enter Value in Relationship dropdown" + " " + relationshipValue);
//		Thread.sleep(1000);
//	}
//
//	public void enterProvideToroleValue(String provideToroleValue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		ProvideToUserRole.click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
//		WebElement UserRoleSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		UserRoleSearchElement.clear();
//		UserRoleSearchElement.sendKeys(provideToroleValue);
//		test.log(LogStatus.PASS, "Enter Value in ProvideToUserRole dropdown" + " " + provideToroleValue);
//		Thread.sleep(1000);
//	}
//
//	public void enterProvideToUsernameValue(String provideTorUserNameValue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		ProvideToUserName.click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
//		WebElement UserNameSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		UserNameSearchElement.clear();
//		UserNameSearchElement.sendKeys(provideTorUserNameValue);
//		test.log(LogStatus.PASS, "Enter Value in ProvideToUserName dropdown" + " " + provideTorUserNameValue);
//		Thread.sleep(1000);
//	}
//
//	public void enterMethodValue(String methodValue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		Method.click();
//		wait.until(ExpectedConditions
//				.elementToBeClickable(By.xpath("//*[@id=\"consentMethodtooltipDiv\"]/ul/div[1]/div[1]/div/input")));
//		WebElement MethodSearchElement = driver
//				.findElement(By.xpath("//*[@id=\"consentMethodtooltipDiv\"]/ul/div[1]/div[1]/div/input"));
//		MethodSearchElement.clear();
//		MethodSearchElement.sendKeys(methodValue);
//		test.log(LogStatus.PASS, "Enter Value in Method dropdown" + " " + methodValue);
//		Thread.sleep(1000);
//	}
//
//	public void selectMethodValue(String methodvalue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Method.getLocation().y + ")");
//
//		Method.click();
//		Method.sendKeys(methodvalue);
//		Thread.sleep(4000);
//
//		WebElement Methodvalue = driver.findElement(By.xpath("//*[@id=\"consentMethodtooltipDiv\"]/ul/li[3]/label"));
//		Methodvalue.click();
//		test.log(LogStatus.PASS, "Select Method Value");
//
//		WebElement outsideclick = driver.findElement(By.xpath("//*[@id=\"consentForm\"]/section/div[1]"));
//		outsideclick.click();
//		Thread.sleep(3000);
//
//	}
//	
//	public void enterConsentTypeValue(String consentTypeValue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		ConsentType.click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
//		WebElement consentTypeElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		consentTypeElement.clear();
//		consentTypeElement.sendKeys(consentTypeValue);
//		test.log(LogStatus.PASS, "Enter Value in ConsentType dropdown" + " " + consentTypeValue);
//		Thread.sleep(3000);
//	}
//
//	public void selectConsentTypeValue(String consentTypeValue) throws InterruptedException {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ConsentType.getLocation().y + ")");
//
//		ConsentType.click();
//		Thread.sleep(4000);
//
//		WebElement ConsentTypePath = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		ConsentTypePath.sendKeys(consentTypeValue);
//
//		ConsentTypePath.sendKeys(Keys.ENTER);
//		test.log(LogStatus.PASS, "Select Consent Type Value");
//		Thread.sleep(3000);
//	}
//
//	public void addConsentTypeValue() throws InterruptedException {
//		WebElement PAclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList0\"]"));
//		PAclick.click();
//		Thread.sleep(3000);
//		
//		WebElement Appealclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList1\"]"));
//		Appealclick.click();
//		Thread.sleep(3000);
//		
//		WebElement Copayclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList2\"]"));
//		((JavascriptExecutor) driver)
//		.executeScript("window.scrollTo(0," + Copayclick.getLocation().y + ")");
//		Copayclick.click();
//		Thread.sleep(3000);
//		
//		WebElement MFRclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList3\"]"));
//		MFRclick.click();
//		Thread.sleep(3000);
//		
//		WebElement Foundationclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList4\"]"));
//		Foundationclick.click();
//		Thread.sleep(3000);
//	}
//
//	public void saveConsentClick() {
//		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CreateCaseHTML.getLocation().y + ")");
//		SaveAllConsent.click();
//		test.log(LogStatus.PASS, "Click on Save Consent Button");
//	}
//	
//	public void saveAll() throws InterruptedException
//	{
//		WebElement CallConducted = driver.findElement(By.id("tasktypeCheckBox9"));
//		((JavascriptExecutor) driver)
//				.executeScript("window.scrollTo(0," + CallConducted.getLocation().y + ")");
//		CallConducted.click();
//		Thread.sleep(3000);
//
//		WebElement SaveAll = driver.findElement(By.xpath("//*[@class='save-btn']/*[1]"));
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAll.getLocation().y + ")");
//		SaveAll.click();
//		test.log(LogStatus.PASS, "Patient Consent Added");
//	}
	
	public void windowHandle() throws InterruptedException{
		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);
			driver.manage().window().maximize();
		}
	}
	public void err_msg() throws IOException {
		String Error_msg = driver.findElement(By.xpath("/html/body/section/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
}
