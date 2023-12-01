package methodPackage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataPackage.AddPrescriptionData;
import dataPackage.PAData;
import dataPackage.POSData;
import dataPackage.PostBIData;

public class POSMethod extends POSData {

	PAData padata1 = PageFactory.initElements(driver, PAData.class);
	PostBIData postbidata = PageFactory.initElements(driver, PostBIData.class);
	AddPrescriptionData rxdata = PageFactory.initElements(driver, AddPrescriptionData.class);

	public void verify_POS_With_Valid_Data() throws IOException, InterruptedException {

//		parent = report.createTest("Point of Sale");
//		test = report.createTest("Point of Sale");
//		padata1.patientSearchMethod();
//		padata1.caseManagementTabClick();
//		padata1.clickonCase();
		caseOpenSessionPopup();
		patientAlertPopUp();
		patientCarePopUp();
		Thread.sleep(6000);
		clickOnPOSworkflow();
		
		try {
//			openPOSActivity();
			if (DpCaseManagement_tab.getRow(1).getCell(16).getStringCellValue().equalsIgnoreCase("filled")) {
				openPOSActivity();
				selectOrderSoldMethod();
				selectOrderSoldDate();
				selectOrderSoldTime();
				saveAll();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Filled POS Successfully");
			} else {

				System.out.println("Prescription is not a Filled");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Prescription is not a Filled");
				ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		}

		//parent.appendChild(test);
		//report.endTest(parent);
	}

	String CaseManagementTabpermission = DpModulePermission.getRow(9).getCell(1).getStringCellValue();
	String CaseManagementPermission = DpCaseManagement_tab.getRow(2).getCell(3).getStringCellValue();
	String winHandleBefore = driver.getWindowHandle();

	public void completeIntake() throws InterruptedException, IOException {

//		parent = report.createTest("Case Complete");
//		test = report.createTest("Complete Intake WorkFlow");

		// Click on Intake Flow
		caseOpenSessionPopup();
		rxdata.PrescriptionInatke();

		// Get all activities with NA radio button displays
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));

		System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
				+ " Number of elements:" + elements.size());
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
				+ " Number of elements:" + elements.size()));
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
				Thread.sleep(2000);
				ALLNAActivityRadio.click();			
				Thread.sleep(2000);
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

		}
		SaveAllbutton();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Intake Workflow is Completed.");
		//parent.appendChild(test);

//		Workflowcompleted();
//		Refillcase();
	}

	public void completeBI() throws InterruptedException, IOException {

		//test = report.createTest("Complete BI WorkFlow");
		caseBannerpopup();
		// Click on BI Workflow
		caseOpenSessionPopup();
		padata1.BIWorkflowClick();

		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));

		System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
				+ " Number of elements:" + elements.size());
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
				+ " Number of elements:" + elements.size()));
		for (int i = 0; i < elements.size(); i++) {

			String coreid = elements.get(i).getAttribute("id");
			// System.out.println("Core id is "+coreid);
			String[] part = coreid.split("(?<=\\D)(?=\\d)");

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
		}
		SaveAllbutton();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "BI Workflow is Completed.");
		//parent.appendChild(test);

	}

	public void completeCOC() throws InterruptedException {

		//test = report.createTest("Complete COC WorkFlow");
		caseBannerpopup();
		caseOpenSessionPopup();
		// Click on COC Workflow

		postbidata.cocWorkFlowClick();

		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));

		System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
				+ " Number of elements:" + elements.size());
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
				+ " Number of elements:" + elements.size()));
		for (int i = 0; i < elements.size(); i++) {

			String coreid = elements.get(i).getAttribute("id");
			// System.out.println("Core id is "+coreid);
			String[] part = coreid.split("(?<=\\D)(?=\\d)");

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

		}
		Thread.sleep(4000);
		SaveAllbutton();
		ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "COC Workflow is Completed.");

		//parent.appendChild(test);

	}

	public void completeCoD() throws InterruptedException, IOException {

		//test = report.createTest("Complete COD WorkFlow");
		try {
			// Click on COD Workflow

			caseOpenSessionPopup();
			caseBannerpopup();
			clickCOD();

			Thread.sleep(1000);
			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));

			System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size()));
			for (int i = 0; i < elements.size(); i++) {

				String coreid = elements.get(i).getAttribute("id");
				// System.out.println("Core id is "+coreid);
				String[] part = coreid.split("(?<=\\D)(?=\\d)");
//		
				String lastOne = part[part.length - 1];

				WebElement NAActivityRadio = driver
						.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
				wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
				NAActivityRadio.click();

				/*
				 * if (lastOne.equals(part[1])) { WebElement CompleteActivityRadio = driver
				 * .findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne +
				 * "']")); ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0," +
				 * CompleteActivityRadio.getLocation().y + ")");
				 * wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
				 * CompleteActivityRadio.click(); } else { WebElement NAActivityRadio = driver
				 * .findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
				 * ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0," +
				 * NAActivityRadio.getLocation().y + ")");
				 * wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
				 * NAActivityRadio.click(); }
				 */

			}

			SaveAllbutton();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "COD Workflow is Completed.");

		} catch (Exception e) {
		}

		//parent.appendChild(test);

	}

	public void completePOS() throws InterruptedException, IOException {

		//test = report.createTest("Complete POS WorkFlow");
		try {

			// Click on POS Workflow
			caseOpenSessionPopup();
			caseBannerpopup();

			clickOnPOSworkflow();

			Thread.sleep(1000);
			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));

			System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size()));
			for (int i = 0; i < elements.size(); i++) {

				String coreid = elements.get(i).getAttribute("id");
				// System.out.println("Core id is "+coreid);
				String[] part = coreid.split("(?<=\\D)(?=\\d)");

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
				SaveAllbutton();
				ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "POS Workflow is Completed.");

			}

		} catch (Exception e) {
			
			/*
			 * ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
			 * "FAIL to Complete the POS Workflow");
			 * ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
			 * MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build()
			 * );
			 */
		}

		//parent.appendChild(test);

	}

	public void completePE() throws InterruptedException, IOException {

		//test = report.createTest("Complete PE WorkFlow");
		try {
			caseBannerpopup();
			caseOpenSessionPopup();

		} catch (Exception e) {
		}

		try {
			// Click on PE Workflow

			clickOnPE();

			Thread.sleep(1000);
			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'activtyRadioNA')]"));

			System.out.println(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size());
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS,(driver.findElement(By.xpath("//*[@id=\'workflowScreen\']/h3")).getText()
					+ " Number of elements:" + elements.size()));
			for (int i = 0; i < elements.size(); i++) {

				String coreid = elements.get(i).getAttribute("id");
				// System.out.println("Core id is "+coreid);
				String[] part = coreid.split("(?<=\\D)(?=\\d)");

//				String lastOne = part[part.length - 1];

				/*
				 * if (lastOne.equals(part[1])) { WebElement CompleteActivityRadio = driver
				 * .findElement(By.xpath("//input[@id='activtyRadioComplete-" + lastOne +
				 * "']")); ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0," +
				 * CompleteActivityRadio.getLocation().y + ")");
				 * wait.until(ExpectedConditions.elementToBeClickable(CompleteActivityRadio));
				 * CompleteActivityRadio.click(); } else { WebElement NAActivityRadio = driver
				 * .findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
				 * ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0," +
				 * NAActivityRadio.getLocation().y + ")");
				 * wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
				 * NAActivityRadio.click(); }
				 */WebElement NAActivityRadio = driver
						.findElement(By.xpath("//input[@id='activtyRadioNA-" + part[1] + "']"));
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + NAActivityRadio.getLocation().y + ")");
				wait.until(ExpectedConditions.elementToBeClickable(NAActivityRadio));
				NAActivityRadio.click();
				

			}
			SaveAllbutton();
			//caseOpenSessionPopup();
			ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "PE Workflow is Completed.");

		} catch (Exception e) {
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "FAIL to Complete the PE Workflow");
			ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL,
					MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen(driver)).build());
		}

		//parent.appendChild(test);
		//report.endTest(parent);

	}

	public void refillCase() throws IOException, InterruptedException {
//			parent = report.createTest("Refill Case");
//			test = report.createTest("Verify that the Refill Case is created or not");
			driver.navigate().refresh();
			Thread.sleep(3000);
			try {
			
				WebElement AlertPopup = driver
						.findElement(By.xpath("//*[@id=\"prescriber-alert\"]/div[1]/h2/div/i"));
				((JavascriptExecutor) driver)
						.executeScript("window.scrollTo(0," + AlertPopup.getLocation().y + ")");
				wait.until(ExpectedConditions.elementToBeClickable(AlertPopup));
				AlertPopup.click();

			} catch (Exception e) {
			}
			Refillcase();
			//parent.appendChild(test);
			//report.endTest(parent);
			//add x path for cancelling pop up
			clickOutside.click();
			try {
				driver.switchTo().alert().accept();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread.sleep(2000);
		}

}