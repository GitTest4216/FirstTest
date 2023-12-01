package dataPackage;

import java.io.IOException;
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

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class AddConsentData  extends Base{
	protected WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-relationship-container\"]")
	protected WebElement Relationshipvalue;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-consentToRole-container\"]")
	protected WebElement ProvideToUserRole;

	@FindBy(how = How.XPATH, using = "//*[@id=\"consentToDiv\"]/div/div/div/span/span[1]/span")
	protected WebElement ProvideToUserName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"consentMethodbtnMultiselectDropdown\"]")
	protected WebElement Method;

	@FindBy(how = How.XPATH, using = "//*[@id=\"addNewConsent\"]")
	protected WebElement Addlink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-consentForList0_consentFor-container\"]")
	protected WebElement ConsentType;

	@FindBy(how = How.XPATH, using = "//*[@id=\"consentForList0_consentForActivityList0\"]")
	protected String PAclick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected WebElement SaveAllConsent;

	public void enterRelationshipValue(String relationshipValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Relationshipvalue.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement relationShipSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		relationShipSearchElement.clear();
		relationShipSearchElement.sendKeys(relationshipValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter Value in Relationship dropdown" + " " + relationshipValue);
		//test.log(LogStatus.PASS, "Enter Value in Relationship dropdown" + " " + relationshipValue);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while Entering Value in Relationship dropdown" + " " + relationshipValue);
		}
	}

	public void enterProvideToroleValue(String provideToroleValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProvideToUserRole.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement UserRoleSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		UserRoleSearchElement.clear();
		UserRoleSearchElement.sendKeys(provideToroleValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter Value in ProvideToUserRole dropdown" + " " + provideToroleValue);
		//test.log(LogStatus.PASS, "Enter Value in ProvideToUserRole dropdown" + " " + provideToroleValue);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while Entering Value in ProvideToUserRole dropdown" + " " + provideToroleValue);
		}
	}

	public void enterProvideToUsernameValue(String provideTorUserNameValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ProvideToUserName.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement UserNameSearchElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		UserNameSearchElement.clear();
		UserNameSearchElement.sendKeys(provideTorUserNameValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter Value in ProvideToUserName dropdown" + " " + provideTorUserNameValue);
		//test.log(LogStatus.PASS, "Enter Value in ProvideToUserName dropdown" + " " + provideTorUserNameValue);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while Entering Value in ProvideToUserName dropdown" + " " + provideTorUserNameValue);
		}
	}

	public void enterMethodValue(String methodValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Method.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"consentMethodtooltipDiv\"]/ul/div[1]/div[1]/div/input")));
		WebElement MethodSearchElement = driver
				.findElement(By.xpath("//*[@id=\"consentMethodtooltipDiv\"]/ul/div[1]/div[1]/div/input"));
		MethodSearchElement.clear();
		MethodSearchElement.sendKeys(methodValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter Value in Method dropdown" + " " + methodValue);
		//test.log(LogStatus.PASS, "Enter Value in Method dropdown" + " " + methodValue);
		Thread.sleep(1000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while Entering Value in Method dropdown" + " " + methodValue);
		}
	}

	public void selectMethodValue(String methodvalue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Method.getLocation().y + ")");

		Method.click();
		Method.sendKeys(methodvalue);
		Thread.sleep(4000);

		WebElement Methodvalue = driver.findElement(By.xpath("//*[@id=\"consentMethodtooltipDiv\"]/ul/li[3]/label"));
		Methodvalue.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Select Method Value");
		//test.log(LogStatus.PASS, "Select Method Value");

		WebElement outsideclick = driver.findElement(By.xpath("//*[@id=\"consentForm\"]/section/div[1]"));
		outsideclick.click();
		Thread.sleep(3000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while Selecting Method Value");
		}
	}
	
	public void enterConsentTypeValue(String consentTypeValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ConsentType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
		WebElement consentTypeElement = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		consentTypeElement.clear();
		consentTypeElement.sendKeys(consentTypeValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Enter Value in ConsentType dropdown" + " " + consentTypeValue);
		//test.log(LogStatus.PASS, "Enter Value in ConsentType dropdown" + " " + consentTypeValue);
		Thread.sleep(3000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while Entering Value in ConsentType dropdown" + " " + consentTypeValue);
		}
	}

	public void selectConsentTypeValue(String consentTypeValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ConsentType.getLocation().y + ")");

		ConsentType.click();
		Thread.sleep(4000);

		WebElement ConsentTypePath = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		ConsentTypePath.sendKeys(consentTypeValue);

		ConsentTypePath.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Select Consent Type Value");
		//test.log(LogStatus.PASS, "Select Consent Type Value");
		Thread.sleep(3000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while selecting Consent Type Value");
		}
	}

	public void addConsentTypeValue() throws InterruptedException {
		WebElement PAclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList0\"]"));
		PAclick.click();
		Thread.sleep(3000);
		
		WebElement Appealclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList1\"]"));
		Appealclick.click();
		Thread.sleep(3000);
		
		WebElement Copayclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList2\"]"));
		((JavascriptExecutor) driver)
		.executeScript("window.scrollTo(0," + Copayclick.getLocation().y + ")");
		Copayclick.click();
		Thread.sleep(3000);
		
		WebElement MFRclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList3\"]"));
		MFRclick.click();
		Thread.sleep(3000);
		
		WebElement Foundationclick = driver.findElement(By.xpath("//*[@id=\"consentForList0_consentForActivityList4\"]"));
		Foundationclick.click();
		Thread.sleep(3000);
	}

	public void saveConsentClick() {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAllConsent.getLocation().y + ")");
		SaveAllConsent.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on Save Consent Button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while clicking on Save Consent Button");
		}
	}
	
	public void saveAll() throws InterruptedException
	{
		try {
		WebElement CallConducted = driver.findElement(By.id("tasktypeCheckBox9"));
		((JavascriptExecutor) driver)
				.executeScript("window.scrollTo(0," + CallConducted.getLocation().y + ")");
		CallConducted.click();
		Thread.sleep(3000);

		WebElement SaveAll = driver.findElement(By.xpath("//*[@class='save-btn']/*[1]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAll.getLocation().y + ")");
		SaveAll.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Patient Consent Added");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error Occurred while adding Patient Consent");
		}
		//test.log(LogStatus.PASS, "Patient Consent Added");
	}
	
	public void windowHandle() throws InterruptedException{
		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);
			driver.manage().window().maximize();
		}
	}
	

	public void err_msg() throws IOException {
		String Error_msg = driver.findElement(By.xpath("/html/body/section/ul[2]")).getText();
		System.out.println();
		System.out.println(Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void capture_Screenshot() throws IOException {
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
}
