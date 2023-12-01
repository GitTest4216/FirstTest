package dataPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class PostBIData extends Base {

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriber-alert\"]/div[1]/h2/div/i")
	protected WebElement PatientCareTeamAlertBoxClosebtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-alert\"]")
	protected WebElement PatientAlertBox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollbox3\"]/div[4]/button")
	protected WebElement PatientAlertOkButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"startCase\"]")
	protected WebElement NotificationAlertOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"listCaseHistory\"]/tbody/tr[1]/td[1]/a")
	protected WebElement seleFirstCase;

	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-menu\"]/li[7]/a")
	protected WebElement CaseManagementTab;

	@FindBy(how = How.ID, using = "//*[@documenttag=\\\"CORDINATION_OF_CARE\\\"]")
	protected WebElement CoOrdination_Of_Care;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Post-BI Adjudication")
	protected WebElement PostBIButton;

	@FindBy(how = How.XPATH, using = "//a[@class='seleCaseId']")
	protected WebElement CaseID;

	@FindBy(how = How.XPATH, using = "//a[@class='seleCaseBannerCaseManagement']")
	protected WebElement CaseBannerCaseManagement;

	@FindBy(how = How.XPATH, using = "//a[text()='Post-BI Adjudication']")
	protected WebElement PostBIHeader;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPost-BI Adjudication\"]/div/div/div[2]/div/div[2]/div[3]/div[1]/div[1]")
	protected WebElement PHRxIDHeader;

	@FindBy(how = How.ID, using = "select2-postBIActivityList0primaryInsurance-container")
	protected WebElement primaryInsurance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-postBIActivityList0secondaryInsurance-container\"]")
	protected WebElement SecondaryInsurance;

	@FindBy(how = How.ID, using = "select2-postBIActivityList0copayCard-container")
	protected WebElement CopayInsurance;

	@FindBy(how = How.ID, using = "//*[@id=\"accordion\"]/div[1]/div[1]/h4/a")
	protected WebElement PostBiTab;
//	@FindBy(how = How.ID, using = "select2-postBIActivityList0copayCard-results")
//	protected WebElement CopayInsuranceValue;

	@FindBy(how = How.ID, using = "select2-postBIActivityList0foundationSupport-container")
	protected WebElement FoundationInsurance;

	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement SecondarySearch;

	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement CopaySearch;

	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement FoundationSearch;

	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement insuranceSearchElement;

	@FindBy(how = How.ID, using = "select2-postBIActivityList0primaryInsurance-results")
	protected WebElement PrimaryDropDown;

	@FindBy(how = How.XPATH, using = "//li[text()='-- Select --']")
	protected WebElement Selectbtn;

	@FindBy(how = How.XPATH, using = "//input[@id='rxDispensedDate0']")
	protected WebElement RXDispenseDate;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Edit')]")
	protected WebElement Editbtn;

	@FindBy(how = How.XPATH, using = "//span[@id='select2-postBIActivityList0primaryInsurance-container']")
	protected WebElement PrimaryInsurancedrpdwn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[1]/div[1]/h4/span/span[1]/label[2]")
	protected WebElement Completebtn;

	@FindBy(how = How.ID, using = "startCase")
	protected WebElement Yesbtn;

	@FindBy(how = How.ID, using = "postBIActivityList[0].primaryFinalClaimYes")
	protected WebElement PrimaryInsYesbtn;

	@FindBy(how = How.ID, using = "postBIActivityList[0].copayFinalClaimYes")
	protected WebElement CopayInsYesbtn;

	@FindBy(how = How.ID, using = "postBIActivityList[0].foundationFinalClaimYes")
	protected WebElement FoundInsYesbtn;

	@FindBy(how = How.ID, using = "postBIActivityList[0].secondaryFinalClaimYes")
	protected WebElement SecondaryInsYesbtn;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Save')])[1]")
	protected WebElement Savebtn;

	@FindBy(how = How.ID, using = "postBIActivityList[0].primaryBilledAmount")
	protected WebElement PrimaryAmount;

	@FindBy(how = How.ID, using = "postBIActivityList[0].primaryPaid")
	protected WebElement PrimaryInsPaid;

	@FindBy(how = How.ID, using = "postBIActivityList[0].copayCardPaid")
	protected WebElement CopayInsPaid;
	@FindBy(how = How.ID, using = "postBIActivityList[0].foundationSupportPaid")
	protected WebElement FoundInsPaid;

	@FindBy(how = How.ID, using = "postBIActivityList[0].secondaryBilledAmount")
	protected WebElement SecondaryAmount;

	@FindBy(how = How.ID, using = "postBIActivityList[0].secondaryPaid")
	protected WebElement SecondaryInsPaid;

	@FindBy(how = How.XPATH, using = "//*[@id=\"postBIActivityList[0].patientCopayAmount\"]")
	protected WebElement CopayAmount;

	@FindBy(how = How.ID, using = "postBIActivityList[0].drugAquisitionAmount")
	protected WebElement DrugAmount;

	@FindBy(how = How.ID, using = "notificationAlert")
	protected WebElement NotificationAlert;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-postBIActivityList0primaryInsurance-results\"]/li")
	protected WebElement NoResult;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-postBIActivityList0secondaryInsurance-results\"]/li")
	protected WebElement NoResultSecondary;

	@FindBy(how = How.XPATH, using = "//*[@id=\"workflowScreen\"]/ul")
	protected WebElement WorkflowError;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activtyRadioNA-138574\"]")
	protected WebElement RadioBtnNA;

	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/span")
	protected WebElement NABtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"saveButton-138574\"]/label[1]")
	protected WebElement Pendingbtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/span")
	protected WebElement Xbtn;

	@FindBy(how = How.ID, using = "select2-postBIActivityList0copayCard-results")
	protected WebElement CopayInsuranceValue;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPost-BI Adjudication_0\"]/div[4]/div/h4")
	protected WebElement PostBIClickPAP;

	@FindBy(how = How.ID, using = "postBIActivityList[0].notApplicableCopay")
	protected WebElement CopayCardNA;

	@FindBy(how = How.ID, using = "postBIActivityList[0].notApplicableFoundation")
	protected WebElement FoundationNA;

	@FindBy(how = How.XPATH, using = "//*[@id=\"postBIActivityList[0].patientCopayAmount\"]")
	protected WebElement Copaytxtbx;

	@FindBy(how = How.XPATH, using = "//*[@id=\"postBIActivityList[0].drugAquisitionAmount\"]")
	protected WebElement DrugAquisitiontxtbx;
	
	@FindBy(how = How.XPATH, using = "//*[@documenttag=\"CORDINATION_OF_CARE\"]")
	protected WebElement CoCWorkflowElement;

	public void cocWorkFlowClick() throws InterruptedException {
		try {

			WebElement CoCWorkflowElement = driver.findElement(By.xpath("//*[@documenttag=\"CORDINATION_OF_CARE\"]"));

			Thread.sleep(1000);
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + CoCWorkflowElement.getLocation().y + ")");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@documenttag=\"CORDINATION_OF_CARE\"]")));
			Thread.sleep(4000);
			CoCWorkflowElement.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on CoC Workflow");

		} catch (Exception e) {
			// ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while
			// Clicking on CoC Workflow");
		}
	}

	public void clearData(WebElement element) {
		// Base.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		element.clear();
	}

	public void enterRXDispenseDate(String Date) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RXDispenseDate);
		RXDispenseDate.clear();
		RXDispenseDate.click();
		Thread.sleep(2000);
		RXDispenseDate.sendKeys(Date);
	}

	public void selectInsurance(WebElement insurance, WebElement searchElement, String insuranceName)
			throws InterruptedException {
		Thread.sleep(1000);
		insurance.click();
		wait.until(ExpectedConditions.elementToBeClickable(searchElement));
		insuranceSearchElement.clear();
		insuranceSearchElement.sendKeys(insuranceName);
		insuranceSearchElement.sendKeys(Keys.ENTER);
	}

	public void enterTextInTextBox(WebElement ele, String text) throws InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		// String insuranceValue = "Primary";
		// ele.clear();
		ele.sendKeys(text);
		ele.sendKeys(Keys.ENTER);
	}

	public void clickOnRadioButton(WebElement option) throws InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
		option.click();
	}

	public void clickOnButton(WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + element.getLocation().y + ")");
		element.click();
	}
	public void completePostBI() throws InterruptedException {
		
			Completebtn.click();
			System.out.println("Clicked on complete button");
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Clicked on Complete button");
		
		Thread.sleep(2000);
		// ============Click On Save Button
		
			Savebtn.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Clicked on Save button");
			Thread.sleep(2000);
			//caseOpenSessionPopup();
			System.out.println("Saved PostBi without Adding any data");
	
	}
}
