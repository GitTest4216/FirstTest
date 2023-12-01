package testPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import methodPackage.VitalsMethods;

public class VitalsFunctionality extends AllergyFunctionality{

	@Test(priority = 7)
	public void vitalsClinicalModule() throws InterruptedException, IOException {
		System.out.println("In vitalsClinicalModule");
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
       v1.vitalTabClinicalWithoutData();
		v1.vitalDateNotSelected();
		v1.vitalHeightNotSelected();
		v1.vitalWeightNotSelected();
		v1.vitalTemperatureNotSelected();
		v1.vitalBpNotSelected();
		v1.vitalHeightValueInvalid();
		v1.vitalTemperatureValueInvalid();
		v1.vitalBpValueInvalid();
		v1.vitalHeightFloatValueInvalid();
		v1.vitalHeightBlankSpaceNotAllow();
		v1.vitalWeightSpecialCharacterNotAllow();
		v1.vitalWeightBlankSpaceNotAllow();
		v1.vitalTemperatureSpecialCharacterNotAllow();
		v1.vitalTemperatureNotAllowBlankSpace();
		v1.vitalBpFloatingValueInvalid();
		v1.vitalBpSpecialCharNotAllow();
		v1.vitalBpBlankSpaceNotAllow();
        v1.vitalTabClinicalWithValidData();
	}
}