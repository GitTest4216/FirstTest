package methodPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import dataPackage.CopayData;
//import dataPackage.PayorData;
import dataPackage.PayorData;

public class CopayMethods extends CopayData {

	String CopayTabPermission = DpModulePermission.getRow(19).getCell(1).getStringCellValue();
	String CopaycardPermission = DpCopay.getRow(1).getCell(0).getStringCellValue();

	String CopayStatusValue = DpCopay.getRow(4).getCell(1).getStringCellValue();
	String CopayReasonValue = DpCopay.getRow(4).getCell(2).getStringCellValue();
	String InitiatedBy = DpCopay.getRow(1).getCell(3).getStringCellValue();
	String DateInitiatedValue = DpCopay.getRow(1).getCell(4).getStringCellValue();
	String DateSubmittedValue = DpCopay.getRow(1).getCell(5).getStringCellValue();
	String ExpectedResponseDateValue = DpCopay.getRow(1).getCell(6).getStringCellValue();
	String DecisionDateValue = DpCopay.getRow(1).getCell(7).getStringCellValue();

	public void CopayCardLogValidData() throws IOException, InterruptedException {

//		parent = report.createTest("Copay Card");
//		test = report.createTest("Verify Copay with Valid Data");
		System.out.println("In Valid Data .....COPAY");

//		PayorData p1 = PageFactory.initElements(driver, PayorData.class);

		try {
			String HomePagetitle = driver.getTitle();
			if (HomePagetitle.equalsIgnoreCase("Login")) {
				int i = 0;
				while (i < 1) {
					if (notificationDialogCloseBtn.isDisplayed()) {
						notificationDialogCloseBtn.click();
					} else {
						i = 1;
					}
				}
			}
			if (CopayTabPermission.equalsIgnoreCase("YES")) {

//				p1.patientSearchMethod();

				// Go to Case Management
				Thread.sleep(2000);
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"patient-menu\"]/li[7]/a")));
//				driver.findElement(By.xpath("//*[@id=\"patient-menu\"]/li[7]/a")).click();
//				Thread.sleep(2000);
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//				// Open case
//				driver.findElement(By.xpath("/html/body/section/div[3]/div[1]/table/tbody/tr/td[1]/a")).click();
//				Thread.sleep(2000);

				BIWorkflowClick();
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(3000);

				Copaycardsection();
				Thread.sleep(3000);

				SelectCopaycard();
				Thread.sleep(3000);

				SelectPrescription();
				Thread.sleep(3000);

				OutsideClick();
				Thread.sleep(3000);

				CopayStatusDropdown(CopayStatusValue, CopayReasonValue);
				Thread.sleep(3000);

				InitiatedByDropdown(InitiatedBy);
				Thread.sleep(3000);

				DateInitiated(DateInitiatedValue);
				Thread.sleep(3000);

				DateSubmitted(DateSubmittedValue);
				Thread.sleep(3000);

				ExpectedResponseDate(ExpectedResponseDateValue);
				Thread.sleep(3000);

				DecisionDate(DecisionDateValue);
				Thread.sleep(3000);

				EligibleRadio();
				Thread.sleep(3000);

				CopayUsedRadio();
				Thread.sleep(3000);

				SelectInsurance();
				Thread.sleep(3000);

				SaveBtn();
				Thread.sleep(3000);

				CloseBtn();
				Thread.sleep(2000);

			} else {
				System.out.println("FCM - Copay Card Permission is NO");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		//parent.appendChild(test);
		//report.endTest(parent);

	}

}
