package methodPackage;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import dataPackage.PatientData;
import dataPackage.LoginData;
public class PatientMethods extends PatientData {

	String Patientpermission = DpModulePermission.getRow(5).getCell(1).getStringCellValue();
	String PatientAction = DpPatient.getRow(1).getCell(0).getStringCellValue();

	String PatientFirstName = DpPatient.getRow(1).getCell(1).getStringCellValue();
	String PatientLastName = DpPatient.getRow(1).getCell(2).getStringCellValue();
	String PatientDOB = DpPatient.getRow(1).getCell(3).getStringCellValue();
	String PatientGender = DpPatient.getRow(1).getCell(4).getStringCellValue();
	String KSClient = DpPatient.getRow(1).getCell(5).getStringCellValue();
	String PatientStoreID = DpPatient.getRow(1).getCell(6).getStringCellValue();
	String PatientAddress1 = DpPatient.getRow(1).getCell(7).getStringCellValue();
	String PatientState = DpPatient.getRow(1).getCell(9).getStringCellValue();
	String PatientCity = DpPatient.getRow(1).getCell(10).getStringCellValue();
	int PatientZipint = (int) DpPatient.getRow(1).getCell(11).getNumericCellValue();
	String PatientZip = Integer.toString(PatientZipint);
	String PatientConDrop = DpPatient.getRow(1).getCell(12).getStringCellValue();
	int PatientConValueint = (int) DpPatient.getRow(1).getCell(13).getNumericCellValue();
	String PatientConValue = Integer.toString(PatientConValueint);
	String PatientFaxDrop = DpPatient.getRow(1).getCell(14).getStringCellValue();
	int PatientFaxValueint = (int) DpPatient.getRow(1).getCell(15).getNumericCellValue();
	String PatientFaxValue = Integer.toString(PatientFaxValueint);
	String PatientEmailDrop = DpPatient.getRow(1).getCell(16).getStringCellValue();
	String PatientEmailValue = DpPatient.getRow(1).getCell(17).getStringCellValue();
	String PatientRelationValue = DpPatient.getRow(4).getCell(0).getStringCellValue();
	String PatientResidencyStatus = DpPatient.getRow(4).getCell(1).getStringCellValue();
	String PatientFamilyMember = DpPatient.getRow(4).getCell(2).getStringCellValue();
	String PatientAnnualIncome = DpPatient.getRow(4).getCell(3).getStringCellValue();
	String PatientCrossReference = DpPatient.getRow(4).getCell(4).getStringCellValue();
	int PatientIdint = (int) DpPatient.getRow(4).getCell(5).getNumericCellValue();
	String PatientId = Integer.toString(PatientIdint);
	String ChooseFileDetail = DpPatient.getRow(4).getCell(6).getStringCellValue();
	String DocType = DpPatient.getRow(4).getCell(7).getStringCellValue();
	String OtherDescriptionDetail = DpPatient.getRow(4).getCell(9).getStringCellValue();
	String DescriptionDetail = DpPatient.getRow(4).getCell(8).getStringCellValue();
 
	 public void verify_patient_withoutData() throws IOException, InterruptedException {
		//parent = report.createTest("Patient");
  //test = report.createTest("Add new patient without fill the data>>>>>>>>>>>>>>");
		String HomePagetitle = driver.getTitle();
		if (HomePagetitle.equalsIgnoreCase("KloudScript")) {
			int i = 0;
			while (i < 1) {
				if (notificationDialogCloseBtn.isDisplayed()) {
					notificationDialogCloseBtn.click();
				} else {
					i = 1;
				}
			}

			if (Patientpermission.equals("YES")) {
				if (PatientAction.equals("ADD") || PatientAction.equals("BOTH")) {
					addPatientHome();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					patientSaveBtn();
					Thread.sleep(1000);
					patientErrMsg();
					Thread.sleep(2000);
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					patientResetBtn();
				}
			} else {
				System.out.println("Patient Permission is NO");
			}
			//parent.appendChild(test);
		}
	}

	public void patientTabSomeFieldNotAcceptAlphabets() throws InterruptedException, IOException {
		//test = report.createTest("Verify that some fields should not accept alphabets");
		String PatientDOB = DpPatient.getRow(11).getCell(3).getStringCellValue();
		String PatientGender = DpPatient.getRow(11).getCell(4).getStringCellValue();
		String PatientStoreID = DpPatient.getRow(11).getCell(6).getStringCellValue();
		String PatientState = DpPatient.getRow(11).getCell(9).getStringCellValue();
		String PatientCity = DpPatient.getRow(11).getCell(10).getStringCellValue();
		String PatientZip = DpPatient.getRow(11).getCell(11).getStringCellValue();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (Patientpermission.equals("YES")) {
			if (PatientAction.equals("ADD") || PatientAction.equals("BOTH")) {
				patientFirstName(PatientFirstName);
				patientLastName(PatientLastName);
				try {
					dateOfBirth(PatientDOB);
				} catch (Exception e) {

				}
				try {
					gender(PatientGender);
				} catch (Exception e) {

				}
				try {
					pharmacyStoreInvalid(PatientStoreID);
				} catch (Exception e) {

				}
				addressTabClickBtn();
				firstAddress1(PatientAddress1);
				try {
					patientState(PatientState);
					patientCity(PatientCity);
					patientZip(PatientZip);
				} catch (Exception e) {

				}
				patientSaveBtn();
				patientErrMsg();
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				patientResetBtn();
			}
		}
		//parent.appendChild(test);
	}

	public void patientNotAcceptNumeric() throws IOException, InterruptedException {
		//test = report.createTest("Verify that some fields should not accept numeric values");
		String PatientFirstName = DpPatient.getRow(12).getCell(1).getStringCellValue();
		String PatientLastName = DpPatient.getRow(12).getCell(2).getStringCellValue();
		String PatientDOB = DpPatient.getRow(12).getCell(3).getStringCellValue();
		String PatientGender = DpPatient.getRow(12).getCell(4).getStringCellValue();
		String PatientStoreID = DpPatient.getRow(12).getCell(6).getStringCellValue();
		String PatientState = DpPatient.getRow(12).getCell(9).getStringCellValue();
		String PatientCity = DpPatient.getRow(12).getCell(10).getStringCellValue();
		String PatientZip = DpPatient.getRow(12).getCell(11).getStringCellValue();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (Patientpermission.equals("YES")) {
			if (PatientAction.equals("ADD") || PatientAction.equals("BOTH")) {
				patientFirstName(PatientFirstName);
				patientLastName(PatientLastName);
				try {
					dateOfBirth(PatientDOB);
				} catch (Exception e) {

				}
				try {
					gender(PatientGender);
				} catch (Exception e) {

				}
				try {
					pharmacyStoreInvalid(PatientStoreID);
				} catch (Exception e) {

				}
				addressTabClickBtn();
				firstAddress1(PatientAddress1);
				try {
					patientState(PatientState);
					patientCity(PatientCity);
					patientZip(PatientZip);
				} catch (Exception e) {

				}
				patientSaveBtn();
				patientErrMsg();
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				patientResetBtn();
			}
		}
		//parent.appendChild(test);
	}

	public void patientNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		//test = report.createTest("Verify that some fields should not accept special characters");
		String PatientFirstName = DpPatient.getRow(13).getCell(1).getStringCellValue();
		String PatientLastName = DpPatient.getRow(13).getCell(2).getStringCellValue();
		String PatientDOB = DpPatient.getRow(13).getCell(3).getStringCellValue();
		String PatientGender = DpPatient.getRow(13).getCell(4).getStringCellValue();
		String PatientStoreID = DpPatient.getRow(13).getCell(6).getStringCellValue();
		String PatientState = DpPatient.getRow(13).getCell(9).getStringCellValue();
		String PatientCity = DpPatient.getRow(13).getCell(10).getStringCellValue();
		String PatientZip = DpPatient.getRow(13).getCell(11).getStringCellValue();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (Patientpermission.equals("YES")) {
			if (PatientAction.equals("ADD") || PatientAction.equals("BOTH")) {
				patientFirstName(PatientFirstName);
				patientLastName(PatientLastName);
				try {
					dateOfBirth(PatientDOB);
				} catch (Exception e) {

				}
				try {
					gender(PatientGender);
				} catch (Exception e) {

				}
				try {
					pharmacyStoreInvalid(PatientStoreID);
				} catch (Exception e) {

				}
				addressTabClickBtn();
				firstAddress1(PatientAddress1);
				try {
					patientState(PatientState);
					patientCity(PatientCity);
					patientZip(PatientZip);
				} catch (Exception e) {

				}
				patientSaveBtn();
				patientErrMsg();
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				patientResetBtn();
			}
		}
		//parent.appendChild(test);
	}

	public void patientNotAcceptSpace() throws IOException, InterruptedException {
		//test = report.createTest("Verify that some fields should not accept space");
		String PatientFirstName = DpPatient.getRow(14).getCell(1).getStringCellValue();
		String PatientLastName = DpPatient.getRow(14).getCell(2).getStringCellValue();
		String PatientDOB = DpPatient.getRow(14).getCell(3).getStringCellValue();
		String PatientGender = DpPatient.getRow(14).getCell(4).getStringCellValue();
		String PatientStoreID = DpPatient.getRow(14).getCell(6).getStringCellValue();
		String PatientState = DpPatient.getRow(14).getCell(9).getStringCellValue();
		String PatientCity = DpPatient.getRow(14).getCell(10).getStringCellValue();
		String PatientZip = DpPatient.getRow(14).getCell(11).getStringCellValue();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (Patientpermission.equals("YES")) {
			if (PatientAction.equals("ADD") || PatientAction.equals("BOTH")) {
				patientFirstName(PatientFirstName);
				patientLastName(PatientLastName);
				try {
					dateOfBirth(PatientDOB);
				} catch (Exception e) {

				}
				try {
					gender(PatientGender);
				} catch (Exception e) {

				}
				try {
					pharmacyStoreInvalid(PatientStoreID);
				} catch (Exception e) {

				}
				addressTabClickBtn();
				firstAddress1(PatientAddress1);
				try {
					patientState(PatientState);
					patientCity(PatientCity);
					patientZip(PatientZip);
				} catch (Exception e) {

				}
				patientSaveBtn();
				patientErrMsg();
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				patientResetBtn();
			}
		}
		//parent.appendChild(test);
	}

	public void Patient_with_valid_data() throws InterruptedException, IOException {
		//parent = report.createTest("Patient");
		//test = report.createTest("Add new patient record with valid data");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String Loginpermission = DpModulePermission.getRow(2).getCell(1).getStringCellValue();
		
		if (Patientpermission.equals("YES")) {
			if (PatientAction.equals("ADD") || PatientAction.equals("BOTH")) {
				
				try {	
					addPatientHome();
				} catch (Exception e)
				{
					System.out.println("Patient Tab Already Opened");
				}
				patientFirstName(PatientFirstName);
				patientLastName(PatientLastName);
				dateOfBirth(PatientDOB);
				gender(PatientGender);
			
				try {
					if (Loginpermission.equals("OUTCOMES"))
					{
						 ksClient(KSClient);
						 Thread.sleep(2000);
						pharmacyStore(PatientStoreID);
					}
				
				}
				catch (Exception e)
				{
					System.out.println("Add Patient With CT user");
				}
				
				addressTabClickBtn();
				firstAddress1(PatientAddress1);
				patientState(PatientState);
				patientCity(PatientCity);
				patientZip(PatientZip);
				contactTab();
				patientPhnLink();
				Thread.sleep(2000);
				patientPhnContactDropdown(PatientConDrop);
				Thread.sleep(4000);
				patientPhnContactValue(PatientConValue);
				Thread.sleep(3000);
				patientFaxLink();
				Thread.sleep(2000);
				patientFaxDropdown(PatientFaxDrop);
				Thread.sleep(2000);
				patientFaxValue(PatientFaxValue);
				Thread.sleep(2000);
				patientEmailLink();
				patientEmailDropdown(PatientEmailDrop);
				patientEmailValue(PatientEmailValue);
				patientCaregiverTabLink();
				addCaregiverLink();
				patientCaregiverFname(PatientFirstName);
				patientCaregiverLname(PatientLastName);
				patientRelation(PatientRelationValue);
				patientIncomeLink();
				residencyStatus(PatientResidencyStatus);
				patientFamilyMember(PatientFamilyMember);
				annualIncome(PatientAnnualIncome);
				patientCrossReferenceTab();
				patientCrossReferenceLink();
				patientcrossRefTxt(PatientCrossReference);
				patientIdText(PatientId);
//				patientuploadDocTab();
//				patientUploadDocLink();
//				patientDocChooseFile(ChooseFileDetail);
//				patientdocType(DocType,OtherDescriptionDetail);
//				patientDocDescription(DescriptionDetail);
//				patientClickOnUploadAdd();
//				patientClickOnUploadCancel();
				patientSaveBtn();
				try {
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					patientDuplicatePopupBtn();
				} catch (Exception e) {

				}
				patientSuccessMsg();
				homePageRedirection();
			}
		} else {
			System.out.println("Patient Permission is NO");
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}

}
