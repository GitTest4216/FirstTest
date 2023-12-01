package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
//import com.relevantcodes.extentreports.LogStatus;

public class Base<WindowsDriver> {
	public static WebDriver driver;
	public static String Username;
	public static String pwd;
	public static String UserPwd;
	private String TDSUsername;
	private String TDSPassword;
	public static String tdspwd;
	String LoginValidation;
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
			File DataPermission = new File(".\\KSAutomation2.0\\DataPermission_KS.xlsx");
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
	         OrLogin = or.getSheet("Login");
		
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
			
			String UserPwd = DpLogin.getRow(1).getCell(2).getStringCellValue();
//			String tdspwd = DpLogin.getRow(4).getCell(2).getStringCellValue();
//			byte[] decrypt = Base64.getDecoder().decode(tdspwd);
//			String TDSPassword = new String(decrypt);

//			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\Reports\\testDemo.html");
//			report = new ExtentReports();
//			report.attachReporter(htmlReporter);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void server_auth() throws InterruptedException {
			try {
				
	 			
				String User = DpModulePermission.getRow(2).getCell(1).getStringCellValue();
                     System.out.println("Login with " + User + " User");
                     
				WebDriverWait wait = new WebDriverWait(driver,15);
				String server = DpModulePermission.getRow(1).getCell(1).getStringCellValue(); // Get the Login
				
				
				switch (server) {
				case "Test1":
					driver.get("https://test1.kloudscript.net/kloudscript/auth/login");
					break;
				case "Training":
					driver.get("https://training.kloudscript.net/kloudscript/auth/login");
					break;
				case "Replica":
					driver.get("https://replicaketu.kloudscript.net/kloudscript/auth/login");
					break;
				case "Test2":
					driver.get("https://test2.kloudscript.net/kloudscript/auth/login");
					break;
				case "Test3":
					driver.get("https://test3.kloudscript.net/kloudscript/auth/login");
					break;
				case "UAT100":
					driver.get("https://uat100.kloudscript.net:100/kloudscript/auth/login");
					break;
				case "UAT251":
					driver.get("https://uat251.kloudscript.net:251/kloudscript/auth/login");
					break;
				case "Ketu":
					driver.get("https://ketu.kloudscript.net/kloudscript/auth/login");
					break;
				case "KsKetu":
					driver.get("https://ksketu.kloudscript.net/kloudscript/auth/login");
					System.out.println("KsKetu");
					break;
				default:
					System.out.println("Not able to Find the Server");
					break;
}
			}		
				catch (Exception e) {
					System.out.println("Server not found");
				}

					
				 // Get the Login
				//test.log(LogStatus.PASS, "Server: " + server); 
				// Permission from Excel for KS user Login
			WebDriverWait wait = new WebDriverWait(driver,15);
			String Loginpermission = DpModulePermission.getRow(2).getCell(1).getStringCellValue();
			
				if (Loginpermission.equals("KS")) { // Check the Login permission is for which user

					System.out.println("Login with KS User");
				//	test.log(LogStatus.PASS, "Login with KS User");

					if (null == DpLogin.getRow(1).getCell(1) || null == DpLogin.getRow(1).getCell(2)) {
						System.out.println("User and Password is Not added");
					} else {
						Username = DpLogin.getRow(1).getCell(1).getStringCellValue();
						pwd = DpLogin.getRow(1).getCell(2).getStringCellValue();
						String kssohtml = OrLogin.getRow(4).getCell(3).getStringCellValue();
						String emailuserhtml = OrLogin.getRow(6).getCell(3).getStringCellValue();
						String emailuserpwdhtml = OrLogin.getRow(8).getCell(4).getStringCellValue();
						String FirstNexthtml = OrLogin.getRow(7).getCell(3).getStringCellValue();
						String PwdNexthtml = OrLogin.getRow(9).getCell(3).getStringCellValue();

						WebElement KSSO = driver.findElement(By.id(kssohtml));
						((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + KSSO.getLocation().y + ")");
						KSSO.click();
						String winHandleBefore = driver.getWindowHandle();
						for (String winHandle : driver.getWindowHandles()) {
							driver.switchTo().window(winHandle);
						}

						WebElement UserEmail = driver.findElement(By.id(emailuserhtml));
						UserEmail.click();
						UserEmail.sendKeys(Username);

						wait.until(ExpectedConditions.elementToBeClickable(By.id(FirstNexthtml)));
						driver.findElement(By.id(FirstNexthtml)).click();

						wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(emailuserpwdhtml)));

						WebElement UserPass = driver.findElement(By.name(emailuserpwdhtml));
						UserPass.click();
						UserPass.sendKeys(pwd);

						Thread.sleep(1000);
						wait.until(ExpectedConditions.elementToBeClickable(By.id(PwdNexthtml)));
						driver.findElement(By.id(PwdNexthtml)).click();
						Thread.sleep(4000);
						driver.switchTo().window(winHandleBefore);
						CTUser = false;
					}

				} else if (Loginpermission.equals("OUTCOMES")) {
					System.out.println("Login with OUTCOMES User");
	               // test.log(LogStatus.PASS, "Login with TDS User");

						if (null == DpLogin.getRow(4).getCell(1) || null == DpLogin.getRow(4).getCell(2)) {
							System.out.println("User and Password is Not added");
						} else {

							TDSUsername = DpLogin.getRow(4).getCell(1).getStringCellValue();
							tdspwd = DpLogin.getRow(4).getCell(2).getStringCellValue();

							//System.out.println("User and Password  Not added");
							String tdshtml = OrLogin.getRow(10).getCell(3).getStringCellValue();
							String emailuserpwdhtml = OrLogin.getRow(13).getCell(4).getStringCellValue();
							String FirstNexthtml = OrLogin.getRow(12).getCell(3).getStringCellValue();
							String PwdNexthtml = OrLogin.getRow(12).getCell(3).getStringCellValue();

							// Perform the click operation that opens new window
							WebElement TDSSO = driver.findElement(By.id(tdshtml));
							((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + TDSSO.getLocation().y + ")");
							TDSSO.click();
	                 
							Thread.sleep(2000);
							String winHandleBefore = driver.getWindowHandle();
							// Perform the click operation that opens new window

							// Switch to new window opened
							for (String winHandle : driver.getWindowHandles()) {
								driver.switchTo().window(winHandle);
							}
//								
							Thread.sleep(2000);

							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"i0116\"]"))).click();
							WebElement UserEmail = driver.findElement((By.xpath("//*[@id=\"i0116\"]")));
							UserEmail.click();
							UserEmail.clear();
							UserEmail.sendKeys(TDSUsername);
							Thread.sleep(2000);
							wait.until(ExpectedConditions.elementToBeClickable(By.id(FirstNexthtml)));
							driver.findElement(By.id(FirstNexthtml)).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(emailuserpwdhtml)));
							WebElement UserPass = driver.findElement(By.name(emailuserpwdhtml));
							UserPass.click();
							Thread.sleep(2000);
							String tdspwd = DpLogin.getRow(4).getCell(2).getStringCellValue();
							byte[] decrypt = Base64.getDecoder().decode(tdspwd);
							String TDSPassword = new String(decrypt);
							UserPass.sendKeys(TDSPassword);	
							Thread.sleep(1000);
							wait.until(ExpectedConditions.elementToBeClickable(By.id(PwdNexthtml)));
							driver.findElement(By.id(PwdNexthtml)).click();
							Thread.sleep(3000);

							driver.findElement(By.id("idSIButton9")).click();
							Thread.sleep(3000);

							 System.out.println("OUTCOMES Login done successfully");
							 
							driver.switchTo().window(winHandleBefore);
							CTUser = false;
						}
				}
				else if (Loginpermission.equals("Pharmacy")) {
								// Pharmacy User Login
								System.out.println("Login with Pharmacy User");
								//test.log(LogStatus.PASS, "Login with Pharmacy User");

								Username = DpLogin.getRow(2).getCell(1).getStringCellValue();
								String UserPwd = DpLogin.getRow(2).getCell(2).getStringCellValue();
								// System.out.println(Username+" : "+UserPwd);
								String usernamehtml = OrLogin.getRow(1).getCell(3).getStringCellValue();
								String userpwdhtml = OrLogin.getRow(2).getCell(3).getStringCellValue();
								String signinhtml = OrLogin.getRow(3).getCell(3).getStringCellValue();
								// System.out.println(usernamehtml+" : "+userpwdhtml);

								Thread.sleep(2000);

								WebElement userwebelement = driver.findElement(By.id(usernamehtml));
								((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + userwebelement.getLocation().y + ")");
								userwebelement.click();
								userwebelement.sendKeys(Username);
								WebElement pwdwebelemt = driver.findElement(By.id(userpwdhtml));
								((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + pwdwebelemt.getLocation().y + ")");
								pwdwebelemt.click();
								pwdwebelemt.sendKeys(UserPwd);

								Thread.sleep(1000);
								driver.findElement(By.id(signinhtml)).click();
								try {
									LoginValidation = driver
											.findElement(By.xpath("/html/body/div[1]/section/section/section/div/div[2]/div"))
											.getText();
									System.out.println(LoginValidation);
								} catch (Exception e) {
									// TODO: handle exception
									e.getMessage();
								}
								String PageTitle = driver.getTitle();
								try {

									if (PageTitle.equalsIgnoreCase("Select Pharmacy Location")) {
										Thread.sleep(2000);
										driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/button/span[1]"))
												.click();// click
															// on
															// Store
															// dropdown
										Thread.sleep(2000);
										driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/input"))
												.sendKeys(Keys.DOWN); // Click
										Thread.sleep(1000);
										driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/input"))
												.sendKeys(Keys.DOWN);								// on
																		// First
																		// Option
										driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[1]/input"))
												.sendKeys(Keys.ENTER); // Click on First Option
										driver.findElement(By.xpath("/html/body/section/form/div/div[2]/div[2]/input")).click();																									// Proceed
																															
									} else {

									}
								} catch (Exception e) {
									// TODO: handle exception
									e.getMessage();
								}
								CTUser = true;

							}
					else {

						System.out.println("No Login Permission");
					}
			}

//
//		}
//		String path = System.getProperty("user.dir") + "\\Reports\\Ketu_Sanity_10_09_2023.html";
//	
//		
//		report = new ExtentReports();
//		
////		htmlrepoter = new ExtentSparkReporter(path);
//		htmlrepoter = new ExtentHtmlReporter(path);
//		
////		htmlrepoter.config().setTheme(Theme.DARK);
//
//		report.attachReporter(htmlrepoter);
//		
//		parent = report.createTest("Server Connection");
//		
//		
//		String server = DpModulePermission.getRow(1).getCell(1).getStringCellValue(); // Get the Login
//		test = report.createTest("Redirect to URL - " + server);
//
//		
////		parent.appendChild(test);
//
//		switch (server) {
//		case "Test1":
//			driver.get("https://test1.kloudscript.net/kloudscript/auth/login");
//			break;
//
//		case "Test2":
//			driver.get("https://test2.kloudscript.net/kloudscript/auth/login");
//			break;
//
//		case "Test3":
//			driver.get("https://test3.kloudscript.net/kloudscript/auth/login");
//			break;
//
//		case "UAT100":
//		driver.get("https://uat100.kloudscript.net:100/kloudscript/auth/login");
//			break;
//			
//		case "UAT251":
//			driver.get("https://uat251.kloudscript.net:251/kloudscript/auth/login");
//			break;
//
//		case "Ketu":
//			driver.get("https://ketu.kloudscript.net/kloudscript/auth/login");
//			break;
//
//		case "KsKetu":
//			driver.get("https://ksketu.kloudscript.net/kloudscript/auth/login");
//			break;
//		case "Demo":
//			driver.get("https://training.kloudscript.net/kloudscript/auth/login");
//			break;
//
//		default:
//			System.out.println("Not able to Find the Server");
//			break;
//		}
//		String currenturl = driver.getCurrentUrl();
//		test.log(LogStatus.PASS, "Navigate to " + "<b>" + currenturl + "</b>");
//		report.endTest(parent);
	

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
