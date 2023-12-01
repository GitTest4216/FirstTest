package methodPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import dataPackage.AllergyClinicalData;
import dataPackage.HealthClinicalData;
import dataPackage.PayorData;

public class HealthHistoryMethods extends HealthClinicalData{

	String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
	String ClinicalHealthFamilyPermission = DpClinicalProfile.getRow(46).getCell(0).getStringCellValue();
	String ClinicalHealthMedicalPermission = DpClinicalProfile.getRow(50).getCell(0).getStringCellValue();
	String ClinicalHealthROSPermission = DpClinicalProfile.getRow(54).getCell(0).getStringCellValue();
	String ClinicalHealthSurgicalPermission = DpClinicalProfile.getRow(58).getCell(0).getStringCellValue();
	
	String Relationship = DpClinicalProfile.getRow(46).getCell(1).getStringCellValue();
	String ICD10CodeValue = DpClinicalProfile.getRow(46).getCell(2).getStringCellValue();
	String Status = DpClinicalProfile.getRow(46).getCell(3).getStringCellValue();
	String DateValue = DpClinicalProfile.getRow(46).getCell(4).getStringCellValue();
	String NoteValue = DpClinicalProfile.getRow(46).getCell(5).getStringCellValue();
	String organsValue = DpClinicalProfile.getRow(54).getCell(2).getStringCellValue();
	String clinicalObservationsValue = DpClinicalProfile.getRow(54).getCell(3).getStringCellValue();
	String Surgery = DpClinicalProfile.getRow(58).getCell(1).getStringCellValue();
	
	public void healthHistoryFamilyClinicalWithoutData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
		AllergyClinicalData a1 = PageFactory.initElements(driver, AllergyClinicalData.class);
		parent = report.createTest("Clinical Profile" + "<b>" +"(Health History)" +"</b>");
		test = report.createTest("Health History / Family History (Without Data)");
		String HomePageTitle = driver.getTitle();
		if(!(HomePageTitle.equalsIgnoreCase("Login"))) {
			int ii = 0;
			while(ii < 1) {
				if(notificationDialogCloseBtn.isDisplayed()) {
					notificationDialogCloseBtn.click();
				}else {
					ii=1;
				}
			}
			if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
				p1.patientSearchMethod();
				a1.clinicalProfileTabClick();
				clinicalHealthHistoryTabClick();
				
				if (ClinicalHealthFamilyPermission.equalsIgnoreCase("Add")) {
					familyAddClick();
					familyErrMsg();
					familyCancelClick();
				}
			}
			//parent.appendChild(test);
		}
	}
	
	public void familyHistoryNotAcceptAlphabets() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept alphabets except dropdown in familyHistoryTab");
		String Relationship = DpClinicalProfileValidation.getRow(151).getCell(1).getStringCellValue();
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(151).getCell(2).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(151).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthFamilyPermission.equalsIgnoreCase("Add")) {
				try {
					familyRelationShipClick(Relationship);
					familyICD10CodeClick(ICD10CodeValue);
					familyStatusClick(Status);
				}catch (Exception e) {
					
				}
				familyDateClick(DateValue);
				familyNoteClick(NoteValue);
				familyAddClick();
				familyErrMsg();
				familyCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void familyHistoryNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept special characters except dropdown in familyHistoryTab");
		String Relationship = DpClinicalProfileValidation.getRow(152).getCell(1).getStringCellValue();
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(152).getCell(2).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(152).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthFamilyPermission.equalsIgnoreCase("Add")) {
				try {
					familyRelationShipClick(Relationship);
					familyICD10CodeClick(ICD10CodeValue);
					familyStatusClick(Status);
				}catch (Exception e) {
					
				}
				familyDateClick(DateValue);
				familyNoteClick(NoteValue);
				familyAddClick();
				familyErrMsg();
				familyCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void familyHistoryNotAcceptNumeric() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept numeric values except dropdown in familyHistoryTab");
		String Relationship = DpClinicalProfileValidation.getRow(153).getCell(1).getStringCellValue();
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(153).getCell(2).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(153).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthFamilyPermission.equalsIgnoreCase("Add")) {
				try {
					familyRelationShipClick(Relationship);
					familyICD10CodeClick(ICD10CodeValue);
					familyStatusClick(Status);
				}catch (Exception e) {
					
				}
				familyDateClick(DateValue);
				familyNoteClick(NoteValue);
				familyAddClick();
				familyErrMsg();
				familyCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void familyHistoryNotAcceptSpace() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept space except dropdown in familyHistoryTab");
		String Relationship = DpClinicalProfileValidation.getRow(154).getCell(1).getStringCellValue();
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(154).getCell(2).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(154).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthFamilyPermission.equalsIgnoreCase("Add")) {
				try {
					familyRelationShipClick(Relationship);
					familyICD10CodeClick(ICD10CodeValue);
					familyStatusClick(Status);
				}catch (Exception e) {
					
				}
				familyDateClick(DateValue);
				familyNoteClick(NoteValue);
				familyAddClick();
				Thread.sleep(2000);
				familyErrMsg();
				//familyCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void familyHistoryValidData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Family History [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthFamilyPermission.equalsIgnoreCase("Add")) {
					familyRelationShipClick(Relationship);
					Thread.sleep(2000);
					familyICD10CodeClick(ICD10CodeValue);
					Thread.sleep(2000);
					familyStatusClick(Status);
				familyDateClick(DateValue);
				familyNoteClick(NoteValue);
				familyAddClick();
				Thread.sleep(2000);
				successMsg();
				//familyCancelClick();
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}
	
	public void healthHistoryMedicalClinicalWithoutData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Medical History(Without Data) Tab");
		healthHistoryMedicalTabClick();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedicalPermission.equalsIgnoreCase("Add")) {
				medicalAddClick();
				medicalErrMsg();
				medicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medicalHistoryNotAcceptAlphabets() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept alphabets except dropdown in medicalHistoryTab");
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(161).getCell(1).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(161).getCell(2).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedicalPermission.equalsIgnoreCase("Add")) {
				try {
					medicalICD10CodeClick(ICD10CodeValue);
					medicalStatusClick(Status);
				}catch (Exception e) {
					
				}
				medicalDateClick(DateValue);
				medicalNoteClick(NoteValue);
				medicalAddClick();
				medicalErrMsg();
				medicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medicalHistoryNotAcceptspecialCharacters() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept special characters except dropdown in medicalHistoryTab");
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(162).getCell(1).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(162).getCell(2).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedicalPermission.equalsIgnoreCase("Add")) {
				try {
					medicalICD10CodeClick(ICD10CodeValue);
					medicalStatusClick(Status);
				}catch (Exception e) {
					
				}
				medicalDateClick(DateValue);
				medicalNoteClick(NoteValue);
				medicalAddClick();
				medicalErrMsg();
				medicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medicalHistoryNotAcceptNumeric() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept numeric values except dropdown in medicalHistoryTab");
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(163).getCell(1).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(163).getCell(2).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedicalPermission.equalsIgnoreCase("Add")) {
				try {
					medicalICD10CodeClick(ICD10CodeValue);
					medicalStatusClick(Status);
				}catch (Exception e) {
					
				}
				medicalDateClick(DateValue);
				medicalNoteClick(NoteValue);
				medicalAddClick();
				medicalErrMsg();
				medicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medicalHistoryNotAcceptSpace() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept space except dropdown in medicalHistoryTab");
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(164).getCell(1).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(164).getCell(2).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedicalPermission.equalsIgnoreCase("Add")) {
				try {
					medicalICD10CodeClick(ICD10CodeValue);
					medicalStatusClick(Status);
				}catch (Exception e) {
					
				}
				medicalDateClick(DateValue);
				medicalNoteClick(NoteValue);
				medicalAddClick();
				Thread.sleep(2000);
				medicalErrMsg();
				//medicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medicalHistoryValidData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Medical History [Valid Data]");
		String ICD10CodeValue = DpClinicalProfileValidation.getRow(166).getCell(1).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(166).getCell(2).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedicalPermission.equalsIgnoreCase("Add")) {
	
					medicalICD10CodeClick(ICD10CodeValue);
					Thread.sleep(2000);
					medicalStatusClick(Status);
				
				medicalDateClick(DateValue);
				medicalNoteClick(NoteValue);
				medicalAddClick();
				Thread.sleep(2000);
				successMsg();
		
		}
		}
		//parent.appendChild(test);
	}
	
	
	public void healthHistoryROSClinicalWithoutData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Review Of Systems(Without Data) Tab");
		Thread.sleep(3000);
		healthHistoryROSTabClick();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthROSPermission.equalsIgnoreCase("Add")) {
				rosAddClick();
				rosErrMsg();
				rosCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void ROSwithAlphabets() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept other alphabets except note field in ROSTab");
		String organsValue = DpClinicalProfileValidation.getRow(171).getCell(2).getStringCellValue();
		String clinicalObservationsValue = DpClinicalProfileValidation.getRow(171).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthROSPermission.equalsIgnoreCase("Add")) {
				rosDateClick(DateValue);
				try {
					rosOrgansClick(organsValue);
					rosclinicalObservationsClick(clinicalObservationsValue);
				} catch (Exception e) {
					
				}
				rosNoteClick(NoteValue);
				rosAddClick();
				rosErrMsg();
				rosCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void ROSShouldNotAcceptNumeric() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept numeric values except note field in ROSTab");
		String organsValue = DpClinicalProfileValidation.getRow(172).getCell(2).getStringCellValue();
		String clinicalObservationsValue = DpClinicalProfileValidation.getRow(172).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthROSPermission.equalsIgnoreCase("Add")) {
				rosDateClick(DateValue);
				try {
					rosOrgansClick(organsValue);
					rosclinicalObservationsClick(clinicalObservationsValue);
				} catch (Exception e) {
					
				}
				rosNoteClick(NoteValue);
				rosAddClick();
				rosErrMsg();
				rosCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void ROSShouldNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept special characters except note field in ROSTab");
		String organsValue = DpClinicalProfileValidation.getRow(173).getCell(2).getStringCellValue();
		String clinicalObservationsValue = DpClinicalProfileValidation.getRow(173).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthROSPermission.equalsIgnoreCase("Add")) {
				rosDateClick(DateValue);
				try {
					rosOrgansClick(organsValue);
					rosclinicalObservationsClick(clinicalObservationsValue);
				} catch (Exception e) {
					
				}
				rosNoteClick(NoteValue);
				rosAddClick();
				rosErrMsg();
				rosCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void ROSShouldNotAcceptSpace() throws IOException, InterruptedException {
		test = report.createTest("Verify that all fields should not accept space except note field in ROSTab");
		String organsValue = DpClinicalProfileValidation.getRow(174).getCell(2).getStringCellValue();
		String clinicalObservationsValue = DpClinicalProfileValidation.getRow(174).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthROSPermission.equalsIgnoreCase("Add")) {
				rosDateClick(DateValue);
				try {
					rosOrgansClick(organsValue);
					rosclinicalObservationsClick(clinicalObservationsValue);
				} catch (Exception e) {
					
				}
				rosNoteClick(NoteValue);
				rosAddClick();
				rosErrMsg();
				//rosCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void ROSValidData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Review Of Systems [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthROSPermission.equalsIgnoreCase("Add")) {
				rosDateClick(DateValue);
				rosOrgansClick(organsValue);
				rosclinicalObservationsClick(clinicalObservationsValue);
				rosNoteClick(NoteValue);
				rosAddClick();
				Thread.sleep(2000);
				successMsg();
//				rosCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	
	
	public void healthHistorySurgicalClinicalWithoutData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Surgical History(Without Data) Tab");
		healthHistorySurgicalTabClick();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthSurgicalPermission.equalsIgnoreCase("Add")) {
				surgicalAddClick();
				surgicalErrMsg();
				surgicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void surgicalNotAcceptOtherAlphabets() throws IOException {
		test = report.createTest("Verify that all fields should not accept other alphabets except note field in SurgicalHisoryTab");
		String Surgery = DpClinicalProfileValidation.getRow(181).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthSurgicalPermission.equalsIgnoreCase("Add")) {
				try {
					surgicalSurgeryClick(Surgery);
				}catch (Exception e) {
					
				}
				surgicalDateClick(DateValue);
				surgicalNoteClick(NoteValue);
				surgicalAddClick();
				surgicalErrMsg();
				surgicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void surgicalNotAcceptNumeric() throws IOException {
		test = report.createTest("Verify that all fields should not accept numeric values except note field in SurgicalHisoryTab");
		String Surgery = DpClinicalProfileValidation.getRow(182).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthSurgicalPermission.equalsIgnoreCase("Add")) {
				try {
					surgicalSurgeryClick(Surgery);
				}catch (Exception e) {
					
				}
				surgicalDateClick(DateValue);
				surgicalNoteClick(NoteValue);
				surgicalAddClick();
				surgicalErrMsg();
				surgicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void surgicalNotAcceptSpecialCharacters() throws IOException {
		test = report.createTest("Verify that all fields should not accept special characters except note field in SurgicalHisoryTab");
		String Surgery = DpClinicalProfileValidation.getRow(183).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthSurgicalPermission.equalsIgnoreCase("Add")) {
				try {
					surgicalSurgeryClick(Surgery);
				}catch (Exception e) {
					
				}
				surgicalDateClick(DateValue);
				surgicalNoteClick(NoteValue);
				surgicalAddClick();
				surgicalErrMsg();
				surgicalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void surgicalNotAcceptSpace() throws IOException {
		test = report.createTest("Verify that all fields should not accept space except note field in SurgicalHisoryTab");
		String Surgery = DpClinicalProfileValidation.getRow(184).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthSurgicalPermission.equalsIgnoreCase("Add")) {
				try {
					surgicalSurgeryClick(Surgery);
				}catch (Exception e) {
					
				}
				surgicalDateClick(DateValue);
				surgicalNoteClick(NoteValue);
				surgicalAddClick();
				surgicalErrMsg();
			}
		}
		//parent.appendChild(test);
	}
	
	public void surgicalValidData() throws IOException, InterruptedException {
		test = report.createTest("Health History / Surgical History [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthSurgicalPermission.equalsIgnoreCase("Add")) {
				surgicalSurgeryClick(Surgery);
				surgicalDateClick(DateValue);
				surgicalNoteClick(NoteValue);
				surgicalAddClick();
				Thread.sleep(2000);
				successMsg();
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}
}