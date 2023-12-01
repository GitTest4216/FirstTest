package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.RunResult;

import testPackage.Base;

public class LoginData extends Base {

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	protected WebElement usernamehtml;
	@FindBy(how = How.XPATH, using = "//*[@id='pwd']")
	protected WebElement userpwdhtml;
	@FindBy(how = How.XPATH, using = "//*[@id='signInBtn']")
	protected WebElement signinhtml;

	static public void login_incorrect_data() {
		Username = DPLogin_data.getRow(1).getCell(5).getStringCellValue();
		UserPwd = DPLogin_data.getRow(2).getCell(6).getStringCellValue();
	}

	static public void login_correct_data() {
		Username = DPLogin_data.getRow(4).getCell(5).getStringCellValue();
		UserPwd = DPLogin_data.getRow(4).getCell(6).getStringCellValue();
	}

	public void verify_username_incorrect() throws InterruptedException {
		try {
			login_incorrect_data();
			Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			usernamehtml.clear();
			usernamehtml.sendKeys(Username);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Username - " + Username);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,//"Error occurred whileentering Username - " + Username);
		}
	}

	public void verify_password_incorrect() throws InterruptedException {
		try {
			login_incorrect_data();
			Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			userpwdhtml.sendKeys(UserPwd);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Password - ##### ");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileentering Password - #####");
		}
	}

	public void verify_username_correct() throws InterruptedException {
		try {

			login_correct_data();
			Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			usernamehtml.clear();
			usernamehtml.sendKeys(Username);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Username - " + Username);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,"Error occurred whileentering Username - " + Username);
		}
	}

	public void verify_password_correct() throws InterruptedException {
		try {

			login_correct_data();
			Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			userpwdhtml.sendKeys(UserPwd);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Password - ##### ");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileentering Password - #####");
		}

	}

	public void signInBtn() throws InterruptedException {
		try {

			Base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			signinhtml.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Click on Login button");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileClicking on Login button");

		}
	}

	public void pharmacyStoreSelection(String PageTitle) throws InterruptedException {

	}

	public void passFailStatus() throws IOException, InterruptedException {
		String actualUrl = "https://uat100.kloudscript.net:100/kloudscript/";
		if (!(driver.getCurrentUrl().equalsIgnoreCase(actualUrl))) {
			WebElement status = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div"));
			System.out.println(status.getText());
			String Error_msg = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div")).getText();
			System.out.println(Error_msg);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation Messages are:-" + "</b>" + Error_msg);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			
		} else {
			String status = DPLogin_data.getRow(4).getCell(7).getStringCellValue();
			System.out.println(status);
			String Error_msg = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div")).getText();
			System.out.println(Error_msg);
			Thread.sleep(2000);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}
	}
	
}
