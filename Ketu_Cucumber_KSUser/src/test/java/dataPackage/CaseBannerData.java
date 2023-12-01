package dataPackage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import java.util.logging.Logger;

import testPackage.Base;

public class CaseBannerData extends Base {
 
	final static Logger logger = Logger.getLogger(CaseBannerData.class.getName());

	WebDriverWait wait = new WebDriverWait(Base.driver, 15);
	@FindBy(how = How.XPATH, using = "//*[@id='notificationDialogCloseButton']")
	protected WebElement notificationDialogCloseBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriber-alert\"]")
	protected WebElement PatientCareTeamAlertBox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"prescriber-alert\"]/div[1]/h2/div/i")
	protected WebElement PatientCareTeamAlertBoxClosebtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-alert\"]")
	protected WebElement PatientAlertBox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollbox3\"]/div[4]/button")
	protected WebElement PatientAlertOkButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"patient-menu\"]/li[7]/a")
	protected WebElement CaseManagementTab;

	@FindBy(how = How.XPATH, using = "//*[@id='caseIdInBanner']")
	protected WebElement Casebannerlink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"listCaseHistory\"]/tbody/tr[1]/td[1]/a")
	protected WebElement seleFirstCase;

	@FindBy(how = How.CLASS_NAME, using = "modal-title")
	protected WebElement notificationTitle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"startCase\"]")
	protected WebElement NotificationAlertOkBtn;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail0_manualFollowUpDate\"]")
	protected WebElement followupdatetime0;

	@FindBy(how = How.XPATH, using = "//*[@id=\"workflowDiv0\"]/input")
	protected WebElement workflow0;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpStatusDiv0\"]/input")
	protected WebElement Followup_status0;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpReasonDiv0\"]/input")
	protected WebElement followupreason0;
	@FindBy(how = How.ID, using = "followUpDetail0_notes")
	protected WebElement Note0;

	@FindBy(how = How.XPATH, using = "//*[@id=\"addFollowUpDetails\"]")
	protected WebElement addlink;
	@FindBy(how = How.XPATH, using = "//*[@id=\"caseStatusTab\"]/div[2]")
	WebElement addlinkClassName;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail1_manualFollowUpDatedatepicker\"]")

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail1_manualFollowUpDate\"]")
	protected WebElement followup_datetime1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"workflowDiv1\"]/input")
	protected WebElement workflow1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpStatusDiv1\"]/input")
	protected WebElement followupstatus1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpReasonDiv1\"]/input")
	protected WebElement followupreason1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail1_notes\"]")

	protected WebElement note1;

//	@FindBy(how = How.ID, using = "addFollowUpDetails")
//	protected WebElement element1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail1\"]/div/div[7]")
	protected WebElement clickoutside;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail2_manualFollowUpDate\"]")
	protected WebElement followupdatetime2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"workflowDiv2\"]/input")
	protected WebElement workflow2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpStatusDiv2\"]/input")
	protected WebElement followupstatus2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpReasonDiv2\"]/input")
	protected WebElement followupreason2;

//	@FindBy(how = How.ID, using ="addFollowUpDetails")
//	protected WebElement elem;
	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail2_notes\"]")
	protected WebElement note2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpDetail1\"]/div/div[1]")
	protected WebElement noteScroll;

	@FindBy(how = How.ID, using = "saveCaseBannerButton")
	protected WebElement savebtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpPrescriptionDiv_0\"]/span/div/button")
	protected WebElement presdropdown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"followUpPrescriptionDiv_0\"]/span/div/ul/li[1]/a/label/input")
	protected WebElement presdropdownvalue;

	@FindBy(how = How.XPATH, using = "//*[@id=\"assignRoleDiv\"]/label")
	protected WebElement AssignSectionClick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"assignRoleDiv\"]/input")
	protected WebElement assignedrole;
	
	//*[@id="assignRoleDiv"]/input

//	@FindBy(how = How.XPATH, using = "//*[@id=\"assignedUserDiv\"]")
	@FindBy(how = How.XPATH, using = "//*[@id=\"assignedUserDiv\"]/input")
	protected WebElement assigneduser;

	@FindBy(how = How.XPATH, using = "//*[@id=\"pyRxIdDiv\"]/input")
	protected WebElement presciddropdown;

	public void openCaseBanner() throws InterruptedException {

// *********************** CaseBanner Link is displayed or not  *************************
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Casebannerlink.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Case Banner Link");
			// test.log(LogStatus.PASS, "Clicked on Case Banner Link");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileClicking on Case Banner Link");
		}

	}

	// *********************** Adding First Followup Data with All Positive values
	// *************************

	public void FirstFollowupDateTime(String FirstFollowupDate) throws InterruptedException {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + followupdatetime0.getLocation().y + ")");
			followupdatetime0.click();
			// followupdatetime0.clear();
			Thread.sleep(1000);
			followupdatetime0.sendKeys(FirstFollowupDate);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Added First Followup Date - " + FirstFollowupDate + " in Case Banner");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,//"Error occurred whileAdding First Followup Date - " + FirstFollowupDate + " in Case Banner");
		}
	}

	public void FirstWorkFlow(String workflow0value) throws InterruptedException {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + workflow0.getLocation().y + ")");
			workflow0.clear();
			Thread.sleep(1000);
			workflow0.sendKeys(workflow0value);
			workflow0.sendKeys(Keys.DOWN, Keys.ENTER);
			workflow0.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected First WorkFlow -> " + workflow0value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileSelecting First WorkFlow -> " + workflow0value);
		}
	}

	public void FirstFollowupStatus(String followupstatus0value) {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Followup_status0.getLocation().y + ")");
			Followup_status0.sendKeys(followupstatus0value);
			Followup_status0.sendKeys(Keys.DOWN);
			Followup_status0.sendKeys(Keys.ENTER);
			workflow0.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Selected First Followup Status -> " + followupstatus0value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileSelecting First Followup Status -> " + followupstatus0value);
		}
	}

	public void FirstFollowupReason(String followupreason0value) {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			followupreason0.sendKeys(followupreason0value);
			followupreason0.sendKeys(Keys.DOWN);
			followupreason0.sendKeys(Keys.ENTER);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Selected First Followup Reason -> " + followupreason0value);

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileSelecting First Followup Reason -> " + followupreason0value);
		}

	}

	public void FirstFollowupNote(String followupnote0value) throws InterruptedException {
		try {
			Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Note0.getLocation().y + ")");
			Actions action = new Actions(driver);
			action.moveToElement(Note0);
			action.perform();
			Note0.sendKeys(followupnote0value);
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					"Entered First Followup Note -> " + followupnote0value);
			// followupnote0value);
//		enableDropdownForPriscription();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + addlink.getLocation().y + ")");
			addlink.click();
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileEntering First Followup Note -> " + followupnote0value);
		}

		// *********************** Adding Second Followup Data with All Positive values
		// *************************
	}

	public void SecondFollowupDateTime(String secondFollowupDate) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + savebtn.getLocation().y + ")");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", savebtn);
		
		followup_datetime1.clear();
		followup_datetime1.click();
		Thread.sleep(1000);
		followup_datetime1.sendKeys(secondFollowupDate);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Added Second Followup Date -> " + secondFollowupDate + " in Case Banner");
		// test.log(LogStatus.PASS, "Added Second Followup Date -> " +
		// secondFollowupDate + " in Case Banner");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileAdding Second Followup Date -> " + secondFollowupDate + " in Case Banner");
		}
	}

	public void SecondWorkFlow(String workflow1value) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + workflow1.getLocation().y + ")");
		workflow1.clear();
		workflow1.sendKeys(workflow1value);
		workflow1.sendKeys(Keys.DOWN, Keys.ENTER);
		workflow1.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Second WorkFlow -> " + workflow1value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileSelecting Second WorkFlow -> " + workflow1value);
		}
		}

	public void SecondFollowupStatus(String followupstatus1value) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + followupstatus1.getLocation().y + ")");
		followupstatus1.sendKeys(followupstatus1value);
		followupstatus1.sendKeys(Keys.DOWN);
		followupstatus1.sendKeys(Keys.ENTER);
		workflow0.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Selected Second Followup Status -> " + followupstatus1value);
		// test.log(LogStatus.PASS, "Selected Second Followup Status -> " +
		// followupstatus1value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileSelecting Second Followup Status -> " + followupstatus1value);
		}
	}

	public void SecondFollowupReason(String followupreason1value) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + followupreason1.getLocation().y + ")");
		followupreason1.sendKeys(followupreason1value);
		followupreason1.sendKeys(Keys.DOWN);
		followupreason1.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Selected Second Followup Reason -> " + followupreason1value);
		// test.log(LogStatus.PASS, "Selected Second Followup Reason -> " +
		// followupreason1value);
		followupreason1.sendKeys(Keys.TAB);
		
	} catch (Exception e) {
		//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
				//"Error occurred whileSelecting Second Followup Reason -> " + followupreason1value);
	}
	}

	public void SecondFollowupNote(String note1value) throws InterruptedException {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		note1.sendKeys(note1value);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Second Followup Note -> " + note1value);
//		test.log(LogStatus.PASS, "Entered Second Followup Note -> " + note1value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileEntering Second Followup Note -> " + note1value);
		}
	}

	// *********************** Adding Third Followup Data with All Positive values
	// *************************

	public void ThirdFollowupDateTime(String ThirdFolloupDate) {
		try {
		Actions action = new Actions(driver);
		action.moveToElement(addlinkClassName);
		action.perform();
		addlink.click();

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + followupdatetime2.getLocation().y + ")");
		followupdatetime2.clear();
		followupdatetime2.click();
		followupdatetime2.sendKeys(ThirdFolloupDate);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Added Third Followup Date -> " + ThirdFolloupDate + " in Case Banner");
		// test.log(LogStatus.PASS, "Added Third Followup Date -> " + ThirdFolloupDate +
		// " in Case Banner");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileAdding Third Followup Date -> " + ThirdFolloupDate + " in Case Banner");
		}
	}

	public void ThirdWorkFlow(String workflow2value) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + workflow2.getLocation().y + ")");
		workflow2.clear();
		workflow2.sendKeys(workflow2value);
		workflow2.sendKeys(Keys.DOWN, Keys.ENTER);
		workflow2.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Third WorkFlow -> " + workflow2value);
		// test.log(LogStatus.PASS, "Selected Third WorkFlow -> " + workflow2value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileSelecting Third WorkFlow -> " + workflow2value);
		}
	}

	public void ThirdFollowupStatus(String followupstatus2value) {
		try {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + followupstatus2.getLocation().y + ")");
		followupstatus2.sendKeys(followupstatus2value);
		followupstatus2.sendKeys(Keys.DOWN);
		followupstatus2.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Selected Third Followup Status -> " + followupstatus2value);
		// test.log(LogStatus.PASS, "Selected Third Followup Status -> " +
		// followupstatus2value);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileSelecting Third Followup Status -> " + followupstatus2value);
		}
	}

	public void ThirdFollowupReason(String followupreason2value) {
		try {
			
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		followupreason2.sendKeys(followupreason2value);
		followupreason2.sendKeys(Keys.DOWN);
		followupreason2.sendKeys(Keys.ENTER);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Selected Third Followup Reason -> " + followupreason2value);
		// test.log(LogStatus.PASS, "Selected Third Followup Reason -> " +
		// followupreason2value);\
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred whileSelecting Third Followup Reason -> " + followupreason2value);
		}
	}

	public void ThirdFollowupNote(String followupnote2value) {
		try {
			
	
		wait.until(ExpectedConditions.elementToBeClickable(note2));
		note2.sendKeys(followupnote2value);
		note2.sendKeys(Keys.TAB, Keys.TAB);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered Third Followup Note -> " + followupnote2value);
		// test.log(LogStatus.PASS, "Entered Third Followup Note -> " +
		// followupnote2value);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Case Banner Added Successfully.");
		// test.log(LogStatus.PASS, );
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileEntering Third Followup Note -> " + followupnote2value);
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileAdding Case Banner Successfully.");
		}
	}

	// *********************** Select Assign Role and Assign User
	// *************************

	public void AssignUser(String assignedrolevalue, String assigneduservalue) {

		try {
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", savebtn);
			System.out.println("In Assign User Method-------------------");
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + assignedrole.getLocation().y + ")");
			assignedrole.clear();
			assignedrole.click();
			assignedrole.sendKeys(assignedrolevalue);
			System.out.println("Value of Dropdown" + assignedrolevalue);
			assignedrole.sendKeys(Keys.DOWN);
			assignedrole.sendKeys(Keys.ENTER);

//		wait.until(ExpectedConditions.elementToBeClickable(assigneduser));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + assigneduser.getLocation().y + ")");
				assigneduser.clear();
				assigneduser.click();
				Thread.sleep(2000);
				assigneduser.sendKeys(assigneduservalue);
				System.out.println("Value of Dropdown" + assigneduservalue);
				Thread.sleep(2000);
				assigneduser.sendKeys(Keys.DOWN);
				assigneduser.sendKeys(Keys.ENTER);
			}
 catch (Exception e) {
	 System.out.println("Not Found User and Role");
			
 }
		}

 
	public void RemoveFirstWorkFlow() {
		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + workflow0.getLocation().y + ")");
		workflow0.clear();
//		workflow0.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.BACK_SPACE,Keys.TAB);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Cleared Selected First WorkFlow -> ");
		// test.log(LogStatus.PASS, "Cleared Selected First WorkFlow -> ");
	}

	/*
	 * public void RemoveSelectedRoleAndUser() {
	 * 
	 * System.out.println("In Remove Method");
	 * 
	 * Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," +
	 * assignedrole.getLocation().y + ")"); assignedrole.clear();
	 * test.log(LogStatus.PASS, "Cleared Selected Assigned Role Value");
	 * ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," +
	 * assigneduser.getLocation().y + ")"); assigneduser.clear();
	 * test.log(LogStatus.PASS, "Cleared Selected Assigned User Value");
	 * 
	 * 
	 * }
	 */
	public void prescIDdropdown(String PrescIdValue) throws InterruptedException {
		try {

		Base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		presciddropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(presciddropdown));
		WebElement prescIDSearchElement = driver.findElement(By.xpath("//*[@id=\\\"pyRxIdDiv\\\"]/input"));
		prescIDSearchElement.clear();
		System.out.println("PRescID------" + PrescIdValue);
		prescIDSearchElement.sendKeys(PrescIdValue);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Enter PH RX ID");
		// test.log(LogStatus.PASS, "Enter PH RX ID");

		Thread.sleep(1000);
		
	} catch (Exception e) {
		//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred whileEntering PH RX ID");
	}
//		WebElement ele = Base.getExactListOfElements(driver,
//				driver.findElement(By.xpath(
//						"//*[@id='select2-genderType-results']")),
//				PatientGender);
//
//		ele.click();
//		test.log(LogStatus.PASS, "Select gender");
//		Thread.sleep(1000);
	}

	// *********************** Click on Save button
	// *************************

	public void saveButtonClick()

	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", savebtn);
		savebtn.click();
	}

//	private void enableDropdownForPriscription() {
//
//		Boolean prescdropdownflag = false;
//		try {
//			if (presdropdown.isDisplayed()) {
//				prescdropdownflag = true;
//			}
//		} catch (Exception e) {
//			prescdropdownflag = false;
//		}
//
//		try {
//			if (prescdropdownflag) {
//				wait.until(ExpectedConditions.elementToBeClickable(presdropdown));
//				presdropdown.click();
//				Thread.sleep(2000);
//				wait.until(ExpectedConditions.elementToBeClickable(presdropdownvalue));
//				presdropdownvalue.click();
//			} else {
//				logger.info("no prescription displayed");
//			}
//		} catch (Exception e) {
//			logger.info("Exception::::" + e.getMessage());
//		}
//
//	}

	public void err_msg() throws IOException, InterruptedException {
		String Error_msg = driver.findElement(By.xpath("//*[@id=\"customError\"]")).getText();
		System.out.println();
		System.out.println(Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "<b>" + "Validation messages are:-" + "</b>" + Error_msg);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}
	
	public void capture_Screenshot() throws IOException, InterruptedException {
		Thread.sleep(2000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
	}

}
