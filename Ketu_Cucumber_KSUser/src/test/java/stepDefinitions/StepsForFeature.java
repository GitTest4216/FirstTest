package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import dataPackage.PayorData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methodPackage.AddAppealMethods;
import methodPackage.AddCaseMethods;
import methodPackage.AddConsentMethods;
import methodPackage.AddFoundationMethods;
import methodPackage.AddPrescriptionMethod;
import methodPackage.AllergyMethods;
import methodPackage.CaseBannerMethods;
import methodPackage.CommunicationMethods;
import methodPackage.CopayMethods;
import methodPackage.FaxSendMethods;
import methodPackage.HealthHistoryMethods;
import methodPackage.LabsMethods;
import methodPackage.LoginMethods;
import methodPackage.MedListMethods;
import methodPackage.PAMethod;
import methodPackage.POSMethod;
import methodPackage.PatientMethods;
import methodPackage.PayorInsuranceMethods;
import methodPackage.PostBIMethod;
import methodPackage.PreBIMethods;
import methodPackage.ServicePrefMethods;
import methodPackage.SocialHistoryMethods;
import methodPackage.VitalsMethods;
import testPackage.Base;

public class StepsForFeature extends Base<Object> {

	// Launch Browser

	Base<?> b1 = new Base<Object>();

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() throws InterruptedException {
	beforeTest();
	Base.readdata();
		server_auth();
		//test.log(Status.PASS,"Launched successfully");
	}
//
//	@When("User enters incorrect username and correct password")
//	public void user_enters_incorrect_username_and_correct_password() throws InterruptedException, IOException {
//		LoginMethods l1 = PageFactory.initElements(Base.driver, LoginMethods.class);
//		Base.readdata();
//		l1.verify_login_incorrect_correct();
//	}
//
//	@When("User enters correct username and incorrect password")
//	public void user_enters_correct_username_and_incorrect_password() throws InterruptedException, IOException {
//		LoginMethods l1 = PageFactory.initElements(Base.driver, LoginMethods.class);
//		Base.readdata();
//		l1.verify_login_correct_incorrect();
//	}
//
//	@When("User enters incorrect username and incorrect password")
//	public void user_enters_incorrect_username_and_incorrect_password() throws InterruptedException, IOException {
//		LoginMethods l1 = PageFactory.initElements(Base.driver, LoginMethods.class);
//		Base.readdata();
//		l1.verify_login_incorrect_incorrect();
//	}
//
//	@When("User enters correct username and correct password")
//	public void user_enters_correct_username_and_correct_password() throws InterruptedException, IOException {
//		LoginMethods l1 = PageFactory.initElements(Base.driver, LoginMethods.class);
//		Base.readdata();
//		l1.verify_login_correct_correct();
//	}

	// ------------------------------------------------------- Patient Module
	// --------------------------------------------------------------

	@When("User click on Save button without selection of data")
	public void click_on_save_without_enter_data() throws InterruptedException, IOException {
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);
		Base.readdata();
		p1.verify_patient_withoutData();
	}

	@When("User verify that some fields should not accept alphabets")
	public void verify_some_fields_should_not_accept_alphabets() throws InterruptedException, IOException {
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);
		Base.readdata();
		p1.patientTabSomeFieldNotAcceptAlphabets();

	}

	@When("User verify that some fields should not accept numeric values")
	public void verify_some_fields_should_not_accept_numeric() throws InterruptedException, IOException {
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);
		Base.readdata();
		p1.patientNotAcceptNumeric();

	}

	@When("User verify that some fields should not accept special characters")
	public void verify_some_fields_should_not_accept_specialChar() throws InterruptedException, IOException {
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);
		Base.readdata();
		p1.patientNotAcceptSpecialCharacters();

	}

	@When("User verify that some fields should not be blank")
	public void verify_some_fields_should_not_be_blank() throws InterruptedException, IOException {
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);
		Base.readdata();
		p1.patientNotAcceptSpace();

	}

	@When("User add new patient record with valid data")
	public void add_new_patient_with_valid_data() throws InterruptedException, IOException {
		PatientMethods p1 = PageFactory.initElements(driver, PatientMethods.class);
		Base.readdata();
		p1.Patient_with_valid_data();

	}
	


	// ------------------------------------------------------- Patient Payor Module
	// --------------------------------------------------------------

	@When("User click on Save button without fill data")
	public void user_click_on_save_button_without_fill_data() throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTab_WithoutData();

	}

	@When("User verify click on save button after select only insurance type")
	public void user_verify_click_on_save_button_after_select_only_insurance_type()
			throws InterruptedException, IOException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.payorTabOnlyInsuranceTypeSelected();
	}

	@When("User verify Payor Tab some fields should not accept alphabets")
	public void user_verify_payor_tab_some_fields_should_not_accept_alphabets()
			throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabNotAcceptAlphabets();
	}

	@When("User verify Payor Tab some fields should not accept special characters")
	public void user_verify_payor_tab_some_fields_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabNotAcceptSpecialCharacters();
	}

	@When("User verify Payor Tab some fields should not be blank")
	public void user_verify_payor_tab_some_fields_should_not_be_blank() throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabNotAcceptSpace();
	}

	@When("User verify Payor Tab some fields should not accept numeric values")
	public void user_verify_payor_tab_some_fields_should_not_accept_numeric_values()
			throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabNotAcceptNumericValue();
	}

	@When("User verify Payor Tab BIN value should not accept less than six digit")
	public void user_verify_payor_tab_bin_value_should_not_accept_less_than_six_digit()
			throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabBINSize();
	}

	@When("User verify Payor Tab phone number should not accept less than ten digit")
	public void user_verify_payor_tab_phone_number_should_not_accept_less_than_ten_digit()
			throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabPhoneSize();
	}

	@When("User verify Payor Tab insurance effective date and end date should not accept invalid data")
	public void user_verify_payor_tab_insurance_effective_date_and_end_date_should_not_accept_invalid_data()
			throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabDateNotAcceptInvalidData();
	}

	@When("User add new payor insurance record with valid data")
	public void user_add_new_payor_insurance_record_with_valid_data() throws IOException, InterruptedException {
		PayorInsuranceMethods p2 = PageFactory.initElements(driver, PayorInsuranceMethods.class);
		Base.readdata();
		p2.PayorTabWithValidData();
	}

	// ------------------------------------------------------- Service Preference
	// Module --------------------------------------------------------------

	@When("Verify servicepreference tab is display or not")
	public void servicePreferenceTab_display_or_not() throws IOException, InterruptedException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		sp1.verify_ServicePreferenceTabIsDisplayed();

	}
	
	@When("Verify servicepreference tab without any data")
	public void verify_servicepreference_tab_without_any_data() throws InterruptedException, IOException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		 sp1.SaveTherapeuticProgramWithoutEnterData();
	}

	@When("Verify servicepreference tab Save only Enter TherapeuticProgram")
	public void verify_servicepreference_tab_save_only_enter_therapeutic_program() throws InterruptedException, IOException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		sp1.SaveOnlyEnterTherapeuticProgram();
	}

	@When("Verify servicepreference tab with Save TC and Status")
	public void verify_servicepreference_tab_with_save_tc_and_status() throws InterruptedException, IOException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		 sp1.SaveTCandStatus();
	}

	@When("Verify servicepreference tab with Save TC Status Reason")
	public void verify_servicepreference_tab_with_save_tc_status_reason() throws InterruptedException, IOException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		sp1.SaveTCStatusReason();	 
	}
	
	@When("Verify servicepreference tab with Save TC Status Reason and Specialty new to pharmacy")
	public void verify_servicepreference_tab_with_save_tc_status_reason_and_Specialty_new_Pharmacy() throws InterruptedException, IOException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		sp1.SaveTCStatusReasonandNewtoPharmacy();
	}
	
	@When("verify Service Preference is adding with Valid Data")
	public void add_servicePreference_valid_data() throws IOException, InterruptedException {
		ServicePrefMethods sp1 = PageFactory.initElements(driver, ServicePrefMethods.class);
		Base.readdata();
		sp1.verify_ServicePreference_With_Valid_Data();

	}

	// ------------------------------------------------------- Add Case Module
	// --------------------------------------------------------------

	

	@When("User click on create case button")
	public void user_click_on_create_case_button() throws IOException {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		p1.addNewCase();
	}

	@When("User Select PharmacyStore")
	public void user_select_pharmacy_store() {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		try {
			p1.caseManagementTabOnlyPharmacyStoreSelected();
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User enter numeric,alphabets,special characters Value in Therapeutic Program")
	public void user_enter_nnumeric_alphabets_special_characters_value_in_therapeutic_program() { 
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		try {
			p1.therapeuticValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("User Select Therapeutic Program")
	public void user_select_therapeutic_program() {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		try {
			p1.caseManagementTabOnlyStoreandTCSelected();
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("User Select Service")
	public void user_select_service() {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		try {
			p1.caseManagementTabOnlyServicesSelected();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("User enter numeric,alphabets,special characters Value in Care Plan")
	public void user_enter_numeric_alphabets_special_characters_value_in_care_plan() {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		try {
			p1.careplanValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("User Select CarePlan")
	public void user_select_care_plan() {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		try {
			p1.caseManagementTabOnlyCarePlanSelected();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@When("User Select CaseType")
//	public void user_select_case_type() {
//		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
//		Base.readdata();
//		try {
//			p1.caseManagementTabOnlyCaseTypeSelected();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	@When("User click on create case with All valid Data")
	public void user_click_on_create_case_valid_data_only() throws IOException, InterruptedException {
		AddCaseMethods p1 = PageFactory.initElements(Base.driver, AddCaseMethods.class);
		Base.readdata();
		p1.caseManagementAllValiddata();
	}

	// ------------------------------------------------------- Add Consent in Case
	// --------------------------------------------------------------

	

	@When("User click on Patient Consent Tab")
	public void user_click_on_patient_consent_tab() throws Exception {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.ClickonPatientConsentTab();
	}

	@When("User click on Add Patient Consent Elements")
	public void user_click_on_add_patient_consent_elements() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.AddPatientConsentkElement();

	}

	@When("User enter numeric,alphabets,special characters Value in Relationship Value")
	public void user_enter_numeric_alphabets_special_characters_value_in_relationship_value() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.relationshipValue();

	}

	@When("User enter numeric,alphabets,special characters Value in Userrole Value")
	public void user_enter_numeric_alphabets_special_characters_value_in_Userrole_value() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.userRoleValue();

	}

	@When("User enter numeric,alphabets,special characters Value in Username Value")
	public void user_enter_numeric_alphabets_special_characters_value_in_Username_value() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.userNameValue();

	}

	@When("User enter numeric,alphabets,special characters Value in Methods Value")
	public void user_enter_numeric_alphabets_special_characters_value_in_Methods_value() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.methodValue();

	}

	@When("User select correct value in methods dropdown")
	public void user_select_correct_value_in_methods_dropdown() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.selectMethod();

	}

	@When("User enter numeric,alphabets,special characters Value in Consent Type Value")

	public void user_enter_numeric_alphabets_special_characters_value_in_consent_type_value()
			throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.consentTypeValue();

	}

	@When("User select correct value in Consent Type")
	public void user_select_correct_value_in_consent_type() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.selectConsentType();

	}

	@When("User Add the Consent Type")

	public void user_add_the_consent_type() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();

		c1.addConsentType();

	}

	
	@When("User save all consent activity")
	public void user_save_all_consent_activity() throws InterruptedException, IOException {
		AddConsentMethods c1 = PageFactory.initElements(Base.driver, AddConsentMethods.class);
		Base.readdata();
		
			c1.selectAllActivity();
	
		
	}
	 

	// ------------------------------------------------------- Clinical_Allergy
	// --------------------------------------------------------------

	@When("Save Allergy tab without selection of data")
	public void add_Allergy_without_data() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyTabClinicalWithoutData();
	}

	@When("User not select allergen Type")
	public void add_Allergy_without_allergenType() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergenTypeNotSelected();
	}

	@When("User not select only Allergy Name")
	public void add_Allergy_without_allergyName() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNameNotSelected();
	}

	@When("User not enter only Allergy Note")
	public void user_not_enter_only_allergy_note() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNoteNotSelected();
	}

	@When("verify that allergy name field should not accept alpha numeric")
	public void allergyName_not_accept_Alphanumeric() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNameNotAllowAlphaNumeric();
	}

	@When("verify that allergy name field should not accept special characters")
	public void allergyName_not_accept_Special_Char() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNameNotAllowSpecialCharacter();
	}

	@When("verify that allergy name field should not be blank")
	public void allergyName_not_accept_blankSpace() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNameNotAllowSpace();

	}

	@When("verify that allergy name field should not allow space between name")
	public void allergyName_not_accept_betweenSpace() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNameNotAllowSpaceBetweenName();

	}

	@When("verify that allergy note field not allow only space")
	public void allergyNote_not_allow_only_space() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNoteNotAllowOnlySpace();

	}

	@When("verify that allergy name field based on type")
	public void allergyName_basedontype() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyNameBasedOnType();

	}

	@When("Allergy tab save with valid data")
	public void allergytab_with_valid_data() throws InterruptedException, IOException {
		AllergyMethods a1 = PageFactory.initElements(driver, AllergyMethods.class);
		Base.readdata();
		a1.allergyTabClinicalWithValid();

	}

	// ------------------------------------------------------- Clinical_Vitals_Tab
	// --------------------------------------------------------------

	@When("Save Vitals tab without selection of data")
	public void add_Vitals_without_data() throws InterruptedException, IOException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalTabClinicalWithoutData();
	}

	@When("User not select vital Date")
	public void add_Vitals_without_vitalDate() throws InterruptedException, IOException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalDateNotSelected();
	}

	@When("User not select only Vital Height")
	public void add_Vitals_without_vitalHeight() throws InterruptedException, IOException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalHeightNotSelected();
	}

	@When("User not select only Vital Weight")
	public void add_Vitals_without_vitalWeight() throws InterruptedException, IOException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalWeightNotSelected();
	}

	@When("User not select only Temperature")
	public void user_not_select_only_temperature() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalTemperatureNotSelected();
	}

	@When("User not select only BP Field")
	public void user_not_select_only_bp_field() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalBpNotSelected();
	}

	@When("User enter Invalid Height Value")
	public void user_enter_invalid_height_value() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalHeightValueInvalid();
	}

	@When("User enter Invalid Temperature Value")
	public void user_enter_invalid_temperature_value() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalTemperatureValueInvalid();
	}

	@When("User enter Invalid BP Value")
	public void user_enter_invalid_bp_value() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalBpValueInvalid();
	}

	@When("User enter Invalid Height Float Value")
	public void user_enter_invalid_height_float_value() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalHeightFloatValueInvalid();
	}

	@When("verify that Height field should not be blank")
	public void verify_that_height_field_should_not_be_blank() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalHeightBlankSpaceNotAllow();
	}

	@When("verify that Weight field should not accept special characters")
	public void verify_that_weight_field_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalWeightSpecialCharacterNotAllow();
	}

	@When("verify that Weight field not allow only space")
	public void verify_that_weight_field_not_allow_only_space() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalWeightBlankSpaceNotAllow();
	}

	@When("verify that Temperature field should not accept special characters")
	public void verify_that_temperature_field_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalTemperatureSpecialCharacterNotAllow();
	}

	@When("verify that Temperature field should not be blank")
	public void verify_that_temperature_field_should_not_be_blank() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalTemperatureNotAllowBlankSpace();
	}

	@When("User enter Invalid BP Floating Value")
	public void user_enter_invalid_bp_floating_value() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalBpFloatingValueInvalid();
	}

	@When("verify that BP field should not accept special characters")
	public void verify_that_bp_field_should_not_accept_special_characters() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalBpSpecialCharNotAllow();
	}

	@When("verify that BP field should not be blank")
	public void verify_that_bp_field_should_not_be_blank() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		v1.vitalBpBlankSpaceNotAllow();
	}
	
	@When("Vital Tab With Valid Data")
	public void verify_that_vital_tab_with_valid_data() throws IOException, InterruptedException {
		VitalsMethods v1 = PageFactory.initElements(driver, VitalsMethods.class);
		Base.readdata();
		   v1.vitalTabClinicalWithValidData();
	}

	// ------------------------------------------------------- Clinical_Labs_Tab
	// --------------------------------------------------------------

//				-------------------- Blood Glucose Tab --------------------

	@When("Save Blood Glucose tab without selection of data")
	public void save_blood_glucose_tab_without_selection_of_data() throws InterruptedException, IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabBloodGlucoseClinicalWithoutData();
	}

	@When("User enter invalid Alphabets Data")
	public void user_enter_invalid_alphabets_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabBloodGlucoseWithInvalidAlphabetsData();
	}

	@When("verify that Blood Glucose tab should not accept special characters")
	public void verify_that_blood_glucose_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabBloodGlucoseWithSpecialCharData();
	}

	@When("verify that Blood Glucose tab should not be saved with blank space")
	public void verify_that_blood_glucose_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabBloodGlucoseWithBlankSpaceData();
	}

	@When("verify other type dropdown")
	public void verify_other_type_dropdown() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabBloodGlucoseDropdownOthertype();
	}
	@When("User not select Date")
	public void user_not_select_date() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabBloodGlucoseWithoutDate();
	}

	@When("Blood Glucose Tab With Valid Data")
	public void Blood_Glucose_Tab_with_Valid_Data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		 l1.labTabBloodGlucoseClinicalWithValidData();
	}


//	-------------------- Chemistries Tab --------------------

	@When("Save Chemistries tab without selection of data")
	public void save_chemistries_tab_without_selection_of_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabChemistriesClinicalWithoutData();
	}

	@When("User enter invalid Alphabets Data Chemistries Tab")
	public void user_enter_invalid_alphabets_data_chemistries_tab() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.chemistriesAllFieldAlphabets();
	}

	@When("verify that Chemistries tab should not accept special characters")
	public void verify_that_chemistries_tab_should_not_accept_special_characters() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.chemistriesAllFieldsSpecialCharacter();
	}

	@When("verify that Chemistries tab should not be saved with blank space")
	public void verify_that_chemistries_tab_should_not_be_saved_with_blank_space() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.chemistriesAllFieldsSpace();
	}

	@When("verify that Chemistries tab should not be saved some fields out of range")
	public void verify_that_chemistries_tab_should_not_be_saved_some_fields_out_of_range() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.chemistriesSomeFieldsOutOfRange();
	}
	
	@When("User not select Date Chemistries")
	public void user_not_select_date_chemistries() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabChemistriesWithoutDate();
	}

	@When("Chemistries Tab With Valid Data")
	public void Chemistries_Tab_With_Valid_Data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabChemistriesWithValidData();
	}


//	-------------------- Complete Blood Count Tab --------------------	

	@When("Save Complete Blood Count tab without selection of data")
	public void save_complete_blood_count_tab_without_selection_of_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabCompleteBloodCountClinicalWithoutData();
	}

	
	@When("verify that Complete Blood Count not be saved some fields out of range")
	public void verify_that_complete_blood_count_not_be_saved_some_fields_out_of_range()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.CBCDataOutOfRange();
	}

	@When("User enter invalid Alphabets Data Complete Blood Count Tab")
	public void user_enter_invalid_alphabets_data_complete_blood_count_tab() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.CBCNotAcceptAlphabets();
	}

	@When("verify that Complete Blood Count tab should not accept special characters")
	public void verify_that_complete_blood_count_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.CBCNotAcceptSpecialCharacters();
	}

	@When("verify that Complete Blood Count tab should not be saved with blank space")
	public void verify_that_complete_blood_count_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.CBCNotAcceptSpace();
	}
	
	@When("User not select Date Complete Blood Count")
	public void user_not_select_date_complete_blood_count() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabCBCWithoutDate();
	}

	@When("Complete Blood Count With Valid Data")
	public void Complete_Blood_Count_With_Valid_Data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabCBCWithValidData();
	}


//	-------------------- Inflammatory Markers tab --------------------

	@When("Save Inflammatory Markers tab without selection of data")
	public void save_inflammatory_markers_tab_without_selection_of_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabInflammatoryMarkersClinicalWithoutData();
	}

	
	@When("User enter invalid Alphabets Data Inflammatory Markers Tab")
	public void user_enter_invalid_alphabets_data_inflammatory_markers_tab() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.inflammatoryWithAlphabets();
	}

	@When("verify that Inflammatory Markers tab should not accept special characters")
	public void verify_that_inflammatory_markers_tab_should_not_accept_special_characters() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.inflammatoryWithSpecialCharacters();
	}

	@When("verify that Inflammatory Markers tab should not be saved with blank space")
	public void verify_that_inflammatory_markers_tab_should_not_be_saved_with_blank_space() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.inflammatoryWithSpace();
	}

	@When("verify that Inflammatory Markers - CRP field not be saved out of range")
	public void verify_that_inflammatory_markers_crp_field_not_be_saved_out_of_range() throws IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.CRPWithOutOfRange();
	}
	@When("User not select Date Inflammatory Markers tab")
	public void user_not_select_date_inflammatory_markers_tab() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.inflammatoryWithoutDate();
	}

	@When("Inflammatory Markers with Valid Data")
	public void Inflammatory_Markers_with_Valid_Data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.inflammatoryWithValidData();
	}


//	-------------------- Lipid Panel tab --------------------

	@When("Save Lipid Panel tab without selection of data")
	public void save_lipid_panel_tab_without_selection_of_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabLipidPanelClinicalWithoutData();
	}

	
	@When("User enter invalid Alphabets Data Lipid Panel Tab")
	public void user_enter_invalid_alphabets_data_lipid_panel_tab() throws InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.lipidPanelAlphabets();
	}

	@When("verify that Lipid Panel tab should not accept special characters")
	public void verify_that_lipid_panel_tab_should_not_accept_special_characters() throws InterruptedException {

		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.lipidPanelSpecialCharacters();
	}

	@When("verify that Lipid Panel tab should not be saved with blank space")
	public void verify_that_lipid_panel_tab_should_not_be_saved_with_blank_space() throws InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.lipidPanelSpace();
	}
	@When("User not select Date Lipid Panel tab")
	public void user_not_select_date_lipid_panel_tab() throws InterruptedException, IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.lipidPanelWithoutDate();
	}

	@When("Lipid Panel with Valid Data")
	public void Lipid_Panel_with_Valid_Data() throws InterruptedException, IOException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.lipidPanelWithValidData();
	}


//	-------------------- Liver Test tab --------------------	

	@When("Save Liver Test tab without selection of data")
	public void save_liver_test_tab_without_selection_of_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabLiverTestClinicalWithoutData();
	}

	@When("User enter invalid Alphabets Data Liver Test Tab")
	public void user_enter_invalid_alphabets_data_liver_test_tab() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.liverTestNotAcceptAlphabets();
	}

	@When("verify that Liver Test tab should not accept special characters")
	public void verify_that_liver_test_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.liverTestNotAcceptSpecialCharacters();
	}

	@When("verify that Liver Test tab should not be saved with blank space")
	public void verify_that_liver_test_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.liverTestNotAcceptSpace();
	}

	@When("verify that Liver Test tab should not be saved out of range")
	public void verify_that_liver_test_tab_should_not_be_saved_out_of_range() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.liverTestNotAcceptOutOfRange();
	}
	@When("User not select Date Liver Test tab")
	public void user_not_select_date_liver_test_tab() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.liverTestWithoutDate();
	}
	@When("Liver Test with Valid Data")
	public void Liver_Test_with_Valid_Data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.liverTestWithValidData();
	}

//	-------------------- Renal Test tab --------------------	

	@When("Save Renal Test tab without selection of data")
	public void save_renal_test_tab_without_selection_of_data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.labTabRenalTestClinicalWithoutData();
	}

	
	@When("User enter invalid Alphabets Data Renal Test Tab")
	public void user_enter_invalid_alphabets_data_renal_test_tab() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.renalTestNotAcceptAlphabets();
	}

	@When("verify that Renal Test tab should not accept special characters")
	public void verify_that_renal_test_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.renalTestNotAcceptSpecialCharacters();
	}

	@When("verify that Renal Test tab should not be saved with blank space")
	public void verify_that_renal_test_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.renalTestNotAcceptSpace();
	}

	@When("verify that Renal Test tab should not be saved out of range")
	public void verify_that_renal_test_tab_should_not_be_saved_out_of_range() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.renalTestNotAcceptOutOfRange();
	}
	@When("User not select Date Renal Test tab")
	public void user_not_select_date_renal_test_tab() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.renalTestWithoutDate();
	}

	@When("Renal Test with Valid Data")
	public void Renal_Test_with_Valid_Data() throws IOException, InterruptedException {
		LabsMethods l1 = PageFactory.initElements(driver, LabsMethods.class);
		Base.readdata();
		l1.renalTestWithValidData();
	}

	// ------------------------------------------------------- Clinical_Social
	// History_Tab
	// --------------------------------------------------------------

	@When("Save Social History tab without selection of data")
	public void save_social_history_tab_without_selection_of_data() throws InterruptedException, IOException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryClinicalWithoutData();
	}

	@When("User enter alphabets in dropdown Social History tab")
	public void user_enter_alphabets_in_dropdown_social_history_tab() throws IOException, InterruptedException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryDropdownNotAcceptAlphabets();
	}

	@When("User enter numeric value in dropdown Social History tab")
	public void user_enter_numeric_value_in_dropdown_social_history_tab() throws IOException, InterruptedException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryDropdownNotAcceptNumeric();
	}

	@When("verify that Social History tab should not accept special characters")
	public void verify_that_social_history_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryDropdownNotAcceptSpecialCharacters();
	}

	@When("verify that Social History tab should not be saved with blank space")
	public void verify_that_social_history_tab_should_not_be_saved_with_blank_space() throws IOException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryAllFieldsNotAcceptSpace();
	}

	@When("verify that radio buttons should not accept any other values Social History tab")
	public void verify_that_radio_buttons_should_not_accept_any_other_values_social_history_tab()
			throws IOException, InterruptedException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryRadioButtonsNotAcceptAnyOtherValues();
	}
	
	@When("Social History with Valid Data")
	public void Social_History_with_Valid_Data()throws IOException, InterruptedException {
		SocialHistoryMethods s1 = PageFactory.initElements(driver, SocialHistoryMethods.class);
		Base.readdata();
		s1.socialHistoryAllFieldsWithValidData();
	}


	// ------------------------------------------------------- Clinical_Health
	// History_Tab
	// --------------------------------------------------------------

//	-------------------- Family History tab --------------------	

	@When("Save Family History tab without selection of data")
	public void save_family_history_tab_without_selection_of_data() throws InterruptedException, IOException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.healthHistoryFamilyClinicalWithoutData();
	}

	@When("verify all fields should not accept alphabets Family History")
	public void verify_all_fields_should_not_accept_alphabets_family_history()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.familyHistoryNotAcceptAlphabets();
	}

	@When("verify that Family History tab should not accept special characters")
	public void verify_that_family_history_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.familyHistoryNotAcceptSpecialCharacters();
	}

	@When("verify all fields should not accept numeric values Family History")
	public void verify_all_fields_should_not_accept_numeric_values_family_history()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.familyHistoryNotAcceptNumeric();
	}

	@When("verify that Family History tab should not be saved with blank space")
	public void verify_that_family_history_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.familyHistoryNotAcceptSpace();
	}
	@When("Family History with Valid Data")
	public void Family_History_with_Valid_Data()throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		 h1.familyHistoryValidData();
	}
	

//	-------------------- Medical History tab --------------------	

	@When("Save Medical History tab without selection of data")
	public void save_medical_history_tab_without_selection_of_data() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.healthHistoryMedicalClinicalWithoutData();
	}

	@When("verify all fields should not accept alphabets Medical History")
	public void verify_all_fields_should_not_accept_alphabets_medical_history()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.medicalHistoryNotAcceptAlphabets();
	}

	@When("verify that Medical History tab should not accept special characters")
	public void verify_that_medical_history_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.medicalHistoryNotAcceptspecialCharacters();

	}

	@When("verify all fields should not accept numeric values Medical History")
	public void verify_all_fields_should_not_accept_numeric_values_medical_history()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.medicalHistoryNotAcceptNumeric();
	}

	@When("verify that Medical History tab should not be saved with blank space")
	public void verify_that_medical_history_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.medicalHistoryNotAcceptSpace();
	}

	@When("Medical History with Valid Data")
	public void Medical_History_with_Valid_Data()throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		 h1.medicalHistoryValidData();
	}

//	-------------------- Review Of Systems tab --------------------	

	@When("Save Review Of Systems tab without selection of data")
	public void save_ros_tab_without_selection_of_data() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.healthHistoryROSClinicalWithoutData();
	}

	@When("verify all fields should not accept alphabets Review Of Systems tab")
	public void verify_all_fields_should_not_accept_alphabets_ros_tab() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.ROSwithAlphabets();
	}

	@When("verify all fields should not accept numeric values Review Of Systems")
	public void verify_all_fields_should_not_accept_numeric_values_ros() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.ROSShouldNotAcceptNumeric();
	}

	@When("verify that Review Of Systems tab should not accept special characters")
	public void verify_that_ros_tab_should_not_accept_special_characters() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.ROSShouldNotAcceptSpecialCharacters();
	}

	@When("verify that Review Of Systems tab should not be saved with blank space")
	public void verify_that_ros_tab_should_not_be_saved_with_blank_space() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.ROSShouldNotAcceptSpace();
	}
	@When("Review Of Systems with Valid Data")
	public void Review_Of_Systems_with_Valid_Data() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.ROSValidData();
	}

//	-------------------- Surgical tab --------------------		

	@When("Save Surgical tab without selection of data")
	public void save_surgical_tab_without_selection_of_data() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.healthHistorySurgicalClinicalWithoutData();
	}

	@When("verify all fields should not accept alphabets Surgical tab")
	public void verify_all_fields_should_not_accept_alphabets_surgical_tab() throws IOException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.surgicalNotAcceptOtherAlphabets();
	}

	@When("verify all fields should not accept numeric values Surgical")
	public void verify_all_fields_should_not_accept_numeric_values_surgical() throws IOException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.surgicalNotAcceptNumeric();
	}

	@When("verify that Surgical tab should not accept special characters")
	public void verify_that_surgical_tab_should_not_accept_special_characters() throws IOException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.surgicalNotAcceptSpecialCharacters();
	}

	@When("verify that Surgical tab should not be saved with blank space")
	public void verify_that_surgical_tab_should_not_be_saved_with_blank_space() throws IOException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.surgicalNotAcceptSpace();
	}
	@When("Surgical tab with Valid Data")
	public void Surgical_tab_with_Valid_Data() throws IOException, InterruptedException {
		HealthHistoryMethods h1 = PageFactory.initElements(driver, HealthHistoryMethods.class);
		Base.readdata();
		h1.surgicalValidData();
	}

//	-------------------- Med List tab --------------------		

	@When("Save Med List tab without selection of data")
	public void save_med_list_tab_without_selection_of_data() throws InterruptedException, IOException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListClinicalWithoutData();
	}

	@When("User enter alphabets in dropdown Med List tab")
	public void user_enter_alphabets_in_dropdown_med_list_tab() throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.dropdownnotAcceptOtherAlphabets();
	}

	@When("User enter numeric value in dropdown Med List tab")
	public void user_enter_numeric_value_in_dropdown_med_list_tab() throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.dropdownnotAcceptNumeric();
	}

	@When("verify that Med List tab should not accept special characters")
	public void verify_that_med_list_tab_should_not_accept_special_characters()
			throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.dropdownnotAcceptSpecialCharacters();
	}

	@When("verify that Med List tab should not be saved with blank space")
	public void verify_that_med_list_tab_should_not_be_saved_with_blank_space()
			throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.dropdownnotAcceptSpace();
	}

	@When("User not select Date Med List tab")
	public void user_not_select_date_med_list_tab() throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListDateValueInvaid();
	}

	@When("verify that Medication Name field should not accept numeric values")
	public void verify_that_medication_name_field_should_not_accept_numeric_values()
			throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListMedicationNameNotAcceptNumeric();
	}

	@When("verify that all fields not allow only space in Med List tab")
	public void verify_that_all_fields_not_allow_only_space_in_med_list_tab() throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListAllTextFieldNotAcceptSpace();
	}

	@When("verify that some fields not accept alphabets in Med List tab")
	public void verify_that_some_fields_not_accept_alphabets_in_med_list_tab()
			throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListSomeFieldNotAcceptAlphabets();
	}

	@When("verify that some fields not accept special characters")
	public void verify_that_some_fields_not_accept_special_characters() throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListSomeFieldNotAcceptSpecialCharacters();
	}
	
	@When("Med List with Valid Data")
	public void Med_List_with_Valid_Data() throws IOException, InterruptedException {
		MedListMethods m1 = PageFactory.initElements(driver, MedListMethods.class);
		Base.readdata();
		m1.medListValidData();
	}


// ------------------------------------------------------- Add Prescription in Case
		// --------------------------------------------------------------	
		
	
	@When("Verify that the Add Presciprion Link is clickable or not")
	public void verify_that_the_add_presciprion_link_is_clickable_or_not() throws InterruptedException, IOException {
		AddPrescriptionMethod addrx = PageFactory.initElements(driver, AddPrescriptionMethod.class);
		Base.readdata();
		addrx.AddPrescriptionfromInatke();
	}

	@When("User enter all valid data and save the prescription to case")
	public void user_enter_all_valid_data_and_save_the_prescription_to_case() throws InterruptedException, IOException {
		AddPrescriptionMethod addrx = PageFactory.initElements(driver, AddPrescriptionMethod.class);
		Base.readdata();
		addrx.AddRx_WithValidData();
	}

	
// ------------------------------------------------------- Case Banner
			// --------------------------------------------------------------	
	
			@When("Check Permission for Case Banner")
			public void check_permission_for_case_banner() throws IOException, InterruptedException {
				CaseBannerMethods casebanner = PageFactory.initElements(Base.driver, CaseBannerMethods.class);
				Base.readdata();
				casebanner.verify_casebanner();
			}

			@When("User save case banner without entering any data")
			public void user_save_case_banner_without_entering_any_data() throws IOException, InterruptedException {
				CaseBannerMethods casebanner = PageFactory.initElements(Base.driver, CaseBannerMethods.class);
				Base.readdata();
				casebanner.verify_casebaneer_withoutdata();
			}

			@When("User save case banner with invalid data")
			public void user_save_case_banner_with_invalid_data() throws IOException, InterruptedException {
				CaseBannerMethods casebanner = PageFactory.initElements(Base.driver, CaseBannerMethods.class);
				Base.readdata();
				casebanner.verify_casebaneer_InvalideData();
			}

			@When("User save case banner with valid data")
			public void user_save_case_banner_with_positive_data() throws IOException, InterruptedException {
				CaseBannerMethods casebanner = PageFactory.initElements(Base.driver, CaseBannerMethods.class);
				Base.readdata();
				casebanner.verify_casebaneer_correct_data();
			}
	
// ------------------------------------------------------- Add Pre BI
			// --------------------------------------------------------------				

			@When("User save the Pre BI activity with valid data")
			public void user_save_the_pre_bi_activity_with_valid_data() throws Exception {
				PreBIMethods cmm = PageFactory.initElements(driver, PreBIMethods.class);
				Base.readdata();
				cmm.verify_PreBI_With_Valid_Data();	
			}
			
// ------------------------------------------------------- Add Prior Authorization
			// --------------------------------------------------------------			

			@When("User save the PA activity with valid data")
			public void user_save_the_priorauthorizatio_activity_with_valid_data() throws Exception {
				PAMethod pm1 = PageFactory.initElements(driver, PAMethod.class);
				Base.readdata();
				pm1.verify_AddPAWithValidData();
			}
			
// ------------------------------------------------------- Add Appeal
			// --------------------------------------------------------------
			
			@When("User save the appeal activity with valid data")
			public void user_save_the_appeal_activity_with_valid_data() throws Exception {
				AddAppealMethods p5 = PageFactory.initElements(driver, AddAppealMethods.class);
				Base.readdata();
				p5.clickOnBIWorkflow();
				p5.clickonAppealActivity();
				p5.clickOnAddAppealLink();
				p5.selectStatusValue();
				p5.selectReasonValue();
				p5.selectInitiatedByValue();
				p5.enterPANumberValue();
				p5.selectOnPrescrLinks();
				p5.selectInsuranceValue();
				p5.enterPADateOnInitiated();
				p5.selectLevelOfAppealValue();
				p5.selectPAContestedReasonValue();
				p5.selectYesRadioValue();
				p5.AppealDraftedByValue();
				p5.enterAppealDateSubmittedValue();
				p5.enterDecisionReceivedDateValue();
				p5.enterApprovalDateValue();
				p5.enterExpirationDateValue();
				p5.enterAppealNumberValue();
				p5.appealSavebtn();
				p5.appealClosebtn();
			}
			
// ------------------------------------------------------- Add Copay
			// --------------------------------------------------------------		
			@When("User save the copay activity with valid data")
			public void user_save_the_copay_activity_with_valid_data() throws Exception {
				CopayMethods copay = PageFactory.initElements(driver, CopayMethods.class);
				Base.readdata();
				copay.CopayCardLogValidData();
			}		
// ------------------------------------------------------- Add Foundation
						// --------------------------------------------------------------					
			@When("User save the foundation activity with valid data")
			public void user_save_the_foundation_activity_with_valid_data() throws Exception {
				AddFoundationMethods foundation = PageFactory.initElements(driver, AddFoundationMethods.class);
				Base.readdata();
				foundation.clickOnBIWorkflow();
				foundation.clickonFoundationSupportActivity();
				foundation.clickOnAddFoundationSupportLink();
				foundation.selectOnFoundationProgramLinks();
				foundation.selectOnPrescrLinks();
				foundation.selectStatusValue();
				foundation.selectInitiatedByValue();
				foundation.enterDateInitiatedFoundationValue();
				foundation.enterDateSubmittedFoundationValue();
				foundation.enterExpectedResponseDateFoundationValue();
				foundation.enterDecisionDateFoundationValue();
				foundation.SelectInsuranceValue();
				foundation.FoundationSavebtn();
				foundation.FoundationsClosebtn();
			}	
// ------------------------------------------------------- Add Post BI
			// --------------------------------------------------------------			
			@When("Verify the Post BI permission")
			public void verify_the_post_bi_permission() throws IOException, InterruptedException {
				PostBIMethod postbi = PageFactory.initElements(driver, PostBIMethod.class);
				Base.readdata();
				postbi.verifyPostBI();
				
			}
			@When("User save the PostBi activity without adding data")
			public void user_save_the_post_bi_activity_without_adding_data() throws InterruptedException, IOException {
				PostBIMethod postbi = PageFactory.initElements(driver, PostBIMethod.class);
				Base.readdata();
				postbi.verifyPostBIwithoutData();
			}

			@When("User save the postbi activity with valid data")
			public void user_save_the_postbi_activity_with_valid_data() throws IOException, InterruptedException {
				PostBIMethod postbi = PageFactory.initElements(driver, PostBIMethod.class);
				Base.readdata();
				postbi.VerifyPostBIWithValidData();
			}

			// ------------------------------------------------------- Add POS
						// --------------------------------------------------------------					

			@When("User save the point of sale activity with valid data")
			public void user_save_the_point_of_sale_activity_with_valid_data()
					throws IOException, InterruptedException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.verify_POS_With_Valid_Data();
			}
		
			// ------------------------------------------------------- Complete Intake Workflow
			// --------------------------------------------------------------			
			@When("User Complete Intake WorkFlow")
			public void user_complete_intake_work_flow() throws InterruptedException, IOException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.completeIntake();				
			}
			// ------------------------------------------------------- Complete BI Workflow
						// --------------------------------------------------------------	
			@When("User Complete BI WorkFlow")
			public void user_complete_bi_work_flow() throws InterruptedException, IOException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.completeBI();
			}
			// ------------------------------------------------------- Complete COC Workflow
			// --------------------------------------------------------------	
			@When("User Complete COC WorkFlow")
			public void user_complete_coc_work_flow() throws InterruptedException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.completeCOC();
			}
			// ------------------------------------------------------- Complete CoD Workflow
			// --------------------------------------------------------------	
			@When("User Complete CoD WorkFlow")
			public void user_complete_co_d_work_flow() throws InterruptedException, IOException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.completeCoD();
			}
			// ------------------------------------------------------- Complete POS Workflow
						// --------------------------------------------------------------	
			@When("User Complete POS WorkFlow")
			public void user_complete_pos_work_flow() throws InterruptedException, IOException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.completePOS();
			}

			// ------------------------------------------------------- Complete PE Workflow
						// --------------------------------------------------------------	
			
			@When("User Complete PE WorkFlow")
			public void user_complete_pe_work_flow() throws InterruptedException, IOException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.completePE();
			}
			// ------------------------------------------------------- Create Refill Case
						// --------------------------------------------------------------	
			@When("User create refill case")
			public void user_create_refill_case() throws IOException, InterruptedException {
				POSMethod pos1 = PageFactory.initElements(driver, POSMethod.class);
				Base.readdata();
				pos1.refillCase();
			}
			
			
			// ------------------------------------------------------- Add Communication Log
			// --------------------------------------------------------------	
			
			@When("User try to save Communication Log without any data")
			public void user_try_to_save_communication_log_without_any_data() throws IOException, InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				CommunicationMethods commLog = PageFactory.initElements(Base.driver, CommunicationMethods.class);
				Base.readdata();
				commLog.verify_communicationLog_withoutData();
			}

		 

			@When("User try to save Communication Log with Invalid data")
			public void user_try_to_save_communication_log_with_invalid_data() throws IOException, InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				CommunicationMethods commLog = PageFactory.initElements(Base.driver, CommunicationMethods.class);
				Base.readdata();
				commLog.verify_communicationLog_withInvalidData();
			}

		 

			@When("User try to save Communication Log not accepting Numeric")
			public void user_try_to_save_communication_log_not_accepting_numeric() throws IOException, InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				CommunicationMethods commLog = PageFactory.initElements(Base.driver, CommunicationMethods.class);
				Base.readdata();
				commLog.verify_communicationLogNotAcceptNumeric();
			}

		 

			@When("User try to save Communication Log with special characters")
			public void user_try_to_save_communication_log_with_special_characters() throws IOException, InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				CommunicationMethods commLog = PageFactory.initElements(Base.driver, CommunicationMethods.class);
				Base.readdata();
				commLog.verify_communicationLogtNotAcceptSpecialCharacters();
			}

		 

			@When("User try to save Communication Log with Valid date")
			public void user_try_to_save_communication_log_with_valid_date() throws InterruptedException, IOException {
			    // Write code here that turns the phrase above into concrete actions

			    CommunicationMethods commLog = PageFactory.initElements(Base.driver, CommunicationMethods.class);
				Base.readdata();
				commLog.CommunicationLogValidData();
			}
			
			
			// ------------------------------------------------------- Add Send Fax
						// --------------------------------------------------------------		

			@When("User send Fax successfully")
			public void user_send_fax_successfully() throws InterruptedException, IOException {
				FaxSendMethods f1 = PageFactory.initElements(driver, FaxSendMethods.class);
				Base.readdata();
				f1.FaxSend();
			}

			@When("User assign Fax successfully")
			public void user_assign_fax_successfully() throws InterruptedException, IOException {
				FaxSendMethods f1 = PageFactory.initElements(driver, FaxSendMethods.class);
				Base.readdata();
				f1.FaxInbox();
			}

			@When("User close the browser")
			public void user_close_the_browser() throws InterruptedException {
				afterTest();
			}

}
