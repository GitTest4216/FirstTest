package methodPackage;
 
import java.io.IOException;
 
import org.openqa.selenium.support.PageFactory;
 
import dataPackage.AllergyClinicalData;
import dataPackage.PayorData;
 
public class AllergyMethods extends AllergyClinicalData {
	String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
	String ClinicalAllergenPermission = DpClinicalProfile.getRow(1).getCell(1).getStringCellValue();
	String AllergentypeValue = DpClinicalProfile.getRow(1).getCell(0).getStringCellValue();
	String AllergyNameValue = DpClinicalProfile.getRow(1).getCell(2).getStringCellValue();
	String reactionNameValue = DpClinicalProfile.getRow(1).getCell(3).getStringCellValue();
	String onsetDateValue = DpClinicalProfile.getRow(1).getCell(4).getStringCellValue();
	String statusValue = DpClinicalProfile.getRow(1).getCell(5).getStringCellValue();
	String allergyNoteValue = DpClinicalProfile.getRow(1).getCell(6).getStringCellValue();
	public void allergyTabClinicalWithoutData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
//		parent = report.createTest("Clinical Profile " + "<b>" + "(Allergy)" + "</b>");
//		test = report.createTest("Clinical Profile / AllergyTab(Without Data)");
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
//				p1.patientSearchMethod();
				clinicalProfileTabClick();
				ClinicalProfileAllergyTabClick();
				if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
					addAllergyClick();
					errMsg();
					cancelAllergyClick();
				}
			}
			//parent.appendChild(test);
		}	
	}
	public void allergenTypeNotSelected() throws IOException, InterruptedException {
		//test = report.createTest("Click on add button without selecting allergen type");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	}
	public void allergyNameNotSelected() throws InterruptedException, IOException {
		//test = report.createTest("Click on add button without selecting name of the allergy");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	}
	public void allergyNoteNotSelected() throws InterruptedException, IOException {
		//test = report.createTest("Click on add button without enter a note");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	}
	public void allergyNameNotAllowAlphaNumeric() throws InterruptedException, IOException {
		//test = report.createTest("Verify that allergy name should not allow alphanumeric values");
		String AllergentypeValue = DpClinicalProfileValidation.getRow(3).getCell(0).getStringCellValue();
		String AllergyNameValue = DpClinicalProfileValidation.getRow(3).getCell(2).getStringCellValue();
		String reactionNameValue = DpClinicalProfileValidation.getRow(3).getCell(3).getStringCellValue();
		String onsetDateValue = DpClinicalProfileValidation.getRow(3).getCell(4).getStringCellValue();
		String statusValue = DpClinicalProfileValidation.getRow(3).getCell(5).getStringCellValue();
		String allergyNoteValue = DpClinicalProfileValidation.getRow(3).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	}
	public void allergyNameNotAllowSpecialCharacter() throws InterruptedException, IOException {
		//test = report.createTest("Verify that allergy name should not allow special characters");
		String AllergentypeValue = DpClinicalProfileValidation.getRow(4).getCell(0).getStringCellValue();
		String AllergyNameValue = DpClinicalProfileValidation.getRow(4).getCell(2).getStringCellValue();
		String reactionNameValue = DpClinicalProfileValidation.getRow(4).getCell(3).getStringCellValue();
		String onsetDateValue = DpClinicalProfileValidation.getRow(4).getCell(4).getStringCellValue();
		String statusValue = DpClinicalProfileValidation.getRow(4).getCell(5).getStringCellValue();
		String allergyNoteValue = DpClinicalProfileValidation.getRow(4).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	}
	public void allergyNameNotAllowSpaceBetweenName() throws InterruptedException, IOException {
		//test = report.createTest("Verify that allergy name should not allow space between name");
		String AllergentypeValue = DpClinicalProfileValidation.getRow(5).getCell(0).getStringCellValue();
		String AllergyNameValue = DpClinicalProfileValidation.getRow(5).getCell(2).getStringCellValue();
		String reactionNameValue = DpClinicalProfileValidation.getRow(5).getCell(3).getStringCellValue();
		String onsetDateValue = DpClinicalProfileValidation.getRow(5).getCell(4).getStringCellValue();
		String statusValue = DpClinicalProfileValidation.getRow(5).getCell(5).getStringCellValue();
		String allergyNoteValue = DpClinicalProfileValidation.getRow(5).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	} 
	public void allergyNameNotAllowSpace() throws InterruptedException, IOException {
		//test = report.createTest("Verify that allergy name should not allow only blank space");
		String AllergentypeValue = DpClinicalProfileValidation.getRow(6).getCell(0).getStringCellValue();
		String AllergyNameValue = DpClinicalProfileValidation.getRow(6).getCell(2).getStringCellValue();
		String reactionNameValue = DpClinicalProfileValidation.getRow(6).getCell(3).getStringCellValue();
		String onsetDateValue = DpClinicalProfileValidation.getRow(6).getCell(4).getStringCellValue();
		String statusValue = DpClinicalProfileValidation.getRow(6).getCell(5).getStringCellValue();
		String allergyNoteValue = DpClinicalProfileValidation.getRow(6).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	} 
	public void allergyNoteNotAllowOnlySpace() throws InterruptedException, IOException {
		//test = report.createTest("Verify that allergy note should not allow only blank space");
		String AllergentypeValue = DpClinicalProfileValidation.getRow(8).getCell(0).getStringCellValue();
		String AllergyNameValue = DpClinicalProfileValidation.getRow(8).getCell(2).getStringCellValue();
		String reactionNameValue = DpClinicalProfileValidation.getRow(8).getCell(3).getStringCellValue();
		String onsetDateValue = DpClinicalProfileValidation.getRow(8).getCell(4).getStringCellValue();
		String statusValue = DpClinicalProfileValidation.getRow(8).getCell(5).getStringCellValue();
		String allergyNoteValue = DpClinicalProfileValidation.getRow(8).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	} 
	public void allergyNameBasedOnType() throws InterruptedException, IOException {
		//test = report.createTest("Verify that if allergen type is no known allergies than it will not show name");
		String AllergentypeValue = DpClinicalProfileValidation.getRow(9).getCell(0).getStringCellValue();
		String AllergyNameValue = DpClinicalProfileValidation.getRow(9).getCell(2).getStringCellValue();
		String reactionNameValue = DpClinicalProfileValidation.getRow(9).getCell(3).getStringCellValue();
		String onsetDateValue = DpClinicalProfileValidation.getRow(9).getCell(4).getStringCellValue();
		String statusValue = DpClinicalProfileValidation.getRow(9).getCell(5).getStringCellValue();
		String allergyNoteValue = DpClinicalProfileValidation.getRow(9).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				try {
					allergyNameAdd(AllergyNameValue);
				} catch (Exception e) {
				}
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				Thread.sleep(2000);
				errMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
	}	
	public void allergyTabClinicalWithValid() throws InterruptedException, IOException {
		//test = report.createTest("Clinical Profile / AllergyTab (Valid Data)");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalAllergenPermission.equalsIgnoreCase("Add")) {
				allergenType(AllergentypeValue);
				allergyNameAdd(AllergyNameValue);
				reactionsSelect(reactionNameValue);
				onsetDateSelect(onsetDateValue);
				statusSelect(statusValue);
				allergyNote(allergyNoteValue);
				addAllergyClick();
				Thread.sleep(1000);
				successMsg();
				cancelAllergyClick();
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}
}