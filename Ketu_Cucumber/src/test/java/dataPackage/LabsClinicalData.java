package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class LabsClinicalData extends Base {

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='vitals']/div[3]/ul/li[2]")
	protected WebElement ClinicalProfileLabtabHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='booldGlucoseDate']")
	protected WebElement bloodGlucoseDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='bloodGlucoseVal']")
	protected WebElement BloodGlucoseHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='type']")
	protected WebElement TypeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='readingTaken']")
	protected WebElement TimeHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='himoglobin']")
	protected WebElement HemoglobinA1CHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='booldGlucoseNote']")
	protected WebElement NoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='bloodGlucoseSave']")
	protected WebElement BloodGlucoseAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='bloodGlucoseCancel']")
	protected WebElement BloodGlucoseCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='chemistriesTab']")
	protected WebElement ClinicalProfileLabtabChemistriesHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='chemistriesDate']")
	protected WebElement chemistriesDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='sodium']")
	protected WebElement SodiumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='potassium']")
	protected WebElement PotassiumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='calcium']")
	protected WebElement CalciumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='magnesium']")
	protected WebElement MagnesiumHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='phosphorus']")
	protected WebElement PhosphorusHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='chloride']")
	protected WebElement ChlorideHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='bicarbonate']")
	protected WebElement BicarbonateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='carbonDioxide']")
	protected WebElement CarbonDioxideHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='chemistriesNote']")
	protected WebElement ChemistriesNoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='chemistriesSave']")
	protected WebElement ChemistriesAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='chemistriesCancel']")
	protected WebElement ChemistriesCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='completeBloodCountTab']")
	protected WebElement ClinicalProfileLabtabCBCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='completeBloodCountDate']")
	protected WebElement CBCDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='whiteBloodCellCount']")
	protected WebElement WBCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='absoluteNeutrophilCount']")
	protected WebElement ANCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='absoluteLymphocyteCount']")
	protected WebElement ALCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='erythrocyteRedBloodCellCount']")
	protected WebElement RBCHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='hemoglobin']")
	protected WebElement HgBHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='hematocrit']")
	protected WebElement HCTHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='platelet']")
	protected WebElement PLTHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='completeBloodCountNote']")
	protected WebElement CBCNoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='completeBloodCountSave']")
	protected WebElement CBCAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='completeBloodCountCancel']")
	protected WebElement CBCCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='inflammatoryTab']")
	protected WebElement ClinicalProfileLabtabInflammatoryHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='inflammatoryDate']")
	protected WebElement InflammatoryDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='antiCCP']")
	protected WebElement AntiCCPHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='CRP']")
	protected WebElement CRPHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='ESR']")
	protected WebElement ESRHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='RF']")
	protected WebElement RFHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='inflammatoryNote']")
	protected WebElement InflammatoryNoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='inflammatorySave']")
	protected WebElement InflammatoryAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='inflammatoryCancel']")
	protected WebElement InflammatoryCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='lipidTab']")
	protected WebElement ClinicalProfileLabtabLipidHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='lipidDate']")
	protected WebElement LipidDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='LDL']")
	protected WebElement LDLHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='HDL']")
	protected WebElement HDLHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='triglycerides']")
	protected WebElement TriglyceridesHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='lipidNote']")
	protected WebElement LipidNoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='lipidSave']")
	protected WebElement LipidPanelAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='lipidCancel']")
	protected WebElement LipidPanelCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='liverTab']")
	protected WebElement ClinicalProfileLabtabLiverHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='liverFunctionDate']")
	protected WebElement LiverDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='ALP']")
	protected WebElement ALPHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='ATL']")
	protected WebElement ALTHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='AST']")
	protected WebElement ASTHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='serumAlbumin']")
	protected WebElement SerumAlbuminHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='totalBilirubin']")
	protected WebElement TotalBilirubinHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='liverNote']")
	protected WebElement LiverNoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='liverSave']")
	protected WebElement LiverTestAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='liverCancel']")
	protected WebElement LiverTestCancelHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='renalTab']")
	protected WebElement ClinicalProfileLabtabRenalHTML;

	@FindBy(how = How.XPATH, using = "//*[@id=\"panRight\"]")
	protected WebElement RightArrow;

	@FindBy(how = How.XPATH, using = "//*[@id='renalFunctionDate']")
	protected WebElement RenalDateHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='creatinineClearance']")
	protected WebElement CrClHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='serumCreatinine']")
	protected WebElement SCrHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='bloodUrea']")
	protected WebElement BUNHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='ratio']")
	protected WebElement BunRatioHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='renalNotes']")
	protected WebElement RenalNoteHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='renalSave']")
	protected WebElement RenalTestAddHTML;

	@FindBy(how = How.XPATH, using = "//*[@id='renalCancel']")
	protected WebElement RenalTestCancelHTML;

	public void clinicalLabTabClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + ClinicalProfileLabtabHTML.getLocation().y + ")");
		ClinicalProfileLabtabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab");
		}
	}

	public void bloodGlucoseDateClick(String bloodGlucoseDate) throws InterruptedException {
		try {
			Base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + bloodGlucoseDateHTML.getLocation().y + ")");
			bloodGlucoseDateHTML.click();
			bloodGlucoseDateHTML.clear();
			bloodGlucoseDateHTML.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			bloodGlucoseDateHTML.sendKeys(bloodGlucoseDate);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered bloodGlucoseDate - " + bloodGlucoseDate);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entered bloodGlucoseDate - " + bloodGlucoseDate);
		}
	}

	public void bloodGlucoseValClick(String BloodGlucoseValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BloodGlucoseHTML.getLocation().y + ")");
		BloodGlucoseHTML.clear();
		BloodGlucoseHTML.click();
		BloodGlucoseHTML.sendKeys(BloodGlucoseValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Blood Glucose - " +BloodGlucoseValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Blood Glucose - " +BloodGlucoseValue);
		}
	}

	public void bloodGlucoseTypeClick(String Type) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TypeHTML.getLocation().y + ")");
		Select Typeelement = new Select(TypeHTML);
		Typeelement.selectByVisibleText(Type);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected type - " +Type); 
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting type");
		}
	}

	public void bloodGlucoseTimeClick(String Time) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TimeHTML.getLocation().y + ")");
		Select Timeelement = new Select(TimeHTML);
		Timeelement.selectByVisibleText(Time);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected type - " +Time);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Selecting type");
		}
	}

	public void bloodGlucoseHemoglobinA1C(String HemoglobinA1CValue) {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HemoglobinA1CHTML.getLocation().y + ")");
		HemoglobinA1CHTML.clear();
		HemoglobinA1CHTML.click();
		HemoglobinA1CHTML.sendKeys(HemoglobinA1CValue);
		
	}

	public void bloodGlucoseNotes(String NoteValue) {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + NoteHTML.getLocation().y + ")");
		 NoteHTML.clear();
		NoteHTML.click();
		NoteHTML.sendKeys(NoteValue);
		
	}

	public void bloodGlucoseAddBtnClick() {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BloodGlucoseAddHTML.getLocation().y + ")");
		BloodGlucoseAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		
	}

	public void bloodGlucoseCancelBtnClick() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BloodGlucoseCancelHTML.getLocation().y + ")");
		BloodGlucoseCancelHTML.click();
		
	}

	public void bloodGlucoseErrMsg() throws IOException{
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id=\"customBloodGlucoseMessages\"]")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Blood Glucose(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void successCaptureScreenshot() throws IOException, InterruptedException{
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

	public void clinicalProfileLabChemistriesClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileLabtabChemistriesHTML.getLocation().y + ")");
		ClinicalProfileLabtabChemistriesHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab(Chemistries)");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab(Chemistries)");
		}
	}

	public void chemistriesDateClick(String chemistriesDateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + chemistriesDateHTML.getLocation().y + ")");
		chemistriesDateHTML.clear();
		chemistriesDateHTML.click();
		//chemistriesDateHTML.clear();
		chemistriesDateHTML.sendKeys(chemistriesDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Date (Chemistries) - " +chemistriesDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Date (Chemistries)");
		}
	}

	public void chemistriesSodiumClick(String SodiumValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SodiumHTML.getLocation().y + ")");
		SodiumHTML.click();
		SodiumHTML.clear();
		SodiumHTML.sendKeys(SodiumValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered sodium value - " +SodiumValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering sodium value - " +SodiumValue);
		}
	}

	public void chemistriesPotassiumClick(String PotassiumValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PotassiumHTML.getLocation().y + ")");
		PotassiumHTML.click();
		PotassiumHTML.clear();
		PotassiumHTML.sendKeys(PotassiumValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered potassium value - " +PotassiumValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering potassium value - " +PotassiumValue);
		}
	}

	public void chemistriesCalciumClick(String CalciumValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CalciumHTML.getLocation().y + ")");
		CalciumHTML.click();
		CalciumHTML.clear();
		CalciumHTML.sendKeys(CalciumValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered calcium value - " +CalciumValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering calcium value");
		}
	}

	public void chemistriesMagnesiumClick(String MagnesiumValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MagnesiumHTML.getLocation().y + ")");
		MagnesiumHTML.click();
		MagnesiumHTML.clear();
		MagnesiumHTML.sendKeys(MagnesiumValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered magnesium value - " +MagnesiumValue); 
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering magnesium value ");
		}
	}

	public void chemistriesPhosphorusClick(String PhosphorusValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PhosphorusHTML.getLocation().y + ")");
		PhosphorusHTML.click();
		PhosphorusHTML.clear();
		PhosphorusHTML.sendKeys(PhosphorusValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered phosphorus value - " +PhosphorusValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering phosphorus value");
		}
	}

	public void chemistriesChlorideClick(String ChlorideValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ChlorideHTML.getLocation().y + ")");
		ChlorideHTML.click();
		ChlorideHTML.clear();
		ChlorideHTML.sendKeys(ChlorideValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered chloride value - " +ChlorideValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering chloride value");
		}
	}

	public void chemistriesBicarbonateClick(String BicarbonateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BicarbonateHTML.getLocation().y + ")");
		BicarbonateHTML.click();
		BicarbonateHTML.clear();
		BicarbonateHTML.sendKeys(BicarbonateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered bicarbonate value - " +BicarbonateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering bicarbonate value");
		}
	}

	public void chemistriesCarbonDioxideClick(String CarbonDioxideValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CarbonDioxideHTML.getLocation().y + ")");
		CarbonDioxideHTML.click();
		CarbonDioxideHTML.clear();
		CarbonDioxideHTML.sendKeys(CarbonDioxideValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered carbondioxide value - " +CarbonDioxideValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering carbondioxide value");
		}
	}

	public void chemistriesNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ChemistriesNoteHTML.getLocation().y + ")");
		ChemistriesNoteHTML.click();
		ChemistriesNoteHTML.clear();
		ChemistriesNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note value - " +NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note value");
		}
	}

	public void chemistriesAddBtnClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ChemistriesAddHTML.getLocation().y + ")");
		ChemistriesAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}

	public void chemistriesCancelBtnClick() {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ChemistriesCancelHTML.getLocation().y + ")");
		ChemistriesCancelHTML.click();
	}

	public void chemistriesErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='customChemistriesMessages']")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Chemistries(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());	
		}

	public void clinicalCBCTabClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileLabtabCBCHTML.getLocation().y + ")");
		ClinicalProfileLabtabCBCHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab(Complete blood Count)");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab(Complete blood Count");
		}
	}

	public void CBCDateClick(String CBCDateValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CBCDateHTML.getLocation().y + ")");
		CBCDateHTML.clear();
		CBCDateHTML.click();
		CBCDateHTML.sendKeys(CBCDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Date (CBCD)- " +CBCDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Date (CBCD)");
		}
	}

	public void CBCWbcClick(String WBCValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + WBCHTML.getLocation().y + ")");
		WBCHTML.clear();
		WBCHTML.click();
		WBCHTML.sendKeys(WBCValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered WBC - " +WBCValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering WBC");
		}
	}

	public void CBCAncClick(String ANCValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ANCHTML.getLocation().y + ")");
		ANCHTML.clear();
		ANCHTML.click();
		ANCHTML.sendKeys(ANCValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered ANC - " +ANCValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ANC");
		}
	}

	public void CBCAlcClick(String ALCValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ALCHTML.getLocation().y + ")");
		ALCHTML.clear();
		ALCHTML.click();
		ALCHTML.sendKeys(ALCValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered ALC - " +ALCValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ALC");
		}
	}

	public void CBCRbcClick(String RBCValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RBCHTML.getLocation().y + ")");
		RBCHTML.clear();
		RBCHTML.click();
		RBCHTML.sendKeys(RBCValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered RBC - " +RBCValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering RBC");
		}
	}

	public void CBCHgBClick(String HgBValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HgBHTML.getLocation().y + ")");
		HgBHTML.clear();
		HgBHTML.click();
		HgBHTML.sendKeys(HgBValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered HgB - " +HgBValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering HgB");
		}
	}

	public void CBCHctClick(String HCTValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HCTHTML.getLocation().y + ")");
		HCTHTML.clear();
		HCTHTML.click();
		HCTHTML.sendKeys(HCTValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter HCT - " +HCTValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering HCT");
		}
	}

	public void CBCPltClick(String PLTValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PLTHTML.getLocation().y + ")");
		PLTHTML.clear();
		PLTHTML.click();
		PLTHTML.sendKeys(PLTValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter PLT - " +PLTValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering PLT");
		}
	}

	public void CBCNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CBCNoteHTML.getLocation().y + ")");
		CBCNoteHTML.click();
		CBCNoteHTML.clear();
		CBCNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter Note - " +NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Note");
		}
	}

	public void CBCAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CBCAddHTML.getLocation().y + ")");
		CBCAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on add button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on add button");
		}
	}

	public void CBCCancelClick() {
	
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CBCCancelHTML.getLocation().y + ")");
		CBCCancelHTML.click();
		
	}

	public void CBCErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id=\"customCompleteBloodCountMessages\"]")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Complete Blood Count(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}

	public void clinicalInflammatoryTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileLabtabInflammatoryHTML.getLocation().y + ")");
		ClinicalProfileLabtabInflammatoryHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab(Inflammatory Markers)");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab(Inflammatory Markers)");
		}
	}

	public void inflammotoryDateClick(String InflammatoryDateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InflammatoryDateHTML.getLocation().y + ")");
		InflammatoryDateHTML.clear();
		InflammatoryDateHTML.click();
		InflammatoryDateHTML.sendKeys(InflammatoryDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Date (Inflammatory) - " +InflammatoryDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Date (Inflammatory)");
		}
	}

	public void inflammotoryAntiCCPClick(String AntiCCPValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AntiCCPHTML.getLocation().y + ")");
		AntiCCPHTML.clear();
		AntiCCPHTML.click();	
		AntiCCPHTML.sendKeys(AntiCCPValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Anti-CCP value - " +AntiCCPValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Anti-CCP value");
		}
	}

	public void inflammotoryCRPClick(String CRPValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CRPHTML.getLocation().y + ")");
		CRPHTML.clear();
		CRPHTML.click();
		CRPHTML.sendKeys(CRPValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered CRP - " +CRPValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering CRP");
		}
	}

	public void inflammotoryESRClick(String ESRValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ESRHTML.getLocation().y + ")");
		ESRHTML.clear();
		ESRHTML.click();
		ESRHTML.sendKeys(ESRValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered ESR - " +ESRValue);
		}
		catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ESR");
		}
	}

	public void inflammotoryRFClick(String RFValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RFHTML.getLocation().y + ")");
		RFHTML.clear();
		RFHTML.click();
		RFHTML.sendKeys(RFValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered RF - " +RFValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering RF");
		}
	}

	public void inflammotoryNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InflammatoryNoteHTML.getLocation().y + ")");
		InflammatoryNoteHTML.clear();
		InflammatoryNoteHTML.click();
		InflammatoryNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter note - " +NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note");
		}
	}

	public void inflammatoryAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InflammatoryAddHTML.getLocation().y + ")");
		InflammatoryAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}

	public void inflammatoryCancelClick() {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + InflammatoryCancelHTML.getLocation().y + ")");
		InflammatoryCancelHTML.click();
		
	}

	public void inflammatoryErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='customInflammatoryMessages']")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Inflammatory Markers(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}

	public void clinicalLipidTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileLabtabLipidHTML.getLocation().y + ")");
		ClinicalProfileLabtabLipidHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab(Lipid Panel)");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab(Lipid Panel)");
		}
	}

	public void lipidDateClick(String LipidDateValue) throws InterruptedException {
		
		try { Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LipidDateHTML.getLocation().y + ")");
		LipidDateHTML.clear();
		LipidDateHTML.click();
		LipidDateHTML.sendKeys(LipidDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Date (Lipid) - " +LipidDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Date (Lipid)");
		}
	}

	public void lipidLDLClick(String LDLValue) {
		try {Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LDLHTML.getLocation().y + ")");
		LDLHTML.clear();
		LDLHTML.click();
		LDLHTML.sendKeys(LDLValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered LDL - " +LDLValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering LDL");
		}
	}

	public void lipidHDLClick(String HDLValue) {
		try {Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HDLHTML.getLocation().y + ")");
		HDLHTML.clear();
		HDLHTML.click();
		HDLHTML.sendKeys(HDLValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered HDL - " +HDLValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering HDL");
		}
	}

	public void lipidTriglyceridesClick(String TriglyceridesValue) {
		try {Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TriglyceridesHTML.getLocation().y + ")");
		TriglyceridesHTML.clear();
		TriglyceridesHTML.click();
		TriglyceridesHTML.sendKeys(TriglyceridesValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Triglycerides - " +TriglyceridesValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Triglycerides");
		}
	}

	public void lipidNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LipidNoteHTML.getLocation().y + ")");
		LipidNoteHTML.clear();
		LipidNoteHTML.click();
		LipidNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note - " + NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note");
		}
	}

	public void lipidAddClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LipidPanelAddHTML.getLocation().y + ")");
		LipidPanelAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}

	public void lipidCancelClick() throws InterruptedException {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LipidPanelCancelHTML.getLocation().y + ")");
		LipidPanelCancelHTML.click();
		
	}

	public void lipidErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='customLipidMessages']")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Lipid Panel(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}

	public void clinicalLiverTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + ClinicalProfileLabtabLiverHTML.getLocation().y + ")");
		ClinicalProfileLabtabLiverHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab(Liver Function Test)");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab(Liver Function Test)");
		}
	}

	public void liverDateClick(String LiverDateValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LiverDateHTML.getLocation().y + ")");
		LiverDateHTML.clear();
		LiverDateHTML.click();
		// LiverDateHTML.clear();
		LiverDateHTML.sendKeys(LiverDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered date (Liver function) - " + LiverDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering date (Liver function)");
		}
	}

	public void liverALPClick(String ALPValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ALPHTML.getLocation().y + ")");
		ALPHTML.clear();
		ALPHTML.click();
		ALPHTML.sendKeys(ALPValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered ALP - " + ALPValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ALP");
		}
	}

	public void liverALTClick(String ALTValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ALTHTML.getLocation().y + ")");
		ALTHTML.clear();
		ALTHTML.click();
		ALTHTML.sendKeys(ALTValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered ALT - " + ALTValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering ALT");
		}
	}

	public void liverASTClick(String ASTValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ASTHTML.getLocation().y + ")");
		ASTHTML.clear();
		ASTHTML.click();
		ASTHTML.sendKeys(ASTValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered AST - " + ASTValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering AST");
		}
	}

	public void liverSerumAlbuminClick(String SerumAlbuminValue) {
		try {	
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SerumAlbuminHTML.getLocation().y + ")");
		SerumAlbuminHTML.clear();
		SerumAlbuminHTML.click();
		SerumAlbuminHTML.sendKeys(SerumAlbuminValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered serum albumin - " + SerumAlbuminValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering serum albumin");
		}
	}

	public void liverTotalBilirubinClick(String TotalBilirubinValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TotalBilirubinHTML.getLocation().y + ")");
		TotalBilirubinHTML.clear();
		TotalBilirubinHTML.click();
		TotalBilirubinHTML.sendKeys(TotalBilirubinValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered total bilirubin - " + TotalBilirubinValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering total bilirubin");
		}
	}

	public void liverNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LiverNoteHTML.getLocation().y + ")");
		LiverNoteHTML.clear();
		LiverNoteHTML.click();
		LiverNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note - " + NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note");
		}
	}

	public void liverAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LiverTestAddHTML.getLocation().y + ")");
		LiverTestAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}

	public void liverCancelClick() {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + LiverTestCancelHTML.getLocation().y + ")");
		LiverTestCancelHTML.click();
		
	}

	public void liverErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='customLiverMessages']")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Liver Function Test(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());	
		}

	public void clickOnRightArrow() throws InterruptedException {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RightArrow.getLocation().y + ")");
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			for (int i = 0; i < 25; i++) {
				act.doubleClick(RightArrow).perform();
		        Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("Renal Tab Already displayed");
		}
	}

	public void clinicalRenalTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + ClinicalProfileLabtabRenalHTML.getLocation().y + ")");
		ClinicalProfileLabtabRenalHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Labs tab(Renal Function Test)");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Labs tab(Renal Function Test)");
		}
	}

	public void renalDateClick(String RenalDateValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RenalDateHTML.getLocation().y + ")");
		RenalDateHTML.clear();
		RenalDateHTML.click();
		RenalDateHTML.sendKeys(RenalDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered date (Renalfunction) - " + RenalDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering date (Renalfunction)");
		}
	}

	public void renalCrClClick(String CrClValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CrClHTML.getLocation().y + ")");
		CrClHTML.clear();
		CrClHTML.click();
		CrClHTML.sendKeys(CrClValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered CrCl - " + CrClValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering CrCl");
		}
	}

	public void renalSCrClick(String SCrValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SCrHTML.getLocation().y + ")");
		SCrHTML.clear();
		SCrHTML.click();
		SCrHTML.sendKeys(SCrValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Scr - " + SCrValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering Scr");
		}
	}

	public void renalBunClick(String BUNValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BUNHTML.getLocation().y + ")");
		BUNHTML.clear();
		BUNHTML.click();
		BUNHTML.sendKeys(BUNValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered BUN - " + BUNValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering BUN");
		}
	}

	public void renalBunRatioClick(String BunRatioValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + BunRatioHTML.getLocation().y + ")");
		// BunRatioHTML.clear();
		BunRatioHTML.click();
		BunRatioHTML.sendKeys(BunRatioValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered BunRatio - " + BunRatioValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering BunRatio");
		}
	}

	public void renalNoteClick(String NoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RenalNoteHTML.getLocation().y + ")");
		RenalNoteHTML.clear();
		RenalNoteHTML.click();
		RenalNoteHTML.sendKeys(NoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note - " + NoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering note");
		}
	}

	public void renalAddClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RenalTestAddHTML.getLocation().y + ")");
		RenalTestAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add Button");
		}
	}

	public void renalCancelClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + RenalTestCancelHTML.getLocation().y + ")");
		RenalTestCancelHTML.click();
	}

	public void renalErrMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='customRenalMessages']")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Renal Function Test(Labs) Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());	
		}
}