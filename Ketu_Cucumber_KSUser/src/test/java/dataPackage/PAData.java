
package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.Status;

import testPackage.Base;

public class PAData extends Base<Object> {

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
	@FindBy(how = How.XPATH, using = "/html/body/section/div[3]/div[1]/table/tbody/tr/td[1]/a")
	protected WebElement ClickonCase;
	@FindBy(how = How.XPATH, using = "//*[@workflownameabbr=\"BI\"]")
	protected WebElement BIWorkflowElements;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Prior Authorization")
	protected WebElement ClickPAActivityLink;
	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPrior Authorization\"]/div/div/div[2]/div[1]/div/div[1]/div/a")
	protected WebElement AddPALinkHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-paType-container\"]")
	protected WebElement PATypeDropdown;
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement PATypeSearch;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-status-container\"]")
	protected WebElement PAStatusDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-reason-container\"]")
	protected WebElement PAReasonDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-initiatedBy-container\"]")
	protected WebElement PAInitiatedByDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"selectLink\"]")
	protected WebElement SelectPrescLinkHTMLs;
	@FindBy(how = How.XPATH, using = "//*[@id=\"okButton\"]")
	protected WebElement ClickOkBtn;
	@FindBy(how = How.ID, using = "select2-insurance-container")
	protected WebElement PAInsurance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"startDate\"]")
	protected WebElement PADateInitiatedHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submitDate\"]")
	protected WebElement PADateSubmittedHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"expectedResponseDate\"]")
	protected WebElement PAExpectedResponseDateHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"resultDate\"]")
	protected WebElement PADecisionDateHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"expirtyDate\"]")
	protected WebElement PAExpirationDateHTML;
	@FindBy(how = How.ID, using = "paNumber")
	protected WebElement PARefCaseNumberHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected WebElement PASaveBtnHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[2]")
	protected WebElement paClosebtn;

	String Currents = driver.getWindowHandle();

	/** Patient Search **/

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
	/* Click on Case */

	public void clickonCase() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickonCase.getLocation().y + ")");

		ClickonCase.click();
		Thread.sleep(1000);
	}

	/* Case Management Tab */

	public void caseManagementTabClick() {
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + CaseManagement_tabHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CaseManagement_tabHTML.click();
	}

	public void BIWorkflowClick() throws InterruptedException, IOException {

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BIWorkflowElements.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@workflownameabbr=\"BI\"]")));
		BIWorkflowElements.click();
		Thread.sleep(3000);

	}

	public void ClickPAActivity() throws InterruptedException, IOException {
		try {

			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + ClickPAActivityLink.getLocation().y + ")");

			ClickPAActivityLink.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on PA Activity");
			Thread.sleep(1000);
		} catch (Exception e) {
			//////ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on PA Activity");
		}
	}

	public void AddPALink() throws InterruptedException, IOException {
		try {

			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			AddPALinkHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Add PA Link");
			for (String handle1 : driver.getWindowHandles()) {

				driver.switchTo().window(handle1);
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			//////ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add PA Link");
		}

	}

	public void selectPAType(String PATypeValue) throws InterruptedException {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
			PATypeDropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));

			PATypeSearch.clear();
			PATypeSearch.sendKeys(PATypeValue);
			PATypeSearch.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected PA TYPE Value - " + PATypeValue);
			Thread.sleep(1000);
		} catch (Exception e) {
			//////ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting PA TYPE Value - " + PATypeValue);

		}
	}

	public void selectPAStatus(String PAStatusValue) throws InterruptedException {
		try {

			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
			PAStatusDropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
			WebElement PAStatusSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			PAStatusSearchHTML.clear();
			PAStatusSearchHTML.sendKeys(PAStatusValue);
			PAStatusSearchHTML.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected PA Status Value - " + PAStatusValue);
			Thread.sleep(1000);
		} catch (Exception e) {
			////ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting PA Status Value - " + PAStatusValue);
		}
	}

	public void selectPAReason(String PAReasonValue) throws InterruptedException {
		try {

			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
			PAReasonDropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
			WebElement PAreasonSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			PAreasonSearchHTML.clear();
			PAreasonSearchHTML.sendKeys(PAReasonValue);
			PAreasonSearchHTML.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected PA Status Value - " + PAReasonValue);
			Thread.sleep(1000);

		} catch (Exception e) {
			//////ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting PA Status Value - " + PAReasonValue);
		}
	}

	public void selectPAInitiatedBy(String PAInitiatedBy) throws InterruptedException {
		try {

			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
			PAInitiatedByDropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
			WebElement PAInitiatedBySearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			PAInitiatedBySearchHTML.clear();
			PAInitiatedBySearchHTML.sendKeys(PAInitiatedBy);
			PAInitiatedBySearchHTML.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Selected PA Intiitated By Value - " + PAInitiatedBy);
			Thread.sleep(1000);

		} catch (Exception e) {
			//////ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting PA Intiitated By Value - " + PAInitiatedBy);
		}
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
				.findElement(By.xpath("/html/body/section/form/section/div[2]/div[10]/div/div/label"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PAoutsideclick.getLocation().y + ")");
		PAoutsideclick.click();
	}

	public void selectInsurance() throws InterruptedException {
		Thread.sleep(2000);
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PAInsurance.getLocation().y + ")");
		PAInsurance.click();
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
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PADateInitiatedHTML.getLocation().y + ")");
		PADateInitiatedHTML.click();
		PADateInitiatedHTML.sendKeys(PADateInitiatedValue);
		Thread.sleep(1000);
	}

	public void enterPADateSubmitted(String PADateSubmittedValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PADateSubmittedHTML.getLocation().y + ")");
		PADateSubmittedHTML.click();
		PADateSubmittedHTML.sendKeys(PADateSubmittedValue);
		Thread.sleep(1000);
	}

	public void enterPAExpectedResponseDate(String PAExpectedResponseDateValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + PAExpectedResponseDateHTML.getLocation().y + ")");
		PAExpectedResponseDateHTML.click();
		PAExpectedResponseDateHTML.sendKeys(PAExpectedResponseDateValue);
		Thread.sleep(1000);
	}

	public void enterPAExpirationDate(String PAExpirationDateValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PADecisionDateHTML.getLocation().y + ")");
		PADecisionDateHTML.click();
		PADecisionDateHTML.sendKeys(PAExpirationDateValue);
		Thread.sleep(1000);
	}

	public void enterPADecisionDate(String PADecisionDateValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PAExpirationDateHTML.getLocation().y + ")");
		PAExpirationDateHTML.click();
		PAExpirationDateHTML.sendKeys(PADecisionDateValue);
		Thread.sleep(1000);
	}

	public void enterPARefCaseNumber(String PARefCaseNumberValue) throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PARefCaseNumberHTML.getLocation().y + ")");
		PARefCaseNumberHTML.click();
		PARefCaseNumberHTML.sendKeys(PARefCaseNumberValue);
		Thread.sleep(1000);
	}

	public void PASaveBtn() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PASaveBtnHTML.getLocation().y + ")");
		PASaveBtnHTML.click();
	}

	public void PACloseBtn() throws InterruptedException {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + paClosebtn.getLocation().y + ")");
		paClosebtn.click();

		driver.switchTo().window(Currents);
//		driver.findElement(By.id("statusTrue")).click();
		Thread.sleep(1000);
	}

}
