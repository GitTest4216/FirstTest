package methodPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import dataPackage.AllergyClinicalData;
import dataPackage.MedListData;
import dataPackage.PayorData;

public class MedListMethods extends MedListData{

	String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
	String ClinicalHealthMedPermission = DpClinicalProfile.getRow(62).getCell(0).getStringCellValue();
	String Type = DpClinicalProfile.getRow(62).getCell(1).getStringCellValue();
	String medicationNameValue = DpClinicalProfile.getRow(62).getCell(3).getStringCellValue();
	String strengthValue = DpClinicalProfile.getRow(62).getCell(4).getStringCellValue();
	String strengthUnit = DpClinicalProfile.getRow(62).getCell(5).getStringCellValue();
	String dosageQuantityValue = DpClinicalProfile.getRow(62).getCell(6).getStringCellValue();
	String dosageUnit = DpClinicalProfile.getRow(62).getCell(7).getStringCellValue();
	String frequencyValue = DpClinicalProfile.getRow(62).getCell(8).getStringCellValue();
	String ROA = DpClinicalProfile.getRow(62).getCell(9).getStringCellValue();
	String RFUValue = DpClinicalProfile.getRow(62).getCell(10).getStringCellValue();
	String Status = DpClinicalProfile.getRow(62).getCell(11).getStringCellValue();
	String StartDateValue = DpClinicalProfile.getRow(62).getCell(12).getStringCellValue();
	String EndDateValue = DpClinicalProfile.getRow(62).getCell(13).getStringCellValue();
	String NoteValue = DpClinicalProfile.getRow(62).getCell(14).getStringCellValue();
	
	public void medListClinicalWithoutData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
		AllergyClinicalData a1 = PageFactory.initElements(driver, AllergyClinicalData.class);
//		parent = report.createTest("Clinical Profile " + "<b>" + "(Med List)" + "</b>");
//		test = report.createTest("Clinical Profile / Med List (without data) Tab");
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
				a1.clinicalProfileTabClick();
				medListTabClick();
				if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
					medListAddBtnClick();
					medListErrMsg();
					medListCancelBtnClick();
				}
			}
			//parent.appendChild(test);
		}
		
	}
	
	public void dropdownnotAcceptOtherAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("MedList all dropdowns should not accept any other alphabets");
		String Type = DpClinicalProfileValidation.getRow(191).getCell(1).getStringCellValue();
		String strengthUnit = DpClinicalProfileValidation.getRow(191).getCell(5).getStringCellValue();
		String dosageUnit = DpClinicalProfileValidation.getRow(191).getCell(7).getStringCellValue();
		String ROA = DpClinicalProfileValidation.getRow(191).getCell(9).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(191).getCell(11).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				try {
					typeSearchClick(Type);
				} catch (Exception e) {
					
				}
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				try {
					strengthUnitClick(strengthUnit);
				} catch (Exception e) {
					
				}
				dosageQuantityClick(dosageQuantityValue);
				try {
					dosageUnitClick(dosageUnit);
				} catch (Exception e) {
					
				}
				frequencyClick(frequencyValue);
				try {
					ROAClick(ROA);
				} catch (Exception e) {
					
				}
				reasonForUseClick(RFUValue);
				try {
					statusClick(Status);
				} catch (Exception e) {
					
				}
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void dropdownnotAcceptNumeric() throws IOException, InterruptedException {
		//test = report.createTest("MedList all dropdowns should not accept numeric values");
		String Type = DpClinicalProfileValidation.getRow(192).getCell(1).getStringCellValue();
		String strengthUnit = DpClinicalProfileValidation.getRow(192).getCell(5).getStringCellValue();
		String dosageUnit = DpClinicalProfileValidation.getRow(192).getCell(7).getStringCellValue();
		String ROA = DpClinicalProfileValidation.getRow(192).getCell(9).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(192).getCell(11).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				try {
					typeSearchClick(Type);
				} catch (Exception e) {
					
				}
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				try {
					strengthUnitClick(strengthUnit);
				} catch (Exception e) {
					
				}
				dosageQuantityClick(dosageQuantityValue);
				try {
					dosageUnitClick(dosageUnit);
				} catch (Exception e) {
					
				}
				frequencyClick(frequencyValue);
				try {
					ROAClick(ROA);
				} catch (Exception e) {
					
				}
				reasonForUseClick(RFUValue);
				try {
					statusClick(Status);
				} catch (Exception e) {
					
				}
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void dropdownnotAcceptSpecialCharacters() throws IOException, InterruptedException {
	//	test = report.createTest("MedList all dropdowns should not accept special characters");
		String Type = DpClinicalProfileValidation.getRow(193).getCell(1).getStringCellValue();
		String strengthUnit = DpClinicalProfileValidation.getRow(193).getCell(5).getStringCellValue();
		String dosageUnit = DpClinicalProfileValidation.getRow(193).getCell(7).getStringCellValue();
		String ROA = DpClinicalProfileValidation.getRow(193).getCell(9).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(193).getCell(11).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				try {
					typeSearchClick(Type);
				} catch (Exception e) {
					
				}
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				try {
					strengthUnitClick(strengthUnit);
				} catch (Exception e) {
					
				}
				dosageQuantityClick(dosageQuantityValue);
				try {
					dosageUnitClick(dosageUnit);
				} catch (Exception e) {
					
				}
				frequencyClick(frequencyValue);
				try {
					ROAClick(ROA);
				} catch (Exception e) {
					
				}
				reasonForUseClick(RFUValue);
				try {
					statusClick(Status);
				} catch (Exception e) {
					
				}
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void dropdownnotAcceptSpace() throws IOException, InterruptedException {
		//test = report.createTest("MedList all dropdowns should not accept space");
		String Type = DpClinicalProfileValidation.getRow(194).getCell(1).getStringCellValue();
		String strengthUnit = DpClinicalProfileValidation.getRow(194).getCell(5).getStringCellValue();
		String dosageUnit = DpClinicalProfileValidation.getRow(194).getCell(7).getStringCellValue();
		String ROA = DpClinicalProfileValidation.getRow(194).getCell(9).getStringCellValue();
		String Status = DpClinicalProfileValidation.getRow(194).getCell(11).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				try {
					typeSearchClick(Type);
				} catch (Exception e) {
					
				}
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				try {
					strengthUnitClick(strengthUnit);
				} catch (Exception e) {
					
				}
				dosageQuantityClick(dosageQuantityValue);
				try {
					dosageUnitClick(dosageUnit);
				} catch (Exception e) {
					
				}
				frequencyClick(frequencyValue);
				try {
					ROAClick(ROA);
				} catch (Exception e) {
					
				}
				reasonForUseClick(RFUValue);
				try {
					statusClick(Status);
				} catch (Exception e) {
					
				}
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medListDateValueInvaid() throws IOException, InterruptedException {
		//test = report.createTest("MedList startDate and endDate should not accept invalid date value");
		String StartDateValue = DpClinicalProfileValidation.getRow(195).getCell(12).getStringCellValue();
		String EndDateValue = DpClinicalProfileValidation.getRow(195).getCell(13).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				typeSearchClick(Type);
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				strengthUnitClick(strengthUnit);
				dosageQuantityClick(dosageQuantityValue);
				dosageUnitClick(dosageUnit);
				frequencyClick(frequencyValue);
				ROAClick(ROA);
				reasonForUseClick(RFUValue);
				statusClick(Status);
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medListMedicationNameNotAcceptNumeric() throws IOException, InterruptedException {
		//test = report.createTest("MedList medication name should not accept numeric values");
		String medicationNameValue = DpClinicalProfileValidation.getRow(196).getCell(3).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				typeSearchClick(Type);
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				strengthUnitClick(strengthUnit);
				dosageQuantityClick(dosageQuantityValue);
				dosageUnitClick(dosageUnit);
				frequencyClick(frequencyValue);
				ROAClick(ROA);
				reasonForUseClick(RFUValue);
				statusClick(Status);
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}	
		}
		//parent.appendChild(test);
	}
	
	public void medListAllTextFieldNotAcceptSpace() throws IOException, InterruptedException {
		//test = report.createTest("MedList all fields should not accept space");
		String medicationNameValue = DpClinicalProfileValidation.getRow(197).getCell(3).getStringCellValue();
		String strengthValue = DpClinicalProfileValidation.getRow(197).getCell(4).getStringCellValue();
		String dosageQuantityValue = DpClinicalProfileValidation.getRow(197).getCell(6).getStringCellValue();
		String frequencyValue = DpClinicalProfileValidation.getRow(197).getCell(8).getStringCellValue();
		String RFUValue = DpClinicalProfileValidation.getRow(197).getCell(10).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				typeSearchClick(Type);
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				strengthUnitClick(strengthUnit);
				dosageQuantityClick(dosageQuantityValue);
				dosageUnitClick(dosageUnit);
				frequencyClick(frequencyValue);
				ROAClick(ROA);
				reasonForUseClick(RFUValue);
				statusClick(Status);
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}	
		}
		//parent.appendChild(test);
	}
	
	public void medListSomeFieldNotAcceptAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("MedList dosage quantity and frequency should not accept alphabets");
		String dosageQuantityValue = DpClinicalProfileValidation.getRow(198).getCell(6).getStringCellValue();
		String frequencyValue = DpClinicalProfileValidation.getRow(198).getCell(8).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				typeSearchClick(Type);
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				strengthUnitClick(strengthUnit);
				try {
					dosageQuantityClick(dosageQuantityValue);
				} catch (Exception e) {
					
				}
				dosageUnitClick(dosageUnit);
				try {
					frequencyClick(frequencyValue);
				}catch (Exception e) {
					
				}
				ROAClick(ROA);
				reasonForUseClick(RFUValue);
				statusClick(Status);
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void medListSomeFieldNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		//test = report.createTest("MedList dosage quantity and frequency should not special characters");
		String dosageQuantityValue = DpClinicalProfileValidation.getRow(199).getCell(6).getStringCellValue();
		String frequencyValue = DpClinicalProfileValidation.getRow(199).getCell(8).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				typeSearchClick(Type);
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				strengthUnitClick(strengthUnit);
				try {
					dosageQuantityClick(dosageQuantityValue);
				} catch (Exception e) {
					
				}
				dosageUnitClick(dosageUnit);
				try {
					frequencyClick(frequencyValue);
				}catch (Exception e) {
					
				}
				ROAClick(ROA);
				reasonForUseClick(RFUValue);
				statusClick(Status);
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				medListErrMsg();
				medListCancelBtnClick();
			}
		}
		//parent.appendChild(test);
		
	}
	
	public void medListValidData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / Med List [Valid data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalHealthMedPermission.equalsIgnoreCase("Add")) {
				typeSearchClick(Type);
				medicationNameClick(medicationNameValue);
				strengthClick(strengthValue);
				strengthUnitClick(strengthUnit);
				dosageQuantityClick(dosageQuantityValue);
				dosageUnitClick(dosageUnit);
				frequencyClick(frequencyValue);
				ROAClick(ROA);
				reasonForUseClick(RFUValue);
				statusClick(Status);
				startDateClick(StartDateValue);
				endDateClick(EndDateValue);
				noteClick(NoteValue);
				medListAddBtnClick();
				Thread.sleep(1000);
				successMsg();
				
			}
			
		}	
		//parent.appendChild(test);
		//report.endTest(parent);
	}
		

	
	
	}
	
