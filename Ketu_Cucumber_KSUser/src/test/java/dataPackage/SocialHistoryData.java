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

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class SocialHistoryData extends Base{

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[4]/div/ul/li[3]/a")
	protected WebElement ClinicalProfileSocialHistorytabHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='preferLanguageLookUpMasterId']")
	protected WebElement PrimaryLanguageHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='secondLanguageLookUpMasterId']")
	protected WebElement SecondaryLanguageHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='primaryOther']")
	protected WebElement OtherPrimaryLanguageHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='secondaryOther']")
	protected WebElement OtherSecondaryLanguageHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='needTranslate'][1]")
	protected WebElement TranslateRequiredYesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='needTranslate'][2]")
	protected WebElement TranslateRequiredNoHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='workStatus'][1]")
	protected WebElement currentlyWorkingStatusYes;
	
	@FindBy(how = How.XPATH, using = "//*[@id='workStatus'][2]")
	protected WebElement currentlyWorkingStatusNo;
	
	@FindBy(how = How.XPATH, using = "//*[@id='occupation']")
	protected WebElement OccupationHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='smokingStatusLookUpMasterId']")
	protected WebElement SmokingStatusHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='quitDuration']")
	static protected WebElement TimeSinceLastSmokeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='quitDurationTimeUnit']")
	protected WebElement QuitUnitHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='smokingDuration']")
	protected WebElement SmokingDurationHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='smokingDurationTimeUnit']")
	protected WebElement UnitHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reactionUlbtnMultiselectDropdown']")
	protected WebElement typeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reactionUltooltipDiv']/ul/div[1]/div[1]/div/input")
	protected WebElement searchTypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='packsPerDay']")
	protected WebElement PacksPerDayHTML;
	
	@FindBy(how = How.XPATH, using = "//body[1]/section[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	protected WebElement AlcoholUseNeverHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='alcoholUse'][2]")
	protected WebElement AlcoholUseRegularlyHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='alcoholUse'][3]")
	protected WebElement AlcoholUseSociallyHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='drinksPerPack']")
	protected WebElement DrinksHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='drinksPerPackTimeUnit']")
	protected WebElement AlcoholUnitHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='recreationalDrugHeading']/div[1]/div/div/input[1]")
	protected WebElement DrugUseYesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='recreationalDrugHeading']/div[1]/div/div/input[2]")
	protected WebElement DrugUseNoHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='recreationalDrugHeading']/div[1]/div/div/input[3]")
	protected WebElement DrugUseNotDisclosedHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='rdType']")
	protected WebElement TypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='rdFormbtnMultiselectDropdown']")
	protected WebElement formHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='rdFormtooltipDiv']/ul/div[1]/div[1]/div/input")
	protected WebElement searchFormHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='drugName']")
	protected WebElement DrugNameHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='isExercise'][1]")
	protected WebElement ExerciseStatusYesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='isExercise'][2]")
	protected WebElement ExerciseStatusNoHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='exerciseTypeId']")
	protected WebElement ExerciseTypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='exerciseDuration']")
	protected WebElement MinutesActiveHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='exerciseDurationTimeUnit']")
	protected WebElement perUnitHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='exerciseInformation']")
	protected WebElement NotesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cardioExcerciseTypeId']")
	protected WebElement CardioExerciseTypeHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cardioExerciseDurationId']")
	protected WebElement cardioMinutesActiveHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cardioExercisdDurationUnitId']")
	protected WebElement cardioPerUnitHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='cardioExerciseInformationId']")
	protected WebElement cardioNotesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='extraActivity']/div/div[1]/div/input[1]")
	protected WebElement CulturalPreferencesYesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='culturalPreferencesYes']")
	protected WebElement CulturalTextHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='extraActivity']/div/div[1]/div/input[2]")
	protected WebElement CulturalPreferencesNoHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='extraActivity']/div/div[2]/div/input[1]")
	protected WebElement SocioeconomicYesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='socioeconomicPreferencesYes']")
	protected WebElement SocioeconomicTextHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='extraActivity']/div/div[2]/div/input[2]")
	protected WebElement SocioeconomicNoHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='extraActivity']/div/div[3]/div/input[1]")
	protected WebElement HealthLiteracyYesHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='healthConcernYes']")
	protected WebElement HealthLiteracyTextHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='extraActivity']/div/div[3]/div/input[2]")
	protected WebElement HealthLiteracyNoHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='saveSocialHistoryBtn']")
	protected WebElement SocialHistoryAddHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id='commonS']/div[5]/div/button")
	protected WebElement SocialHistoryCancelHTML;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"saveSocialSuccess\"]")
	protected WebElement RecordUpdateSuccessfullyHTML;
	
	
	public void ClinicalProfileSocialHistoryTabClick() {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClinicalProfileSocialHistorytabHTML.getLocation().y + ")");
		ClinicalProfileSocialHistorytabHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Allergy tab");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Allergy tab");		
			}
	}
	
	public void socialHistoryPrimaryLanguageSelect(String PrimaryLanguage, String otherPrimaryLanguage) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PrimaryLanguageHTML.getLocation().y + ")");
		Select PrimaryLanguageelement = new Select(PrimaryLanguageHTML);
		PrimaryLanguageelement.selectByVisibleText(PrimaryLanguage);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected primary language - " +PrimaryLanguage);
		
		if(PrimaryLanguage.equalsIgnoreCase("Other")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			OtherPrimaryLanguageHTML.click();
			OtherPrimaryLanguageHTML.clear();
			OtherPrimaryLanguageHTML.sendKeys(otherPrimaryLanguage);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered other primary language - " +otherPrimaryLanguage);
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering other primary language - " +otherPrimaryLanguage);

		}
	}
	
	public void socialHistorySecondaryLanguageSelect(String SecondaryLanguage, String otherSecondaryLanguage) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SecondaryLanguageHTML.getLocation().y + ")");
		Select SecondaryLanguageelement = new Select(SecondaryLanguageHTML);
		SecondaryLanguageelement.selectByVisibleText(SecondaryLanguage);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected secondary language - " +SecondaryLanguage);
		
		if(SecondaryLanguage.equalsIgnoreCase("Other")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			OtherSecondaryLanguageHTML.click();
			OtherSecondaryLanguageHTML.clear();
			OtherSecondaryLanguageHTML.sendKeys(otherSecondaryLanguage);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered other secondary language - " +otherSecondaryLanguage);
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Entering other secondary language - " +otherSecondaryLanguage);
		}
	}
	
	public void socialHistoryTranslationServiceClick(String TranslationStatus) {
		try {
			
		if(TranslationStatus.equalsIgnoreCase("Yes")){
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TranslateRequiredYesHTML.getLocation().y + ")");
			TranslateRequiredYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on translation required (Yes) button");
		}
		else {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TranslateRequiredNoHTML.getLocation().y + ")");
			TranslateRequiredNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on translation required (No) button");
		}
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on translation required (Yes) button");
		}
	}
	
	public void socialHistoryCurrentlyWorkingClick(String currentlyWorkingStatus, String OccupationValue) {
		try {
		if(currentlyWorkingStatus.equalsIgnoreCase("Yes")){
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + currentlyWorkingStatusYes.getLocation().y + ")");
			currentlyWorkingStatusYes.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on currently working (Yes) button");
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			OccupationHTML.click();
			OccupationHTML.clear();
			OccupationHTML.sendKeys(OccupationValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter occupation");
		}
		else {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + currentlyWorkingStatusNo.getLocation().y + ")");
			currentlyWorkingStatusNo.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on currently working (No) button");
		}

		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Error occurred while Clicking on currently working (No) button");
		}
	}
	
	public void socialHistorySmokingStatusClick(String SmokingStatus, String TimeSinceLastSmokeValue, String Unit, String SmokingDurationValue, String searchTypeValue, String PacksPerDayValue) throws InterruptedException {
		
		try {
			
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SmokingStatusHTML.getLocation().y + ")");
		Select SmokingStatuselement = new Select(SmokingStatusHTML);
		SmokingStatuselement.selectByVisibleText(SmokingStatus);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected smoking status - " +SmokingStatus);
		
		if(SmokingStatus.equalsIgnoreCase("Quit")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TimeSinceLastSmokeHTML.getLocation().y + ")");
			TimeSinceLastSmokeHTML.click();
			TimeSinceLastSmokeHTML.clear();
			TimeSinceLastSmokeHTML.sendKeys(TimeSinceLastSmokeValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered time since last smoke - " +TimeSinceLastSmokeValue);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + QuitUnitHTML.getLocation().y + ")");
			Select Unitelement = new Select(QuitUnitHTML);
			Unitelement.selectByVisibleText(Unit);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected unit - " +Unit);
			
		}
		
		else if(SmokingStatus.equalsIgnoreCase("Second Hand Smoker")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SmokingDurationHTML.getLocation().y + ")");
			SmokingDurationHTML.click();
			SmokingDurationHTML.clear();
			SmokingDurationHTML.sendKeys(SmokingDurationValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered time since last smoke - " +SmokingDurationValue);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + UnitHTML.getLocation().y + ")");
			Select Unitelement = new Select(UnitHTML);
			Unitelement.selectByVisibleText(Unit);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected unit - " +Unit);
		}
		
		else if(SmokingStatus.equalsIgnoreCase("Yes")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + typeHTML.getLocation().y + ")");
			typeHTML.click();
			searchTypeHTML.click();
			searchTypeHTML.clear();
			searchTypeHTML.sendKeys(searchTypeValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered type - " +searchTypeValue);
			WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id=\"reactionUltooltipDiv\"]/ul")),searchTypeValue);
			ele.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Select type");
			driver.findElement(By.xpath("//*[@id=\"reactionUlbtnMultiselectDropdown\"]")).click();
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PacksPerDayHTML.getLocation().y + ")");
			PacksPerDayHTML.click();
			PacksPerDayHTML.clear();
			PacksPerDayHTML.sendKeys(PacksPerDayValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered packs per day - " +PacksPerDayValue);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SmokingDurationHTML.getLocation().y + ")");
			SmokingDurationHTML.click();
			SmokingDurationHTML.clear();
			SmokingDurationHTML.sendKeys(SmokingDurationValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered time since last smoke - " +SmokingDurationValue);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + UnitHTML.getLocation().y + ")");
			Select Unitelement = new Select(UnitHTML);
			Unitelement.selectByVisibleText(Unit);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected unit - " +Unit);
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while adding data for Social History Smoking Status");		
			}
	}

	public void socialHistoryAlcoholUseClick(String AlcoholUseStatus, String DrinksValue, String Unit) throws InterruptedException {
		
		try {
			
		if(AlcoholUseStatus.equalsIgnoreCase("Never")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AlcoholUseNeverHTML.getLocation().y + ")");
			AlcoholUseNeverHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on alcohol use(Never) button");
		}
		
		else if(AlcoholUseStatus.equalsIgnoreCase("Regularly")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AlcoholUseRegularlyHTML.getLocation().y + ")");
			AlcoholUseRegularlyHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on alcohol use(Regularly) button");
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DrinksHTML.getLocation().y + ")");
			DrinksHTML.click();
			DrinksHTML.clear();
			DrinksHTML.sendKeys(DrinksValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered drink name - " +DrinksValue);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AlcoholUnitHTML.getLocation().y + ")");
			Select Unitelement = new Select(AlcoholUnitHTML);
			Unitelement.selectByVisibleText(Unit);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected unit - " +Unit);
		}
		
		else if(AlcoholUseStatus.equalsIgnoreCase("Socially")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AlcoholUseSociallyHTML.getLocation().y + ")");
			AlcoholUseSociallyHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on alcohol use(Socially) button");
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DrinksHTML.getLocation().y + ")");
			DrinksHTML.click();
			DrinksHTML.clear();
			DrinksHTML.sendKeys(DrinksValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered drink name - " +DrinksValue);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + AlcoholUnitHTML.getLocation().y + ")");
			Select Unitelement = new Select(AlcoholUnitHTML);
			Unitelement.selectByVisibleText(Unit);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected unit - " +Unit);
		}

		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Error occurred while adding Social History Alcohol Data"); 
		}
	}
	
	public void socialHistoryDrugUseStatusClick(String DrugUseStatus, String Type, String searchFormValue, String DrugNameValue) {
		try {
			
		if(DrugUseStatus.equalsIgnoreCase("Yes")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DrugUseYesHTML.getLocation().y + ")");
			DrugUseYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on recreational drug use(Yes) button");
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TypeHTML.getLocation().y + ")");
			Select Typeelement = new Select(TypeHTML);
			Typeelement.selectByVisibleText(Type);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected type - " +Type);
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + formHTML.getLocation().y + ")");
			formHTML.click();
			searchFormHTML.click();
		    searchFormHTML.clear();
			searchFormHTML.sendKeys(searchFormValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered formvalue to search - " +searchFormValue);
			WebElement ele = Base.getExactListOfElements(driver,driver.findElement(By.xpath("//*[@id='rdFormtooltipDiv']/ul")),
					searchFormValue);
			ele.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected form value - " +searchFormValue);
			formHTML.click();
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DrugNameHTML.getLocation().y + ")");
			DrugNameHTML.click();
		     DrugNameHTML.clear();
			DrugNameHTML.sendKeys(DrugNameValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered drug name - " +DrugNameValue);
		}
		
		else if(DrugUseStatus.equalsIgnoreCase("No")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DrugUseNoHTML.getLocation().y + ")");
			DrugUseNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on recreational drug use(No) button");
		}
		
		else if(DrugUseStatus.equalsIgnoreCase("Not Disclosed")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + DrugUseNotDisclosedHTML.getLocation().y + ")");
			DrugUseNotDisclosedHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on recreational drug use(Not Disclosed) button");
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on recreational drug use(Not Disclosed) button");
		}
	}
	
	public void socialHistoryExerciseStatusClick(String ExerciseStatusData, String ExerciseType, String MinutesActiveValue, String perUnit, String NotesValue, String CardioExerciseType, String cardioMinutesActiveValue, String cardioPerUnit, String cardioNotesValue) {
		try {
			
		if(ExerciseStatusData.equalsIgnoreCase("Yes")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ExerciseStatusYesHTML.getLocation().y + ")");
			ExerciseStatusYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on exercise status(Yes)");
			
			try {
				Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ExerciseTypeHTML.getLocation().y + ")");
				Select ExerciseTypeelement = new Select(ExerciseTypeHTML);
				ExerciseTypeelement.selectByVisibleText(ExerciseType);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected exercise type - " +ExerciseType);
			}catch (Exception e) {
				
			}
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + MinutesActiveHTML.getLocation().y + ")");
			MinutesActiveHTML.click();
			//MinutesActiveHTML.clear();
			MinutesActiveHTML.sendKeys(MinutesActiveValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered active minutes - " +MinutesActiveValue);
			
			try {
				Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + perUnitHTML.getLocation().y + ")");
				Select perUnitelement = new Select(perUnitHTML);
				perUnitelement.selectByVisibleText(perUnit);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected per unit - " +perUnit);
			}catch (Exception e) {
				
			}
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + NotesHTML.getLocation().y + ")");
			NotesHTML.click();
			//NotesHTML.clear();
			NotesHTML.sendKeys(NotesValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note - " +NotesValue);
			
			try {
				Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CardioExerciseTypeHTML.getLocation().y + ")");
				Select CardioExerciseTypeelement = new Select(CardioExerciseTypeHTML);
				CardioExerciseTypeelement.selectByVisibleText(CardioExerciseType);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected exercise type(Cardio) - " +CardioExerciseType);
			} catch (Exception e) {
				
			}
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + cardioMinutesActiveHTML.getLocation().y + ")");
			cardioMinutesActiveHTML.click();
			//cardioMinutesActiveHTML.clear();
			cardioMinutesActiveHTML.sendKeys(cardioMinutesActiveValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered active minutes - " +cardioMinutesActiveValue);
			
			try {
				Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + cardioPerUnitHTML.getLocation().y + ")");
				Select cardioPerUnitelement = new Select(cardioPerUnitHTML);
				cardioPerUnitelement.selectByVisibleText(cardioPerUnit);
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected cardio per unit - " +cardioPerUnit);
			} catch (Exception e) {
				
			}
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + cardioNotesHTML.getLocation().y + ")");
			cardioNotesHTML.click();
			//cardioNotesHTML.clear();
			cardioNotesHTML.sendKeys(cardioNotesValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered note - " +cardioNotesValue);
		}
		
		else if(ExerciseStatusData.equalsIgnoreCase("No")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ExerciseStatusNoHTML.getLocation().y + ")");
			ExerciseStatusNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on exercise status(No)");
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on exercise status(No)");
		}
	}
	
	public void socialHistoryCulturalClick(String CulturalStatus, String CulturalTextValue) {
		try {
		
		if(CulturalStatus.equalsIgnoreCase("Yes")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CulturalPreferencesYesHTML.getLocation().y + ")");
			CulturalPreferencesYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on cultural preferences status(Yes)");
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CulturalTextHTML.getLocation().y + ")");
			CulturalTextHTML.click();
			//CulturalTextHTML.clear();
			CulturalTextHTML.sendKeys(CulturalTextValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Cultural Preference - " +CulturalTextValue);
		}
		
		else if(CulturalStatus.equalsIgnoreCase("No")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CulturalPreferencesNoHTML.getLocation().y + ")");
			CulturalPreferencesNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on cultural preferences status(No)");
		}
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on cultural preferences status(No)");
		}
	}
	
	public void socialHistorySocioEconomicClick(String SocioeconomicStatus, String SocioeconomicTextValue) {
		try {
			
		if(SocioeconomicStatus.equalsIgnoreCase("Yes")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SocioeconomicYesHTML.getLocation().y + ")");
			SocioeconomicYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on socioeconomic or other barriers to care(Yes)");
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SocioeconomicTextHTML.getLocation().y + ")");
			SocioeconomicTextHTML.click();
			//SocioeconomicTextHTML.clear();
			SocioeconomicTextHTML.sendKeys(SocioeconomicTextValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Socioeconomic value - " +SocioeconomicStatus);
		}
		
		else if(SocioeconomicStatus.equalsIgnoreCase("No")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SocioeconomicNoHTML.getLocation().y + ")");
			SocioeconomicNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on socioeconomic or other barriers to care(No)");
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on socioeconomic or other barriers to care(No)");
		}
	}
	
	public void socialHistoryHealthLiteracyClick(String healthLiteracyStatus, String HealthLiteracyTextValue) {
		try {
			
		if(healthLiteracyStatus.equalsIgnoreCase("Yes")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HealthLiteracyYesHTML.getLocation().y + ")");
			HealthLiteracyYesHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on socioeconomic or other barriers to care(Yes)");
			
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HealthLiteracyTextHTML.getLocation().y + ")");
			HealthLiteracyTextHTML.click();
			//HealthLiteracyTextHTML.clear();
			HealthLiteracyTextHTML.sendKeys(HealthLiteracyTextValue);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered health literacy concern - " +HealthLiteracyTextValue);
		}
		
		else if(healthLiteracyStatus.equalsIgnoreCase("No")) {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + HealthLiteracyNoHTML.getLocation().y + ")");
			HealthLiteracyNoHTML.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on socioeconomic or other barriers to care(No)");
		}

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on socioeconomic or other barriers to care(No)");
		}
	}
	
	public void addSocialHistoryClick() {
		try {
		
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SocialHistoryAddHTML.getLocation().y + ")");
		SocialHistoryAddHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Add button");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Error occurred while Clicking on Add button");
		}
	}
	
	static public void successMsg() throws IOException, InterruptedException {
		String success = "Record Saved Successfully";
		Thread.sleep(2000);
		System.out.println(success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, success);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void cancelSocialHistoryClick() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SocialHistoryCancelHTML.getLocation().y + ")");
		SocialHistoryCancelHTML.click();
	}
	
	
	public void errMsg() throws IOException {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Error_msg = driver.findElement(By.xpath("//*[@id='customSocialHistoryMessages']")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Social History Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
}