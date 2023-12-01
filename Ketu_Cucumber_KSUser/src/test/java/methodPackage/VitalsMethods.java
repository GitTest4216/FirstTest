package methodPackage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import dataPackage.AllergyClinicalData;
import dataPackage.PayorData;
import dataPackage.VitalClinicalData;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class VitalsMethods extends VitalClinicalData {

	String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
	String ClinicalVitalPermission = DpClinicalProfile.getRow(8).getCell(0).getStringCellValue();
	String vitalsDateValue = DpClinicalProfile.getRow(8).getCell(1).getStringCellValue();
	String HeightInFeetValue = DpClinicalProfile.getRow(8).getCell(2).getStringCellValue();
	String HeightInInchesValue = DpClinicalProfile.getRow(8).getCell(3).getStringCellValue();
	String WeightValue = DpClinicalProfile.getRow(8).getCell(4).getStringCellValue();
	String TemperatureValue = DpClinicalProfile.getRow(8).getCell(5).getStringCellValue();
	String TemperatureMethod = DpClinicalProfile.getRow(8).getCell(6).getStringCellValue();
	String PulseValue = DpClinicalProfile.getRow(8).getCell(7).getStringCellValue();
	String PulseLocation = DpClinicalProfile.getRow(8).getCell(8).getStringCellValue();
	String BpValue = DpClinicalProfile.getRow(8).getCell(9).getStringCellValue();
	String PatientPosition = DpClinicalProfile.getRow(8).getCell(10).getStringCellValue();
	String BpLocation = DpClinicalProfile.getRow(8).getCell(11).getStringCellValue();
	String VitalNoteValue = DpClinicalProfile.getRow(8).getCell(12).getStringCellValue();

	public void vitalTabClinicalWithoutData() throws InterruptedException, IOException {
		PayorData p1 = PageFactory.initElements(driver, PayorData.class);
		AllergyClinicalData a1 = PageFactory.initElements(driver, AllergyClinicalData.class);
//		parent = report.createTest("Clinical Profile " + "<b>" + "(Vitals)" + "</b>");
//		test = report.createTest("Clinical Profile / VitalsTab (Without Data)");
		String HomePageTitle = driver.getTitle();
		if (!(HomePageTitle.equalsIgnoreCase("Login"))) {
			int ii = 0;
			while (ii < 1) {
				if (notificationDialogCloseBtn.isDisplayed()) {
					notificationDialogCloseBtn.click();
				} else {
					ii = 1;
				}
			} 

			if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
//				p1.patientSearchMethod();
				a1.clinicalProfileTabClick();
				ClinicalProfileVitalSignsTabClick();
				if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				}
			}
			//parent.appendChild(test);
		}
	}

	public void vitalDateNotSelected() throws IOException, InterruptedException {
	//	test = report.createTest("Click on add button without selecting date");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					vitalsTabDateClear();
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalHeightNotSelected() throws IOException, InterruptedException {
	//test = report.createTest("Click on add button without enter height");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				vitalsTabDateClick(vitalsDateValue);
				vitalsTabHeightInInchesClick(HeightInInchesValue);
				vitalsTabWeightClick(WeightValue);
				vitalsTabTemperatureClick(TemperatureValue);
				vitalsTabTemperatureMethodClick(TemperatureMethod);
				vitalsTabPulseClick(PulseValue);
				vitalsTabPulseLocationClick(PulseLocation);
				vitalsTabBpClick(BpValue);
				vitalsTabPatientPositionClick(PatientPosition);
				vitalsTabBpLocationClick(BpLocation);
				vitalsTabNoteClick(VitalNoteValue);
				vitalsTabAddClick();
				errMsg();
				Thread.sleep(2000);
				vitalsTabCancelClick();
			}
		}

		//parent.appendChild(test);
	}

	public void vitalWeightNotSelected() throws IOException, InterruptedException {
	//	test = report.createTest("Click on add button without enter weight");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalTemperatureNotSelected() throws IOException, InterruptedException {
	//	test = report.createTest("Click on add button without enter temperature");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalBpNotSelected() throws IOException, InterruptedException {
		//test = report.createTest("Click on add button without enter BP(mmHg)");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {

				try {
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

		//parent.appendChild(test);
	}

	public void vitalHeightValueInvalid() throws IOException, InterruptedException {
		//test = report.createTest("Click on Add or Update button with invalid numeric values in both height");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String HeightInFeetValue = DpClinicalProfileValidation.getRow(26).getCell(2).getStringCellValue();
					String HeightInInchesValue = DpClinicalProfileValidation.getRow(26).getCell(3).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalTemperatureValueInvalid() throws IOException, InterruptedException {
	//	test = report.createTest("Click on Add or Update button with invalid floating point values in temperature");

		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				String TemperatureValue = DpClinicalProfileValidation.getRow(27).getCell(5).getStringCellValue();
				try {
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalBpValueInvalid() throws IOException, InterruptedException {
		//test = report.createTest("Click on Add or Update button with invalid numeric values in BP");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String BpValue = DpClinicalProfileValidation.getRow(28).getCell(9).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalHeightFloatValueInvalid() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that both the heights should not allow floating point values");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {

				try {
					String HeightInFeetValue = DpClinicalProfileValidation.getRow(29).getCell(2).getStringCellValue();
					String HeightInInchesValue = DpClinicalProfileValidation.getRow(29).getCell(3).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					try {
						vitalsTabHeightInFeetClick(HeightInFeetValue);
						vitalsTabHeightInInchesClick(HeightInInchesValue);
					} catch (Exception e) {

					}
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalHeightBlankSpaceNotAllow() throws IOException, InterruptedException {
		//test = report.createTest("Verify that both the heights should not allow blank space");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String HeightInFeetValue = DpClinicalProfileValidation.getRow(30).getCell(2).getStringCellValue();
					String HeightInInchesValue = DpClinicalProfileValidation.getRow(30).getCell(3).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					try {
						vitalsTabHeightInFeetClick(HeightInFeetValue);
						vitalsTabHeightInInchesClick(HeightInInchesValue);
					} catch (Exception e) {

					}
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalWeightSpecialCharacterNotAllow() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that weight should not allow special character");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String WeightValue = DpClinicalProfileValidation.getRow(33).getCell(4).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalWeightBlankSpaceNotAllow() throws IOException, InterruptedException {
		//test = report.createTest("Verify that weight should not allow blank space");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String WeightValue = DpClinicalProfileValidation.getRow(34).getCell(4).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalTemperatureSpecialCharacterNotAllow() throws IOException, InterruptedException {
		//test = report.createTest("Verify that temperature should not allow special character");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String TemperatureValue = DpClinicalProfileValidation.getRow(35).getCell(5).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalTemperatureNotAllowBlankSpace() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that temperature should not allow blank space");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String TemperatureValue = DpClinicalProfileValidation.getRow(36).getCell(5).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalBpFloatingValueInvalid() throws IOException, InterruptedException {
		//test = report.createTest("Verify that BP should not allow invalid floating point values");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String BpValue = DpClinicalProfileValidation.getRow(37).getCell(9).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalBpSpecialCharNotAllow() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that BP should not allow special characters");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String BpValue = DpClinicalProfileValidation.getRow(38).getCell(9).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					errMsg();
					Thread.sleep(2000);
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
	}

	public void vitalBpBlankSpaceNotAllow() throws IOException, InterruptedException {
	//	test = report.createTest("Verify that BP should not allow only space");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					String BpValue = DpClinicalProfileValidation.getRow(39).getCell(9).getStringCellValue();
					vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					Thread.sleep(2000);
					errMsg();
					vitalsTabCancelClick();
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
	}
	
	public void vitalTabClinicalWithValidData() throws IOException, InterruptedException {
		String ClinicalProfileTabPermission = DpModulePermission.getRow(17).getCell(1).getStringCellValue();
		String ClinicalVitalPermission = DpClinicalProfile.getRow(10).getCell(0).getStringCellValue();
		String vitalsDateValue = DpClinicalProfile.getRow(10).getCell(1).getStringCellValue();
		String HeightInFeetValue = DpClinicalProfile.getRow(10).getCell(2).getStringCellValue();
		String HeightInInchesValue = DpClinicalProfile.getRow(10).getCell(3).getStringCellValue();
		String WeightValue = DpClinicalProfile.getRow(10).getCell(4).getStringCellValue();
		String TemperatureValue = DpClinicalProfile.getRow(10).getCell(5).getStringCellValue();
		String TemperatureMethod = DpClinicalProfile.getRow(10).getCell(6).getStringCellValue();
		String PulseValue = DpClinicalProfile.getRow(10).getCell(7).getStringCellValue();
		String PulseLocation = DpClinicalProfile.getRow(10).getCell(8).getStringCellValue();
		String BpValue = DpClinicalProfile.getRow(10).getCell(9).getStringCellValue();
		String PatientPosition = DpClinicalProfile.getRow(10).getCell(10).getStringCellValue();
		String BpLocation = DpClinicalProfile.getRow(10).getCell(11).getStringCellValue();
		String VitalNoteValue = DpClinicalProfile.getRow(10).getCell(12).getStringCellValue();
		test = report.createTest("Add Vital Tab with Valid Data");
		if (ClinicalProfileTabPermission.equalsIgnoreCase("YES")) {
			if (ClinicalVitalPermission.equalsIgnoreCase("Add")) {
				try {
					//vitalsTabDateClick(vitalsDateValue);
					vitalsTabHeightInFeetClick(HeightInFeetValue);
					vitalsTabHeightInInchesClick(HeightInInchesValue);
					vitalsTabWeightClick(WeightValue);
					vitalsTabTemperatureClick(TemperatureValue);
					vitalsTabTemperatureMethodClick(TemperatureMethod);
					vitalsTabPulseClick(PulseValue);
					vitalsTabPulseLocationClick(PulseLocation);
					vitalsTabBpClick(BpValue);
					vitalsTabPatientPositionClick(PatientPosition);
					vitalsTabBpLocationClick(BpLocation);
					vitalsTabNoteClick(VitalNoteValue);
					vitalsTabAddClick();
					Thread.sleep(1000);
					successMsg();
					vitalsTabCancelClick();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		//parent.appendChild(test);
		//report.endTest(parent);
}
}