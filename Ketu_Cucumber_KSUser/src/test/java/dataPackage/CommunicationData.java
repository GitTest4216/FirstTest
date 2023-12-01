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

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class CommunicationData extends Base{

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='patient-menu']/li[8]/a")
	static protected WebElement communicationtabHTML;

	
	@FindBy(how = How.XPATH, using = "/html/body/section/section[2]/a")
	protected WebElement add_Log;
	
	@FindBy(how = How.XPATH, using = "//*[@id='callType']")
	protected WebElement call_Type;
	
	@FindBy(how = How.XPATH, using = "//*[@id='note']")
	protected WebElement notes;
	
	@FindBy(how = How.XPATH, using = "//*[@id='buttonGroup']/div/input[1]")
	protected WebElement save;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"phoneNumber\"]")
	protected WebElement email;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"receiver\"]")
	protected WebElement receiver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/a")
	protected WebElement ComLogResetHTML;
	
	@FindBy(how = How.XPATH, using = "/html/body/section/div[1]/div[2]/div/div/div[2]/div[3]/div/span/b")
	protected WebElement clickOutside;
	
	public void communicationTabClick() throws InterruptedException {
		
	
		navigateToCommunicationLogTab();
	try {
		Thread.sleep(3000);
		WebElement MDAuth = driver
				.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[1]/div[4]"));
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[1]/div[4]"))));
		MDAuth.click();

		Thread.sleep(4000);

	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Patient Not Found for Communication Log");
	}
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(communicationtabHTML));
		communicationtabHTML.click();
		Thread.sleep(4000);
		
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on Communication Log tab");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on Communication Log tab");
		}
	}
	

	
	public void addComLog() throws InterruptedException {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + add_Log.getLocation().y + ")");
		add_Log.click();
		Thread.sleep(4000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Add Communication Log Click");
		//test.log(LogStatus.PASS, "Add Communication Log Click");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Adding Communication Log Click");
		}
	}
	
	public void callTypeadd(String callTypeValue) throws InterruptedException {
		try {
	Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + call_Type.getLocation().y + ")");
	Select CallTypeElement = new Select(call_Type);
	CallTypeElement.selectByVisibleText(callTypeValue);
	Thread.sleep(2000);
	ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Selected Call Type value - " +callTypeValue);
	//test.log(LogStatus.PASS, "Selected Call Type value - " +callTypeValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Call Type value - " +callTypeValue);
		}
	}
	
	
	public void receiver(String receiverValue) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select receivereElement = new Select(receiver);
	receivereElement.selectByVisibleText(receiverValue);
	Thread.sleep(2000);
	ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Receiver value - " +receiverValue);
	//test.log(LogStatus.PASS, "Selected Receiver value - " +receiverValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Selecting Receiver value - " +receiverValue);
		}
	}
	
	public void Email(String EmailValue) {
		try {
	Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	email.click();
	email.clear();
	email.sendKeys(EmailValue);
	ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered Email ID value - " +EmailValue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Entering Email ID value - " +EmailValue);
		}
}
	
	public void Notes(String notesvalue) {
		try {
	Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	notes.click();
	notes.clear();
	notes.sendKeys(notesvalue);
	ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Entered Notes value - " +notesvalue);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Entering Notes value - " +notesvalue);
		}
	}

	
	public void save()
	{
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		save.click();
	}
	
	public void errMsg() throws IOException {
		String Error_msg = driver.findElement(By.xpath("/html/body/section/ul")).getText();
		System.out.println();
		System.out.println(Error_msg);
		System.out.println("Communication Tab :-");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void comLogResetBtn() {
		try {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ComLogResetHTML.getLocation().y + ")");
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ComLogResetHTML.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,"Click on reset button");
		//test.log(LogStatus.PASS, "Click on reset button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred while Clicking on reset button");
		}
	}
	
	public void navigateToCommunicationLogTab() throws InterruptedException {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + clickOutside.getLocation().y + ")");
		clickOutside.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + communicationtabHTML.getLocation().y + ")");
		communicationtabHTML.click();
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("Alert Not Found");
		}
		Thread.sleep(2000);
		System.out.println("Navigate to Communication Log Successfully");
	}
}
