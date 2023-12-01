package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import methodPackage.LabsMethods;

public class LabsFunctionality extends VitalsFunctionality{

	@Test(priority = 8)
	public void labsClinicalModule() throws InterruptedException, IOException {
		System.out.println("In labsClinicalModule");
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
	   l1.labTabBloodGlucoseClinicalWithoutData();	
		l1.labTabBloodGlucoseWithInvalidAlphabetsData();
		l1.labTabBloodGlucoseWithSpecialCharData();
		l1.labTabBloodGlucoseWithBlankSpaceData();
		l1.labTabBloodGlucoseDropdownOthertype();
		l1.labTabBloodGlucoseWithoutDate();
	   l1.labTabBloodGlucoseClinicalWithValidData();
	   
		l1.labTabChemistriesClinicalWithoutData();
		l1.chemistriesAllFieldAlphabets();
		l1.chemistriesAllFieldsSpecialCharacter();
		l1.chemistriesAllFieldsSpace();
		l1.chemistriesSomeFieldsOutOfRange();
		l1.labTabChemistriesWithoutDate();
	   l1.labTabChemistriesWithValidData();
	   
		l1.labTabCompleteBloodCountClinicalWithoutData();
		l1.CBCDataOutOfRange();
		l1.CBCNotAcceptAlphabets();
		l1.CBCNotAcceptSpecialCharacters();
		l1.CBCNotAcceptSpace();
	    l1.labTabCBCWithoutDate();
		l1.labTabCBCWithValidData();
		
		l1.labTabInflammatoryMarkersClinicalWithoutData();
		l1.inflammatoryWithAlphabets();
		l1.inflammatoryWithSpecialCharacters();
		l1.inflammatoryWithSpace();
		l1.CRPWithOutOfRange();
		l1.inflammatoryWithoutDate();
		l1.inflammatoryWithValidData();
		
		l1.labTabLipidPanelClinicalWithoutData();	
		l1.lipidPanelAlphabets();
		l1.lipidPanelSpecialCharacters();
		l1.lipidPanelSpace();
		l1.lipidPanelWithoutDate();
		l1.lipidPanelWithValidData();
		
		l1.labTabLiverTestClinicalWithoutData();
		l1.liverTestNotAcceptAlphabets();
		l1.liverTestNotAcceptSpecialCharacters();
		l1.liverTestNotAcceptSpace();
		l1.liverTestNotAcceptOutOfRange();
		l1.liverTestWithoutDate();
		l1.liverTestWithValidData();
		
		l1.labTabRenalTestClinicalWithoutData();
		l1.renalTestNotAcceptAlphabets();
		l1.renalTestNotAcceptSpecialCharacters();
		l1.renalTestNotAcceptSpace();
		l1.renalTestNotAcceptOutOfRange();
		l1.renalTestWithoutDate();
		l1.renalTestWithValidData();
	}
}
