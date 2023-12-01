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

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class AllergyClinicalData extends Base{

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[4]/div/div/a")
	static protected WebElement ClinicalProfiletabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[4]/div/ul/li[1]/a")
	protected WebElement ClinicalProfileAllergytabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='allergyTypeId']")
	protected WebElement AllergentypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='name']")
	protected WebElement AllergyNameHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reactionbtnMultiselectDropdown']")
	protected WebElement reactionsHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reactiontooltipDiv']/ul/div[1]/div[1]/div/input")
	protected WebElement reactionsSearchHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reactiontooltipDiv']/ul")
	protected WebElement selectReactionValue;
	
	@FindBy(how = How.XPATH, using = "//*[@id='onsetDate']")
	protected WebElement onsetDateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='status']")
	protected WebElement statusHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='note']")
	protected WebElement AllergyNoteHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='add']")
	protected WebElement AllergyAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='AllergyCancel']")
	protected WebElement AllergyCancelHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='update']")
	protected WebElement AllergyUpdateHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='listGridDiv']/div[1]/table/tbody/tr[1]/td[2]/a")
	protected WebElement EditLinkHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reactionclear-all']")
	protected WebElement clearAllHTML;
	
	public void clinicalProfileTabClick() throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);	
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfiletabHTML.getLocation().y + ")");
		ClinicalProfiletabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on clinical profile tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on clinical profile tab");
		}
		//test.log(LogStatus.PASS, "Click on clinical profile tab");
	}
	
	public void ClinicalProfileAllergyTabClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileAllergytabHTML.getLocation().y + ")");
		ClinicalProfileAllergytabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on Allergy tab");
		//test.log(LogStatus.PASS, "Click on Allergy tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on Allergy tab");
		}
	}
	
	public void allergenType(String AllergentypeValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AllergentypeHTML.getLocation().y + ")");
		Select allergytypeelement = new Select(AllergentypeHTML);
		allergytypeelement.selectByVisibleText(AllergentypeValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected allergy type - " +AllergentypeValue);
		//test.log(LogStatus.PASS, "Selected allergy type - " +AllergentypeValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting allergy type - " +AllergentypeValue);
		}
	}
	
	public void allergyNameAdd(String allergyNameValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		AllergyNameHTML.clear();
		AllergyNameHTML.click();
		AllergyNameHTML.sendKeys(allergyNameValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered allergy name - " +allergyNameValue);
		//test.log(LogStatus.PASS, "Entered allergy name - " +allergyNameValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Entering allergy name - " +allergyNameValue);
		}
	}
	
	public void reactionsSelect(String reactionNameValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		reactionsHTML.click();
		reactionsSearchHTML.click();
		reactionsSearchHTML.clear();
		reactionsSearchHTML.sendKeys(reactionNameValue);
		
		WebElement ele = Base.getExactListOfElements(driver, selectReactionValue,reactionNameValue);
		ele.click();
		reactionsHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected reactions - " +reactionNameValue);
		//test.log(LogStatus.PASS, "Selected reactions - " +reactionNameValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting reactions - " +reactionNameValue);
		}
	}
	
	public void onsetDateSelect(String onsetDateValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		onsetDateHTML.click();
		onsetDateHTML.clear();
		onsetDateHTML.sendKeys(onsetDateValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered OnSetDate - " +onsetDateValue);
		//test.log(LogStatus.PASS, "Entered OnSetDate - " +onsetDateValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Entering OnSetDate - " +onsetDateValue);
		}
	}
	
	public void statusSelect(String statusValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select Statuselement = new Select(statusHTML);
		Statuselement.selectByVisibleText(statusValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected LogStatus - " +statusValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting LogStatus - " +statusValue);
		}
		//test.log(LogStatus.PASS, "Selected LogStatus - " +statusValue);
	}
	
	public void allergyNote(String allergyNoteValue) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AllergyNoteHTML.click();
		AllergyNoteHTML.clear();
		AllergyNoteHTML.sendKeys(allergyNoteValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered allergy note - " +allergyNoteValue);
		//test.log(LogStatus.PASS, "Entered allergy note - " +allergyNoteValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Entering allergy note - " +allergyNoteValue);
		}
	}
	
	public void addAllergyClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AllergyAddHTML.getLocation().y + ")");
		AllergyAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on Add button");
		//test.log(LogStatus.PASS, "Click on Add button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on Add button");
		}
	}
	
	static public void successMsg() throws IOException {
		String success = "Record Saved Successfully";
		System.out.println(success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		//test.log(LogStatus.PASS, success);
	}
	
	public void cancelAllergyClick() throws InterruptedException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AllergyCancelHTML.getLocation().y + ")");
		AllergyCancelHTML.click();
	}
	
	public void errMsg() throws IOException, InterruptedException {
		String Error_msg = driver.findElement(By.xpath("//*[@id=\"customAllergyMessages\"]")).getText();
		System.out.println();
		System.out.println(Error_msg);
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

}
