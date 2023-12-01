package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import testPackage.Base;

public class VitalClinicalData extends Base{

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[4]/div/ul/li[2]/a")
	static protected WebElement ClinicalProfileVitalSignstabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='vitalTab']")
	protected WebElement ClinicalProfileVitaltabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='vitalDate']")
	protected WebElement vitalsDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='heightfeet']")
	protected WebElement HeightInFeetHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='heightInches']")
	protected WebElement HeightInInchesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='weight']")
	protected WebElement WeightHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tempratureCelsius\"]")
	protected WebElement TemperatureHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='method']")
	protected WebElement TemperatureMethodHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='pulse']")
	protected WebElement PulseHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='location']")
	protected WebElement PulseLocationHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='SBP']")
	protected WebElement BpHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patientPosition']")
	protected WebElement PatientPositionHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='bpLocation']")
	protected WebElement BpLocationHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='vitalNote']")
	protected WebElement VitalNoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='vitalSave']")
	protected WebElement VitalAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='vitalCancel']")
	protected WebElement VitalCancelHTML;
	
	public void ClinicalProfileVitalSignsTabClick() {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileVitalSignstabHTML.getLocation().y + ")");
		ClinicalProfileVitalSignstabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on clinical profile vital/sings tab");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on clinical profile vital/sings tab");
		}
	}
	
	public void ClinicalProfileVitalTabClick() {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileVitaltabHTML.getLocation().y + ")");
		ClinicalProfileVitaltabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on vital tab");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on vital tab");
		}
	}
	
	public void vitalsTabDateClick(String vitalsDateValue) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + vitalsDateHTML.getLocation().y + ")");
		vitalsDateHTML.click();
		vitalsDateHTML.clear();
		vitalsDateHTML.sendKeys(vitalsDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered date for vitals - " +vitalsDateValue);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering date for vitals - " +vitalsDateValue);
		}
	}
	
	public void vitalsTabDateClear() {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + vitalsDateHTML.getLocation().y + ")");
		vitalsDateHTML.click();
		vitalsDateHTML.clear();		
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Cleared date for vitals.");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clearing date for vitals.");
		}
	}
	
	
	public void vitalsTabHeightInFeetClick(String HeightInFeetValue) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HeightInFeetHTML.click();
		HeightInFeetHTML.clear();
		HeightInFeetHTML.sendKeys(HeightInFeetValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered height(feet) - " +HeightInFeetValue);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering height(feet) - " +HeightInFeetValue);
		}
	}
	
	public void vitalsTabHeightInInchesClick(String HeightInInchesValue) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HeightInInchesHTML.click();
		HeightInInchesHTML.clear();
		HeightInInchesHTML.sendKeys(HeightInInchesValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered height (Inches) - " +HeightInInchesValue);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering height (Inches) - " +HeightInInchesValue);
		}
	}
	
	public void vitalsTabWeightClick(String weightValue) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WeightHTML.click();
		WeightHTML.clear();
		WeightHTML.sendKeys(weightValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered weight - " +weightValue);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering weight - " +weightValue);
		}
	}
	
	public void vitalsTabTemperatureClick(String TemperatureValue) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TemperatureHTML.getLocation().y + ")");
		TemperatureHTML.click();
		TemperatureHTML.clear();
		TemperatureHTML.sendKeys(TemperatureValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered temperature value -" +TemperatureValue);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering temperature value -" +TemperatureValue);
		}
	}
	
	public void vitalsTabTemperatureMethodClick(String TemperatureMethod) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TemperatureMethodHTML.getLocation().y + ")");
		Select temperatureMethodelement = new Select(TemperatureMethodHTML);
		temperatureMethodelement.selectByVisibleText(TemperatureMethod);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected temperature method - " +TemperatureMethod);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Selected temperature method - " +TemperatureMethod);
		}
	}
	
	public void vitalsTabPulseClick(String PulseValue) {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PulseHTML.click();
		PulseHTML.clear();
		PulseHTML.sendKeys(PulseValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered pulse - " +PulseValue);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering pulse - " +PulseValue);
		}
	}
	
	public void vitalsTabPulseLocationClick(String PulseLocation) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PulseLocationHTML.getLocation().y + ")");
		Select pulseLocationelement = new Select(PulseLocationHTML);
		pulseLocationelement.selectByVisibleText(PulseLocation);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected pulse location - " +PulseLocation);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting pulse location - " +PulseLocation);
		}
	}
	
	public void vitalsTabBpClick(String BpValue) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BpHTML.getLocation().y + ")");
		BpHTML.click();
		BpHTML.clear();
		BpHTML.sendKeys(BpValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered bp - " +BpValue);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering bp - " +BpValue);
		}
	}
	
	public void vitalsTabPatientPositionClick(String PatientPosition) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientPositionHTML.getLocation().y + ")");
		Select patientPositionelement = new Select(PatientPositionHTML);
		patientPositionelement.selectByVisibleText(PatientPosition);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected patient position - " +PatientPosition);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting patient position - " +PatientPosition);
		}
	}
	
	public void vitalsTabBpLocationClick(String BpLocation) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BpLocationHTML.getLocation().y + ")");
		Select patientPositionelement = new Select(BpLocationHTML);
		patientPositionelement.selectByVisibleText(BpLocation);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected BP Location - " +BpLocation);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting BP Location - " +BpLocation);
		}
	}
	
	public void vitalsTabNoteClick(String VitalNoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + VitalNoteHTML.getLocation().y + ")");
		VitalNoteHTML.click();
		VitalNoteHTML.clear();
		VitalNoteHTML.sendKeys(VitalNoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered vital note - " +VitalNoteValue);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering vital note - " +VitalNoteValue);
		}
	}
	
	public void vitalsTabAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + VitalAddHTML.getLocation().y + ")");
		VitalAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}
	
	public void vitalsTabCancelClick() {
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + VitalCancelHTML.getLocation().y + ")");
		VitalCancelHTML.click();
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
	
	public void errMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id=\"customVitalMessages\"]")).getText();
		System.out.println();
		System.out.println(Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
}
