package methodPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import dataPackage.AddConsentData;
import testPackage.Base;

public class AddConsentMethods extends AddConsentData {
	String CaseManagementTabpermission = DpModulePermission.getRow(9).getCell(1).getStringCellValue();
	String CaseManagementPermission = DpCaseManagement_tab.getRow(2).getCell(3).getStringCellValue();
	String winHandleBefore = driver.getWindowHandle();
	String Loginpermission = DpModulePermission.getRow(2).getCell(1).getStringCellValue();
   String assignedRole = DpCaseBanner.getRow(2).getCell(4).getStringCellValue();
   String assignedUser = DpCaseBanner.getRow(2).getCell(5).getStringCellValue();
   
	public void ClickonPatientConsentTab() throws InterruptedException, IOException {
		
		//parent = report.createTest("Add Patient Consent");
		
		try {
			Thread.sleep(5000);
			WebElement PatientConsent = driver.findElement(By.linkText("Patient Welcome Call & Consent"));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + PatientConsent.getLocation().y + ")");
			PatientConsent.click();
			//capture_Screenshot();
			// //parent.appendChild(test);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	String current = driver.getWindowHandle();

	public void AddPatientConsentkElement() throws InterruptedException, IOException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"consentListing\"]/div[1]/a")));
			WebElement AddPatientConsentkElement = driver
					.findElement((By.xpath("//*[@id=\"consentListing\"]/div[1]/a")));
			((JavascriptExecutor) driver)
					.executeScript("window.scrollTo(0," + AddPatientConsentkElement.getLocation().y + ")");
			AddPatientConsentkElement.click();
			//capture_Screenshot();
			// //parent.appendChild(test);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);
			driver.manage().window().maximize();
		}
		
		try {
			
			if (Loginpermission.equals("OUTCOMES"))
			{	
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + assignedrole.getLocation().y + ")");
        assignedrole.click();
        Thread.sleep(2000);
        assignedroleSearch.sendKeys(assignedRole);
        Thread.sleep(2000);
        assignedroleSearch.sendKeys(Keys.ENTER) ;
        Thread.sleep(2000);
      ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + assigneduser.getLocation().y + ")");
      assigneduser.click();
      Thread.sleep(2000);
      assignUserSearch.sendKeys(assignedUser);
      Thread.sleep(2000);
      assignUserSearch.sendKeys(Keys.ENTER) ;
      Thread.sleep(2000);
	}
			}
    catch (Exception e)
    {
    	System.out.println("Add Consent with CT User");
    }
    }
	  
	public void relationshipValue() throws InterruptedException, IOException {
		putDataInsideRelationshipDropDown(DpCaseManagement_tab.getRow(19).getCell(0).getStringCellValue(),
				"Verify that Relationship should not accept numeric values");
		putDataInsideRelationshipDropDown(DpCaseManagement_tab.getRow(20).getCell(0).getStringCellValue(),
				"Verify that Relationship should not accept Alphabets values");
		putDataInsideRelationshipDropDown(DpCaseManagement_tab.getRow(21).getCell(0).getStringCellValue(),
				"Verify that Relationship should not accept Special-Character values");
	}

	private void putDataInsideRelationshipDropDown(String relationship, String message)
			throws InterruptedException, IOException {
		//test = report.createTest(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterRelationshipValue(relationship);
			System.out.println("Add Value in Relationship: " + relationship);
			saveConsentClick();
			Thread.sleep(1000);
			err_msg();
			////parent.appendChild(test);

		}
	}

	public void userRoleValue() throws InterruptedException, IOException {

		putDataInsideUserDropDown(DpCaseManagement_tab.getRow(19).getCell(1).getStringCellValue(),
				"Verify that User Role should not accept numeric values");
		putDataInsideUserDropDown(DpCaseManagement_tab.getRow(20).getCell(1).getStringCellValue(),
				"Verify that User Role should not accept Alphabets values");
		putDataInsideUserDropDown(DpCaseManagement_tab.getRow(21).getCell(1).getStringCellValue(),
				"Verify that User Role should not accept Special-Character values");
	}

	private void putDataInsideUserDropDown(String userRole, String message) throws InterruptedException, IOException {
		//test = report.createTest(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterProvideToroleValue(userRole);
			System.out.println("Add Value in User Role: " + userRole);
			saveConsentClick();
			Thread.sleep(1000);
			err_msg();
			//parent.appendChild(test);
		}
	}

	public void userNameValue() throws InterruptedException, IOException {

		putDataInsideUsernameDropDown(DpCaseManagement_tab.getRow(19).getCell(2).getStringCellValue(),
				"Verify that User Name should not accept numeric values");
		putDataInsideUsernameDropDown(DpCaseManagement_tab.getRow(20).getCell(2).getStringCellValue(),
				"Verify that User Name should not accept Alphabets values");
		putDataInsideUsernameDropDown(DpCaseManagement_tab.getRow(21).getCell(2).getStringCellValue(),
				"Verify that User Name should not accept Special-Character values");
	}

	private void putDataInsideUsernameDropDown(String username, String message)
			throws InterruptedException, IOException {
		//test = report.createTest(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterProvideToUsernameValue(username);
			System.out.println("Add Value in User Name: " + username);
			saveConsentClick();
			Thread.sleep(1000);
			err_msg();
			//parent.appendChild(test);
		}
	}

	public void methodValue() throws InterruptedException, IOException {

		putDataInsideMethodDropDown(DpCaseManagement_tab.getRow(19).getCell(2).getStringCellValue(),
				"Verify that Method should not accept numeric values");
		putDataInsideMethodDropDown(DpCaseManagement_tab.getRow(20).getCell(2).getStringCellValue(),
				"Verify that Method should not accept Alphabets values");
		putDataInsideMethodDropDown(DpCaseManagement_tab.getRow(21).getCell(2).getStringCellValue(),
				"Verify that Method should not accept Special-Character values");
	}

	private void putDataInsideMethodDropDown(String method, String message) throws InterruptedException, IOException {
		//test = report.createTest(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterMethodValue(method);
			System.out.println("Add Value in Method: " + method);
			saveConsentClick();
			Thread.sleep(1000);
			err_msg();
			//parent.appendChild(test);
		}
	}

	public void selectMethod() throws InterruptedException, IOException {
		//test = report.createTest("Verify that Select Valid Methods value in Dropdown ");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			String methodValue = DpCaseManagement_tab.getRow(7).getCell(1).getStringCellValue();
			selectMethodValue(methodValue);
			System.out.println("Method is : " + methodValue);
			Thread.sleep(2000);
		}
	}

	public void consentTypeValue() throws InterruptedException, IOException {

		putDataInsideConsentTypeDropDown(DpCaseManagement_tab.getRow(19).getCell(3).getStringCellValue(),
				"Verify that ConsentType should not accept numeric values");
		putDataInsideConsentTypeDropDown(DpCaseManagement_tab.getRow(20).getCell(3).getStringCellValue(),
				"Verify that ConsentType should not accept Alphabets values");
		putDataInsideConsentTypeDropDown(DpCaseManagement_tab.getRow(21).getCell(3).getStringCellValue(),
				"Verify that ConsentType should not accept Special-Character values");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"removeConsentRowData0\"]")));
		WebElement RemoveConsent = driver.findElement(By.xpath("//*[@id=\"removeConsentRowData0\"]"));
		RemoveConsent.click();
		
	}

	private void putDataInsideConsentTypeDropDown(String consenttype, String message)
			throws InterruptedException, IOException {
		//test = report.createTest(message);
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			enterConsentTypeValue(consenttype);
			System.out.println("Add Value in ConsentType: " + consenttype);
			saveConsentClick();
			Thread.sleep(1000);
			err_msg();
			//parent.appendChild(test);
		}
	}

	public void selectConsentType() throws InterruptedException, IOException {
	//	test = report.createTest("Verify that Select Valid Consent Type value in Dropdown ");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addNewConsent\"]")));
				WebElement AddNewConsent = driver.findElement(By.xpath("//*[@id=\"addNewConsent\"]"));
				AddNewConsent.click();
				Thread.sleep(2000);
			String consentTypeValue = DpCaseManagement_tab.getRow(7).getCell(2).getStringCellValue();
			selectConsentTypeValue(consentTypeValue);
			System.out.println("ConsentType is : " + consentTypeValue);
			Thread.sleep(2000);
			//err_msg();
			//parent.appendChild(test);
		}	
	}
	

	public void addConsentType() throws InterruptedException, IOException {
		//test = report.createTest("Verify add all consent type");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			try {
			addConsentTypeValue();
			saveConsentClick();
			windowHandle();
			List<String> windowHandlesList = new ArrayList<>(driver.getWindowHandles());
			//System.out.println("1st window"+windowHandlesList.get(0));
			//System.out.println("Window"+ winHandleBefore);
			driver.switchTo().window(windowHandlesList.get(0));
			Thread.sleep(1000);
			capture_Screenshot();
			//parent.appendChild(test);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void selectAllActivity() throws InterruptedException, IOException {
	//	test = report.createTest("Verify Save all consent activity");
		if (CaseManagementTabpermission.equalsIgnoreCase("YES")) {
			saveAll();
			Thread.sleep(1000);
			capture_Screenshot();
			//parent.appendChild(test);

		}
	}

}
