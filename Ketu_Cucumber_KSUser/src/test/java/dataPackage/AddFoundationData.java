package dataPackage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
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

public class AddFoundationData extends Base {

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"listCaseHistory\"]/tbody/tr[1]/td[1]/a")
	protected WebElement ClickonCase;

	@FindBy(how = How.XPATH, using = "//*[@id=\"foundationMasterForm\"]/section/div[2]/div[1]/div[1]/div/label/a")
	protected WebElement SelectFoundationProgramLinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"selectValue\"]")
	protected WebElement SelectFoundationRadioBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"foundationMasterForm\"]/section/div[2]/div[1]/div[2]/div/div/label/a")
	protected WebElement SelectPrescLinkHTMLs;

	@FindBy(how = How.XPATH, using = "//*[@id=\"okButton\"]")
	protected WebElement OKButtonFoundation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-status-container\"]")
	protected WebElement FoundationStatusDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-reason-container\"]")
	protected WebElement FoundationReasonDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-initiatedBy-container\"]")
	protected WebElement FoundationInitiatedByDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"dateFundingInitiated\"]")
	protected WebElement DateInitiatedFoundationHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"submitDate\"]")
	protected WebElement DateSubmittedFoundationHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"expectedResponse\"]")
	protected WebElement ExpectedResponseDateFoundationHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"resultDate\"]")
	protected WebElement DecisionDateFoundationHTML;

	@FindBy(how = How.ID, using = "createNewInsuranceFoundation")
	static protected WebElement CreateNewInsurance;

	@FindBy(how = How.ID, using = "insurance")
	static protected WebElement InsuranceID;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	static protected WebElement SaveBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[2]")
	static protected WebElement CloseBtn;

	// @FindBy(how = How.XPATH, using = "//*[@id=\"activityFoundation
	// Support\"]/div/div/div[2]/div[1]/div/div[3]/div[1]")
	// static protected WebElement FoundationProgramNameHTML;

	String Current = driver.getWindowHandle();

	public void patientSearchMethod() throws InterruptedException {
		String PatientFirstName = DpPatient.getRow(1).getCell(1).getStringCellValue();
		String PatientLastName = DpPatient.getRow(1).getCell(2).getStringCellValue();
		String PatientDOB = DpPatient.getRow(1).getCell(3).getStringCellValue();

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (driver.getTitle().equalsIgnoreCase("KloudScript")) {
			Thread.sleep(2000);
			SearchPatientHomeHTML.click();
			PatientSearchFirstnameHTML.click();
			PatientSearchFirstnameHTML.clear();
			PatientSearchFirstnameHTML.sendKeys(PatientFirstName);

			PatientSearchLastnameHTML.click();
			PatientSearchLastnameHTML.clear();
			PatientSearchLastnameHTML.sendKeys(PatientLastName);

			PatientSearchDOBHTML.click();
			// PatientSearchDOBHTML.clear();
			PatientSearchDOBHTML.sendKeys(PatientDOB);

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
				System.out.println("Patient Not Found for Case Management");
			}
		}
	}

	public void clickonCase() throws InterruptedException {
		Thread.sleep(2000);
		ClickonCase.click();
	}

	public void caseManagementTabClick() {
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + CaseManagement_tabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CaseManagement_tabHTML.click();
	}

	public void clickonBIworkflow() throws InterruptedException {

		Thread.sleep(1000);
		WebElement BIWorkflowElement = driver.findElement(By.xpath("//*[@workflownameabbr=\"BI\"]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BIWorkflowElement.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@workflownameabbr=\"BI\"]")));
		BIWorkflowElement.click();
		Thread.sleep(1000);
	}

	public void clickonFoundationActivity() throws InterruptedException {
		WebElement AddFoundationBIActivity = driver.findElement(By.partialLinkText("Foundation Support"));
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + AddFoundationBIActivity.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Foundation Support")));
		AddFoundationBIActivity.click();
		Thread.sleep(1000);
	}

	public void clickonAddFoundationLink() throws InterruptedException {
		WebElement AddFoundationLinkHTML = driver
				.findElement((By.xpath("//a[contains(@href,'/kloudscript/foundationSupport/add')]")));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[contains(@href,'/kloudscript/foundationSupport/add')]")));
		AddFoundationLinkHTML.click();

		Thread.sleep(2000);

		for (String handles : driver.getWindowHandles()) {

			driver.switchTo().window(handles);
			driver.manage().window().maximize();
		}
	}

	public void SelectFoundationProgramLink() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + SelectFoundationProgramLinkHTML.getLocation().y + ")");
		SelectFoundationProgramLinkHTML.click();
		Thread.sleep(2000);

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + SelectFoundationRadioBtn.getLocation().y + ")");
		SelectFoundationRadioBtn.click();
	}

	public void SelectPrescrLinks() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectPrescLinkHTMLs.getLocation().y + ")");
		SelectPrescLinkHTMLs.click();
		Thread.sleep(2000);

		List<WebElement> Selectmcheckbox = driver.findElements(By.xpath("//*[@name=\"selectValue\"]"));

		for (int i = 0; i < Selectmcheckbox.size(); i++) {

			int x = Selectmcheckbox.get(i).getLocation().getX();
			if (x != 0) {

				Selectmcheckbox.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + OKButtonFoundation.getLocation().y + ")");
		OKButtonFoundation.click();

		Thread.sleep(1000);
		WebElement outsideclickfoundation = driver.findElement(By.xpath("/html/body/section/div[5]/h2"));
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + outsideclickfoundation.getLocation().y + ")");
		outsideclickfoundation.click();
	}

	public void selectStatus(String FoundationStatusValue, String FoundationReasonValue) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		FoundationStatusDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement FoundationStatusSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		FoundationStatusSearchHTML.clear();
		FoundationStatusSearchHTML.sendKeys(FoundationStatusValue);
		FoundationStatusSearchHTML.sendKeys(Keys.ENTER);

		if (!FoundationStatusValue.equals("Approved")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			FoundationReasonDropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
			WebElement FoundationreasonSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			FoundationreasonSearchHTML.clear();
			FoundationreasonSearchHTML.sendKeys(FoundationReasonValue);
			FoundationreasonSearchHTML.sendKeys(Keys.ENTER);
		}
		// Thread.sleep(1000);
	}

	public void selectInitiatedBy(String FoundationInitiatedByValue) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		FoundationInitiatedByDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement FoundationInitiatedBySearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		FoundationInitiatedBySearchHTML.clear();
		FoundationInitiatedBySearchHTML.sendKeys(FoundationInitiatedByValue);
		FoundationInitiatedBySearchHTML.sendKeys(Keys.ENTER);
		// Thread.sleep(1000);
	}

	public void enterDateInitiatedFoundation(String DateInitiatedFoundationValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + DateInitiatedFoundationHTML.getLocation().y + ")");
		DateInitiatedFoundationHTML.click();
		DateInitiatedFoundationHTML.sendKeys(DateInitiatedFoundationValue);
		// Thread.sleep(1000);
	}

	public void enterDateSubmittedFoundation(String DateSubmittedFoundationValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + DateSubmittedFoundationHTML.getLocation().y + ")");
		DateSubmittedFoundationHTML.click();
		DateSubmittedFoundationHTML.sendKeys(DateSubmittedFoundationValue);
		// Thread.sleep(1000);
	}

	public void enterExpectedResponseDateFoundation(String ExpectedResponseDateFoundationValue)
			throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + ExpectedResponseDateFoundationHTML.getLocation().y + ")");
		ExpectedResponseDateFoundationHTML.click();
		ExpectedResponseDateFoundationHTML.sendKeys(ExpectedResponseDateFoundationValue);
		// Thread.sleep(1000);
	}

	public void enterDecisionDateFoundation(String DecisionDateFoundationValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + DecisionDateFoundationHTML.getLocation().y + ")");
		DecisionDateFoundationHTML.click();
		DecisionDateFoundationHTML.sendKeys(DecisionDateFoundationValue);
		// Thread.sleep(1000);
	}

	public void SelectInsurance() throws InterruptedException {

		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + DecisionDateFoundationHTML.getLocation().y + ")");
		CreateNewInsurance.click();
		Thread.sleep(3000);
		Select Insuranceddl = new Select(InsuranceID);
		wait.until(ExpectedConditions.elementToBeClickable(InsuranceID));
		Insuranceddl.selectByIndex(1);
		Thread.sleep(4000);
	}

	public void SaveBtn() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveBtn.getLocation().y + ")");
		SaveBtn.click();
		Thread.sleep(3000);
	}

	public void CloseBtn() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CloseBtn.getLocation().y + ")");
		CloseBtn.click();
		Thread.sleep(3000);

		driver.switchTo().window(Current);
		System.out.println("Foundation Support Added Successfully");
		Thread.sleep(3000);
	}

	public void Activitycompleted() throws InterruptedException {
		WebElement FoundationName = driver.findElement(By.xpath(
				"//*[@id=\\\\\\\"activityFoundation Support\\\\\\\"]/div/div/div[2]/div[1]/div/div[3]/div[1]"));
		driver.switchTo().window(Current);
		try {

			WebElement AgainClickBIWorkflow = driver.findElement(By.xpath("//*[@workflownameabbr=\"BI\"]"));

			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + AgainClickBIWorkflow.getLocation().y + ")");
			wait.until(ExpectedConditions.elementToBeClickable(AgainClickBIWorkflow));
			AgainClickBIWorkflow.click();

			WebElement ClickFoundationActivity = driver.findElement(By.partialLinkText("Foundation Support"));
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + ClickFoundationActivity.getLocation().y + ")");
			wait.until(ExpectedConditions.elementToBeClickable(ClickFoundationActivity));
			ClickFoundationActivity.click();

			// String FoundationProgramNameHTML =
			// OrCaseManagement_tab.getRow(107).getCell(3).getStringCellValue();
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\\\\\"activityFoundation Support\\\\\\\"]/div/div/div[2]/div[1]/div/div[3]/div[1]")));
			wait.until(ExpectedConditions.elementToBeClickable(FoundationName));
			FoundationName.getText();
			System.out.println(FoundationName);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Added: " + FoundationName);
			//test.log(LogStatus.PASS, "Added: " + FoundationName);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while adding Foundation: " + FoundationName);
		}
	}
	public void err_msg() throws IOException {
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
}
