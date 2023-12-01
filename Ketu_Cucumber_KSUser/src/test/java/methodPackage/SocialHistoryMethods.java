package methodPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import dataPackage.AllergyClinicalData;
import dataPackage.PayorData;
import dataPackage.SocialHistoryData;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class SocialHistoryMethods extends SocialHistoryData{

	String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
	String ClinicalLabSocialHistoryPermission = DpClinicalProfile.getRow(42).getCell(0).getStringCellValue();
	String PrimaryLanguage = DpClinicalProfile.getRow(42).getCell(1).getStringCellValue();
	String SecondaryLanguage = DpClinicalProfile.getRow(42).getCell(2).getStringCellValue();
	String otherPrimaryLanguage = DpClinicalProfile.getRow(42).getCell(3).getStringCellValue();
	String otherSecondaryLanguage = DpClinicalProfile.getRow(42).getCell(4).getStringCellValue();
	String TranslationStatus = DpClinicalProfile.getRow(42).getCell(5).getStringCellValue();
	String currentlyWorkingStatus = DpClinicalProfile.getRow(42).getCell(6).getStringCellValue();
	String OccupationValue = DpClinicalProfile.getRow(42).getCell(7).getStringCellValue();
	String SmokingStatus = DpClinicalProfile.getRow(42).getCell(8).getStringCellValue();
	String TimeSinceLastSmokeValue = DpClinicalProfile.getRow(42).getCell(9).getStringCellValue();
	String Unit = DpClinicalProfile.getRow(42).getCell(10).getStringCellValue();
	String SmokingDurationValue = DpClinicalProfile.getRow(42).getCell(9).getStringCellValue();
	String searchTypeValue = DpClinicalProfile.getRow(42).getCell(12).getStringCellValue();		
	String PacksPerDayValue = DpClinicalProfile.getRow(42).getCell(13).getStringCellValue();
	String AlcoholUseStatus = DpClinicalProfile.getRow(42).getCell(14).getStringCellValue();
	String DrinksValue = DpClinicalProfile.getRow(42).getCell(15).getStringCellValue();
	String DrugUseStatus = DpClinicalProfile.getRow(42).getCell(16).getStringCellValue();
	String Type = DpClinicalProfile.getRow(42).getCell(17).getStringCellValue();
	String searchFormValue = DpClinicalProfile.getRow(42).getCell(18).getStringCellValue();
	String DrugNameValue = DpClinicalProfile.getRow(42).getCell(19).getStringCellValue();
	String ExerciseStatusData = DpClinicalProfile.getRow(42).getCell(20).getStringCellValue();
	String ExerciseType = DpClinicalProfile.getRow(42).getCell(21).getStringCellValue();
	String MinutesActiveValue = DpClinicalProfile.getRow(42).getCell(22).getStringCellValue();
	String perUnit = DpClinicalProfile.getRow(42).getCell(23).getStringCellValue();
	String NotesValue = DpClinicalProfile.getRow(42).getCell(24).getStringCellValue();
	String CardioExerciseType = DpClinicalProfile.getRow(42).getCell(25).getStringCellValue();
	String cardioMinutesActiveValue = DpClinicalProfile.getRow(42).getCell(26).getStringCellValue();
	String cardioPerUnit = DpClinicalProfile.getRow(42).getCell(27).getStringCellValue();
	String cardioNotesValue = DpClinicalProfile.getRow(42).getCell(28).getStringCellValue();
	String CulturalStatus = DpClinicalProfile.getRow(42).getCell(29).getStringCellValue();
	String CulturalTextValue = DpClinicalProfile.getRow(42).getCell(30).getStringCellValue();
	String SocioeconomicStatus = DpClinicalProfile.getRow(42).getCell(31).getStringCellValue();
	String SocioeconomicTextValue = DpClinicalProfile.getRow(42).getCell(32).getStringCellValue();
	String healthLiteracyStatus = DpClinicalProfile.getRow(42).getCell(33).getStringCellValue();
	String HealthLiteracyTextValue = DpClinicalProfile.getRow(42).getCell(34).getStringCellValue();
	 
	public void socialHistoryClinicalWithoutData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
		AllergyClinicalData a1 = PageFactory.initElements(driver, AllergyClinicalData.class);
//		parent = report.createTest("Clinical Profile " + "<b>" + "(Social History)" + "</b>");
//		test = report.createTest("Clinical Profile / Social History Tab(Without Data))");
		
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
				ClinicalProfileSocialHistoryTabClick();
				if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
					addSocialHistoryClick();
					errMsg();
					cancelSocialHistoryClick();
				}
			}
			//parent.appendChild(test);
		}
	}
	
	public void socialHistoryDropdownNotAcceptAlphabets() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all dropdowns should not accept any other alphabetic values except dropdown values in socialHistoryTab");
		String PrimaryLanguage = DpClinicalProfileValidation.getRow(121).getCell(1).getStringCellValue();
		String SecondaryLanguage =DpClinicalProfileValidation.getRow(121).getCell(2).getStringCellValue();
		String SmokingStatus = DpClinicalProfileValidation.getRow(121).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				try {
					socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
					socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				} catch (Exception e) {
					
				}
				socialHistoryTranslationServiceClick(TranslationStatus);
				socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				try {
					socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				} catch (Exception e) {
					
				}
				socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
						cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
				socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
				socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				addSocialHistoryClick();
				errMsg();
				cancelSocialHistoryClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void socialHistoryDropdownNotAcceptNumeric() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all dropdowns should not accept numeric values for dropdown values in socialHistoryTab");
		String PrimaryLanguage = DpClinicalProfileValidation.getRow(122).getCell(1).getStringCellValue();
		String SecondaryLanguage =DpClinicalProfileValidation.getRow(122).getCell(2).getStringCellValue();
		String SmokingStatus = DpClinicalProfileValidation.getRow(122).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				try {
					socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
					socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				} catch (Exception e) {
					
				}
				socialHistoryTranslationServiceClick(TranslationStatus);
				socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				try {
					socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				} catch (Exception e) {
					
				}
				socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
						cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
				socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
				socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				addSocialHistoryClick();
				errMsg();
				cancelSocialHistoryClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void socialHistoryDropdownNotAcceptSpecialCharacters() throws IOException, InterruptedException {
		//test = report.createTest("Verify that all dropdowns should not accept special characters for dropdown values in socialHistoryTab");
		String PrimaryLanguage = DpClinicalProfileValidation.getRow(123).getCell(1).getStringCellValue();
		String SecondaryLanguage =DpClinicalProfileValidation.getRow(123).getCell(2).getStringCellValue();
		String SmokingStatus = DpClinicalProfileValidation.getRow(123).getCell(8).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				try {
					socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
					socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				} catch (Exception e) {
					
				}
				socialHistoryTranslationServiceClick(TranslationStatus);
				socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				try {
					socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				} catch (Exception e) {
					
				}
				socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
						cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
				socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
				socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				addSocialHistoryClick();
				errMsg();
				cancelSocialHistoryClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void socialHistoryAllFieldsNotAcceptSpace() throws IOException {
		//test = report.createTest("Verify that all fields should not accept space in socialHistoryTab");
		String PrimaryLanguage = DpClinicalProfileValidation.getRow(124).getCell(1).getStringCellValue();
		String SecondaryLanguage =DpClinicalProfileValidation.getRow(124).getCell(2).getStringCellValue();
		String otherPrimaryLanguage = DpClinicalProfileValidation.getRow(124).getCell(1).getStringCellValue();
		String otherSecondaryLanguage = DpClinicalProfileValidation.getRow(124).getCell(2).getStringCellValue();
		String TranslationStatus = DpClinicalProfileValidation.getRow(124).getCell(5).getStringCellValue();
		String currentlyWorkingStatus = DpClinicalProfileValidation.getRow(124).getCell(6).getStringCellValue();
		String OccupationValue = DpClinicalProfileValidation.getRow(124).getCell(7).getStringCellValue();
		String SmokingStatus = DpClinicalProfileValidation.getRow(124).getCell(8).getStringCellValue();
		String TimeSinceLastSmokeValue = DpClinicalProfileValidation.getRow(124).getCell(9).getStringCellValue();
		String Unit = DpClinicalProfileValidation.getRow(124).getCell(10).getStringCellValue();
		String SmokingDurationValue = DpClinicalProfileValidation.getRow(124).getCell(9).getStringCellValue();
		String searchTypeValue = DpClinicalProfileValidation.getRow(124).getCell(12).getStringCellValue();		
		String PacksPerDayValue = DpClinicalProfileValidation.getRow(124).getCell(13).getStringCellValue();
		String AlcoholUseStatus = DpClinicalProfileValidation.getRow(124).getCell(14).getStringCellValue();
		String DrinksValue = DpClinicalProfileValidation.getRow(124).getCell(15).getStringCellValue();
		String DrugUseStatus = DpClinicalProfileValidation.getRow(124).getCell(16).getStringCellValue();
		String Type = DpClinicalProfileValidation.getRow(124).getCell(17).getStringCellValue();
		String searchFormValue = DpClinicalProfileValidation.getRow(124).getCell(18).getStringCellValue();
		String DrugNameValue = DpClinicalProfileValidation.getRow(124).getCell(19).getStringCellValue();
		String ExerciseStatusData = DpClinicalProfileValidation.getRow(124).getCell(20).getStringCellValue();
		String ExerciseType = DpClinicalProfileValidation.getRow(124).getCell(21).getStringCellValue();
		String MinutesActiveValue = DpClinicalProfileValidation.getRow(124).getCell(22).getStringCellValue();
		String perUnit = DpClinicalProfileValidation.getRow(124).getCell(23).getStringCellValue();
		String NotesValue = DpClinicalProfileValidation.getRow(124).getCell(24).getStringCellValue();
		String CardioExerciseType = DpClinicalProfileValidation.getRow(124).getCell(25).getStringCellValue();
		String cardioMinutesActiveValue = DpClinicalProfileValidation.getRow(124).getCell(26).getStringCellValue();
		String cardioPerUnit = DpClinicalProfileValidation.getRow(124).getCell(27).getStringCellValue();
		String cardioNotesValue = DpClinicalProfileValidation.getRow(124).getCell(28).getStringCellValue();
		String CulturalStatus = DpClinicalProfileValidation.getRow(124).getCell(29).getStringCellValue();
		String CulturalTextValue = DpClinicalProfileValidation.getRow(124).getCell(30).getStringCellValue();
		String SocioeconomicStatus = DpClinicalProfileValidation.getRow(124).getCell(31).getStringCellValue();
		String SocioeconomicTextValue = DpClinicalProfileValidation.getRow(124).getCell(32).getStringCellValue();
		String healthLiteracyStatus = DpClinicalProfileValidation.getRow(124).getCell(33).getStringCellValue();
		String HealthLiteracyTextValue = DpClinicalProfileValidation.getRow(124).getCell(34).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				try {
					socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
					socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				} catch (Exception e) {	
				}
				try {
					socialHistoryTranslationServiceClick(TranslationStatus);
				}catch (Exception e) {					
				}
				try {
					socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				} catch (Exception e) {				
				}
				try {
					socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				} catch (Exception e) {			
				}
				try {
					socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				} catch (Exception e) {				
				}
				try {
					socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				} catch (Exception e) {				
				}
				try {
					socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
							cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				} catch (Exception e) {		
				}
				try {
					socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
					socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
					socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				} catch (Exception e) {					
				}
				addSocialHistoryClick();
				errMsg();
				cancelSocialHistoryClick();
			}
		}
		//parent.appendChild(test);
	}
	
	public void socialHistoryOtherPrimarySecondaryNotAcceptSpace() throws IOException, InterruptedException {
		//test = report.createTest("Verify that other primary and other secondary should not acccept space");
		String PrimaryLanguage = DpClinicalProfileValidation.getRow(125).getCell(1).getStringCellValue();
		String SecondaryLanguage =DpClinicalProfileValidation.getRow(125).getCell(2).getStringCellValue();
		String otherPrimaryLanguage = DpClinicalProfileValidation.getRow(125).getCell(3).getStringCellValue();
		String otherSecondaryLanguage = DpClinicalProfileValidation.getRow(125).getCell(4).getStringCellValue();
	
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
				socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				socialHistoryTranslationServiceClick(TranslationStatus);
				socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
						cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
				socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
				socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				addSocialHistoryClick();
				errMsg();
				cancelSocialHistoryClick();
			}
		}
		//parent.appendChild(test);
	}
	
	
	public void socialHistoryRadioButtonsNotAcceptAnyOtherValues() throws IOException, InterruptedException {
		//test = report.createTest("Verify that radio buttons should not accept any other values in socialHistoryTab");
		String TranslationStatus = DpClinicalProfileValidation.getRow(125).getCell(5).getStringCellValue();
		String currentlyWorkingStatus = DpClinicalProfileValidation.getRow(125).getCell(6).getStringCellValue();
		String AlcoholUseStatus = DpClinicalProfileValidation.getRow(125).getCell(14).getStringCellValue();
		String DrugUseStatus = DpClinicalProfileValidation.getRow(125).getCell(16).getStringCellValue();
		String ExerciseStatusData = DpClinicalProfileValidation.getRow(125).getCell(20).getStringCellValue();
		String CulturalStatus = DpClinicalProfileValidation.getRow(125).getCell(29).getStringCellValue();
		String SocioeconomicStatus = DpClinicalProfileValidation.getRow(125).getCell(31).getStringCellValue();
		String healthLiteracyStatus = DpClinicalProfileValidation.getRow(125).getCell(33).getStringCellValue();
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
				socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				try {
					socialHistoryTranslationServiceClick(TranslationStatus);
				}catch (Exception e) {					
				}
				try {
					socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				} catch (Exception e) {				
				}
				
					socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				try {
					socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				} catch (Exception e) {				
				}
				try {
					socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				} catch (Exception e) {				
				}
				try {
					socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
							cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				} catch (Exception e) {		
				}
				try {
					socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
					socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
					socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				} catch (Exception e) {					
				}
				addSocialHistoryClick();
				Thread.sleep(2000);
				errMsg();
				cancelSocialHistoryClick();
			}
		}
		//parent.appendChild(test);
		
	}
	
	public void socialHistoryAllFieldsWithValidData() throws IOException, InterruptedException {
		//test = report.createTest("Clinical Profile / Social History Tab [Valid Data]");
		String PrimaryLanguage = DpClinicalProfileValidation.getRow(126).getCell(1).getStringCellValue();
		String SecondaryLanguage =DpClinicalProfileValidation.getRow(126).getCell(2).getStringCellValue();
		String otherPrimaryLanguage = DpClinicalProfileValidation.getRow(126).getCell(3).getStringCellValue();
		String otherSecondaryLanguage = DpClinicalProfileValidation.getRow(126).getCell(4).getStringCellValue();
		String TranslationStatus = DpClinicalProfileValidation.getRow(126).getCell(5).getStringCellValue();
		String currentlyWorkingStatus = DpClinicalProfileValidation.getRow(126).getCell(6).getStringCellValue();
		String OccupationValue = DpClinicalProfileValidation.getRow(126).getCell(7).getStringCellValue();
		String SmokingStatus = DpClinicalProfileValidation.getRow(126).getCell(8).getStringCellValue();
		String TimeSinceLastSmokeValue = DpClinicalProfileValidation.getRow(126).getCell(9).getStringCellValue();
		String Unit = DpClinicalProfileValidation.getRow(126).getCell(10).getStringCellValue();
		String SmokingDurationValue = DpClinicalProfileValidation.getRow(126).getCell(9).getStringCellValue();
		String searchTypeValue = DpClinicalProfileValidation.getRow(126).getCell(12).getStringCellValue();		
		String PacksPerDayValue = DpClinicalProfileValidation.getRow(126).getCell(13).getStringCellValue();
		String AlcoholUseStatus = DpClinicalProfileValidation.getRow(126).getCell(14).getStringCellValue();
		String DrinksValue = DpClinicalProfileValidation.getRow(126).getCell(15).getStringCellValue();
		String DrinksUnits = DpClinicalProfileValidation.getRow(126).getCell(10).getStringCellValue();
		String DrugUseStatus = DpClinicalProfileValidation.getRow(126).getCell(16).getStringCellValue();
		String Type = DpClinicalProfileValidation.getRow(126).getCell(17).getStringCellValue();
		String searchFormValue = DpClinicalProfileValidation.getRow(126).getCell(18).getStringCellValue();
		String DrugNameValue = DpClinicalProfileValidation.getRow(126).getCell(19).getStringCellValue();
		String ExerciseStatusData = DpClinicalProfileValidation.getRow(126).getCell(20).getStringCellValue();
		String ExerciseType = DpClinicalProfileValidation.getRow(126).getCell(21).getStringCellValue();
		String MinutesActiveValue = DpClinicalProfileValidation.getRow(126).getCell(22).getStringCellValue();
		String perUnit = DpClinicalProfileValidation.getRow(126).getCell(23).getStringCellValue();
		String NotesValue = DpClinicalProfileValidation.getRow(126).getCell(24).getStringCellValue();
		String CardioExerciseType = DpClinicalProfileValidation.getRow(126).getCell(25).getStringCellValue();
		String cardioMinutesActiveValue = DpClinicalProfileValidation.getRow(126).getCell(26).getStringCellValue();
		String cardioPerUnit = DpClinicalProfileValidation.getRow(126).getCell(27).getStringCellValue();
		String cardioNotesValue = DpClinicalProfileValidation.getRow(126).getCell(28).getStringCellValue();
		String CulturalStatus = DpClinicalProfileValidation.getRow(126).getCell(29).getStringCellValue();
		String CulturalTextValue = DpClinicalProfileValidation.getRow(126).getCell(30).getStringCellValue();
		String SocioeconomicStatus = DpClinicalProfileValidation.getRow(126).getCell(31).getStringCellValue();
		String SocioeconomicTextValue = DpClinicalProfileValidation.getRow(126).getCell(32).getStringCellValue();
		String healthLiteracyStatus = DpClinicalProfileValidation.getRow(126).getCell(33).getStringCellValue();
		String HealthLiteracyTextValue = DpClinicalProfileValidation.getRow(126).getCell(34).getStringCellValue();
		
		if(ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalLabSocialHistoryPermission.equalsIgnoreCase("Add")) {
				try {
					socialHistoryPrimaryLanguageSelect(PrimaryLanguage, otherPrimaryLanguage);
					socialHistorySecondaryLanguageSelect(SecondaryLanguage, otherSecondaryLanguage);
				} catch (Exception e) {	
				}
				try {
					socialHistoryTranslationServiceClick(TranslationStatus);
				}catch (Exception e) {					
				}
				try {
					socialHistoryCurrentlyWorkingClick(currentlyWorkingStatus, OccupationValue);
				} catch (Exception e) {				
				}
				try {
					socialHistorySmokingStatusClick(SmokingStatus, TimeSinceLastSmokeValue, Unit, SmokingDurationValue, 
							searchTypeValue, PacksPerDayValue);
				} catch (Exception e) {			
				}
				try {
					socialHistoryAlcoholUseClick(AlcoholUseStatus, DrinksValue, Unit);
				} catch (Exception e) {				
				}
				try {
					socialHistoryDrugUseStatusClick(DrugUseStatus, Type, searchFormValue, DrugNameValue);
				} catch (Exception e) {				
				}
				try {
					socialHistoryExerciseStatusClick(ExerciseStatusData, ExerciseType, MinutesActiveValue, perUnit, NotesValue, CardioExerciseType, 
							cardioMinutesActiveValue, cardioPerUnit, cardioNotesValue);
				} catch (Exception e) {		
				}
				try {
					socialHistoryCulturalClick(CulturalStatus, CulturalTextValue);
					socialHistorySocioEconomicClick(SocioeconomicStatus, SocioeconomicTextValue);
					socialHistoryHealthLiteracyClick(healthLiteracyStatus, HealthLiteracyTextValue);
				} catch (Exception e) {					
				}
				addSocialHistoryClick();
				Thread.sleep(2000);
				successMsg();
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	
		
	}
}
