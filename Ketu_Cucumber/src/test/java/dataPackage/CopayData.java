package dataPackage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class CopayData extends Base<Object> {

	protected WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;

	@FindBy(how = How.XPATH, using = "//*[@workflownameabbr=\"BI\"]")
	static protected WebElement BIWorkflowlink;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Co-Pay Card")
	static protected WebElement Copaysection;

	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/kloudscript/coPayCard/add')]")
	static protected WebElement Addcopay;

	@FindBy(how = How.XPATH, using = "//*[@id=\"coPayCardMasterForm\"]/section/div[2]/div[1]/div[1]/div/label/a")
	static protected WebElement SelectCopaycard;

	@FindBy(how = How.XPATH, using = "//*[@id=\"selectValue\"]")
	static protected WebElement SelectCopayRadioBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"coPayCardMasterForm\"]/section/div[2]/div[1]/div[2]/div/label/a")
	static protected WebElement SelectPrescription;

	@FindBy(how = How.XPATH, using = "//*[@id=\"okButton\"]")
	static protected WebElement ClickOkBtnHTML;

	@FindBy(how = How.XPATH, using = "/html/body/section/div[5]/h2")
	static protected WebElement outsideclick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"status\"]")
	static protected WebElement CopayStatusDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"reason\"]")
	static protected WebElement CopayReasonDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"initiatedBy\"]")
	static protected WebElement InitiatedByDropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"dateInitiated\"]")
	static protected WebElement DateInitiated;

	@FindBy(how = How.XPATH, using = "//*[@id=\"dateSubmitted\"]")
	static protected WebElement DateSubmitted;

	@FindBy(how = How.XPATH, using = "//*[@id=\"expectedResponseDate\"]")
	static protected WebElement ExpectedResponseDate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"decisionDate\"]")
	static protected WebElement DecisionDate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"patientEligibleTypeYes\"]")
	static protected WebElement EligibleYesRadio;

	@FindBy(how = How.XPATH, using = "//*[@id=\"isCoPayCardUsedDiv\"]/div/input[2]")
	static protected WebElement CopayUsedNoRadio;

	@FindBy(how = How.ID, using = "createNewInsurance")
	static protected WebElement CreateNewInsurance;

	@FindBy(how = How.ID, using = "insurance")
	static protected WebElement InsuranceID;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	static protected WebElement SaveBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"closeButton\"]")
	static protected WebElement CloseBtn;

	public void BIWorkflowClick() throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BIWorkflowlink.getLocation().y + ")");

		BIWorkflowlink.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"BI workflow Clicked");
		//test.log(LogStatus.PASS, "BI workflow Clicked");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on BI workflow");
		}
	}

	public void Copaycardsection() throws InterruptedException {
		try {
		Copaysection.click();
		Addcopay.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Clicked on Add Copaycard link");
		//test.log(LogStatus.PASS, "Clicked on Add Copaycard link");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on Add Copaycard link");
		}
	}

	String Current = driver.getWindowHandle();

	public void SelectCopaycard() throws InterruptedException {
		try {
		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);
			driver.manage().window().maximize();
		}

		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectCopaycard.getLocation().y + ")");
		SelectCopaycard.click();
		Thread.sleep(2000);

		SelectCopayRadioBtn.click();
		Thread.sleep(6000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected Copay card");
		//test.log(LogStatus.PASS, "Selected Copay card");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Copay card");
		}
	}

	public void SelectPrescription() throws InterruptedException {
		try {
		// Click on Select Prescription
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SelectPrescription.getLocation().y + ")");
		SelectPrescription.click();

		Thread.sleep(2000);

		List<WebElement> Selectcheckbox = driver.findElements(By.name("selectValue"));

		for (int i = 0; i < Selectcheckbox.size(); i++) {

			int x = Selectcheckbox.get(i).getLocation().getX();
			if (x != 0) {

				Selectcheckbox.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);

		// Click on OK buttonbg

		ClickOkBtnHTML.click();
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected Prescription");
		//test.log(LogStatus.PASS, "Selected Prescription");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Prescription");
		}
	}

	public void OutsideClick() throws InterruptedException {

		outsideclick.click();
		Thread.sleep(3000);
	}

	public void CopayStatusDropdown(String CopayStatusValue, String CopayReasonValue) throws InterruptedException {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(CopayStatusDropdown));
		Select CopayStatusDdl = new Select((CopayStatusDropdown));
		CopayStatusDdl.selectByVisibleText(CopayStatusValue);
		System.out.println(" reason valaue" + CopayStatusValue);
		Thread.sleep(3000);

		if (!CopayStatusValue.equals("Approved")) {

			wait.until(ExpectedConditions.elementToBeClickable(CopayReasonDropdown));
			Select CopayReasonDdl = new Select(CopayReasonDropdown);
			CopayReasonDdl.selectByVisibleText(CopayReasonValue);
			System.out.println(" reason valaue" + CopayReasonValue);

		}
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Copay Status Added");
		//test.log(LogStatus.PASS, "Copay Status Added");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Adding Copay Status");
		}
	}

	public void InitiatedByDropdown(String InitiatedValue) throws InterruptedException {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(InitiatedByDropdown));
		Select InitiatedByDdl = new Select((InitiatedByDropdown));
		InitiatedByDdl.selectByVisibleText(InitiatedValue);
		Thread.sleep(3000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Initiated value Selected");
		//test.log(LogStatus.PASS, "Initiated value Selected");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Initiated value");
		}
	}

	public void DateInitiated(String DateInitiatedValue) throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DateInitiated.getLocation().y + ")");
		DateInitiated.click();
		//DateInitiated.clear();
		Thread.sleep(3000);
		DateInitiated.sendKeys(DateInitiatedValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Date Initiated Selected");
		//test.log(LogStatus.PASS, "Date Initiated Selected");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Date Initiated");
		}
	}

	public void DateSubmitted(String DateSubmittedValue) throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DateSubmitted.getLocation().y + ")");
		DateSubmitted.click();
		//DateSubmitted.clear();
		Thread.sleep(3000);
		DateSubmitted.sendKeys(DateSubmittedValue);
	
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Date Submitted Selected");
		//test.log(LogStatus.PASS, "Date Submitted Selected");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Date Submitted");
		}
	}

	public void ExpectedResponseDate(String ExpectedResponseDateValue) throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ExpectedResponseDate.getLocation().y + ")");
		ExpectedResponseDate.click();
		//ExpectedResponseDate.clear();
		Thread.sleep(3000);
		ExpectedResponseDate.sendKeys(ExpectedResponseDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Expected Response Date Selected");
		//test.log(LogStatus.PASS, "Expected Response Date Selected");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Expected Response Date");
		}
	}

	public void DecisionDate(String DecisionDateValue) throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DecisionDate.getLocation().y + ")");
		DecisionDate.click();
		//DecisionDate.clear();
		Thread.sleep(3000);
		DecisionDate.sendKeys(DecisionDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Decision Date Selected");
		//test.log(LogStatus.PASS, "Decision Date Selected");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Decision Date");
		}
	}

	public void EligibleRadio() throws InterruptedException {
		
		// Select Patient Eligible For Co-Pay Card? Yes Radio button
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + EligibleYesRadio.getLocation().y + ")");
		EligibleYesRadio.click();

		System.out.println("Patient is Eligible for Copay Card");
	}

	public void CopayUsedRadio() throws InterruptedException {

		// Select Co-Pay Card Used? No Radio Button
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CopayUsedNoRadio.getLocation().y + ")");
		CopayUsedNoRadio.click();

		System.out.println("Patient is Eligible for Copay Card");
	}

	public void SelectInsurance() throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CopayUsedNoRadio.getLocation().y + ")");
		CreateNewInsurance.click();
		Thread.sleep(3000);
		Select Insuranceddl = new Select(InsuranceID);
		wait.until(ExpectedConditions.elementToBeClickable(InsuranceID));
		Insuranceddl.selectByIndex(1);
		Thread.sleep(4000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected Copay Insurance");
	} catch (Exception e) {
		//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Copay Insurance");
	}
	}

	public void SaveBtn() throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveBtn.getLocation().y + ")");
		SaveBtn.click();
		Thread.sleep(3000);
		//ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Copay Card is Saved successfully");
		//test.log(LogStatus.PASS, "Copay Card is Saved successfully");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Saving Copay Card ");
		}
	}

	public void CloseBtn() throws InterruptedException {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CloseBtn.getLocation().y + ")");
		CloseBtn.click();
		Thread.sleep(3000);

		driver.switchTo().window(Current);
		System.out.println("Copay Card Added Successfully");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Copay Card Added Successfully" + "</b>");
		//test.log(LogStatus.PASS, "Copay Card Added Successfully");
		Thread.sleep(3000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Adding Copay Card");
		}
	}
		

}
