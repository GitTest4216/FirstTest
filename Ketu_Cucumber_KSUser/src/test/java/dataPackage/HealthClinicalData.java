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

public class HealthClinicalData extends Base{

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[4]/div/ul/li[4]/a")
	protected WebElement ClinicalProfileHealthHistorytabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='health-history']/ul/li[1]/a")
	protected WebElement ClinicalProfileFamilytabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='relationShipId']")
	protected WebElement RelationshipHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='icdMasterCode']")
	protected WebElement ICD10CodeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='statusForFamily']")
	protected WebElement StatusHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='dateDiagnosedForFamily']")
	protected WebElement familyDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='familyHistoryNote']")
	protected WebElement TreatmentNoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='familyHistorySave']")
	protected WebElement FamilyAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='familyHistoryCancel']")
	protected WebElement FamilyCancelHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='health-history']/ul/li[2]/a")
	protected WebElement ClinicalProfileMedicaltabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='icdCode']")
	protected WebElement MedicalICD10CodeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='status']")
	protected WebElement MedicalStatusHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='dateDiagnosed']")
	protected WebElement MedicalDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicalHistoryNote']")
	protected WebElement MedicalTreatmentNoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicalHistorySave']")
	protected WebElement MedicalAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicalHistoryCancel']")
	protected WebElement MedicalCancelHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='health-history']/ul/li[3]/a")
	protected WebElement ClinicalProfileReviewOfSystemstabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='rosDate']")
	protected WebElement ROSDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mainOrganbtnMultiselectDropdown']")
	protected WebElement organsHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mainOrgantooltipDiv']/ul/div[1]/div[1]/div/input")
	protected WebElement organsSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='subOrganbtnMultiselectDropdown']")
	protected WebElement clinicalObservationsHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='subOrgantooltipDiv']/ul/div[1]/div[1]/div/input")
	protected WebElement clinicalObservationsSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='comments']")
	protected WebElement NoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reviewofSystemSave']")
	protected WebElement ROSAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicalHistoryCancel']")
	protected WebElement ROSCancelHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='health-history']/ul/li[4]/a")
	protected WebElement ClinicalProfileSurgicaltabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='surgeryId']")
	protected WebElement SurgeryHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='surgeryDate']")
	protected WebElement SurgicalDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='surgeryNotes']")
	protected WebElement SurgicalNoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='surgicalHistorySave']")
	protected WebElement SurgicalAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='surgicalHistoryCancel']")
	protected WebElement SurgicalCancelHTML;
	
	public void clinicalHealthHistoryTabClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileHealthHistorytabHTML.getLocation().y + ")");
		ClinicalProfileHealthHistorytabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on clinical profile health history tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on clinical profile health history tab");
		}
	}
	
	public void healthHistoryFamilyTabClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileFamilytabHTML.getLocation().y + ")");
		ClinicalProfileFamilytabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on family history tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on family history tab");
		}
	}
	
	public void familyRelationShipClick(String Relationship) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RelationshipHTML.getLocation().y + ")");
		Select relationShipelement = new Select(RelationshipHTML);
		relationShipelement.selectByVisibleText(Relationship);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select relationship");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting relationship");
		}
	}
	
	public void familyICD10CodeClick(String ICD10CodeValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ICD10CodeHTML.getLocation().y + ")");
		ICD10CodeHTML.click();
		//ICD10CodeHTML.clear();
		ICD10CodeHTML.sendKeys(ICD10CodeValue);
		Thread.sleep(2000);
		ICD10CodeHTML.sendKeys(Keys.ENTER);
      ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter ICD-10 Code");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ICD-10 Code");
		}
	}
	
	public void familyStatusClick(String Status1) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + StatusHTML.getLocation().y + ")");
		Select Statuselement = new Select(StatusHTML);
		Statuselement.selectByVisibleText(Status1);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select status");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting status");
		}
	}
	
	public void familyDateClick(String DateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + familyDateHTML.getLocation().y + ")");
		familyDateHTML.click();
		//familyDateHTML.clear();
		familyDateHTML.sendKeys(DateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter family history date");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering family history date");
		}
	}
	
	public void familyNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TreatmentNoteHTML.getLocation().y + ")");
		TreatmentNoteHTML.click();
	    TreatmentNoteHTML.clear();
		TreatmentNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter treatment note");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering treatment note");
		}
	}
	
	public void familyAddClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + FamilyAddHTML.getLocation().y + ")");
		FamilyAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}
	
	public void familyCancelClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + FamilyCancelHTML.getLocation().y + ")");
		FamilyCancelHTML.click();
	}
	
	static public void successMsg() throws IOException, InterruptedException {
		String success = "Record Saved Successfully";
		Thread.sleep(2000);
		System.out.println(success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		//test.log(LogStatus.PASS, success);
	}
	
	public void familyErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='familySystemError']/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Family History Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void healthHistoryMedicalTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileMedicaltabHTML.getLocation().y + ")");
		ClinicalProfileMedicaltabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on medical history tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on medical history tab");
		}
	}
	
	public void medicalICD10CodeClick(String ICD10CodeValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedicalICD10CodeHTML.getLocation().y + ")");
		MedicalICD10CodeHTML.click();
		//MedicalICD10CodeHTML.clear();
		MedicalICD10CodeHTML.sendKeys(ICD10CodeValue);
		Thread.sleep(2000);
		MedicalICD10CodeHTML.sendKeys(Keys.DOWN);
		MedicalICD10CodeHTML.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\'ui-id-5\']")));
//		WebElement ele = driver.findElement(By.xpath("//*[@id=\'ui-id-5\']"));
//		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter ICD-10 Code");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ICD-10 Code");
		}
	}
	
	public void medicalStatusClick(String Status1) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedicalStatusHTML.getLocation().y + ")");
		Select Statuselement = new Select(MedicalStatusHTML);
		Statuselement.selectByVisibleText(Status1);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected status");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting status");
		}
	}
	
	public void medicalDateClick(String DateValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedicalDateHTML.getLocation().y + ")");
		MedicalDateHTML.click();
		MedicalDateHTML.clear();
		MedicalDateHTML.sendKeys(DateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter medical history date");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering medical history date");
		}
	}
	
	public void medicalNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedicalTreatmentNoteHTML.getLocation().y + ")");
		MedicalTreatmentNoteHTML.click();
		MedicalTreatmentNoteHTML.clear();
		MedicalTreatmentNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter treatment note");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering treatment note");
		}
	}
	
	public void medicalAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedicalAddHTML.getLocation().y + ")");
		MedicalAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}
	
	public void medicalCancelClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedicalCancelHTML.getLocation().y + ")");
		MedicalCancelHTML.click();
	}
	
	public void medicalErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='medicalSystemError']/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Medical History Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void healthHistoryROSTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileReviewOfSystemstabHTML.getLocation().y + ")");
		ClinicalProfileReviewOfSystemstabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Review Of Systems tab");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Review Of Systems tab");
		}
	}
	
	public void rosDateClick(String DateValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ROSDateHTML.getLocation().y + ")");
		ROSDateHTML.click();
	    ROSDateHTML.clear();
		ROSDateHTML.sendKeys(DateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter ROS date");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ROS date");
		}
	}
	
	public void rosOrgansClick(String organsValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + organsHTML.getLocation().y + ")");
		organsHTML.click();
		organsSearchHTML.click();
		organsSearchHTML.clear();
		organsSearchHTML.sendKeys(organsValue);
		WebElement ele = Base.getExactListOfElements(driver, driver.findElement(By.xpath("//*[@id=\'mainOrgantooltipDiv\']/ul")),organsValue);
		ele.click();
		organsHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select organs/systems");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting organs/systems");
		}
	}
	
	public void rosclinicalObservationsClick(String clinicalObservationsValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + clinicalObservationsHTML.getLocation().y + ")");
		clinicalObservationsHTML.click();
		clinicalObservationsSearchHTML.click();
		clinicalObservationsSearchHTML.clear();
		clinicalObservationsSearchHTML.sendKeys(clinicalObservationsValue);
		WebElement ele = Base.getExactListOfElements(driver, driver.findElement(By.xpath("//*[@id='subOrgantooltipDiv']/ul")),clinicalObservationsValue);
		ele.click();
		clinicalObservationsHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select clinical observations");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting clinical observations");
		}
	}
	
	public void rosNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + NoteHTML.getLocation().y + ")");
		NoteHTML.click();
		NoteHTML.clear();
		NoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter note");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note");
		}
	}
	
	public void rosAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ROSAddHTML.getLocation().y + ")");
		ROSAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}
	
	public void rosCancelClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ROSCancelHTML.getLocation().y + ")");
		ROSCancelHTML.click();
	}
	
	public void rosErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='rosSystemError']/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Review Of Systems Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void healthHistorySurgicalTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileSurgicaltabHTML.getLocation().y + ")");
		ClinicalProfileSurgicaltabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Surgical History tab");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Surgical History tab");
		}
	}
	
	public void surgicalSurgeryClick(String Surgery) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SurgeryHTML.getLocation().y + ")");
		Select SurgeryElement = new Select(SurgeryHTML);
		SurgeryElement.selectByVisibleText(Surgery);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select surgery");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting surgery");
		}
	}
	
	public void surgicalDateClick(String DateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SurgicalDateHTML.getLocation().y + ")");
		SurgicalDateHTML.clear();
		SurgicalDateHTML.click();
		SurgicalDateHTML.sendKeys(DateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter Surgery date");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Surgery date");
		}
	}
	
	public void surgicalNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SurgicalNoteHTML.getLocation().y + ")");
		SurgicalNoteHTML.clear();
		SurgicalNoteHTML.click();
		SurgicalNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter note");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note");
		}
	}
	
	public void surgicalAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SurgicalAddHTML.getLocation().y + ")");
		SurgicalAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			// TODO: handle exception
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}
	
	public void surgicalCancelClick() {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SurgicalCancelHTML.getLocation().y + ")");
		SurgicalCancelHTML.click();
	}
	
	public void surgicalErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='surgicalSystemError']/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Surgical history Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
}