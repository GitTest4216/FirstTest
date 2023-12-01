package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base<WindowsDriver> {
	public static WebDriver driver;
	public static String Username;
	public static String pwd;
	public static String UserPwd;

	protected static XSSFSheet DpModulePermission;
	static XSSFSheet DpLogin;
	static XSSFSheet DpOranization;
	public static XSSFSheet OrLogin;
	static XSSFSheet OrOrganization;
	protected static XSSFSheet DpPatient;
	static XSSFSheet OrPatient;
	protected static XSSFSheet DpFaxInbox;
	protected static XSSFSheet DpFaxSend;
	static XSSFSheet OrFaxInbox;
	static XSSFSheet OrClinicalProfile;
	protected static XSSFSheet DpClinicalProfile;
	protected static XSSFSheet DpClinicalProfileValidation;
	static XSSFSheet DpContact;
	static XSSFSheet OrContact;
	static XSSFSheet OrPayor_tab;
	protected static XSSFSheet DpPayor_tab;
	protected static XSSFSheet DpServicePreferences_tab;
	static XSSFSheet OrServicePreferences_tab;
	static XSSFSheet DpPrescriptionHistory_tab;
	static XSSFSheet OrPrescriptionHistory_tab;
	protected static XSSFSheet DpCaseManagement_tab;
	static XSSFSheet OrCaseManagement_tab;
	protected static XSSFSheet DpCommunication_Log;
	static XSSFSheet OrCommunication_Log;
	protected static XSSFSheet DpFCM;
	protected static XSSFSheet DpCaseBanner;
	protected static XSSFSheet DpPostBI_tab;
	protected static XSSFSheet DpPreBI_tab;
	protected static XSSFSheet DpCopay;
	protected static XSSFSheet DPPayor_tab_PositiveData;
	protected static XSSFSheet DPLogin_data;

	//protected static XSSFSheet MsLogin;
	protected boolean CTUser;

	protected static ExtentTest test;
	protected static ExtentReports report;
	protected static ExtentTest parent;
//	protected static ExtentSparkReporter htmlrepoter;
	protected static ExtentHtmlReporter htmlrepoter;

	@Test(priority = 0)
	public static void readdata() {
		try {
			File DataPermission = new File(".\\KSAutomation2.0\\DataPermission_Cucumber.xlsx");
			File ObjectRepository = new File(".\\KSAutomation2.0\\ObjectRepository.xlsx");
			//File Data = new File(".\\KSAutomation2.0\\LoginDemo.xlsx");

			FileInputStream datapermissionf = new FileInputStream(DataPermission);
			FileInputStream objectrepositaryf = new FileInputStream(ObjectRepository);
			//FileInputStream fis = new FileInputStream(Data);

			XSSFWorkbook dp = new XSSFWorkbook(datapermissionf);
			XSSFWorkbook or = new XSSFWorkbook(objectrepositaryf);
			//XSSFWorkbook ms = new XSSFWorkbook(fis);

			DpModulePermission = dp.getSheet("Module Permission");
			DpLogin = dp.getSheet("Login");
			DpOranization = dp.getSheet("Organization");
		
			DPLogin_data = dp.getSheet("login_data");
			DpPatient = dp.getSheet("Patient");
		
			DpFaxInbox = dp.getSheet("FaxInbox");
			DpFaxSend = dp.getSheet("FaxSend");
		
		
			DpContact = dp.getSheet("Contact");
		
			DpPayor_tab = dp.getSheet("Payor_tab");
//		
			DpServicePreferences_tab = dp.getSheet("Service_preferencestab");
		
			DpPrescriptionHistory_tab = dp.getSheet("PrescriptionHistoryTab");
			
			DpCaseManagement_tab = dp.getSheet("Case");
			DpCommunication_Log = dp.getSheet("Communication_Log");
			
			
			DpClinicalProfile = dp.getSheet("Clinical_Profile");
			DpClinicalProfileValidation = dp.getSheet("Clinical_FieldVerification");
			DpFCM = dp.getSheet("FCM");
//		
			DpPostBI_tab = dp.getSheet("PostBI");
			DpPreBI_tab = dp.getSheet("PreBI");
			
			DpCopay = dp.getSheet("Copaycard");
			DpCaseBanner = dp.getSheet("CaseBanner");
			DPPayor_tab_PositiveData = dp.getSheet("Payor_tab_PositiveData");

//			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\Reports\\testDemo.html");
//			report = new ExtentReports();
//			report.attachReporter(htmlReporter);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void server_auth() {

		String path = System.getProperty("user.dir") + "\\Reports\\Ketu_Sanity_10_09_2023.html";
	
		
		report = new ExtentReports();
		
//		htmlrepoter = new ExtentSparkReporter(path);
		htmlrepoter = new ExtentHtmlReporter(path);
		
//		htmlrepoter.config().setTheme(Theme.DARK);

		report.attachReporter(htmlrepoter);
		
		parent = report.createTest("Server Connection");
		
		
		String server = DpModulePermission.getRow(1).getCell(1).getStringCellValue(); // Get the Login
		test = report.createTest("Redirect to URL - " + server);

		
//		parent.appendChild(test);

		switch (server) {
		case "Test1":
			driver.get("https://test1.kloudscript.net/kloudscript/auth/login");
			break;

		case "Test2":
			driver.get("https://test2.kloudscript.net/kloudscript/auth/login");
			break;

		case "Test3":
			driver.get("https://test3.kloudscript.net/kloudscript/auth/login");
			break;

		case "UAT100":
			//driver.get("https://uat100.kloudscript.net:100/kloudscript/auth/login");
			driver.get("https://uat100.kloudscript.net:100/kloudscript/case/editCase?caseId=5808&tenantId=2258a8c8457565100145758dedae0000");
			break;
			
		case "UAT251":
			driver.get("https://uat251.kloudscript.net:251/kloudscript/auth/login");
			break;

		case "Ketu":
			driver.get("https://ketu.kloudscript.net/kloudscript/auth/login");
			break;

		case "KsKetu":
			driver.get("https://ksketu.kloudscript.net/kloudscript/auth/login");
			break;
		case "Demo":
			driver.get("https://training.kloudscript.net/kloudscript/auth/login");
			break;

		default:
			System.out.println("Not able to Find the Server");
			break;
		}
		String currenturl = driver.getCurrentUrl();
//		test.log(LogStatus.PASS, "Navigate to " + "<b>" + currenturl + "</b>");
//		report.endTest(parent);
	}

	@BeforeTest
	public void beforeTest() {
		String exePath = ".\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
//		driver.quit();
//		test.log(LogStatus.PASS, "Close the browser");
//		test.log(LogStatus.PASS, "TEST Completed");
//		report.endTest(parent);

		report.flush();
	}

	public static String CaptureScreen(WebDriver driver) throws IOException {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String path = System.getProperty("user.dir") + "\\Reports\\KETU_Cucumeber.html";

		File destfile = new File(".\\images\\" + System.currentTimeMillis() + ".png");
		String absPath = destfile.getAbsolutePath();
		FileUtils.copyFile(srcfile, destfile);
		return absPath;
	}
	
	

	public static WebElement getExactListOfElements(WebDriver p_driver, WebElement by, String itemToFound) {
		java.util.List<WebElement> mlist = by.findElements(By.tagName("li"));

		WebElement eleToFound = null;
		// System.out.println("getExactListOfElements() itemToFound: " + itemToFound);
		for (WebElement webElement : mlist) {
			String itemName = webElement.getText();
			// System.out.println("getExactListOfElements() itemName is : " + itemName);
			if (itemName.trim().equalsIgnoreCase(itemToFound)) {

				eleToFound = webElement;

				break;
			}

		}

		return eleToFound;

	}

	public static void patientCarePopUp() throws InterruptedException {
		try {

			WebElement PatientCare = driver.findElement(By.xpath("//*[@id=\"prescriber-alert\"]/div[1]/h2"));

			if (PatientCare.isDisplayed()) {

				PatientCare.click();
				WebElement Close = driver.findElement(By.xpath("//*[@id=\"prescriber-alert\"]/div[1]/h2/div/i"));
				Thread.sleep(500);
				Close.click();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void patientAlertPopUp() throws InterruptedException {

		try {

			WebElement PatientAlert = driver.findElement(By.xpath("//*[@id=\"patient-alert\"]/div/div/h2"));

			if (PatientAlert.isDisplayed()) {

				PatientAlert.click();
				WebElement Closebtn = driver.findElement(By.xpath("//*[@id=\"patient-alert\"]/div/div/h2/div/i"));
				Thread.sleep(500);
				Closebtn.click();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void caseOpenSessionPopup() throws InterruptedException {
		try {

			WebElement Alert = driver.findElement(By.xpath("//*[@id=\"notificationAlert\"]/div/div"));

			if (Alert.isDisplayed()) {

				Alert.click();
				WebElement Yesbtn = driver.findElement(By.xpath("//*[@id=\"startCase\"]"));
				Thread.sleep(500);
				Yesbtn.click();

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void captureScreenshot() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

}
