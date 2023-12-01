package dataPackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
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

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class PreBIData extends Base<Object> {

	WebDriverWait wait = new WebDriverWait(driver, 15);

	@FindBy(how = How.XPATH, using = "//*[@id=\'notificationDialogCloseButton\']")
	protected WebElement notificationDialogCloseBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-menu\"]/li[7]/a")
	protected static WebElement CaseManagementTab;

	@FindBy(how = How.XPATH, using = "//*[@class=\"seleCaseHistory\"]")
	protected static WebElement History;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected static WebElement AddCase;

	@FindBy(how = How.XPATH, using = "//*[@id=\'sametccareplandialog\']/div/div/div[3]/button[1]")
	protected static WebElement accept;

	@FindBy(how = How.XPATH, using = "/html/body/section/section[2]/a")
	protected static WebElement Addcase;

	@FindBy(how = How.XPATH, using = "//*[@id=\"pharmacyStore\"]")
	protected static WebElement pharmacyStore;

	@FindBy(how = How.XPATH, using = "//*[@id=\"therapeuticProgram\"]")
	protected static WebElement therapeuticProgram;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Rx Processing\"]")
	protected static WebElement RxProcessing;

	@FindBy(how = How.XPATH, using = "//*[@id=\"selectCarePlan\"]")
	protected static WebElement CarePlan;

	@FindBy(how = How.XPATH, using = "//*[@id=\"New Rx\"]")
	protected static WebElement NewRx;

	@FindBy(how = How.XPATH, using = "//*[@id=\"caseIdInBanner\"]")
	protected static WebElement CaseId;

	@FindBy(how = How.XPATH, using = "//*[@class='main_wrap']/div/ul/li[1]/a")
	protected static WebElement IntakeWorkflowElement;

	@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[3]/div[1]/h4/span/span[1]/input[2]")
	protected static WebElement completeButton;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Pre-BI Adjudication")
	protected static WebElement PreBIIntakeActivity;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPre-BI Adjudication\"]/div/div[1]/div[2]/div/div[2]/div[3]/div[1]/div[1]")
	protected static WebElement preBiAdjIIButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"primaryInsRow0\"]/div[1]/div[1]/div/div[1]/span/span[1]/span")
	protected static WebElement preBiPrimaryDdl;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"secondaryInsRow0\"]/div[1]/div[1]/div/div/span[1]/span[1]/span")
	protected static WebElement preBiSecDdl;
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected static WebElement preBiPrimarySearch;

	@FindBy(how = How.XPATH, using = "//*[@class='save-btn']/*[1]")
	protected static WebElement SaveAll;

	@FindBy(how = How.ID, using = "startCase")
	protected static WebElement popUp;

	@FindBy(how = How.XPATH, using = "//*[@id=\"updateFollowupDate\"]/div[1]/div/div[3]//button")
	protected static WebElement ensurePopUp;

	@FindBy(how = How.XPATH, using = "//*[@id=\"displayCaseBanner\"]/div/div/div[1]/button")
	protected static WebElement caseBannerPopup;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].primaryInsurance\"]")
	protected static WebElement PrimaryInsuranceName;

	@FindBy(how = How.ID, using = "prescriptionBIActivityList[0].primaryInitialClaimYes")
	protected static WebElement priYes;

	@FindBy(how = How.ID, using = "prescriptionBIActivityList[0].primaryInitialClaimNo")
	protected static WebElement priNo;
	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].primaryPriorAuthRequired\"]")
	protected static WebElement PARequiredYes;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].primaryBilledAmount\"]")
	protected static WebElement PriBilled;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPre-BI Adjudication_0\"]/fieldset[1]")
	protected static WebElement outsideclick;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"activityPre-BI Adjudication_0\\\"]/div[6]/div")
	protected static WebElement ClickPAPSetion;

	@FindBy(how = How.XPATH, using = "/html/body/section/form/div/div[2]/div[2]/div[1]/div[4]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[3]/div/div/fieldset[3]/legend/div/input")
	protected static WebElement ClickPAPFoundationSetion;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].secondaryInsurance\"]")
	protected static WebElement SecondaryInsuranceName;

	@FindBy(how = How.ID, using = "prescriptionBIActivityList[0].secondaryInitialClaimYes")
	protected static WebElement secYes;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].secondaryBilledAmount\"]")
	protected static WebElement SecBilledHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPre-BI Adjudication_0\"]/div[6]/div")

	protected static WebElement ClickPAP;
	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].notApplicableFoundation\"]")
	protected static WebElement ClickFoundationNAcheckbox;

	@FindBy(how = How.ID, using = "prescriptionBIActivityList[0].copayCard")
	protected static WebElement PAPCoPayCard;

	@FindBy(how = How.XPATH, using = "//*[@id=\"copayInsRow0\"]/div[2]/div/div[1]/label/input")
	protected static WebElement copayClaim;

	@FindBy(how = How.ID, using = "prescriptionBIActivityList[0].copaySupportBenefit")
	protected static WebElement copayBilled;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].foundationSupport\"]")
	protected static WebElement foundSupportName;

	@FindBy(how = How.XPATH, using = "//div[@id=\"foundationInsRow0\"]/div[2]/div[1]/div[1]/label/input")
	protected static WebElement foundClaim;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionBIActivityList[0].foundationSupportBenefit\"]")
	protected static WebElement foundBill;

	@FindBy(how = How.XPATH, using = "//*[@id=\"workflowScreen\"]/ul/li")
	protected static WebElement errorMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"activityPre-BI Adjudication_0\\\"]/fieldset[2]/legend/div/label")
	protected static WebElement PAPCopay;
	
	

	public void clickCaseManagement() throws InterruptedException, Exception {
		parent = report.createTest("PreBI");
		test = report.createTest("Case Management");
		String HomePageTitle = driver.getTitle();
		//parent.appendChild(test);
		// Thread.sleep(2000);
		if (!HomePageTitle.equals("Login")) { // Check the Page title if we are reach at home page or not.

			int ii = 0;
			while (ii < 1) {
				Thread.sleep(1000);
				if (notificationDialogCloseBtn.isDisplayed()) {
					notificationDialogCloseBtn.click();
				} else {
					ii = 1;
				}
			}
			String CasePermision = DpModulePermission.getRow(9).getCell(1).getStringCellValue();
			if (CasePermision.equals("YES")) {
				// System.out.println("Service Preferences Tab is Yes ");

				try {
//					    String CaseManagementTab = OrCaseManagement_tab.getRow(1).getCell(3).getStringCellValue();
					wait.until(ExpectedConditions.elementToBeClickable(CaseManagementTab));
					CaseManagementTab.click();
					ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Case management tab visible");
					System.out.println("clicked on case management");
				} catch (Exception e) {
					//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error : Case management tab is not visible");
					System.out.println("case mangement tab not found");
					//CaptureScreen(driver);
				}
			}
		}
		//report.endTest(parent);
	}

	public void handlingAlert() throws InterruptedException, IOException {
		try {
			org.openqa.selenium.Alert popup = driver.switchTo().alert();
			// here you can examine the text within the alert using popup.getText();
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println(alertMessage);
			Thread.sleep(1000);
			popup.accept();
			Thread.sleep(1000);
//			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Alert Handled succesfully");
			System.out.println("Alert handled succesfully");
		} catch (Exception e) {
//			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Alert not found");
			System.out.println("Alert not found");
		}
	}

	public void createCase() throws Exception {
		clickAddCase();
		selectPharmacyStore();
		selectTherapeutic();
		selectRxProcessing();
		selectCarePlan();
		selectNewRx();
		clickCreateCase();
	}

	public void clickOnCase() throws Exception {

//		String CaseIDHTML = OrCaseManagement_tab.getRow(11).getCell(3).getStringCellValue();
		System.out.println("entered into clickOnCase");
		Thread.sleep(1000);

		List<WebElement> CaseIds = driver.findElements(By.xpath("//*[@id=\"listCaseHistory\"]/tbody/tr/td[1]/a"));

		for (WebElement CaseId : CaseIds) {
//        	String GetCase = CaseId.getText();
//        	System.out.println(CaseId.getText());
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CaseId.getLocation().y + ")");
			if (CaseId.getText().contains("572389")) {
				System.out.println("entered into if block");
				try {
					wait.until(ExpectedConditions.visibilityOf(CaseId));
					CaseId.click();
//        			org.openqa.selenium.Alert popup = driver.switchTo().alert();
					Thread.sleep(1000);
//        			popup.accept();
					driver.findElement(By.id("startCase")).click();
					ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Found existing case with CaseID as ");
					System.out.println("clicked on existing case");
				} catch (Exception e) {
					//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error : Unable to Find existing case with CaseID as ");
					System.out.println(" Case not found");
					CaptureScreen(driver);
				}
			}
//        	else {
//        		break;
//        	}
		}
	}

	public void clickHistory() throws Exception {
		Thread.sleep(1000);
//		String HistoryHTML = OrCaseManagement_tab.getRow(9).getCell(3).getStringCellValue();
		try {
//			WebElement History = driver.findElement(By.xpath("//*[@class=\"seleCaseHistory\"]"));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + History.getLocation().y + ")");
			History.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "History tab visible");
			System.out.println("clicked on history tab");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error : Unable to find History tab visible");
			System.out.println("History tab not found");
			CaptureScreen(driver);
		}
	}

	public void clickCreateCase() throws IOException, InterruptedException {

//		String CreateCaseHTML = OrCaseManagement_tab.getRow(10).getCell(3).getStringCellValue();
		AddCase.click();
//		WebElement accept= driver.findElement(By.xpath("//*[@id=\'sametccareplandialog\']/div/div/div[3]/button[1]"));
//		wait.until(ExpectedConditions.visibilityOf(accept));
		Thread.sleep(1000);
//		WebElement accept= driver.findElement(By.name("continueCreateCase"));
		try {
			if (accept.isDisplayed()) {
				accept.click();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Case Added Duplicate");
				System.out.println("Added Duplicate case");
				// //*[@id='sametccareplandialog']/div/div/div[3]/a
				// //*[@id='sametccareplandialog']/div/div/div[3]/button[2]
			} else {
			}
		} catch (Exception e) {
			// TODO: handle exceptions
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error while adding new case");
			System.out.println("Added new Case");
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error : History tab is not visible");
		}
	}

	public void clickAddCase() {
//		String AddCaseHTML = OrCaseManagement_tab.getRow(2).getCell(3).getStringCellValue();
//		WebElement Addcase = driver.findElement(By.xpath("/html/body/section/section[2]/a"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Addcase.getLocation().y + ")");
		Addcase.click();
	}

	// ======================================== CREATE CASE
	// ================================================================================

	public void selectPharmacyStore() throws InterruptedException {
		Thread.sleep(1000);
//		String PharmacyStoreHTML = OrCaseManagement_tab.getRow(3).getCell(3).getStringCellValue();
//		String PharmacyStore = DpCaseManagement_tab.getRow(1).getCell(0).getStringCellValue();
		wait.until(ExpectedConditions.visibilityOf(pharmacyStore));
		Select pharmacyStores = new Select(pharmacyStore);
		pharmacyStores.selectByVisibleText("KS2STORE49 *");

	}

	public void selectTherapeutic() throws InterruptedException {
		Thread.sleep(1000);
//		String TherapeuticHTML = OrCaseManagement_tab.getRow(4).getCell(3).getStringCellValue();
//		String Therapeutic = DpCaseManagement_tab.getRow(1).getCell(1).getStringCellValue();
		wait.until(ExpectedConditions.visibilityOf(therapeuticProgram));
		Select therapeuticPrograms = new Select(therapeuticProgram);
		therapeuticPrograms.selectByVisibleText("Crohn's Disease");
	}

	public void selectRxProcessing() throws InterruptedException {
		Thread.sleep(1000);
//		String RxProcessingHTML = OrCaseManagement_tab.getRow(5).getCell(3).getStringCellValue();
		wait.until(ExpectedConditions.elementToBeClickable(RxProcessing));
		RxProcessing.click();
	}

	public void selectCarePlan() throws InterruptedException {
		Thread.sleep(1000);
//		String CareplanHTML = OrCaseManagement_tab.getRow(6).getCell(3).getStringCellValue();
//		String Careplan = DpCaseManagement_tab.getRow(1).getCell(2).getStringCellValue();
		wait.until(ExpectedConditions.visibilityOf(CarePlan));
		Select selectCarePlans = new Select(CarePlan);
		selectCarePlans.selectByVisibleText("Crohn's Disease");
	}

	public void selectNewRx() {
//		String NewRxHTML = OrCaseManagement_tab.getRow(7).getCell(3).getStringCellValue();
		NewRx.click();
	}

	public void find_CaseId() {
		try {
//		String CaseIDHTML = OrCaseManagement_tab.getRow(11).getCell(3).getStringCellValue();
//		String CaseId = driver.findElement(By.xpath("//*[@id=\"caseIdInBanner\"]")).getText();
		System.out.println(CaseId);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "CaseID found with ID as-" + CaseId);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "CaseID not found with ID as-" + CaseId);
		}
	}

	public void clickIntake() throws IOException {
//		test = report.createTest("Pre-BI");
		// Check for Pre Bi permission
//		String PreBiPermision = DpModulePermission.getRow(15).getCell(1).getStringCellValue();
		
//			String IntakeWorkflowHTML = OrCaseManagement_tab.getRow(12).getCell(3).getStringCellValue();
			try {
//				wait.until(ExpectedConditions.elementToBeClickable(IntakeWorkflowElement));
				Thread.sleep(1000);
				WebElement IntakeWorkflowElement = driver.findElement(By.xpath("//*[@class='main_wrap']/div/ul/li[1]/a"));
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + IntakeWorkflowElement.getLocation().y + ")");
				IntakeWorkflowElement.click();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Successfully clicked on Intake Workflow");
				System.out.println("Clicked Intake");

			} catch (Exception e) {
				//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Intake tab not found");
				System.out.println("Intake tab not found");
				CaptureScreen(driver);
			}
		
	}

	public void clickPreBiAdjudication() throws InterruptedException {
		// click on complete radio button
//		Thread.sleep(1000);
//		WebElement completeButton = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4/span/span[1]/input[2]"));
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + completeButton.getLocation().y + ")");
//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.elementToBeSelected(completeButton));
//		completeButton.click();
		Thread.sleep(1000);
//		WebElement PreBIIntakeActivity = driver.findElement(By.partialLinkText("Pre-BI Adjudication"));
		PreBIIntakeActivity.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked On Pre-BI Adjudicatoin Activity");
		
		Thread.sleep(1000);
		try {
//			WebElement preBiAdjIIButton =driver.findElement(
//					By.xpath("//*[@id=\"activityPre-BI Adjudication\"]/div/div[1]/div[2]/div/div[2]/div[3]/div[1]/div[1]"));
			preBiAdjIIButton.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Pre-BI Adjudication Section clicked Successfully");
			System.out.println("PreBiAdjudicatoin button clicked");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error to Click on Pre-BI Adjudication Section");
			System.out.println("PreBiAdjudicatoin button not clicked");
		}
	}

	public void clickSaveButton() throws InterruptedException {
		try {
			
//		driver.findElement(By.id("statusTrue")).click();
		Thread.sleep(1000);
//		WebElement SaveAll = driver.findElement(By.xpath("//*[@id=\"saveButton-141026\"]/a"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAll.getLocation().y + ")");
		SaveAll.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Pre-BI Added Successfully");
		Thread.sleep(1000);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error while Adding Pre-BI");

		}
		
//		To Handle the Pop UP if any come after Saving PreBI
		try {
			popUp.click();
		} catch (Exception e) {
			System.out.println("Permission alert not found");
		}
//		To Handle the Alert if any come after Saving PreBI
		try {
			org.openqa.selenium.Alert popup = driver.switchTo().alert();
			
			Thread.sleep(1000);
			popup.accept();
			System.out.println("Patient alert handled");
		} catch (Exception e) {
			System.out.println("Patient alert not found");
		}
		
//		To Check that the Message Pop up is showing or not after saving Pre BI
		try {
			
			ensurePopUp.click();
			System.out.println("Ensure message handelled successfully");
			Thread.sleep(1000);
			// case banner pop up


			wait.until(ExpectedConditions.elementToBeClickable(caseBannerPopup)).click();


		} catch (Exception e) {
			System.out.println("Ensure message not found");
		}
//		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Pre-BI Added");
	}

	public void selectPrimaryInsurance(String PIName) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("--------------IN Select Insurance method");
		/*
		 * Thread.sleep(1000); // String PrimaryInsurance =
		 * OrCaseManagement_tab.getRow(111).getCell(3).getStringCellValue(); Select
		 * PrimaryInsuranceNames = new Select(PrimaryInsuranceName); String PIName =
		 * DpPayor_tab.getRow(25).getCell(3).getStringCellValue();
		 * PrimaryInsuranceNames.selectByVisibleText(PIName);
		 * System.out.println("Primary Insurance Name - " + PIName);
		 */

//		Thread.sleep(2000);
		preBiPrimaryDdl.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement preBiPrimarySearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));

		preBiPrimarySearchHTML.clear();
		preBiPrimarySearchHTML.sendKeys(PIName);
		preBiPrimarySearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Primary Insurance - " + PIName);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Primary Insurance - " + PIName);
		}
	}

	public void selectInitialclaimAdj1() throws InterruptedException {
		try {
			
		Thread.sleep(1000);
//		String ClaimSuccessfullyYes = OrCaseManagement_tab.getRow(117).getCell(3).getStringCellValue();
		Thread.sleep(1000);
//		WebElement yes= driver.findElement(By.id("prescriptionBIActivityList[0].primaryInitialClaimYes"));
//		WebElement yes= driver.findElement(By.xpath(ClaimSuccessfullyYes));
		wait.until(ExpectedConditions.elementToBeClickable(priNo)).click();
		
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Initial Claim Adjudicated Successfully? - NO");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error while Initializing Claim Adjudicated");
		}
	}

	public void selectPARequired() throws InterruptedException {
		try {
			
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(PARequiredYes)).click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Prior Authorization Required? - YES");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error while requesting Prior Authorization");
		}
	}

	public void enterPrimaryBilled(String PrimaryBilledAmount) throws InterruptedException {
		try {
		Thread.sleep(1000);
		PriBilled.sendKeys(PrimaryBilledAmount);	
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Added Primary Billed Amount - " + PrimaryBilledAmount);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Adding Primary Billed Amount - " + PrimaryBilledAmount);
		}
	}

	public void clickOutSide() throws InterruptedException {
		Thread.sleep(3000);
		// Click on Secondary Insurance Section
//		WebElement outsideclick = driver
//				.findElement(By.xpath("//*[@id=\"activityPre-BI Adjudication_0\"]/fieldset[1]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + outsideclick.getLocation().y + ")");
		outsideclick.click();

	}

	public void locatPAPsection() throws InterruptedException {

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickPAPSetion.getLocation().y + ")");
		ClickPAPSetion.click();

	}

	public void locatPAPFoundationsection() throws InterruptedException {

		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + ClickPAPFoundationSetion.getLocation().y + ")");
		ClickPAPFoundationSetion.click();

	}

	/*
	 * public void selectSecondaryInsurance() throws InterruptedException {
	 * Thread.sleep(1000); // String SecIns =
	 * OrCaseManagement_tab.getRow(120).getCell(3).getStringCellValue(); Select
	 * SecondaryInsuranceNames = new Select(SecondaryInsuranceName);
	 * ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + driver
	 * .findElement(By.id(
	 * "select2-prescriptionBIActivityList0secondaryInsurance-container")).
	 * getLocation().y + ")"); String SecInsName =
	 * DpPayor_tab.getRow(26).getCell(3).getStringCellValue();
	 * SecondaryInsuranceNames.selectByVisibleText(SecInsName);
	 * System.out.println("Secondary Insurance Name - " + SecInsName); }
	 */

	public void selectSecInsurance(String SIName) throws InterruptedException {
		
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + preBiSecDdl.getLocation().y + ")");
		
		/*
		 * Thread.sleep(1000); // String PrimaryInsurance =
		 * OrCaseManagement_tab.getRow(111).getCell(3).getStringCellValue(); Select
		 * PrimaryInsuranceNames = new Select(PrimaryInsuranceName); String PIName =
		 * DpPayor_tab.getRow(25).getCell(3).getStringCellValue();
		 * PrimaryInsuranceNames.selectByVisibleText(PIName);
		 * System.out.println("Primary Insurance Name - " + PIName);
		 */

//		Thread.sleep(2000);
		preBiSecDdl.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement preBiSecSearchHTML = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));

		preBiSecSearchHTML.clear();
		preBiSecSearchHTML.sendKeys(SIName);
		preBiSecSearchHTML.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Secondary Insurance - " + SIName);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Secondary Insurance - " + SIName);
		}
	}
	
	
	
	public void selectSecInitialClaimAdj() throws InterruptedException {
		try {
			
//		String SecClaimClaimSuccessfullyYes = OrCaseManagement_tab.getRow(124).getCell(3).getStringCellValue();
//		WebElement secYes = driver.findElement(By.id("prescriptionBIActivityList[0].secondaryInitialClaimYes"));
//		WebElement yes = driver.findElement(By.xpath(SecClaimClaimSuccessfullyYes));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + secYes.getLocation().y + ")");
		Thread.sleep(1000);
		secYes.click();
		Thread.sleep(1000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Secondary - Initial Claim Adjudicated Successfully? - YES");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error : Secondary - Initial Claim Adjudication");
		}
	}

//	public void selectSecPriorAutho() {
//		Thread.sleep(2000);
//		String SecPARequiredYes = OrCaseManagement_tab.getRow(122).getCell(3).getStringCellValue();
//		driver.findElement(By.xpath(SecPARequiredYes)).click();
//		Thread.sleep(1000);
//
//	}

	public void enterSecondaryBilled(String SecondaryBilledAmount) throws InterruptedException {
		try {
			
//		String SecBilled = OrCaseManagement_tab.getRow(123).getCell(3).getStringCellValue();
//		WebElement SecBilledHTML = driver.findElement(By.xpath("//*[@id=\"prescriptionBIActivityList[0].secondaryBilledAmount\"]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SecBilledHTML.getLocation().y + ")");
		Thread.sleep(1000);
		SecBilledHTML.clear();
		SecBilledHTML.sendKeys(SecondaryBilledAmount);
		Thread.sleep(1000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Added Secondary Billed Amount - " + SecondaryBilledAmount);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Adding Secondary Billed Amount - " + SecondaryBilledAmount);
		}
	}

	public void selectNAforCopay() throws InterruptedException {

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickPAP.getLocation().y + ")");
		ClickPAP.click();
		Thread.sleep(2000);
		PAPCopay.click();
		
	}

	public void selectNAforFoundation() throws InterruptedException {

		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + ClickFoundationNAcheckbox.getLocation().y + ")");
		ClickFoundationNAcheckbox.click();
		Thread.sleep(1000);
		driver.findElement(By.id("statusTrue")).click();
		Thread.sleep(1000);
	}
	
	public void selectNAforCopayandFoundation() throws InterruptedException {
		try {
			
		Thread.sleep(2000);
		WebElement ClickPAP = driver.findElement(By.xpath("//*[@id=\"activityPre-BI Adjudication_0\"]/div[6]/div"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickPAP.getLocation().y + ")");
		ClickPAP.click();

		Thread.sleep(2000);

		WebElement PAPCcopay = driver
				.findElement(By.xpath("//*[@id=\"activityPre-BI Adjudication_0\"]/fieldset[2]/legend/div/label"));
		PAPCcopay.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Checked " + "<b>" + "NA" + "</b>" + " for Copay");
		// Click on Foundation section
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/section/form/div/div[2]/div[2]/div[1]/div[4]/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[3]/div/div/fieldset[3]/legend/div/input"))
				.click();

		Thread.sleep(2000);

		WebElement PAPFcopay = driver
				.findElement(By.xpath("//*[@id=\"activityPre-BI Adjudication_0\"]/fieldset[3]/legend/div"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PAPFcopay.getLocation().y + ")");
		PAPFcopay.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Checked " + "<b>" + "NA" + "</b>"+" for Foundation");
		Thread.sleep(1000);

		driver.findElement(By.id("statusTrue")).click();
		Thread.sleep(1000);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error while Checking " + "<b>" + "NA" + "</b>"+" for Foundation");
		}
	}
	
	
	
	
	public void selectCopayCard() throws InterruptedException {
		Thread.sleep(1000);
//		WebElement ClickPAP = driver.findElement(By.xpath("//*[@id=\"activityPre-BI Adjudication_0\"]/div[6]/div"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickPAP.getLocation().y + ")");
		ClickPAP.click();
		Thread.sleep(1000);
//		String PAPCoPayNA = OrCaseManagement_tab.getRow(120).getCell(3).getStringCellValue();
//		WebElement PAPCoPayCard = driver.findElement(By.id("prescriptionBIActivityList[0].copayCard"));
		String CopayInsName = DpPayor_tab.getRow(27).getCell(3).getStringCellValue();

		Select PAPCoPayCards = new Select(PAPCoPayCard);
		PAPCoPayCards.selectByVisibleText(CopayInsName);
		System.out.println("Secondary Insurance Name - " + CopayInsName);
	}

	public void selectCopayInitialClaim() throws Exception {
//		WebElement copayClaim = driver.findElement(By.xpath("//*[@id=\"copayInsRow0\"]/div[2]/div/div[1]/label/input"));
//		wait.until(ExpectedConditions.elementToBeClickable(copayClaim));
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + copayClaim.getLocation().y + ")");
		Thread.sleep(1000);
		copayClaim.click();
	}

	public void enterCopayBilled() throws Exception {
		WebElement copayBilled = driver.findElement(By.id("prescriptionBIActivityList[0].copaySupportBenefit"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + copayBilled.getLocation().y + ")");
		Thread.sleep(1000);
		copayBilled.sendKeys("6000");
		;
	}

	public void selectFoundationSupport() throws InterruptedException {
		Thread.sleep(1000);
//		String foundIns = OrCaseManagement_tab.getRow(248).getCell(3).getStringCellValue();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + foundSupportName.getLocation().y + ")");
		Select foundSupportNames = new Select(foundSupportName);
		String FoundInsName = DpPayor_tab.getRow(28).getCell(3).getStringCellValue();
		foundSupportNames.selectByVisibleText(FoundInsName);
		System.out.println("Secondary Insurance Name - " + FoundInsName);

	}

	public void selectFoundationInitialClaim() throws InterruptedException {
		Thread.sleep(1000);
//		String foundClaimHTML = OrCaseManagement_tab.getRow(249).getCell(3).getStringCellValue();
//		WebElement foundClaim = driver.findElement(By.xpath("//div[@id=\"foundationInsRow0\"]/div[2]/div[1]/div[1]/label/input"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + foundClaim.getLocation().y + ")");
		foundClaim.click();
	}

	public void enterFoundationBilled() {
//		String foundBilledHTML = OrCaseManagement_tab.getRow(250).getCell(3).getStringCellValue();
//		WebElement foundBill = driver.findElement(By.xpath("//*[@id=\"prescriptionBIActivityList[0].foundationSupportBenefit\"]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + foundBill.getLocation().y + ")");
		foundBill.sendKeys("2000");
	}

	public void passFailStatus() {
		try {
//			WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"workflowScreen\"]/ul/li"));
			wait.until(ExpectedConditions.elementToBeClickable(errorMessage));
			if (errorMessage.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + errorMessage.getLocation().y + ")");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, CaptureScreen(driver));
				System.out.println("Need to fill other details");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
 
		} catch (Exception e) {
//			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "PreBI addeded Sucessfully");
			System.out.println("PreBI added successfully");
		}
	}
}
