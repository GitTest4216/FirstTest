package dataPackage;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testPackage.Base;
import testPackage.CommunicationLogFuntionality;

public class FaxSentData extends Base {

	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\'notificationDialogCloseButton\']")
	protected WebElement Notification;

	@FindBy(how = How.XPATH, using = "//*[@id='faxBlock']/div/div[2]/div/a[2]")
	protected WebElement FaxSend;

	@FindBy(how = How.CLASS_NAME, using = "seleFaxSentSendFax")
	protected WebElement Sendbutton;

	@FindBy(how = How.ID, using = "organization")
	protected WebElement Organization1;

	@FindBy(how = How.ID, using = "faxTemplate")
	protected WebElement faxTemplateEle;

	@FindBy(how = How.ID, using = "field_idx_0")
	protected WebElement To;

	@FindBy(how = How.ID, using = "field_idx_1")
	protected WebElement Attention;

	@FindBy(how = How.ID, using = "field_idx_2")
	protected WebElement From;

	@FindBy(how = How.ID, using = "nextBtn")
	protected WebElement step1;

	@FindBy(how = How.ID, using = "nextBtn")
	protected WebElement step2;

	@FindBy(how = How.ID, using = "nextBtn")
	protected WebElement step3;

	@FindBy(how = How.ID, using = "nextBtn")
	protected WebElement SendFax;

	@FindBy(how = How.XPATH, using = "//*[@id=\"templateAssociateTypeDiv\"]/input[1]")
	protected WebElement PatientRadiobtn;

	@FindBy(how = How.ID, using = "receiverFax")
	protected WebElement receiverFax;

	@FindBy(how = How.XPATH, using = "//*[@id='loginPageLogoCommonFluidHeader1']")
	protected WebElement HomePage;

	@FindBy(how = How.ID, using = "faxTemplate")
	protected WebElement FaxTemplate;

	@FindBy(how = How.XPATH, using = "//*[@id='faxBlock']/div/div[2]/div/a[1]")
	protected WebElement FaxInbox;

	@FindBy(how = How.ID, using = "//*[@id='tenant-namebtnMultiselectDropdown']")
	protected WebElement Ksclientdopdown;

	@FindBy(how = How.XPATH, using = "//*[@id='tenant-nametooltipDiv']/ul/div[1]/div[1]/div/input")
	protected WebElement KSSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"tenant-nametooltipDiv\"]/ul/li[56]/label")
	protected WebElement KSclientselectvalue;

	@FindBy(how = How.ID, using = "searchStatus")
	protected WebElement FaxinboxStatus1;

	@FindBy(how = How.NAME, using = "_action_dashboard")
	protected WebElement FaxSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='listGridDiv']/div[1]/table/tbody/tr[1]/td[8]/a[1]/img")
	protected WebElement PharmacyTitleView;

	@FindBy(how = How.XPATH, using = "//*[@id='listGridDiv']/div[1]/table/tbody/tr[1]/td[8]/a[1]/img")
	protected WebElement FaxViews;

	@FindBy(how = How.XPATH, using = "/html/body/section/div[3]/div/center/input[1]")
	protected WebElement TagClick;

	@FindBy(how = How.XPATH, using = "//*[@id='listGridDiv']/div[1]/table/tbody/tr[1]/td[8]/a[1]/img")
	protected WebElement AssignFaxClick;

	@FindBy(how = How.XPATH, using = "//*[@id='patientSearch']/div[1]/a")
	protected WebElement searchpatient;

	@FindBy(how = How.ID, using = "searchPatientId")
	protected WebElement patientid;

	@FindBy(how = How.NAME, using = "_action_searchPatient")
	protected WebElement ClickSearchPatient;

	@FindBy(how = How.NAME, using = "selectedPatient")
	protected WebElement SelectPatient;

	@FindBy(how = How.ID, using = "callerType")
	protected WebElement CallerType1;

	@FindBy(how = How.ID, using = "note")
	protected WebElement LogNotes;

	@FindBy(how = How.ID, using = "assignButton")
	protected WebElement assignbutton;

	public void openFaxSend(String FaxSendpermission) throws InterruptedException {

		Thread.sleep(2000);
		if (FaxSendpermission.equals("YES")) {
			Thread.sleep(5000);
			FaxSend.click();
			Thread.sleep(2000);

			// Send Fax button click
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Sendbutton.getLocation().y + ")");
			Sendbutton.click();
			Thread.sleep(1000);
		}
	}

	public String selectOrganization() throws InterruptedException {
		Thread.sleep(1000);
		Select organization = new Select(Organization1);
		organization.selectByValue("2258a8c8457565100145758dedae0000");
		WebElement orgName = organization.getFirstSelectedOption();
		String Organization = orgName.getText();
		System.out.println(Organization);
		Thread.sleep(3000);
		return Organization;
	}

	public String selectTemplate() throws InterruptedException {

		Select faxTemplate = new Select(FaxTemplate);
		faxTemplate.selectByValue("13");
		WebElement template = faxTemplate.getFirstSelectedOption();
		String temp = template.getText();
		System.out.println(temp);
		Thread.sleep(1000);
		return temp;
	}

	public void enterTextinTextbox(WebElement element, String text) throws InterruptedException {

		Thread.sleep(1000);
		element.sendKeys(text);
	}

	public void navigateToHomePage() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(HomePage));
		HomePage.click();
		Thread.sleep(3000);
	}

	public void clickOnSendFax() throws InterruptedException, IOException {

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SendFax.getLocation().y + ")");
		SendFax.click();
		Thread.sleep(2000);
		/*
		 * test.log(LogStatus.PASS, test.addScreenCapture(CaptureScreen(driver)));
		 * Thread.sleep(5000);
		 */
	}

	public void wizardSteps(String receiverfaxnumber) throws InterruptedException, IOException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		// =================Click On Next button
		// Click on Next - Step 1
		executor.executeScript("arguments[0].click();", step1);
		Thread.sleep(3000);

		// Click on Next - Step 2
		executor.executeScript("arguments[0].click();", step2);
		Thread.sleep(3000);

		// Click on Next - Step 3
		executor.executeScript("arguments[0].click();", step3);
		Thread.sleep(3000);

		// ===========Enter Receiver Fax
		receiverFax.click();
		enterTextinTextbox(receiverFax, receiverfaxnumber);

	}

	public void selectStatus(String FaxStatus) throws InterruptedException {
		Thread.sleep(2000);
		Select FaxinboxStatus = new Select(FaxinboxStatus1);
		FaxinboxStatus.selectByVisibleText(FaxStatus);
	}

	public void clickOnSearch() throws InterruptedException {
		Thread.sleep(2000);
		FaxSearch.click();
	}

	public void verifyLoginPermission(String Loginpermission, String KSClientsearch) throws InterruptedException {
		if (Loginpermission.equals("KS")) {
			Thread.sleep(2000);
			Ksclientdopdown.click();
			Thread.sleep(2000);
			KSSearch.sendKeys(KSClientsearch);
			Thread.sleep(3000);
			KSclientselectvalue.click();

		}
	}

	public void verifyView(String PatientId, String CallerValue, String Lognotesvalue) throws InterruptedException {
		clickOnButton(FaxViews);
		String current = driver.getWindowHandle();
		windowHandle();
		Thread.sleep(3000);
		clickOnButton(TagClick);
		Thread.sleep(4000);

		driver.switchTo().window(current);
		clickOnButton(AssignFaxClick);
		Thread.sleep(4000);
		windowHandle();
		Thread.sleep(3000);

		String winHandleBefore = driver.getWindowHandle();
		searchpatient.click();

		windowHandle();
		patientid.sendKeys(PatientId);

		clickOnButton(ClickSearchPatient);
		clickOnButton(SelectPatient);
		Thread.sleep(1000);

		driver.switchTo().window(winHandleBefore);
		Thread.sleep(1000);

		Select CallertypeValue = new Select(CallerType1);
		CallertypeValue.selectByVisibleText(CallerValue);

		LogNotes.sendKeys(Lognotesvalue);

		clickOnButton(assignbutton);

	}

	public void clickOnButton(WebElement button) {

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + button.getLocation().y + ")");

		button.click();
	}

	public void windowHandle() {
		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);

		}
	}

	public void verifyAssign(String PatientId, String CallerValue, String Lognotesvalue) throws InterruptedException {

		clickOnButton(AssignFaxClick);
		windowHandle();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(searchpatient));
		Thread.sleep(2000);

		String winHandleBefore = driver.getWindowHandle();
		searchpatient.click();

		windowHandle();
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + patientid.getLocation().y + ")");

		patientid.sendKeys(PatientId);

		clickOnButton(ClickSearchPatient);

		clickOnButton(SelectPatient);
		driver.switchTo().window(winHandleBefore);

		Thread.sleep(500);

		Select CallertypeValue = new Select(CallerType1);
		CallertypeValue.selectByVisibleText(CallerValue);

		LogNotes.sendKeys(Lognotesvalue);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + assignbutton.getLocation().y + ")");

		assignbutton.click();
	}

}