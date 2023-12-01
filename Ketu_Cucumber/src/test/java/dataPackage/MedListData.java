package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import testPackage.Base;

public class MedListData extends Base{

	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[4]/div/ul/li[5]/a")
	protected WebElement ClinicalProfileMedListTabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='select2-medicationType-container']")
	protected WebElement TypeHTML;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement TypeSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicationOther']")
	protected WebElement otherTypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicationName']")
	protected WebElement medicationNameHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='strengthfield']")
	protected WebElement strengthHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='select2-strengthUnitId-container']")
	protected WebElement StrengthUnitHTML;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement StrengthUnitSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='dosage']")
	protected WebElement dosageQuantityHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='select2-dosageUnitId-container']")
	protected WebElement dosageUnitHTML;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement dosageUnitSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='howOftenTaken']")
	protected WebElement frequencyHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='select2-howTaken-container']")
	protected WebElement ROAHTML;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement ROASearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reasonForTaking']")
	protected WebElement RFUHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='select2-madStatus-container']")
	protected WebElement StatusHTML;
	
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement StatusSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='startDate']")
	protected WebElement StartDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='endDate']")
	protected WebElement EndDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicationNotes']")
	protected WebElement NoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicationSave']")
	protected WebElement MedListAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='medicationCancel']")
	protected WebElement MedListCancelHTML;
	
	public void medListTabClick() {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileMedListTabHTML.getLocation().y + ")");
		ClinicalProfileMedListTabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on clinical profile MedList tab");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on clinical profile MedList tab");
		}
	}
	
	public void typeSearchClick(String Type) throws InterruptedException {
		String otherTypeValue = DpClinicalProfile.getRow(62).getCell(2).getStringCellValue();
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TypeHTML.getLocation().y + ")");
		TypeHTML.click();
		TypeSearchHTML.click();
		TypeSearchHTML.clear();
		TypeSearchHTML.sendKeys(Type);
		WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id=\'select2-medicationType-results\']")),Type);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected type - " +Type);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting  type - " +Type);
		}
		try {
			
		if(Type.equalsIgnoreCase("Other")) {
			
			otherTypeHTML.click();
			otherTypeHTML.clear();
			otherTypeHTML.sendKeys(otherTypeValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered other type - " +otherTypeValue);
		}
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering other type - " + otherTypeValue);
		}
	}
	
	public void medicationNameClick(String medicationNameValue) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + medicationNameHTML.getLocation().y + ")");
		medicationNameHTML.click();
		medicationNameHTML.clear();
		medicationNameHTML.sendKeys(medicationNameValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered medication name - " +medicationNameValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering medication name - " +medicationNameValue);
		}
	}
	
	public void strengthClick(String strengthValue) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + strengthHTML.getLocation().y + ")");
		strengthHTML.click();
		strengthHTML.clear();
		strengthHTML.sendKeys(strengthValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered strength - " +strengthValue);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering strength - " +strengthValue);
		}
	}
	
	public void strengthUnitClick(String strengthUnit) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + StrengthUnitHTML.getLocation().y + ")");
		StrengthUnitHTML.click();
		StrengthUnitSearchHTML.click();
		StrengthUnitSearchHTML.clear();
		StrengthUnitSearchHTML.sendKeys(strengthUnit);
		WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id=\'select2-strengthUnitId-results\']")),strengthUnit);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected strength unit - " +strengthUnit);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting strength unit - " +strengthUnit);
		}
	}
	
	public void dosageQuantityClick(String dosageQuantityValue) {
		
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + dosageQuantityHTML.getLocation().y + ")");
		dosageQuantityHTML.click();
		dosageQuantityHTML.clear();
		dosageQuantityHTML.sendKeys(dosageQuantityValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered dosage quantity - " +dosageQuantityValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering dosage quantity - " +dosageQuantityValue);
		}
	}
	
	public void dosageUnitClick(String dosageUnit) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + dosageUnitHTML.getLocation().y + ")");
		dosageUnitHTML.click();
		dosageUnitSearchHTML.click();
		dosageUnitSearchHTML.clear();
		dosageUnitSearchHTML.sendKeys(dosageUnit);
		WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id='select2-dosageUnitId-results']")),dosageUnit);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected dosage unit - " +dosageUnit);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting dosage unit - " +dosageUnit);
		}
	}
	
	public void frequencyClick(String frequencyValue) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + frequencyHTML.getLocation().y + ")");
		frequencyHTML.click();
		frequencyHTML.clear();
		frequencyHTML.sendKeys(frequencyValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered frequency - " +frequencyValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering frequency - " +frequencyValue);

		}
	}
	
	public void ROAClick(String ROA) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ROAHTML.getLocation().y + ")");
		ROAHTML.click();
		ROASearchHTML.click();
		ROASearchHTML.clear();
		ROASearchHTML.sendKeys(ROA);
		WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id=\'select2-howTaken-results\']")),ROA);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Route Of Administration - " +ROA);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Route Of Administration - " +ROA);
		}
	}
	
	public void reasonForUseClick(String RFUValue) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RFUHTML.getLocation().y + ")");
		RFUHTML.click();
		RFUHTML.clear();
		RFUHTML.sendKeys(RFUValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered reason for use - " +RFUValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering reason for use - " +RFUValue);
		}
	}
	
	public void statusClick(String Status1) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + StatusHTML.getLocation().y + ")");
		StatusHTML.click();
		StatusSearchHTML.click();
		StatusSearchHTML.clear();
		StatusSearchHTML.sendKeys(Status1);
		WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id=\'select2-madStatus-results\']")),Status1);
		ele.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Status - " +Status1);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting Status - " +Status1);
		}
	}
	
	public void startDateClick(String StartDateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + StartDateHTML.getLocation().y + ")");
		StartDateHTML.clear();
		StartDateHTML.click();
		StartDateHTML.sendKeys(StartDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered start date - " +StartDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering start date - " +StartDateValue);
		}
	}
	
	public void endDateClick(String EndDateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + EndDateHTML.getLocation().y + ")");
		EndDateHTML.clear();
		EndDateHTML.click();
		EndDateHTML.sendKeys(EndDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered end date - " +EndDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering end date - " +EndDateValue);
		}
	}
	
	public void noteClick(String NoteValue) {
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + NoteHTML.getLocation().y + ")");
		NoteHTML.click();
		NoteHTML.clear();
		NoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note - " +NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note - " +NoteValue);
		}
	}
	
	public void medListAddBtnClick() {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedListAddHTML.getLocation().y + ")");
		MedListAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}
	
	static public void successMsg() throws IOException, InterruptedException {
		String success = "Record Saved Successfully";
		Thread.sleep(2000);
		System.out.println(success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		//test.log(LogStatus.PASS, success);
	}
	
	
	public void medListCancelBtnClick() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MedListCancelHTML.getLocation().y + ")");
		MedListCancelHTML.click();
	}
	
	public void medListErrMsg() throws IOException, InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String Error_msg = driver.findElement(By.xpath("//*[@id='medicationSystemError']/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Med List Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
}
