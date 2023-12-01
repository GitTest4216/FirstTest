package dataPackage;

import java.io.IOException;
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

public class AddPrescriptionData extends Base<Object> {
	protected WebDriverWait wait = new WebDriverWait(driver, 30);

	@FindBy(how = How.XPATH, using = "//*[@id=\"pharmacyRxRecMethod\"]")
	protected WebElement ReveiveMethodHTML;

	@FindBy(how = How.XPATH, using = "//input[@id='pharmacyRxRecDate']")
	protected static WebElement ReceivedDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"rxNeedbyDate\"]")
	protected static WebElement RxNeedbyDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"rxDrugType\"]")
	protected static WebElement RxDrugTypeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"addPrescribedDrug\"]")
	protected static WebElement PrescriberdruglinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchNDC\"]")
	protected static WebElement NDCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"drugDialogSearchBtn\"]")
	protected static WebElement SearchDrugHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"drugCheckbox\"]")
	protected static WebElement drugradioHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescribedQty\"]")
	protected static WebElement PrescribedQuantityHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"forRefillPyRxNumber\"]")
	protected static WebElement PHRxNumberHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"daySupply\"]")
	protected static WebElement DaySupplyHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"doseDirections\"]")
	protected static WebElement DirectionsHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriptionRefill\"]")
	protected static WebElement RefillsHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriberAdd\"]/a")
	protected static WebElement AddPrescriberlinkHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriberId0\"]")
	protected static WebElement FirstPrescriberonlistHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"show-prescriberOrganization-dialog\"]/div/div/div[3]/button[1]")
	protected static WebElement SaveddressPopupHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"rxTherapyType\"]")
	protected static WebElement RxTypeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"status\"]")
	protected static WebElement RxStatusHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"statusReason\"]")
	protected static WebElement RxReasonHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected static WebElement SaveHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"dispensedQty\"]")
	protected static WebElement DispensedQuantityHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"fillNumber\"]")
	protected static WebElement FillNumberHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"pharmacyStore\"]")
	protected static WebElement PharmacyStoretHTML;

	String ReceiveMethod = DpCaseManagement_tab.getRow(1).getCell(3).getStringCellValue();
	String RxNeedbydate = DpCaseManagement_tab.getRow(1).getCell(5).getStringCellValue();
	String ReceivedDate = DpCaseManagement_tab.getRow(1).getCell(4).getStringCellValue();
	int PrescribedQuantityint = (int) DpCaseManagement_tab.getRow(1).getCell(8).getNumericCellValue();
	String NDC = DpCaseManagement_tab.getRow(1).getCell(18).getStringCellValue();
	int DispensedQuantityint = (int) DpCaseManagement_tab.getRow(1).getCell(9).getNumericCellValue();
	int DaySupplyint = (int) DpCaseManagement_tab.getRow(1).getCell(11).getNumericCellValue();
	int Refillint = (int) DpCaseManagement_tab.getRow(1).getCell(13).getNumericCellValue();
	int Fillnumberint = (int) DpCaseManagement_tab.getRow(1).getCell(14).getNumericCellValue();
	String PHRxNumber = DpCaseManagement_tab.getRow(1).getCell(10).getStringCellValue();
	String Direction = DpCaseManagement_tab.getRow(1).getCell(12).getStringCellValue();
	String RxType = DpCaseManagement_tab.getRow(1).getCell(15).getStringCellValue();
	String RxStatus = DpCaseManagement_tab.getRow(1).getCell(16).getStringCellValue();
	String RxReason = DpCaseManagement_tab.getRow(1).getCell(17).getStringCellValue();

	public void PrescriptionInatke() throws InterruptedException, IOException {
		try {
			WebElement IntakeWorkflowElement = driver.findElement(By.className("seleCaseLeftMenuIntake"));
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + IntakeWorkflowElement.getLocation().y + ")");
			IntakeWorkflowElement.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Intake Workflow");
			// test.log(LogStatus.PASS, "Clicked on Intake Workflow");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on Intake Workflow");
		}
	}

	public void PrescriptionIntakeActivity() throws InterruptedException, IOException {
		try {
			WebElement PrescriptionIntakeActivity = driver.findElement(By.linkText("Prescription Intake"));
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + PrescriptionIntakeActivity.getLocation().y + ")");
			PrescriptionIntakeActivity.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Prescription Intake Activity");
			// test.log(LogStatus.PASS, "Clicked on Prescription Intake Activity");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,//"Error occurred while Clicking on Prescription Intake Activity");
		}
	}

	public void AddNewPrescriptionLink() throws InterruptedException, IOException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Add Prescription")));
			WebElement AddprescriptionLinkElement = driver.findElement(By.partialLinkText("Add Prescription"));
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + AddprescriptionLinkElement.getLocation().y + ")");
			AddprescriptionLinkElement.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Add Prescription Link");
			// test.log(LogStatus.PASS, "Clicked on Add Prescription Link");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Clicking on Add Prescription Link");
		}
	}

	public void AddRxMethod() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ReveiveMethodHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select ReceivedMethod = new Select(ReveiveMethodHTML);
			ReceivedMethod.selectByVisibleText(ReceiveMethod);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Received Method - " + ReceiveMethod);
			// test.log(LogStatus.PASS, "Selected Received Method - " + ReceiveMethod);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Selecting Received Method - " + ReceiveMethod);
		}

	}

	public void AddReceiveDate() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ReceivedDateHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			ReceivedDateHTML.click();
			Thread.sleep(2000);
			ReceivedDateHTML.sendKeys(ReceivedDate);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Received Date - " + ReceivedDate);
			// test.log(LogStatus.PASS, "Entered Received Date - " + ReceivedDate);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Receiving Date - " + ReceivedDate);
		}
	}

	public void RxNeedDate() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RxNeedbyDateHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RxNeedbyDateHTML.click();
			Thread.sleep(2000);
			RxNeedbyDateHTML.sendKeys(RxNeedbydate);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Rx Need by Date - " + RxNeedbydate);
			// test.log(LogStatus.PASS, "Entered Rx Need by Date - " + RxNeedbydate);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Entering Rx Need by Date - " + RxNeedbydate);
		}
	}

	public void AddDrugType() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RxDrugTypeHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select rxDrugTypeelement = new Select(RxDrugTypeHTML);
			rxDrugTypeelement.selectByValue("SPECIALTY");
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Rx Drug Type - Specialty");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Selecting Rx Drug Type - Specialty");
		}

	}

	public void AddPrescriberdrug() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + PrescriberdruglinkHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PrescriberdruglinkHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Prescribed Drug Link");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Clicking on Prescribed Drug Link");
		}
	}

	public void AddNDC() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + NDCHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			NDCHTML.click();
			Thread.sleep(2000);
			NDCHTML.sendKeys(NDC);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered NDC - " + NDC);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Entering NDC - " + NDC);
		}
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SearchDrugHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SearchDrugHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Search button");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on Search button");
		}
		try {
			Thread.sleep(2000);

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + drugradioHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			drugradioHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected first drug from list");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Selecting first drug from list");
		}

	}

	public void AddDrugDetails() throws InterruptedException, IOException {
		String PrescribedQuantity = String.valueOf(PrescribedQuantityint);
		String DispensedQuantity = String.valueOf(DispensedQuantityint);
		String DaySupply = String.valueOf(DaySupplyint);
		String Refill = String.valueOf(Refillint);
		String FillNumber = String.valueOf(Fillnumberint);
		try {
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + PrescribedQuantityHTML.getLocation().y + ")");
			PrescribedQuantityHTML.sendKeys(PrescribedQuantity);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Entered Prescribed Quantity - " + PrescribedQuantity);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Entering Prescribed Quantity - " + PrescribedQuantity);
		}

		try {
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + DispensedQuantityHTML.getLocation().y + ")");
			DispensedQuantityHTML.sendKeys(DispensedQuantity);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Entered Dispensed Quantity - " + DispensedQuantity);
//		test.log(LogStatus.PASS, "Entered Dispensed Quantity - " + DispensedQuantity);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Entering Dispensed Quantity - " + DispensedQuantity);
		}

		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PHRxNumberHTML.getLocation().y + ")");
			PHRxNumberHTML.sendKeys(PHRxNumber);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered PH Rx Number - " + PHRxNumber);
			// test.log(LogStatus.PASS, "Entered PH Rx Number - " + PHRxNumber);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Entering PH Rx Number - " + PHRxNumber);
		}

		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DaySupplyHTML.getLocation().y + ")");
			DaySupplyHTML.sendKeys(DaySupply);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Day Supply - " + DaySupply);
			// test.log(LogStatus.PASS, "Entered Day Supply - " + DaySupply);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Entering Day Supply - " + DaySupply);
		}

		Thread.sleep(2000);
		try {

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DirectionsHTML.getLocation().y + ")");
			DirectionsHTML.sendKeys(Direction);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Directions - " + Direction);
			// test.log(LogStatus.PASS, "Entered Directions - " + Direction);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Entering Directions - " + Direction);
		}

		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RefillsHTML.getLocation().y + ")");
			RefillsHTML.sendKeys(Refill);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Refills - " + Refill);
			// test.log(LogStatus.PASS, "Entered Refills - " + Refill);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Entering Refills - " + Refill);
		}

		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + FillNumberHTML.getLocation().y + ")");
			FillNumberHTML.sendKeys(FillNumber);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Fill Number - " + FillNumber);
			// test.log(LogStatus.PASS, "Entered Fill Number - " + FillNumber);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Entering Fill Number - " + FillNumber);
		}
	}

	public void AddPrescriber() throws InterruptedException, IOException {
		try {

			// Scroll the browser to the element's Y position

			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + AddPrescriberlinkHTML.getLocation().y + ")");

			// Click the element

			AddPrescriberlinkHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Add Prescriber Link");
			// test.log(LogStatus.PASS, "Clicked on Add Prescriber Link");
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on Add Prescriber Link");
		}

		String PreWindowHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}

		Thread.sleep(2000);
		try {
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + FirstPrescriberonlistHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			FirstPrescriberonlistHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected first Prescriber from the list");
			// test.log(LogStatus.PASS, "Selected first Prescriber from the list");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting first Prescriber from the list");

		}
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveddressPopupHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SaveddressPopupHTML.click();
		Thread.sleep(2000);

		driver.switchTo().window(PreWindowHandle);
			Thread.sleep(2000);
	
	}

	public void AddRxType() throws InterruptedException, IOException {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RxTypeHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select rxTherapyTypeelement = new Select(RxTypeHTML);
			rxTherapyTypeelement.selectByVisibleText(RxType);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Rx Type - " + RxType);
			// test.log(LogStatus.PASS, "Selected Rx Type - " + RxType);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Rx Type - " + RxType);
		}
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RxStatusHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select statuselement = new Select(RxStatusHTML);
			statuselement.selectByVisibleText(RxStatus);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Rx Status - " + RxStatus);
			// test.log(LogStatus.PASS, "Selected Rx Status - " + RxStatus);
			Thread.sleep(2000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Rx Status - " + RxStatus);
		}
		try {

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RxReasonHTML.getLocation().y + ")");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select statusReason = new Select(RxReasonHTML);
			statusReason.selectByVisibleText(RxReason);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Rx Reason - " + RxReason);
			// test.log(LogStatus.PASS, "Selected Rx Reason - " + RxReason);
			Thread.sleep(2000);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Rx Reason - " + RxReason);
		}
	}

	public void SaveNewPrescription() throws InterruptedException, IOException

	{

//		driver.manage().window().maximize();

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SaveHTML.click();

	}

}