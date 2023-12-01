package methodPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import dataPackage.AllergyClinicalData;
import dataPackage.LabsClinicalData;
import dataPackage.PayorData;
import dataPackage.VitalClinicalData;

public class LabsMethods  extends LabsClinicalData{
	
	String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
	String ClinicalLabBloodGlucosePermission = DpClinicalProfile.getRow(13).getCell(0).getStringCellValue();
	String ClinicalLabChemistriesPermission = DpClinicalProfile.getRow(17).getCell(0).getStringCellValue();
	String ClinicalLabCBCPermission = DpClinicalProfile.getRow(21).getCell(0).getStringCellValue();
	String ClinicalLabInflammatoryPermission = DpClinicalProfile.getRow(25).getCell(0).getStringCellValue();
	String ClinicalLabLipidPermission = DpClinicalProfile.getRow(29).getCell(0).getStringCellValue();
	String ClinicalLabLiverTestPermission = DpClinicalProfile.getRow(33).getCell(0).getStringCellValue();
	String ClinicalLabRenalTestPermission = DpClinicalProfile.getRow(37).getCell(0).getStringCellValue();
	
	String DateValue = DpClinicalProfile.getRow(13).getCell(1).getStringCellValue();
	String NoteValue = DpClinicalProfile.getRow(13).getCell(6).getStringCellValue();
	String BloodGlucoseValue = DpClinicalProfile.getRow(13).getCell(2).getStringCellValue();
	String Type = DpClinicalProfile.getRow(13).getCell(3).getStringCellValue();
	String Time = DpClinicalProfile.getRow(13).getCell(4).getStringCellValue();
	String HemoglobinA1CValue = DpClinicalProfile.getRow(13).getCell(5).getStringCellValue();
	String SodiumValue = DpClinicalProfile.getRow(17).getCell(2).getStringCellValue();
	String PotassiumValue = DpClinicalProfile.getRow(17).getCell(3).getStringCellValue();
	String CalciumValue = DpClinicalProfile.getRow(17).getCell(4).getStringCellValue();
	String MagnesiumValue = DpClinicalProfile.getRow(17).getCell(5).getStringCellValue();
	String PhosphorusValue = DpClinicalProfile.getRow(17).getCell(6).getStringCellValue();
	String ChlorideValue = DpClinicalProfile.getRow(17).getCell(7).getStringCellValue();
	String BicarbonateValue = DpClinicalProfile.getRow(17).getCell(8).getStringCellValue();
	String CarbonDioxideValue = DpClinicalProfile.getRow(17).getCell(9).getStringCellValue();
	String WBCValue = DpClinicalProfile.getRow(21).getCell(2).getStringCellValue();
	String ANCValue = DpClinicalProfile.getRow(21).getCell(3).getStringCellValue();
	String ALCValue = DpClinicalProfile.getRow(21).getCell(4).getStringCellValue();
	String RBCValue = DpClinicalProfile.getRow(21).getCell(5).getStringCellValue();
	String HgBValue = DpClinicalProfile.getRow(21).getCell(6).getStringCellValue();
	String HCTValue = DpClinicalProfile.getRow(21).getCell(7).getStringCellValue();
	String PLTValue = DpClinicalProfile.getRow(21).getCell(8).getStringCellValue();
	String AntiCCPValue = DpClinicalProfile.getRow(25).getCell(2).getStringCellValue();
	String CRPValue = DpClinicalProfile.getRow(25).getCell(3).getStringCellValue();
	String ESRValue = DpClinicalProfile.getRow(25).getCell(4).getStringCellValue();
	String RFValue = DpClinicalProfile.getRow(25).getCell(5).getStringCellValue();
	String LDLValue = DpClinicalProfile.getRow(29).getCell(2).getStringCellValue();
	String HDLValue = DpClinicalProfile.getRow(29).getCell(3).getStringCellValue();
	String TriglyceridesValue = DpClinicalProfile.getRow(29).getCell(4).getStringCellValue();
	String ALPValue = DpClinicalProfile.getRow(33).getCell(2).getStringCellValue();
	String ALTValue = DpClinicalProfile.getRow(33).getCell(3).getStringCellValue();
	String ASTValue = DpClinicalProfile.getRow(33).getCell(4).getStringCellValue();
	String SerumAlbuminValue = DpClinicalProfile.getRow(33).getCell(5).getStringCellValue();
	String TotalBilirubinValue = DpClinicalProfile.getRow(33).getCell(6).getStringCellValue();
	String CrClValue = DpClinicalProfile.getRow(37).getCell(2).getStringCellValue();
	String SCrValue = DpClinicalProfile.getRow(37).getCell(3).getStringCellValue();
	String BUNValue = DpClinicalProfile.getRow(37).getCell(4).getStringCellValue();
	String BunRatioValue = DpClinicalProfile.getRow(37).getCell(5).getStringCellValue();
	
	public void labTabBloodGlucoseClinicalWithoutData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
		AllergyClinicalData a1 = PageFactory.initElements(driver, AllergyClinicalData.class);
		VitalClinicalData v1 = PageFactory.initElements(driver, VitalClinicalData.class);
//		parent = report.createTest("Clinical Profile" + "<b>" +"(Labs)" +"</b>");
//		test = report.createTest("Labs Tab(BloodGlucoseTab (Without Data))");
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
				v1.ClinicalProfileVitalSignsTabClick();
				clinicalLabTabClick();
				if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
					String bloodGlucoseDate = DpClinicalProfileValidation.getRow(50).getCell(1).getStringCellValue();
					bloodGlucoseDateClick(bloodGlucoseDate);
					bloodGlucoseAddBtnClick();
					bloodGlucoseErrMsg();
					bloodGlucoseCancelBtnClick();
					
				}
			}
			//parent.appendChild(test);
		}
	}
	
	
	public void labTabBloodGlucoseWithInvalidAlphabetsData() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields except dropdowns should not accept alphabets in Blood Glucose Tab");
		String BloodGlucoseValue = DpClinicalProfileValidation.getRow(52).getCell(2).getStringCellValue();
		String HemoglobinA1CValue = DpClinicalProfileValidation.getRow(52).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
				bloodGlucoseDateClick(DateValue);
				try {
					bloodGlucoseValClick(BloodGlucoseValue);
					bloodGlucoseHemoglobinA1C(HemoglobinA1CValue);
				}catch (Exception e) {
					
				}
				bloodGlucoseAddBtnClick();
				bloodGlucoseErrMsg();
				bloodGlucoseCancelBtnClick();
			
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabBloodGlucoseWithSpecialCharData() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept special character in Blood Glucose Tab");
		String BloodGlucoseValue = DpClinicalProfileValidation.getRow(53).getCell(2).getStringCellValue();
		String Type = DpClinicalProfileValidation.getRow(53).getCell(3).getStringCellValue();
		String Time = DpClinicalProfileValidation.getRow(53).getCell(4).getStringCellValue();
		String HemoglobinA1CValue = DpClinicalProfileValidation.getRow(53).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
				bloodGlucoseDateClick(DateValue);
				try {
					bloodGlucoseValClick(BloodGlucoseValue);
					bloodGlucoseTypeClick(Type);
					bloodGlucoseTimeClick(Time);
					bloodGlucoseHemoglobinA1C(HemoglobinA1CValue);
				}catch (Exception e) {
					
				}
				bloodGlucoseAddBtnClick();
				bloodGlucoseErrMsg();
				bloodGlucoseCancelBtnClick();
		
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabBloodGlucoseWithBlankSpaceData() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept blank space in Blood Glucose Tab");
		String BloodGlucoseValue = DpClinicalProfileValidation.getRow(54).getCell(2).getStringCellValue();
		String Type = DpClinicalProfileValidation.getRow(54).getCell(3).getStringCellValue();
		String Time = DpClinicalProfileValidation.getRow(54).getCell(4).getStringCellValue();
		String HemoglobinA1CValue = DpClinicalProfileValidation.getRow(54).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
				bloodGlucoseDateClick(DateValue);
				try {
					bloodGlucoseValClick(BloodGlucoseValue);
					bloodGlucoseTypeClick(Type);
					bloodGlucoseTimeClick(Time);
					bloodGlucoseHemoglobinA1C(HemoglobinA1CValue);
				}catch (Exception e) {
					
				}
				bloodGlucoseAddBtnClick();
				bloodGlucoseErrMsg();
				bloodGlucoseCancelBtnClick();
			
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabBloodGlucoseDropdownOthertype() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all dropdown should not accept other type(numbers) in Blood Glucose Tab");
		String Type = DpClinicalProfileValidation.getRow(52).getCell(3).getStringCellValue();
		String Time = DpClinicalProfileValidation.getRow(52).getCell(4).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
				bloodGlucoseDateClick(DateValue);
				try {
					bloodGlucoseTypeClick(Type);
					bloodGlucoseTimeClick(Time);
				}catch (Exception e) {
					
				}
				bloodGlucoseAddBtnClick();
				bloodGlucoseErrMsg();
				bloodGlucoseCancelBtnClick();

			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabBloodGlucoseWithoutDate() throws IOException, InterruptedException {
		//test = report.createTest("Click on Add or Update button without adding date in Blood Glucose Tab");
	String bloodGlucoseDate = DpClinicalProfileValidation.getRow(50).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
				bloodGlucoseDateClick(bloodGlucoseDate);
				bloodGlucoseValClick(BloodGlucoseValue);
				bloodGlucoseTypeClick(Type);
				bloodGlucoseTimeClick(Time);
				bloodGlucoseHemoglobinA1C(HemoglobinA1CValue);
				bloodGlucoseNotes(NoteValue);
				bloodGlucoseAddBtnClick();
				bloodGlucoseErrMsg();
				//bloodGlucoseCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabBloodGlucoseClinicalWithValidData() throws IOException, InterruptedException {
		//test = report.createTest("Labs Tab (BloodGlucoseTab) [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabBloodGlucosePermission.equalsIgnoreCase("Add")) {
			bloodGlucoseDateClick(DateValue);
				bloodGlucoseValClick(BloodGlucoseValue);
				bloodGlucoseTypeClick(Type);
				bloodGlucoseTimeClick(Time);
				bloodGlucoseHemoglobinA1C(HemoglobinA1CValue);
				bloodGlucoseNotes(NoteValue);
				bloodGlucoseAddBtnClick();
				Thread.sleep(1000);
				successCaptureScreenshot();
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabChemistriesClinicalWithoutData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Chemistries Tab (Without Data))");
		String chemistriesDate = DpClinicalProfileValidation.getRow(60).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
				clinicalProfileLabChemistriesClick();
				chemistriesDateClick(chemistriesDate);
				chemistriesAddBtnClick();
				chemistriesErrMsg();
				chemistriesCancelBtnClick();
				
			}
		}
		//parent.appendChild(test);
	}
	
	
	
	public void chemistriesAllFieldAlphabets() throws IOException {
		//test = report.createTest("Verify that all fields should not accept alphabets in ChemistriesTab");
		
		String SodiumValue = DpClinicalProfileValidation.getRow(62).getCell(2).getStringCellValue();
		String PotassiumValue = DpClinicalProfileValidation.getRow(62).getCell(3).getStringCellValue();
		String CalciumValue = DpClinicalProfileValidation.getRow(62).getCell(4).getStringCellValue();
		String MagnesiumValue = DpClinicalProfileValidation.getRow(62).getCell(5).getStringCellValue();
		String PhosphorusValue = DpClinicalProfileValidation.getRow(62).getCell(6).getStringCellValue();
		String ChlorideValue = DpClinicalProfileValidation.getRow(62).getCell(7).getStringCellValue();
		String BicarbonateValue = DpClinicalProfileValidation.getRow(62).getCell(8).getStringCellValue();
		String CarbonDioxideValue = DpClinicalProfileValidation.getRow(62).getCell(9).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
				chemistriesDateClick(DateValue);
				try {
					chemistriesSodiumClick(SodiumValue);
					chemistriesPotassiumClick(PotassiumValue);
					chemistriesCalciumClick(CalciumValue);
					chemistriesMagnesiumClick(MagnesiumValue);
					chemistriesPhosphorusClick(PhosphorusValue);
					chemistriesChlorideClick(ChlorideValue);
					chemistriesBicarbonateClick(BicarbonateValue);
					chemistriesCarbonDioxideClick(CarbonDioxideValue);
				}catch (Exception e) {
					
				}
				chemistriesAddBtnClick();
				chemistriesErrMsg();
				chemistriesCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void chemistriesAllFieldsSpecialCharacter() throws IOException {
		//test = report.createTest("Verify that Sodium should not accept special characters in ChemistriesTab");
		String SodiumValue = DpClinicalProfileValidation.getRow(63).getCell(2).getStringCellValue();
		String PotassiumValue = DpClinicalProfileValidation.getRow(63).getCell(3).getStringCellValue();
		String CalciumValue = DpClinicalProfileValidation.getRow(63).getCell(4).getStringCellValue();
		String MagnesiumValue = DpClinicalProfileValidation.getRow(63).getCell(5).getStringCellValue();
		String PhosphorusValue = DpClinicalProfileValidation.getRow(63).getCell(6).getStringCellValue();
		String ChlorideValue = DpClinicalProfileValidation.getRow(63).getCell(7).getStringCellValue();
		String BicarbonateValue = DpClinicalProfileValidation.getRow(63).getCell(8).getStringCellValue();
		String CarbonDioxideValue = DpClinicalProfileValidation.getRow(63).getCell(9).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
				chemistriesDateClick(DateValue);
				try {
					chemistriesSodiumClick(SodiumValue);
					chemistriesPotassiumClick(PotassiumValue);
					chemistriesCalciumClick(CalciumValue);
					chemistriesMagnesiumClick(MagnesiumValue);
					chemistriesPhosphorusClick(PhosphorusValue);
					chemistriesChlorideClick(ChlorideValue);
					chemistriesBicarbonateClick(BicarbonateValue);
					chemistriesCarbonDioxideClick(CarbonDioxideValue);
				}catch (Exception e) {
					
				}
				chemistriesAddBtnClick();
				chemistriesErrMsg();
				chemistriesCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void chemistriesAllFieldsSpace() throws IOException {
		//test = report.createTest("Verify that all fields should not accept space in ChemistriesTab");
		String SodiumValue = DpClinicalProfileValidation.getRow(64).getCell(2).getStringCellValue();
		String PotassiumValue = DpClinicalProfileValidation.getRow(64).getCell(3).getStringCellValue();
		String CalciumValue = DpClinicalProfileValidation.getRow(64).getCell(4).getStringCellValue();
		String MagnesiumValue = DpClinicalProfileValidation.getRow(64).getCell(5).getStringCellValue();
		String PhosphorusValue = DpClinicalProfileValidation.getRow(64).getCell(6).getStringCellValue();
		String ChlorideValue = DpClinicalProfileValidation.getRow(64).getCell(7).getStringCellValue();
		String BicarbonateValue = DpClinicalProfileValidation.getRow(64).getCell(8).getStringCellValue();
		String CarbonDioxideValue = DpClinicalProfileValidation.getRow(64).getCell(9).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
				chemistriesDateClick(DateValue);
				try {
					chemistriesSodiumClick(SodiumValue);
					chemistriesPotassiumClick(PotassiumValue);
					chemistriesCalciumClick(CalciumValue);
					chemistriesMagnesiumClick(MagnesiumValue);
					chemistriesPhosphorusClick(PhosphorusValue);
					chemistriesChlorideClick(ChlorideValue);
					chemistriesBicarbonateClick(BicarbonateValue);
					chemistriesCarbonDioxideClick(CarbonDioxideValue);
				}catch (Exception e) {
					
				}
				chemistriesAddBtnClick();
				chemistriesErrMsg();
				chemistriesCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void chemistriesSomeFieldsOutOfRange() throws IOException {
		//test = report.createTest("Verify that some fields should not accept out of range values");
		String PotassiumValue = DpClinicalProfileValidation.getRow(64).getCell(3).getStringCellValue();
		String CalciumValue = DpClinicalProfileValidation.getRow(64).getCell(4).getStringCellValue();
		String MagnesiumValue = DpClinicalProfileValidation.getRow(64).getCell(5).getStringCellValue();
		String PhosphorusValue = DpClinicalProfileValidation.getRow(64).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
				chemistriesDateClick(DateValue);
				try {
					chemistriesPotassiumClick(PotassiumValue);
					chemistriesCalciumClick(CalciumValue);
					chemistriesMagnesiumClick(MagnesiumValue);
					chemistriesPhosphorusClick(PhosphorusValue);
				}catch (Exception e) {
					
				}
				chemistriesAddBtnClick();
				chemistriesErrMsg();
				//chemistriesCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabChemistriesWithoutDate() throws IOException, InterruptedException {
		//test = report.createTest("Click on Add or Update button without adding date in ChemistriesTab");
	String chemistriesDate = DpClinicalProfileValidation.getRow(60).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
				chemistriesDateClick(chemistriesDate);
				chemistriesSodiumClick(SodiumValue);
				chemistriesPotassiumClick(PotassiumValue);
				chemistriesCalciumClick(CalciumValue);
				chemistriesMagnesiumClick(MagnesiumValue);
				chemistriesPhosphorusClick(PhosphorusValue);
				chemistriesChlorideClick(ChlorideValue);
				chemistriesBicarbonateClick(BicarbonateValue);
				chemistriesCarbonDioxideClick(CarbonDioxideValue);
				chemistriesNoteClick(NoteValue);
				chemistriesAddBtnClick();
				Thread.sleep(2000);
				chemistriesErrMsg();
				//chemistriesCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabChemistriesWithValidData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Chemistries Tab [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabChemistriesPermission.equalsIgnoreCase("Add")) {
		     chemistriesDateClick(DateValue);
				chemistriesSodiumClick(SodiumValue);
				chemistriesPotassiumClick(PotassiumValue);
				chemistriesCalciumClick(CalciumValue);
				chemistriesMagnesiumClick(MagnesiumValue);
				chemistriesPhosphorusClick(PhosphorusValue);
				chemistriesChlorideClick(ChlorideValue);
				chemistriesBicarbonateClick(BicarbonateValue);
				chemistriesCarbonDioxideClick(CarbonDioxideValue);
				chemistriesNoteClick(NoteValue);
				chemistriesAddBtnClick();
				Thread.sleep(1000);
				successCaptureScreenshot();
				//chemistriesCancelBtnClick();
			}
		}
		//parent.appendChild(test);
	}

	public void labTabCompleteBloodCountClinicalWithoutData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Complete Blood Count Tab(Without Data))");
		String CBCDateValue = DpClinicalProfileValidation.getRow(71).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				clinicalCBCTabClick();
				CBCDateClick(CBCDateValue);
				CBCAddClick();
				CBCErrMsg();
				CBCCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	
	public void CBCDataOutOfRange() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept out of range values in CBCTab");
		String WBCValue = DpClinicalProfileValidation.getRow(72).getCell(2).getStringCellValue();
		String ANCValue = DpClinicalProfileValidation.getRow(72).getCell(3).getStringCellValue();
		String ALCValue = DpClinicalProfileValidation.getRow(72).getCell(4).getStringCellValue();
		String RBCValue = DpClinicalProfileValidation.getRow(72).getCell(5).getStringCellValue();
		String HgBValue = DpClinicalProfileValidation.getRow(72).getCell(6).getStringCellValue();
		String HCTValue = DpClinicalProfileValidation.getRow(72).getCell(7).getStringCellValue();
		String PLTValue = DpClinicalProfileValidation.getRow(72).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				CBCDateClick(DateValue);
				CBCWbcClick(WBCValue);
				CBCAncClick(ANCValue);
				CBCAlcClick(ALCValue);
				CBCRbcClick(RBCValue);
				CBCHgBClick(HgBValue);
				CBCHctClick(HCTValue);
				CBCPltClick(PLTValue);
				CBCNoteClick(NoteValue);
				CBCAddClick();
				CBCErrMsg();
				CBCCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void CBCNotAcceptAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept alphabets in CBCTab");
		String WBCValue = DpClinicalProfileValidation.getRow(73).getCell(2).getStringCellValue();
		String ANCValue = DpClinicalProfileValidation.getRow(73).getCell(3).getStringCellValue();
		String ALCValue = DpClinicalProfileValidation.getRow(73).getCell(4).getStringCellValue();
		String RBCValue = DpClinicalProfileValidation.getRow(73).getCell(5).getStringCellValue();
		String HgBValue = DpClinicalProfileValidation.getRow(73).getCell(6).getStringCellValue();
		String HCTValue = DpClinicalProfileValidation.getRow(73).getCell(7).getStringCellValue();
		String PLTValue = DpClinicalProfileValidation.getRow(73).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				CBCDateClick(DateValue);
				try {
					CBCWbcClick(WBCValue);
					CBCAncClick(ANCValue);
					CBCAlcClick(ALCValue);
					CBCRbcClick(RBCValue);
					CBCHgBClick(HgBValue);
					CBCHctClick(HCTValue);
					CBCPltClick(PLTValue);
				}catch (Exception e) {
					
				}
				CBCNoteClick(NoteValue);
				CBCAddClick();
				CBCErrMsg();
				CBCCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void CBCNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept special characters in CBCTab");
		String WBCValue = DpClinicalProfileValidation.getRow(74).getCell(2).getStringCellValue();
		String ANCValue = DpClinicalProfileValidation.getRow(74).getCell(3).getStringCellValue();
		String ALCValue = DpClinicalProfileValidation.getRow(74).getCell(4).getStringCellValue();
		String RBCValue = DpClinicalProfileValidation.getRow(74).getCell(5).getStringCellValue();
		String HgBValue = DpClinicalProfileValidation.getRow(74).getCell(6).getStringCellValue();
		String HCTValue = DpClinicalProfileValidation.getRow(74).getCell(7).getStringCellValue();
		String PLTValue = DpClinicalProfileValidation.getRow(74).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				CBCDateClick(DateValue);
				try {
					CBCWbcClick(WBCValue);
					CBCAncClick(ANCValue);
					CBCAlcClick(ALCValue);
					CBCRbcClick(RBCValue);
					CBCHgBClick(HgBValue);
					CBCHctClick(HCTValue);
					CBCPltClick(PLTValue);
				}catch (Exception e) {
					
				}
				CBCNoteClick(NoteValue);
				CBCAddClick();
				CBCErrMsg();
				CBCCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void CBCNotAcceptSpace() throws IOException, InterruptedException {
	//test = report.createTest("Verify that all fields should not accept space in CBCTab");
		String WBCValue = DpClinicalProfileValidation.getRow(75).getCell(2).getStringCellValue();
		String ANCValue = DpClinicalProfileValidation.getRow(75).getCell(3).getStringCellValue();
		String ALCValue = DpClinicalProfileValidation.getRow(75).getCell(4).getStringCellValue();
		String RBCValue = DpClinicalProfileValidation.getRow(75).getCell(5).getStringCellValue();
		String HgBValue = DpClinicalProfileValidation.getRow(75).getCell(6).getStringCellValue();
		String HCTValue = DpClinicalProfileValidation.getRow(75).getCell(7).getStringCellValue();
		String PLTValue = DpClinicalProfileValidation.getRow(75).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				CBCDateClick(DateValue);
				try {
					CBCWbcClick(WBCValue);
					CBCAncClick(ANCValue);
					CBCAlcClick(ALCValue);
					CBCRbcClick(RBCValue);
					CBCHgBClick(HgBValue);
					CBCHctClick(HCTValue);
					CBCPltClick(PLTValue);
				}catch (Exception e) {
					
				}
				CBCNoteClick(NoteValue);
				CBCAddClick();
				CBCErrMsg();
				//CBCCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabCBCWithoutDate() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Complete Blood Count Tab without Date)");
	String CBCDateValue = DpClinicalProfileValidation.getRow(71).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				CBCDateClick(CBCDateValue);
				CBCWbcClick(WBCValue);
				CBCAncClick(ANCValue);
				CBCAlcClick(ALCValue);
				CBCRbcClick(RBCValue);
				CBCHgBClick(HgBValue);
				CBCHctClick(HCTValue);
				CBCPltClick(PLTValue);
				CBCNoteClick(NoteValue);
				CBCAddClick();
				Thread.sleep(2000);
				CBCErrMsg();
			}
		}
		//parent.appendChild(test);
	}
	
	public void labTabCBCWithValidData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Complete Blood Count Tab [Valid Data]");
			if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
				if (ClinicalLabCBCPermission.equalsIgnoreCase("Add")) {
				   CBCDateClick(DateValue);
					CBCWbcClick(WBCValue);
					CBCAncClick(ANCValue);
					CBCAlcClick(ALCValue);
					CBCRbcClick(RBCValue);
					CBCHgBClick(HgBValue);
					CBCHctClick(HCTValue);
					CBCPltClick(PLTValue);
					CBCNoteClick(NoteValue);
					CBCAddClick();
					Thread.sleep(1000);
					successCaptureScreenshot();

				}
			}
			//parent.appendChild(test);
	}

	public void labTabInflammatoryMarkersClinicalWithoutData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Inflammatory Markers Tab(Without Data))");
		String InflammatoryDate = DpClinicalProfileValidation.getRow(81).getCell(1).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
				clinicalInflammatoryTabClick();
				inflammotoryDateClick(InflammatoryDate);
				inflammatoryAddClick();
				inflammatoryErrMsg();
				inflammatoryCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void inflammatoryWithAlphabets() throws IOException {
		//test = report.createTest("Verify that all fields should not accept alphabets in InflammatoryTab");
		String AntiCCPValue = DpClinicalProfileValidation.getRow(82).getCell(2).getStringCellValue();
		String CRPValue = DpClinicalProfileValidation.getRow(82).getCell(3).getStringCellValue();
		String ESRValue = DpClinicalProfileValidation.getRow(82).getCell(4).getStringCellValue();
		String RFValue = DpClinicalProfileValidation.getRow(82).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
				inflammotoryDateClick(DateValue);
				try {
					inflammotoryAntiCCPClick(AntiCCPValue);
					inflammotoryCRPClick(CRPValue);
					inflammotoryESRClick(ESRValue);
					inflammotoryRFClick(RFValue);
				}catch (Exception e) {
					
				}
				inflammotoryNoteClick(NoteValue);
				inflammatoryAddClick();
				inflammatoryErrMsg();
				inflammatoryCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void inflammatoryWithSpecialCharacters() throws IOException {
		//test = report.createTest("Verify that all fields should not accept special characters in InflammatoryTab");
		String AntiCCPValue = DpClinicalProfileValidation.getRow(83).getCell(2).getStringCellValue();
		String CRPValue = DpClinicalProfileValidation.getRow(83).getCell(3).getStringCellValue();
		String ESRValue = DpClinicalProfileValidation.getRow(83).getCell(4).getStringCellValue();
		String RFValue = DpClinicalProfileValidation.getRow(83).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
				inflammotoryDateClick(DateValue);
				try {
					inflammotoryAntiCCPClick(AntiCCPValue);
					inflammotoryCRPClick(CRPValue);
					inflammotoryESRClick(ESRValue);
					inflammotoryRFClick(RFValue);
				}catch (Exception e) {
					
				}
				inflammotoryNoteClick(NoteValue);
				inflammatoryAddClick();
				inflammatoryErrMsg();
				inflammatoryCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void inflammatoryWithSpace() throws IOException {
		//test = report.createTest("Verify that all fields should not accept space in InflammatoryTab");
		String AntiCCPValue = DpClinicalProfileValidation.getRow(84).getCell(2).getStringCellValue();
		String CRPValue = DpClinicalProfileValidation.getRow(84).getCell(3).getStringCellValue();
		String ESRValue = DpClinicalProfileValidation.getRow(84).getCell(4).getStringCellValue();
		String RFValue = DpClinicalProfileValidation.getRow(84).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
				inflammotoryDateClick(DateValue);
				try {
					inflammotoryAntiCCPClick(AntiCCPValue);
					inflammotoryCRPClick(CRPValue);
					inflammotoryESRClick(ESRValue);
					inflammotoryRFClick(RFValue);
				}catch (Exception e) {
					
				}
				inflammotoryNoteClick(NoteValue);
				inflammatoryAddClick();
				inflammatoryErrMsg();
				inflammatoryCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void CRPWithOutOfRange() throws IOException {
		//test = report.createTest("Verify that CRP should not accept out of range values in InflammatoryTab");
		String CRPValue = DpClinicalProfileValidation.getRow(85).getCell(3).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
				inflammotoryDateClick(DateValue);
				inflammotoryCRPClick(CRPValue);
				inflammatoryAddClick();
				inflammatoryErrMsg();
			    //inflammatoryCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void inflammatoryWithoutDate() throws IOException, InterruptedException {
		//test = report.createTest("Click on Add or Update button without adding date in InflammatoryTab");
	String InflammatoryDate = DpClinicalProfileValidation.getRow(81).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
			inflammotoryDateClick(InflammatoryDate);
				inflammotoryAntiCCPClick(AntiCCPValue);
				inflammotoryCRPClick(CRPValue);
				inflammotoryESRClick(ESRValue);
				inflammotoryRFClick(RFValue);
				inflammotoryNoteClick(NoteValue);
				inflammatoryAddClick();
				Thread.sleep(2000);
				inflammatoryErrMsg();
			}
		}
		//parent.appendChild(test);
	}
	
	public void inflammatoryWithValidData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Inflammatory Markers Tab [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabInflammatoryPermission.equalsIgnoreCase("Add")) {
			inflammotoryDateClick(DateValue);
				inflammotoryAntiCCPClick(AntiCCPValue);
				inflammotoryCRPClick(CRPValue);
				inflammotoryESRClick(ESRValue);
				inflammotoryRFClick(RFValue);
				inflammotoryNoteClick(NoteValue);
				inflammatoryAddClick();
				Thread.sleep(1000);
				successCaptureScreenshot();
			}
		}
		//parent.appendChild(test);
	}

	public void labTabLipidPanelClinicalWithoutData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Lipid Panel Tab(Without Data))");
		String LipidDateValue = DpClinicalProfileValidation.getRow(91).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLipidPermission.equalsIgnoreCase("Add")) {
				clinicalLipidTabClick();
				lipidDateClick(LipidDateValue);
				lipidAddClick();
				lipidErrMsg();
				lipidCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	
	public void lipidPanelAlphabets() throws InterruptedException {
		//test = report.createTest("Verify that all fields should not accept alphabets in LipidPanelTab");
		String LDLValue = DpClinicalProfileValidation.getRow(92).getCell(2).getStringCellValue();
		String HDLValue = DpClinicalProfileValidation.getRow(92).getCell(3).getStringCellValue();
		String TriglyceridesValue = DpClinicalProfileValidation.getRow(92).getCell(4).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLipidPermission.equalsIgnoreCase("Add")) {
				lipidDateClick(DateValue);
				try {
					lipidLDLClick(LDLValue);
					lipidHDLClick(HDLValue);
					lipidTriglyceridesClick(TriglyceridesValue);
				}catch (Exception e) {
					
				}
				lipidNoteClick(NoteValue);
			}
		}
		//parent.appendChild(test);
	}
	
	public void lipidPanelSpecialCharacters() throws InterruptedException {
	//	test = report.createTest("Verify that all fields should not accept special characters in LipidPanelTab");
		String LDLValue = DpClinicalProfileValidation.getRow(93).getCell(2).getStringCellValue();
		String HDLValue = DpClinicalProfileValidation.getRow(93).getCell(3).getStringCellValue();
		String TriglyceridesValue = DpClinicalProfileValidation.getRow(93).getCell(4).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLipidPermission.equalsIgnoreCase("Add")) {
				lipidDateClick(DateValue);
				try {
					lipidLDLClick(LDLValue);
					lipidHDLClick(HDLValue);
					lipidTriglyceridesClick(TriglyceridesValue);
				}catch (Exception e) {
					
				}
				lipidNoteClick(NoteValue);
			}
		}
		//parent.appendChild(test);
	}
	
	public void lipidPanelSpace() throws InterruptedException {
		//test = report.createTest("Verify that all fields should not accept space in LipidPanelTab");
		String LDLValue = DpClinicalProfileValidation.getRow(94).getCell(2).getStringCellValue();
		String HDLValue = DpClinicalProfileValidation.getRow(94).getCell(3).getStringCellValue();
		String TriglyceridesValue = DpClinicalProfileValidation.getRow(94).getCell(4).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLipidPermission.equalsIgnoreCase("Add")) {
				lipidDateClick(DateValue);
				try {
					lipidLDLClick(LDLValue);
					lipidHDLClick(HDLValue);
					lipidTriglyceridesClick(TriglyceridesValue);
				}catch (Exception e) {
					
				}
				lipidNoteClick(NoteValue);
			}
		}
		//parent.appendChild(test);
	}
	
	public void lipidPanelWithoutDate() throws InterruptedException, IOException {
		//test = report.createTest("Click on Add or Update button without adding date in LipidPanelTab");
	String LipidDateValue = DpClinicalProfileValidation.getRow(91).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLipidPermission.equalsIgnoreCase("Add")) {
				lipidDateClick(LipidDateValue);
				lipidLDLClick(LDLValue);
				lipidHDLClick(HDLValue);
				lipidTriglyceridesClick(TriglyceridesValue);
				lipidNoteClick(NoteValue);
				lipidAddClick();
				lipidErrMsg();
				//lipidCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void lipidPanelWithValidData() throws InterruptedException, IOException {
	//	test = report.createTest("Clinical Profile / LabTab(Lipid Panel Tab [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLipidPermission.equalsIgnoreCase("Add")) {
				Thread.sleep(2000);
				lipidDateClick(DateValue);
				lipidLDLClick(LDLValue);
				lipidHDLClick(HDLValue);
				lipidTriglyceridesClick(TriglyceridesValue);
				lipidNoteClick(NoteValue);
				lipidAddClick();
				Thread.sleep(1000);
				successCaptureScreenshot();
				//lipidCancelClick();
			}
		}
		//parent.appendChild(test);
	}

	public void labTabLiverTestClinicalWithoutData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Liver Function Test Tab(Without Data))");
		String LiverDateValue = DpClinicalProfileValidation.getRow(101).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				clinicalLiverTabClick();
				liverDateClick(LiverDateValue);
				liverAddClick();
				liverErrMsg();
				liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void liverTestNotAcceptAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept alphabets in LiverFunctionTestTab");
		String ALPValue = DpClinicalProfileValidation.getRow(102).getCell(2).getStringCellValue();
		String ALTValue = DpClinicalProfileValidation.getRow(102).getCell(3).getStringCellValue();
		String ASTValue = DpClinicalProfileValidation.getRow(102).getCell(4).getStringCellValue();
		String SerumAlbuminValue = DpClinicalProfileValidation.getRow(102).getCell(5).getStringCellValue();
		String TotalBilirubinValue = DpClinicalProfileValidation.getRow(102).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				liverDateClick(DateValue);
				try {
					liverALPClick(ALPValue);
					liverALTClick(ALTValue);
					liverASTClick(ASTValue);
					liverSerumAlbuminClick(SerumAlbuminValue);
					liverTotalBilirubinClick(TotalBilirubinValue);
				}catch (Exception e) {
					
				}
				liverNoteClick(NoteValue);
				liverAddClick();
				liverErrMsg();
				liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void liverTestNotAcceptSpecialCharacters() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that all fields should not accept special characters in LiverFunctionTestTab");
		String ALPValue = DpClinicalProfileValidation.getRow(103).getCell(2).getStringCellValue();
		String ALTValue = DpClinicalProfileValidation.getRow(103).getCell(3).getStringCellValue();
		String ASTValue = DpClinicalProfileValidation.getRow(103).getCell(4).getStringCellValue();
		String SerumAlbuminValue = DpClinicalProfileValidation.getRow(103).getCell(5).getStringCellValue();
		String TotalBilirubinValue = DpClinicalProfileValidation.getRow(103).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				liverDateClick(DateValue);
				try {
					liverALPClick(ALPValue);
					liverALTClick(ALTValue);
					liverASTClick(ASTValue);
					liverSerumAlbuminClick(SerumAlbuminValue);
					liverTotalBilirubinClick(TotalBilirubinValue);
				}catch (Exception e) {
					
				}
				liverNoteClick(NoteValue);
				liverAddClick();
				liverErrMsg();
				liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void liverTestNotAcceptSpace() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept space in LiverFunctionTestTab");
		String ALPValue = DpClinicalProfileValidation.getRow(104).getCell(2).getStringCellValue();
		String ALTValue = DpClinicalProfileValidation.getRow(104).getCell(3).getStringCellValue();
		String ASTValue = DpClinicalProfileValidation.getRow(104).getCell(4).getStringCellValue();
		String SerumAlbuminValue = DpClinicalProfileValidation.getRow(104).getCell(5).getStringCellValue();
		String TotalBilirubinValue = DpClinicalProfileValidation.getRow(104).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				liverDateClick(DateValue);
				try {
					liverALPClick(ALPValue);
					liverALTClick(ALTValue);
					liverASTClick(ASTValue);
					liverSerumAlbuminClick(SerumAlbuminValue);
					liverTotalBilirubinClick(TotalBilirubinValue);
				}catch (Exception e) {
					
				}
				liverNoteClick(NoteValue);
				liverAddClick();
				liverErrMsg();
				liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void liverTestNotAcceptOutOfRange() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that some fields should not accept out of range values in LiverFunctionTestTab");
		String SerumAlbuminValue = DpClinicalProfileValidation.getRow(105).getCell(5).getStringCellValue();
		String TotalBilirubinValue = DpClinicalProfileValidation.getRow(105).getCell(6).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				liverDateClick(DateValue);
				try {
					liverSerumAlbuminClick(SerumAlbuminValue);
					liverTotalBilirubinClick(TotalBilirubinValue);
				}catch (Exception e) {
					
				}
				liverNoteClick(NoteValue);
				liverAddClick();
				liverErrMsg();
				liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void liverTestWithoutDate() throws IOException, InterruptedException {
		//test = report.createTest("Click on Add or Update button without adding date in LiverFunctionTestTab");
		String LiverDateValue = DpClinicalProfileValidation.getRow(101).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				liverDateClick(LiverDateValue);
				liverALPClick(ALPValue);
				liverALTClick(ALTValue);
				liverASTClick(ASTValue);
				liverSerumAlbuminClick(SerumAlbuminValue);
				liverTotalBilirubinClick(TotalBilirubinValue);
				liverNoteClick(NoteValue);
				liverAddClick();
				liverErrMsg();
				//liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void liverTestWithValidData() throws IOException, InterruptedException {
	//	test = report.createTest("Clinical Profile / LabTab(Liver Function Test Tab [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabLiverTestPermission.equalsIgnoreCase("Add")) {
				liverDateClick(DateValue);
				liverALPClick(ALPValue);
				liverALTClick(ALTValue);
				liverASTClick(ASTValue);
				liverSerumAlbuminClick(SerumAlbuminValue);
				liverTotalBilirubinClick(TotalBilirubinValue);
				liverNoteClick(NoteValue);
				liverAddClick();
				successCaptureScreenshot();
				
				//liverCancelClick();
			}
		}
		//parent.appendChild(test);
	}

	public void labTabRenalTestClinicalWithoutData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Renal Function Test Tab(Without Data))");
		String RenalDateValue = DpClinicalProfileValidation.getRow(111).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				clickOnRightArrow();
				clinicalRenalTabClick();
				renalDateClick(RenalDateValue);
				renalAddClick();
				renalErrMsg();
				renalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	
	public void renalTestNotAcceptAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept alphabets in RenalFunctionTestTab");
		String CrClValue = DpClinicalProfileValidation.getRow(112).getCell(2).getStringCellValue();
		String SCrValue = DpClinicalProfileValidation.getRow(112).getCell(3).getStringCellValue();
		String BUNValue = DpClinicalProfileValidation.getRow(112).getCell(4).getStringCellValue();
		String BunRatioValue = DpClinicalProfileValidation.getRow(112).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				renalDateClick(DateValue);
				try {
					renalCrClClick(CrClValue);
					renalSCrClick(SCrValue);
					renalBunClick(BUNValue);
					renalBunRatioClick(BunRatioValue);
				}catch (Exception e) {
					
				}
				renalNoteClick(NoteValue);
				renalAddClick();
				renalErrMsg();
				renalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void renalTestNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept special characters in RenalFunctionTestTab");
		String CrClValue = DpClinicalProfileValidation.getRow(113).getCell(2).getStringCellValue();
		String SCrValue = DpClinicalProfileValidation.getRow(113).getCell(3).getStringCellValue();
		String BUNValue = DpClinicalProfileValidation.getRow(113).getCell(4).getStringCellValue();
		String BunRatioValue = DpClinicalProfileValidation.getRow(113).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				renalDateClick(DateValue);
				try {
					renalCrClClick(CrClValue);
					renalSCrClick(SCrValue);
					renalBunClick(BUNValue);
					renalBunRatioClick(BunRatioValue);
				}catch (Exception e) {
					
				}
				renalNoteClick(NoteValue);
				renalAddClick();
				renalErrMsg();
				renalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void renalTestNotAcceptSpace() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that all fields should not accept space in RenalFunctionTestTab");
		String CrClValue = DpClinicalProfileValidation.getRow(114).getCell(2).getStringCellValue();
		String SCrValue = DpClinicalProfileValidation.getRow(114).getCell(3).getStringCellValue();
		String BUNValue = DpClinicalProfileValidation.getRow(114).getCell(4).getStringCellValue();
		String BunRatioValue = DpClinicalProfileValidation.getRow(114).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				renalDateClick(DateValue);
				try {
					renalCrClClick(CrClValue);
					renalSCrClick(SCrValue);
					renalBunClick(BUNValue);
					renalBunRatioClick(BunRatioValue);
				}catch (Exception e) {
					
				}
				renalNoteClick(NoteValue);
				renalAddClick();
				renalErrMsg();
				renalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void renalTestNotAcceptOutOfRange() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all fields should not accept out of range values in RenalFunctionTestTab");
		String SCrValue = DpClinicalProfileValidation.getRow(115).getCell(3).getStringCellValue();
		String BunRatioValue = DpClinicalProfileValidation.getRow(115).getCell(5).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				renalDateClick(DateValue);
				try {
					renalSCrClick(SCrValue);
					renalBunRatioClick(BunRatioValue);
				}catch (Exception e) {
					
				}
				renalNoteClick(NoteValue);
				renalAddClick();
				renalErrMsg();
				renalCancelClick();
			}
		}
		//parent.appendChild(test);
		
	}
	
	public void renalTestWithoutDate() throws IOException, InterruptedException {
	//test = report.createTest("Click on Add or Update button without adding date in RenalFunctionTestTab");
		String RenalDateValue = DpClinicalProfileValidation.getRow(111).getCell(1).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				renalDateClick(RenalDateValue);
				renalCrClClick(CrClValue);
				renalSCrClick(SCrValue);
				renalBunClick(BUNValue);
				renalBunRatioClick(BunRatioValue);
				renalNoteClick(NoteValue);
				renalAddClick();
				Thread.sleep(1000);
				renalErrMsg();
				//renalCancelClick();
			}
		}
		//parent.appendChild(test);
	}
	
	
	public void renalTestWithValidData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / LabTab(Renal Function Test Tab [Valid Data]");
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabRenalTestPermission.equalsIgnoreCase("Add")) {
				renalDateClick(DateValue);
				renalCrClClick(CrClValue);
				renalSCrClick(SCrValue);
				renalBunClick(BUNValue);
				renalBunRatioClick(BunRatioValue);
				renalNoteClick(NoteValue);
				renalAddClick();
				successCaptureScreenshot();
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}
	
	
}