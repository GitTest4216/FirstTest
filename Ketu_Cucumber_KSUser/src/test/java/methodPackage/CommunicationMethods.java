package methodPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import dataPackage.CommunicationData;
import dataPackage.PayorData;

public class CommunicationMethods extends CommunicationData {

	String CommunicationLogTabPermission = DpModulePermission.getRow(13).getCell(1).getStringCellValue();
	String CommunicationPermission = DpCommunication_Log.getRow(1).getCell(0).getStringCellValue();
	String callTypeValue = DpCommunication_Log.getRow(1).getCell(1).getStringCellValue();
	String receiverValue = DpCommunication_Log.getRow(1).getCell(4).getStringCellValue();
	String Emailalue = DpCommunication_Log.getRow(1).getCell(3).getStringCellValue();
	String notesvalue = DpCommunication_Log.getRow(1).getCell(2).getStringCellValue();

	public void verify_communicationLog_withoutData() throws IOException, InterruptedException {
//		parent = report.createTest("Communication Log");
//		test = report.createTest("Add Communication Log without fill the data");
		//System.out.println("In comm 1");
		// PayorData p1 = PageFactory.initElements(driver, PayorData.class);

		String HomePagetitle = driver.getTitle();
		/*
		 * if (HomePagetitle.equalsIgnoreCase("KloudScript")) { int i = 0; while (i < 1)
		 * { if (notificationDialogCloseBtn.isDisplayed()) {
		 * notificationDialogCloseBtn.click(); } else { i = 1; } }
		 */

			System.out.println("In comm 2");
			if (CommunicationLogTabPermission.equalsIgnoreCase("YES")) {
				try {
					System.out.println("In Communication");
					navigateToCommunicationLogTab();
						System.out.println("In If" + communicationtabHTML.isDisplayed());
						try {
							//communicationTabClick();
							//org.openqa.selenium.Alert popup = driver.switchTo().alert();
							// here you can examine the text within the alert using popup.getText();
							/* 
							 * String alertMessage = driver.switchTo().alert().getText();
							 * System.out.println(alertMessage); Thread.sleep(5000); popup.accept();
							 */
							addComLog();
							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
							save();
							Thread.sleep(1000);
							js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
							errMsg();
							Thread.sleep(2000);
							js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
							comLogResetBtn();
							Thread.sleep(3000);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("No Popup display");
						}

				} catch (Exception e) {
					// p1.patientSearchMethod();
					System.out.println("Communication Permission error");
				}

			} else {
				System.out.println("Communication Log Permission is NO");
			}
			//parent.appendChild(test);

	}

	public void verify_communicationLog_withInvalidData() throws IOException, InterruptedException {

		//test = report.createTest("Add Communication Log record with Invalid data");

		String callTypeValue = DpCommunication_Log.getRow(5).getCell(1).getStringCellValue();
		String receiverValue = DpCommunication_Log.getRow(5).getCell(4).getStringCellValue();
		String Emailalue = DpCommunication_Log.getRow(5).getCell(3).getStringCellValue();
		String notesvalue = DpCommunication_Log.getRow(5).getCell(2).getStringCellValue();

		if (CommunicationLogTabPermission.equalsIgnoreCase("YES")) {
			System.out.println("Invalid");
			Thread.sleep(1000);
			try {
				callTypeadd(callTypeValue);
				receiver(receiverValue);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Value is not found in dropdown");
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;

			Email(Emailalue);
			Notes(notesvalue);
			save();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			errMsg();
			Thread.sleep(2000);

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			comLogResetBtn();

		} else {
			System.out.println("No Invalid");
		}
		//parent.appendChild(test);
	}

	public void verify_communicationLogNotAcceptNumeric() throws IOException, InterruptedException {

		//test = report.createTest("Add Communication Log record with  Numeric value");

		String callTypeValue = DpCommunication_Log.getRow(7).getCell(1).getStringCellValue();
		String receiverValue = DpCommunication_Log.getRow(7).getCell(4).getStringCellValue();
		String Emailalue = DpCommunication_Log.getRow(7).getCell(3).getStringCellValue();
		String notesvalue = DpCommunication_Log.getRow(7).getCell(2).getStringCellValue();

		if (CommunicationLogTabPermission.equalsIgnoreCase("YES")) {
			System.out.println("Numeric");
			Thread.sleep(1000);
			try {
				callTypeadd(callTypeValue);
				receiver(receiverValue);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Value is not found in dropdown");
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;

			Email(Emailalue);
			System.out.println("EMmmmmmmmmmmmmmmmmmm" + Emailalue);
			Notes(notesvalue);
			save();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			errMsg();
			Thread.sleep(2000);

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			comLogResetBtn();

		} else {
			System.out.println("No numeric");
		}
		//parent.appendChild(test);
	}

	public void verify_communicationLogtNotAcceptSpecialCharacters() throws IOException, InterruptedException {

		//test = report.createTest("Add Communication Log record with Special characters data");

		String callTypeValue = DpCommunication_Log.getRow(10).getCell(1).getStringCellValue();
		String receiverValue = DpCommunication_Log.getRow(10).getCell(4).getStringCellValue();
		String Emailalue = DpCommunication_Log.getRow(10).getCell(3).getStringCellValue();
		String notesvalue = DpCommunication_Log.getRow(10).getCell(2).getStringCellValue();

		if (CommunicationLogTabPermission.equalsIgnoreCase("YES")) {
			System.out.println("Numeric");
			Thread.sleep(1000);
			try {
				callTypeadd(callTypeValue);
				receiver(receiverValue);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Value is not found in dropdown");
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;

			Email(Emailalue);
			Notes(notesvalue);
			save();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			errMsg();
			Thread.sleep(2000);

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			comLogResetBtn();

		} else {
			System.out.println("No numeric");
		}
		//parent.appendChild(test);
	}

	public void CommunicationLogValidData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);

		//test = report.createTest("Add Communication Log record with valid data");
		//navigateToCommunicationLogTab();
		if (CommunicationLogTabPermission.equalsIgnoreCase("YES")) {
			System.out.println("tabbbbbbbbbbb" + CommunicationLogTabPermission);
			
			try{ navigateToCommunicationLogTab();
			Thread.sleep(2000);
			addComLog();
			Thread.sleep(2000);
			}
			catch (Exception e) {System.out.println("Communication Tab Alreday opened");}
			}

			{

				callTypeadd(callTypeValue);
				receiver(receiverValue);
				Email(Emailalue);
				Notes(notesvalue);
				save(); 
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);

	}

