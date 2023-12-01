
package dataPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import testPackage.Base;

public class POSData extends Base<Object> {
	protected WebDriverWait wait = new WebDriverWait(Base.driver, 15);

	@FindBy(how = How.CLASS_NAME, using = "seleCaseLeftMenuPointOfSale")
	protected WebElement POSWorkflowElement;
	@FindBy(how = How.CLASS_NAME, using = "seleCaseLeftMenuCordinationOfDispense")
	protected WebElement CODWorkflowElement;
	@FindBy(how = How.CLASS_NAME, using = "seleCaseLeftMenuPatientEncounters")
	protected WebElement PEWorkflowElement;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Confirmation of Order")
	protected WebElement ClickPOSActivityLink;
	@FindBy(how = How.XPATH, using = "//*[@id=\"activityPrior Authorization\"]/div/div/div[2]/div[1]/div/div[1]/div/a")
	protected WebElement AddPALinkHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-paType-container\"]")
	protected WebElement PATypeDropdown;
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	protected WebElement PATypeSearch;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-status-container\"]")
	protected WebElement PAStatusDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-reason-container\"]")
	protected WebElement PAReasonDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-initiatedBy-container\"]")
	protected WebElement PAInitiatedByDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id=\"selectLink\"]")
	protected WebElement SelectPrescLinkHTMLs;
	@FindBy(how = How.XPATH, using = "//*[@id=\"okButton\"]")
	protected WebElement ClickOkBtn;
	@FindBy(how = How.ID, using = "select2-insurance-container")
	protected WebElement PAInsurance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"startDate\"]")
	protected WebElement PADateInitiatedHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submitDate\"]")
	protected WebElement PADateSubmittedHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"expectedResponseDate\"]")
	protected WebElement PAExpectedResponseDateHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"resultDate\"]")
	protected WebElement PADecisionDateHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"expirtyDate\"]")
	protected WebElement PAExpirationDateHTML;
	@FindBy(how = How.ID, using = "paNumber")
	protected WebElement PARefCaseNumberHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[1]")
	protected WebElement PASaveBtnHTML;
	@FindBy(how = How.XPATH, using = "//*[@id=\"buttonGroup\"]/div/input[2]")
	protected WebElement paClosebtn;
	@FindBy(how = How.XPATH, using = "/html/body/section/div[1]/div[2]/div/div/div[2]/div[3]/div/span/b")
	protected WebElement clickOutside;

	public void clickOnPOSworkflow() throws InterruptedException {
		try {

			Thread.sleep(6000);
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + POSWorkflowElement.getLocation().y + ")");
			Thread.sleep(4000);
			POSWorkflowElement.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on POS Workflow");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on POS Workflow");
		}
	}

	public void clickCOD() throws InterruptedException {
		try {

			Thread.sleep(2000);
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + CODWorkflowElement.getLocation().y + ")");
			Thread.sleep(4000);
			CODWorkflowElement.click();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on COD Workflow");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on COD Workflow");

		}

	}

	public void clickOnPE() throws InterruptedException {
		try {
	
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PEWorkflowElement.getLocation().y + ")");
		Thread.sleep(2000);
		PEWorkflowElement.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on PE Workflow");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on PE Workflow");
		}
	}

	public void openPOSActivity() throws InterruptedException {
		try {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + ClickPOSActivityLink.getLocation().y + ")");

		ClickPOSActivityLink.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on POS Activity");
		Thread.sleep(2000);
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on POS Activity");
		}

	}

	public void selectOrderSoldMethod() throws InterruptedException {
		try {
	
		driver.findElement(
				By.xpath("//*[@id=\"activityConfirmation of Order\"]/div/div/div[2]/div/div[2]/div[4]/div[1]/div[1]"))
				.click();
		Select OrderSoldMethod = new Select(driver.findElement(By.xpath("//*[@id=\"orderSoldMethod0\"]")));
		OrderSoldMethod.selectByVisibleText("Picked-up at Pharmacy");
		Thread.sleep(1000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Order Sold Method - Picked-up at Pharmacy");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Order Sold Method - Picked-up at Pharmacy");
		}
	}

	public void selectOrderSoldDate() throws InterruptedException {
		try {
			
		WebElement OrderSoldDate = driver.findElement(By.xpath("//*[@id=\"orderSoldDate0\"]"));
		OrderSoldDate.click();
		OrderSoldDate.sendKeys("10/26/2023");
		Thread.sleep(1000);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Order Sold Date - 10/26/2023");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Order Sold Date - 10/26/2023");
		}
	}

	public void selectOrderSoldTime() throws InterruptedException {
		try {
		
		WebElement OrderSoldTime = driver.findElement(By.xpath("//*[@id=\"orderSoldTime0\"]"));
		OrderSoldTime.click();
		OrderSoldTime.sendKeys("12:02 AM");
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Order Sold Time - 12:02 AM");
		
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Order Sold Time - 12:02 AM");
		}
	}

	public void SaveAllbutton() throws InterruptedException {
		WebElement YesAll = driver.findElement(By.xpath("//input[@id='statusTrue']"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + YesAll.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(YesAll));
		YesAll.click();
		WebElement SaveAll = driver.findElement(By.xpath("//*[@class='save-btn']/*[1]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAll.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(SaveAll));
		SaveAll.click();

	}

	public void caseBannerpopup() throws InterruptedException {

		try {
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(
					driver.findElement(By.xpath("//*[@id=\"updateFollowupDate\"]/div/div/div[3]/button"))));
			driver.findElement(By.xpath("//*[@id=\"updateFollowupDate\"]/div/div/div[3]/button")).click();
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(
					driver.findElement(By.xpath("//*[@id='displayCaseBanner']/div/div/div[1]/button"))));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='displayCaseBanner']/div/div/div[1]/button")).click();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

	public void saveAll() throws InterruptedException {
		try {
			
		WebElement SaveAll = driver.findElement(By.xpath("//*[@class='save-btn']/*[1]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAll.getLocation().y + ")");
		SaveAll.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Save All button");

		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on Save All button");
		}
	}

	public void WorkFlowcomplete() throws InterruptedException {

		parent = report.createTest("Case Complete");
		test = report.createTest("Verify Case is Completed or not");
		List<WebElement> workflowcount = driver.findElements(By.xpath("//*[@id=\"caseForm\"]/div/div[1]/ul/li"));
		System.out.println("Workflow count is " + workflowcount.size());
		for (int j = 1; j <= workflowcount.size(); j++) {
			Thread.sleep(1000);
			WebElement workflow = driver.findElement(By.xpath("//form/div[1]/div[1]/ul[1]/li[" + j + "]/a[1]"));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + workflow.getLocation().y + ")");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", workflow);
			wait.until(ExpectedConditions.elementToBeClickable(
					driver.findElement(By.xpath("//form/div[1]/div[1]/ul[1]/li[" + j + "]/a[1]"))));
			Thread.sleep(1000);
			workflow.click();
			Thread.sleep(1000);
			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));
			System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
					(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText() + " Number of elements:"
							+ elements.size()));
			for (int i = 0; i < elements.size(); i++) {
				String coreid = elements.get(i).getAttribute("id");
				// System.out.println("Core id is "+coreid);
				String[] part = coreid.split("(?<=\\D)(?=\\d)");
				// System.out.println(part[0]);
				// System.out.println(part[1]);
				// System.out.println("Radio button text:" +
				// elements.get(i).getAttribute("id"));
				try {
					WebElement ALLNAActivityRadio = driver
							.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
					((JavascriptExecutor) driver)
							.executeScript("window.scrollTo(0," + ALLNAActivityRadio.getLocation().y + ")");
					Thread.sleep(1000);
					ALLNAActivityRadio.click();
					Thread.sleep(1000);
					if (driver.findElement(By.partialLinkText("Prescription Intake")).isDisplayed()) {
						WebElement PrescriptionIntakeActivity = driver.findElement(By.linkText("Prescription Intake"));
						System.out.println(PrescriptionIntakeActivity);
						String prescriptionactivitycoreid = PrescriptionIntakeActivity.getAttribute("href");
						// System.out.println("href is "+ prescriptionactivitycoreid);
						String[] linkpart = prescriptionactivitycoreid.split("(?<=\\D)(?=\\d)");
						System.out.println(linkpart[0]);
						System.out.println(linkpart[1]);
						String lastOne = linkpart[linkpart.length - 1];

						if (lastOne.equals(part[1])) {

							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							Thread.sleep(2000);
							CompleteActivityRadio.click();
						} else {

							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));

							NAActivityRadio.click();
						}

						Thread.sleep(2000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {

					String PreBIPermision1 = DpModulePermission.getRow(15).getCell(1).getStringCellValue();
					if (driver.findElement(By.partialLinkText("Pre-BI Adjudication")).isDisplayed()
							&& PreBIPermision1.equals("YES")) {

						WebElement PreBiactivity = driver.findElement(By.partialLinkText("Pre-BI Adjudication"));

						String PreBiactivityid = PreBiactivity.getAttribute("href");

						String[] linkpart = PreBiactivityid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							NAActivityRadio.click();
						}
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					if (driver.findElement(By.partialLinkText("Patient Welcome Call & Consent")).isDisplayed()) {
						WebElement Consentactivity = driver
								.findElement(By.partialLinkText("Patient Welcome Call & Consent"));

						String Consentactivityid = Consentactivity.getAttribute("href");

						String[] linkpart = Consentactivityid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							NAActivityRadio.click();
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {

					if (driver.findElement(By.partialLinkText("Prior Authorization")).isDisplayed()) {
						WebElement PAActivity = driver.findElement(By.partialLinkText("Prior Authorization"));

						String PAActivityid = PAActivity.getAttribute("href");

						String[] linkpart = PAActivityid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							NAActivityRadio.click();
						}
					} else {

						System.out.println("PA Link is not displayed");
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

				try {

					if (driver.findElement(By.partialLinkText("Appeal")).isDisplayed()) {
						WebElement AppealActivity = driver.findElement(By.partialLinkText("Appeal"));

						String AppealActivityid = AppealActivity.getAttribute("href");

						String[] linkpart = AppealActivityid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							NAActivityRadio.click();
						}
					} else {

						System.out.println("Appeal Link is not displayed");
					}
//			
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {

					if (driver.findElement(By.partialLinkText("Co-Pay Card")).isDisplayed()) {
						WebElement CopayBIActivity = driver.findElement(By.linkText("Co-Pay Card"));

						String copayactivitycoreid = CopayBIActivity.getAttribute("href");

						String[] linkpart = copayactivitycoreid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							Thread.sleep(2000);
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							Thread.sleep(2000);
							NAActivityRadio.click();
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {

					if (driver.findElement(By.partialLinkText("Foundation Support")).isDisplayed()) {
						WebElement FoundationBIActivity = driver.findElement(By.linkText("Foundation Support"));

						String foundationactivitycoreid = FoundationBIActivity.getAttribute("href");

						String[] linkpart = foundationactivitycoreid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							Thread.sleep(2000);
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							Thread.sleep(2000);
							NAActivityRadio.click();
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					String PostBIPermision1 = DpModulePermission.getRow(16).getCell(1).getStringCellValue();

					if (driver.findElement(By.partialLinkText("Post-BI Adjudication")).isDisplayed()
							&& PostBIPermision1.equals("YES")) {
						WebElement PostbiBiactivity = driver.findElement(By.partialLinkText("Post-BI Adjudication"));

						String PostbiBiactivityid = PostbiBiactivity.getAttribute("href");

						String[] linkpart = PostbiBiactivityid.split("(?<=\\D)(?=\\d)");

						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							NAActivityRadio.click();
						}
					} else {

						System.out.println("Post-BI Adjudication Not Found or Post Bi permission is No");
					}
//					
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					if (driver.findElement(By.partialLinkText("Confirmation of Order")).isDisplayed()) {
						WebElement ConfirmoforderActivity = driver
								.findElement(By.partialLinkText("Confirmation of Order"));
						// System.out.println(PrescriptionIntakeActivity);
						String confirmorderactivitycoreid = ConfirmoforderActivity.getAttribute("href");
						// System.out.println("href is "+ prescriptionactivitycoreid);
						String[] linkpart = confirmorderactivitycoreid.split("(?<=\\D)(?=\\d)");
						// System.out.println(linkpart[0]);
						// System.out.println(linkpart[1]);
						String lastOne = linkpart[linkpart.length - 1];
						if (lastOne.equals(part[1])) {
							WebElement CompleteActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + CompleteActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
							CompleteActivityRadio.click();
						} else {
							WebElement NAActivityRadio = driver
									.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
							((JavascriptExecutor) driver)
									.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
							wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
							NAActivityRadio.click();
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			WebElement YesAll = driver.findElement(By.xpath("//input[@id='statusTrue']"));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + YesAll.getLocation().y + ")");
			wait.until(ExpectedConditions.elementToBeClickable(YesAll));
			YesAll.click();
			WebElement SaveAll = driver.findElement(By.xpath("//*[@class='save-btn']/*[1]"));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + SaveAll.getLocation().y + ")");
			wait.until(ExpectedConditions.elementToBeClickable(SaveAll));
			SaveAll.click();
			if (j == workflowcount.size()) {
				System.out.println("Case Completed");
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Case Completed");
			} else {
				try {
					Thread.sleep(4000);
					wait.until(ExpectedConditions.elementToBeClickable(
							driver.findElement(By.xpath("//*[@id=\"updateFollowupDate\"]/div/div/div[3]/button"))));
					driver.findElement(By.xpath("//*[@id=\"updateFollowupDate\"]/div/div/div[3]/button")).click();
					Thread.sleep(4000);
					wait.until(ExpectedConditions.elementToBeClickable(
							driver.findElement(By.xpath("//*[@id='displayCaseBanner']/div/div/div[1]/button"))));
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='displayCaseBanner']/div/div/div[1]/button")).click();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					// TODO: handle exception
				}
			}
		}
		/*
		 * parent.appendChild(test); report.endTest(parent);
		 */
	}

	public void Refillcase() throws InterruptedException {
		try {
			
		
		Thread.sleep(3000);
		WebElement CaseHistory = driver.findElement(By.className("seleCaseHistory"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + CaseHistory.getLocation().y + ")");
		wait.until(ExpectedConditions.elementToBeClickable(By.className("seleCaseHistory")));
		Thread.sleep(2000);
		CaseHistory.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Clicked on Case History link");
		Thread.sleep(3000);
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Clicking on Case History link");
		}
		try {
			
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// Click on Radio button for create manual refill case
		WebElement Refillcase = driver.findElement(By.xpath("//*[@id=\'refillCase\']"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + Refillcase.getLocation().y + ")");
		Refillcase.click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,
				"Selected Radio Button to create the Manual Refill Case");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					//"Error occurred while Selecting Radio Button to create the Manual Refill Case");
		}
		try {
		
			Thread.sleep(2000);
		// select prescription and create refill case
		driver.findElement(By.xpath("//*[@id=\'selectPrescription\']")).click();
		driver.findElement(By.xpath("//*[@id=\'prescriptionDialog\']/div/div/div[3]/a")).click();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Selected Prescription from the list");
		} catch (Exception e) {
			//ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, //"Error occurred while Selecting Prescription from the list");
		}
		Thread.sleep(3000);
		
		String RefillCaseId = driver.findElement(By.xpath("//*[@id=\'caseIdInBanner\']")).getText();
		System.out.println("Refill " + RefillCaseId);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Refill " + RefillCaseId);
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Refill Case Created Successfully");
		Thread.sleep(3000);
		
		
//	
	}
}
