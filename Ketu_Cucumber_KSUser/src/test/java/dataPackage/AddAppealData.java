package dataPackage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class AddAppealData extends Base {

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

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-status-container\"]")
	protected WebElement AppealStatusDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-reason-container\"]")
	protected WebElement AppealReasonDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-initiatedBy-container\"]")
	protected WebElement AppealInitiatedByDropdown;

	@FindBy(how = How.ID, using = "pastPAId")
	protected WebElement PAnumberEle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"selectLink\"]")
	protected WebElement SelectPrescLinkHTMLs;

	@FindBy(how = How.XPATH, using = "//*[@id=\"okButton\"]")
	protected WebElement ClickOkBtn;

	@FindBy(how = How.ID, using = "select2-insurance-container")
	protected WebElement SelectInsurance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"startDate\"]")
	protected WebElement PADateInitiated;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-levelType-container\"]")
	protected WebElement LevelofAppealDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-levelContestedReasonType-container\"]")
	protected WebElement PAContestedReasonDropdown;

	@FindBy(how = How.XPATH, using = "/html/body/section/form/section/div[2]/div[6]/div[1]/input[1]")
	protected WebElement YesRadio;

	@FindBy(how = How.XPATH, using = "/html/body/section/form/section/div[2]/div[6]/div[2]/input[1]")
	protected WebElement WantAppealYesRadio;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ksRphButton\"]/span[1]")
	protected WebElement DraftedBySearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sumbitDate\"]")
	protected WebElement AppealDateSubmittedHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"resultDate\"]")
	protected WebElement DecisionReceivedDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"approvalStartDate\"]")
	protected WebElement ApprovalDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"approximateAppealLength\"]")
	protected WebElement ExpirationDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"appealNumber\"]")
	protected WebElement AppealNumberHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected WebElement appealSavebtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[2]")
	protected WebElement appealClosebtn;
	
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
			PatientSearchDOBHTML.clear();
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

		Thread.sleep(6000);
		WebElement BIWorkflowElement = driver.findElement(By.xpath("//*[@workflownameabbr=\"BI\"]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BIWorkflowElement.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@workflownameabbr=\"BI\"]")));
		BIWorkflowElement.click();
		Thread.sleep(3000);
	}

	public void clickonAppealActivity() throws InterruptedException {
		WebElement AddAppealBIActivity = driver.findElement(By.partialLinkText("Appeal"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AddAppealBIActivity.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Appeal")));
		AddAppealBIActivity.click();
		Thread.sleep(2000);
	}

	public void clickonAddAppealLink() throws InterruptedException {
		WebElement AddAppealLinkHTML = driver.findElement((By.xpath("//a[contains(@href,'/kloudscript/appeal/add')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/kloudscript/appeal/add')]")));
		AddAppealLinkHTML.click();

		Thread.sleep(3000);

		for (String handles : driver.getWindowHandles()) {

			driver.switchTo().window(handles);
			driver.manage().window().maximize();
		}

		Thread.sleep(3000);
	}

	public void selectStatus(String AppealStatusValue) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		AppealStatusDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement AppealStatusSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		AppealStatusSearchHTML.clear();
		AppealStatusSearchHTML.sendKeys(AppealStatusValue);
		AppealStatusSearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void selectReason(String AppealReasonValue) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		AppealReasonDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement AppealreasonSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		AppealreasonSearchHTML.clear();
		AppealreasonSearchHTML.sendKeys(AppealReasonValue);
		AppealreasonSearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void selectInitiatedBy(String AppealInitiatedByValue) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		AppealInitiatedByDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement AppealInitiatedBySearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		AppealInitiatedBySearchHTML.clear();
		AppealInitiatedBySearchHTML.sendKeys(AppealInitiatedByValue);
		AppealInitiatedBySearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void enterPAnumber(String PANumber) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PAnumberEle.getLocation().y + ")");
		PAnumberEle.clear();
		PAnumberEle.sendKeys(PANumber);
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
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickOkBtn.getLocation().y + ")");
		ClickOkBtn.click();

		Thread.sleep(1000);
		WebElement PAoutsideclick = driver
				.findElement(By.xpath("/html/body/section/form/section/div[2]/div[2]/div[3]/div/div/label"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PAoutsideclick.getLocation().y + ")");
		PAoutsideclick.click();
	}

	public void selectInsurance() throws InterruptedException {
		Thread.sleep(2000);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectInsurance.getLocation().y + ")");
		SelectInsurance.click();
		Thread.sleep(2000);

		List<WebElement> PAInsuranceList = driver.findElements(By.className("select2-results__options"));

		for (int i = 0; i < PAInsuranceList.size(); i++) {

			int x = PAInsuranceList.get(i).getLocation().getX();
			if (x != 0) {

				PAInsuranceList.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}

	public void enterPADateInitiated(String PADateInitiatedValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PADateInitiated.getLocation().y + ")");
		PADateInitiated.clear();
		PADateInitiated.click();	
		PADateInitiated.sendKeys(PADateInitiatedValue);
		Thread.sleep(1000);
	}

	public void selectLevelOfAppeal(String LevelofAppeal) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		LevelofAppealDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement LevelOfAppealddlSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		LevelOfAppealddlSearchHTML.clear();
		LevelOfAppealddlSearchHTML.sendKeys(LevelofAppeal);
		LevelOfAppealddlSearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void selectPAContestedReason(String PAContestedReason) throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		PAContestedReasonDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement PAContestedReasonddlSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		PAContestedReasonddlSearchHTML.clear();
		PAContestedReasonddlSearchHTML.sendKeys(PAContestedReason);
		PAContestedReasonddlSearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void selectYesRadio() throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + YesRadio.getLocation().y + ")");
		YesRadio.click();
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + WantAppealYesRadio.getLocation().y + ")");
		WantAppealYesRadio.click();
	}

	public void AppealDraftedBy() throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DraftedBySearch.getLocation().y + ")");
		DraftedBySearch.click();
		Thread.sleep(1000);
		By mySelector = By.xpath("//ul[@id='ui-id-1']");
		List<WebElement> myElements = driver.findElements(mySelector);
		Boolean abc = true;
		for (WebElement e : myElements) {
			if (abc) {

				e.click();
			}

			abc = false;
		}
		Thread.sleep(2000);
	}

	public void enterAppealDateSubmitted(String AppealDateSubmitted) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + AppealDateSubmittedHTML.getLocation().y + ")");
		AppealDateSubmittedHTML.click();
//		AppealDateSubmittedHTML.clear();
		AppealDateSubmittedHTML.sendKeys(AppealDateSubmitted);
		Thread.sleep(1000);
	}

	public void enterDecisionReceivedDate(String DecisionReceivedDate) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + DecisionReceivedDateHTML.getLocation().y + ")");
		DecisionReceivedDateHTML.click();
//		DecisionReceivedDateHTML.clear();
		DecisionReceivedDateHTML.sendKeys(DecisionReceivedDate);
		Thread.sleep(1000);
	}

	public void enterApprovalDate(String ApprovalDate) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ApprovalDateHTML.getLocation().y + ")");
		ApprovalDateHTML.click();
//		ApprovalDateHTML.clear();
		ApprovalDateHTML.sendKeys(ApprovalDate);
		Thread.sleep(1000);
	}

	public void enterExpirationDate(String ExpirationDate) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ExpirationDateHTML.getLocation().y + ")");
		ExpirationDateHTML.click();
//		ExpirationDateHTML.clear();
		ExpirationDateHTML.sendKeys(ExpirationDate);
		Thread.sleep(1000);
	}

	public void enterAppealNumber(String AppealNumber) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AppealNumberHTML.getLocation().y + ")");
		AppealNumberHTML.clear();
		AppealNumberHTML.sendKeys(AppealNumber);
		Thread.sleep(1000);
	}

	public void appealSave() throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + appealSavebtn.getLocation().y + ")");
		appealSavebtn.click();
	}

	public void appealClose() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + appealClosebtn.getLocation().y + ")");
		appealClosebtn.click();

		driver.switchTo().window(Current);
		driver.findElement(By.id("statusTrue")).click();
		Thread.sleep(1000);

		System.out.println("Appeal Added Successfully");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Appeal Added Successfully" + "</b>");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occured while adding Appeal");
		}
	}

	public void err_msg() throws IOException {
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

}
