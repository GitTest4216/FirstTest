package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import testPackage.Base;
import testPackage.LoginFunctionality;

public class PatientData extends Base {
 
	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='patientBlock']/div/div[2]/div/a[2]")
	protected WebElement AddPatientHomeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='firstName']")
	protected WebElement PatientfirstnameHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='lastName']")
	protected WebElement PatientLastnameHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='dateOfBirth']")
	protected WebElement PatientDOBHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='patientForm']/section/div/div[6]/div/div/span/span[1]/span/span[2]")
	protected WebElement PatientGenderHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-tenantId-container\"]")
	protected WebElement KSClient;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement ksClientSearchHTML;

	@FindBy(how = How.XPATH, using = "//button[@class='multi-select form-control   btu']")
	protected WebElement PatientStoreHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='addressTab']")
	protected WebElement PatientAddressTabHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='addressList0_address1']")
	protected WebElement PatientfirstAddress1HTML;

	@FindBy(how = How.XPATH, using = "//select[@id='addressList0_state']")
	static protected WebElement PatientfirstStateHTML;

	@FindBy(how = How.XPATH, using = "//select[@id='addressList0_city']")
	protected WebElement PatientfirstCityHTML;

	@FindBy(how = How.XPATH, using = "//select[@id='addressList0_zip']")
	protected WebElement PatientfirstZipHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='saveBtn']")
	protected WebElement PatientSaveHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='buttonGroup']/div/a[1]")
	protected WebElement PatientResetHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='buttonGroup']/div/a[2]")
	protected WebElement PatientCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='duplicatePatientWarningModal']/div/div/div[3]/button[1]")
	protected WebElement PatientDuplicationPopupsaveHTML;

//	@FindBy(how = How.XPATH, using = "//*[@id='add-patient-multiselecttooltipDiv']/ul/div[1]/div[1]/div/input")
//	protected WebElement StoreSearchHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"AddtooltipDiv\"]/ul/div[1]/div[1]/div/input")
	protected WebElement StoreSearchHTML;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='contactTab']/a")
	protected WebElement PatientContactTabHTML;

	@FindBy(how = How.XPATH, using = "//a[@id='addPhone']")
	protected WebElement PatientPhnAddLinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='contactList0_contactUse']")
	protected WebElement PatientPhnDropHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='contactList0_contactValue']")
	protected WebElement PatientPhnNumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='addFax']")
	protected WebElement PatientFaxAddLinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='contactList1_contactUse']")
	protected WebElement PatientFaxDropHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='contactList1_contactValue']")
	protected WebElement PatientFaxNumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='addEmail']")
	protected WebElement PatientEmailAddLinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='contactList2_contactUse']")
	protected WebElement PatientEmailDropHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='contactList2_contactValue']")
	protected WebElement PatientEmailNumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='accordion']/div[3]/div[1]/h4/a")
	protected WebElement PatientCaregiverTabHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"addCaregiver\"]")
	protected WebElement AddCaregiverHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"caregiverList0_firstName\"]")

	protected WebElement PatientCaregiverFnameHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"caregiverList0_lastName\"]")
	protected WebElement PatientCaregiverLnameHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-caregiverList0_relationship-container\"]")
	protected WebElement PatientCaregiverRelationHTML;
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement CaregiverSearchBarHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='accordion']/div[4]/div[1]/h4/a")
	protected WebElement PatientIncomeTabHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='select2-legalResidency-container']")
	protected WebElement PatientResidencyStatusHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='householdSize']")
	protected WebElement PatientFamilyMemHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='annGrossIncome']")
	protected WebElement PatientAnnualIncomeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='accordion']/div[5]/div[1]/h4/a")
	protected WebElement PatientCrossReferenceTabHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='addCrossRef']")
	protected WebElement PatientCrossReferenceLinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='patientCrossReferenceList0_crossReference']")
	protected WebElement PatientCrossRefHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='patientCrossReferenceList0_crossReferencePatient']")
	protected WebElement PatientIdHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='docTab']/a")
	protected WebElement DocumentTabHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='addDocument']")
	protected WebElement DocumentLinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='uploadDocument']")
	protected WebElement DocumentChooseFileHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='description']")
	protected WebElement DocumentTypeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='documentDescriptionId']")
	protected WebElement DescriptionHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='uploadDocumentModal']/div/div/div[3]/a")
	protected WebElement UploadHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='closeButtonUploadDoc']")
	protected WebElement CloseDocHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='otherDescription']")
	protected WebElement OtherDescriptionHTML;

	@FindBy(how = How.XPATH, using = "/html/body/section/div[1]")
	protected WebElement success_msg;

	@FindBy(how = How.XPATH, using = "//*[@id='loginPageLogoCommonFluidHeader1']")
	protected WebElement HomeHtml;

	public void addPatientHome() {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddPatientHomeHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "User click on add patient tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on add patient tab.");
		}
	}

	public void patientFirstName(String PatientFirstName) throws InterruptedException {
		try {
		
	
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientfirstnameHTML.click();
		PatientfirstnameHTML.clear();
		PatientfirstnameHTML.sendKeys(PatientFirstName);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Added Patient's First Name - " + PatientFirstName);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Adding Patient's First Name - " + PatientFirstName);		
			}
	}

	public void patientLastName(String PatientLastName) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientLastnameHTML.click();
		PatientLastnameHTML.clear();
		PatientLastnameHTML.sendKeys(PatientLastName);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Added Patient's Last Name - " + PatientLastName);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Adding Patient's Last Name - " + PatientLastName);
		}
	}

	public void dateOfBirth(String PatientDOB) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientDOBHTML.click();
		Thread.sleep(1000);
		PatientDOBHTML.sendKeys(PatientDOB);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Date Of Birth - " + PatientDOB);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Date Of Birth - " + PatientDOB);
		}
	}

	public void gender(String PatientGender) throws InterruptedException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		PatientGenderHTML.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement genderSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		genderSearchElement.clear();
		genderSearchElement.sendKeys(PatientGender);
		

		Thread.sleep(1000);
		WebElement ele = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id='select2-genderType-results']")), PatientGender);

		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected gender - " + PatientGender);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting gender - " + PatientGender);
		}
	}
	
	public void ksClient(String ksClient) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		KSClient.click();
		ksClientSearchHTML.clear();
		ksClientSearchHTML.sendKeys(ksClient);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter store id in dropdown - " + ksClient );

		WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id=\"select2-tenantId-results\"]")),ksClient);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected pharmacy store." + ksClient);
		driver.findElement(By.xpath("//*[@id='patientForm']/section/div")).click();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering pharmacy store." + PatientStoreID);
		}
	}

	public void pharmacyStore(String PatientStoreID) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientStoreHTML.click();
		StoreSearchHTML.clear();
		StoreSearchHTML.sendKeys(PatientStoreID);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter store id in dropdown - " + PatientStoreID );

		WebElement ele = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id=\"AddtooltipDiv\"]/ul")),
				PatientStoreID);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected pharmacy store." + PatientStoreID);
		driver.findElement(By.xpath("//*[@id='patientForm']/section/div")).click();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering pharmacy store." + PatientStoreID);
		}
	}

	public void pharmacyStoreInvalid(String PatientStoreID) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientStoreHTML.click();
		StoreSearchHTML.clear();
		StoreSearchHTML.sendKeys(PatientStoreID);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected store - " + PatientStoreID);

		try {
			WebElement ele = Base.getExactListOfElements(driver,
					driver.findElement(By.xpath("//ul[@class='dropdown-menu noclose add-patient-multiselect ']")),
					PatientStoreID);
			ele.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select pharmacy store.");

		} catch (Exception e) {

		}
		PatientStoreHTML.click();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting pharmacy store.");

		}
	}

	public void addressTabClickBtn() throws InterruptedException {
		try {
			
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientAddressTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PatientAddressTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on address tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on address tab.");
		}
	}

	public void firstAddress1(String PatientAddress1) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientfirstAddress1HTML.click();
		PatientfirstAddress1HTML.clear();
		PatientfirstAddress1HTML.sendKeys(PatientAddress1);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Address1 - " + PatientAddress1);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Adding Address1 - " + PatientAddress1);
		}
	}

	public void patientState(String PatientState) throws InterruptedException {
		try {
			
		
		Select state = new Select(PatientfirstStateHTML);
		state.selectByValue(PatientState);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected state - " +PatientState);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting state - " +PatientState);
		}
	}

	public void patientCity(String PatientCity) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select city = new Select(PatientfirstCityHTML);
		city.selectByVisibleText(PatientCity);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected city - " +PatientCity);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting city - " +PatientCity);
		}
	}

	public void patientZip(String PatientZip) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select zip = new Select(PatientfirstZipHTML);
		zip.selectByVisibleText(PatientZip);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Zip code - " +PatientZip);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Zip code - " +PatientZip);
		}
	}

	public void contactTab() throws InterruptedException {
		try {
			
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientContactTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientContactTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Contact tab");
		
		Thread.sleep(2000);
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Error occurred while Clicking on Contact tab");
		}
	}

	public void patientPhnLink() throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PatientPhnAddLinkHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on add new phone number link");
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Error occurred while Clicking on add new phone number link");
		}
	}

	public void patientPhnContactDropdown(String PatientConDrop) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select phnConDropTxt = new Select(PatientPhnDropHTML);
		phnConDropTxt.selectByVisibleText(PatientConDrop);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected phone value from dropdown + " +PatientConDrop);
		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Error occurred while Selecting phone value from dropdown + " +PatientConDrop);
		}
	}

	public void patientPhnContactValue(String PatientConValue) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		PatientPhnNumHTML.click();
//		PatientPhnNumHTML.clear();
		Thread.sleep(2000);
		PatientPhnNumHTML.sendKeys(PatientConValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered phone number - " +PatientConValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering phone number - " +PatientConValue);
		}
	}

	public void patientFaxLink() {
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientFaxAddLinkHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientFaxAddLinkHTML.click();
	}

	public void patientFaxDropdown(String PatientFaxDrop) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select phnFaxDropTxt = new Select(PatientFaxDropHTML);
		phnFaxDropTxt.selectByVisibleText(PatientFaxDrop);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected fax value from dropdown - " +PatientFaxDrop);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting fax value from dropdown - " +PatientFaxDrop);
		}
	}

	public void patientFaxValue(String PatientFaxValue) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientFaxNumHTML.click();
//		PatientFaxNumHTML.clear();
		PatientFaxNumHTML.sendKeys(PatientFaxValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered fax number - " +PatientFaxValue);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering fax number - " +PatientFaxValue);
		}
	}

	public void patientEmailLink() {
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + PatientEmailAddLinkHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientEmailAddLinkHTML.click();
	}

	public void patientEmailDropdown(String PatientEmailDrop) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select phnEmailDropTxt = new Select(PatientEmailDropHTML);
		phnEmailDropTxt.selectByVisibleText(PatientEmailDrop);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected email value from dropdown - " +PatientEmailDrop);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting email value from dropdown - " +PatientEmailDrop);

		}
	}

	public void patientEmailValue(String PatientEmailValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientEmailNumHTML.click();
		PatientEmailNumHTML.clear();
		PatientEmailNumHTML.sendKeys(PatientEmailValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered email address - " +PatientEmailValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering email address - " +PatientEmailValue);
		}
	}

	public void patientCaregiverTabLink() throws InterruptedException {
		try {

		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + PatientCaregiverTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientCaregiverTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Caregiver information tab");
		Thread.sleep(2000);
		
	} catch (Exception e) {
		//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Caregiver information tab.");
	}
	}

	public void addCaregiverLink() throws InterruptedException {
		try {
			
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AddCaregiverHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		AddCaregiverHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Caregiver Link");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Caregiver Link.");
		}
	}

	public void patientCaregiverFname(String PatientFirstName) throws InterruptedException {
		try {
	
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientCaregiverFnameHTML.click();
		PatientCaregiverFnameHTML.clear();
		PatientCaregiverFnameHTML.sendKeys(PatientFirstName);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered caregiver first name - " +PatientFirstName);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering caregiver first name - " +PatientFirstName);
		}

	}

	public void patientCaregiverLname(String PatientLastName) throws InterruptedException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientCaregiverLnameHTML.click();
		PatientCaregiverLnameHTML.clear();
		PatientCaregiverLnameHTML.sendKeys(PatientLastName);
//		PatientCaregiverLnameHTML.sendKeys(Keys.TAB,Keys.TAB);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered caregiver last name - " +PatientLastName);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering caregiver last name - " +PatientLastName);
		}

	}

	public void patientRelation(String PatientRelationValue) throws InterruptedException {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		PatientCaregiverRelationHTML.click();
		wait.until(ExpectedConditions.elementToBeClickable(CaregiverSearchBarHTML));
		CaregiverSearchBarHTML.clear();
		CaregiverSearchBarHTML.sendKeys(PatientRelationValue);

		Thread.sleep(1000);
		WebElement ele = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id=\"select2-caregiverList0_relationship-results\"]")),
				PatientRelationValue);

		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered caregiver relation with patient - " +PatientRelationValue);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering caregiver relation with patient - " +PatientRelationValue);
		}
//		CaregiverSearchBarHTML.clear();
//		CaregiverSearchBarHTML.sendKeys(PatientRelationValue);
////		Select RelationTxt = new Select(PatientCaregiverRelationHTML);
//		RelationTxt.selectByVisibleText(PatientRelationValue);

	}

	public void patientIncomeLink() throws InterruptedException {
		try {
			
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientIncomeTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientIncomeTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Income tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Income tab");

		}
	}

	public void residencyStatus(String PatientResidencyStatus) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientResidencyStatusHTML.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement resStatusSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));

		resStatusSearchElement.click();
		resStatusSearchElement.sendKeys(PatientResidencyStatus);
		Thread.sleep(2000);
		WebElement ele2 = Base.getExactListOfElements(driver,
				driver.findElement(By.xpath("//*[@id='select2-legalResidency-results']")), PatientResidencyStatus);
		ele2.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected residency status - " +PatientResidencyStatus);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting residency status - " +PatientResidencyStatus);
		}
	}

	public void patientFamilyMember(String PatientFamilyMember) {
		
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientFamilyMemHTML.click();
		PatientFamilyMemHTML.clear();
		PatientFamilyMemHTML.sendKeys(PatientFamilyMember);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered family member (in number) - " +PatientFamilyMember);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering family member (in number) - " +PatientFamilyMember);
		}
	}

	public void annualIncome(String PatientAnnualIncome) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientAnnualIncomeHTML.click();
		PatientAnnualIncomeHTML.clear();
		PatientAnnualIncomeHTML.sendKeys(PatientAnnualIncome);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Annual Income - " +PatientAnnualIncome);
		
	} catch (Exception e) {
		//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Annual Income - " +PatientAnnualIncome);
	}
	}

	public void patientCrossReferenceTab() {
		try {
		
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + PatientCrossReferenceTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientCrossReferenceTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on cross reference tab");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on cross reference tab");
		}
	}

	public void patientCrossReferenceLink() throws InterruptedException {
		try {
		
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + PatientCrossReferenceLinkHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PatientCrossReferenceLinkHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on patient cross reference link");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on patient cross reference link");
		}
	}

	public void patientcrossRefTxt(String PatientCrossReference) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select CrossRefTxt = new Select(PatientCrossRefHTML);
		CrossRefTxt.selectByVisibleText(PatientCrossReference);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected cross reference from dropdown - " +PatientCrossReference);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting cross reference from dropdown - " +PatientCrossReference);
		}
	}

	public void patientIdText(String PatientId) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientIdHTML.click();
		PatientIdHTML.clear();
		PatientIdHTML.sendKeys(PatientId);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered patient Id - " +PatientId);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering patient Id - " +PatientId);
		}
	}

	public void patientuploadDocTab() {
		try {
			
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DocumentTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DocumentTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on document tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on document tab");
		}
	}

	public void patientUploadDocLink() throws InterruptedException {
		try {
			
		
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DocumentTabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DocumentLinkHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on upload document link");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on upload document link");
		}
	}

	public void patientDocChooseFile(String ChooseFileDetail) throws InterruptedException {
		try {
			
		Thread.sleep(2000);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + DocumentChooseFileHTML.getLocation().y + ")");
		Actions act = new Actions(driver);
		act.moveToElement(DocumentChooseFileHTML).perform();
		DocumentChooseFileHTML.sendKeys(ChooseFileDetail);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Choose a document for upload");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Choosing a document for upload");
		}
	}

	public void patientdocType(String DocType, String OtherDescriptionDetail) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select DocTypeTxt = new Select(DocumentTypeHTML);
		DocTypeTxt.selectByVisibleText(DocType);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select Document Type from dropdown");

		if (DocType.equalsIgnoreCase("Other")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			OtherDescriptionHTML.click();
			OtherDescriptionHTML.clear();
			OtherDescriptionHTML.sendKeys(OtherDescriptionDetail);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter Other Description");
		}
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Enter Other Description");
		}
	}

	public void patientDocDescription(String DescriptionDetail) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DescriptionHTML.click();
		DescriptionHTML.clear();
		DescriptionHTML.sendKeys(DescriptionDetail);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter description");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Enter description");
		}
	}

	public void patientClickOnUploadAdd() {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UploadHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on upload button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on upload button");
		}
	}

	public void patientClickOnUploadCancel() {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CloseDocHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on close button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on close button");
		}
	}

	public void patientSaveBtn() {
		try {
			
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientSaveHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientSaveHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on save button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on save button");

		}
	}

	public void patientResetBtn() {
		try {
			
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientResetHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientResetHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on reset button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on reset button");
		}
	}

	public void patientCancelBtn() {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PatientCancelHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on cancel button");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on cancel button");
		}
	}

	public void patientDuplicatePopupBtn() throws InterruptedException {
		try {
			
		Thread.sleep(1000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + PatientDuplicationPopupsaveHTML.getLocation().y + ")");
		PatientDuplicationPopupsaveHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on patient's duplicate record button.");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on patient's duplicate record button.");
		}
	}
	public void patientSuccessMsg() throws IOException {
		 
		String actualTitle = "Patient";
		if ((driver.getTitle().equalsIgnoreCase(actualTitle))) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + success_msg.getLocation().y + ")");
			System.out.println();
			System.out.println("Add new patient with valid data :-");
			System.out.println(success_msg.getText());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, success_msg.getText());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	}

	public void homePageRedirection() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		HomeHtml.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "User redirect to home page");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "User redirect to home page");
		}
	}

	public void patientErrMsg() throws IOException, InterruptedException {
		String actualTitle = "Patient";
		if (!(driver.getTitle().equalsIgnoreCase(actualTitle))) {
			String Error_msg = driver.findElement(By.xpath("/html/body/section/ul")).getText();
			System.out.println();
			System.out.println("Add new patient without data or invalid data :-");
			System.out.println(Error_msg);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation Messages are:-" + "</b>" + Error_msg);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
}
}