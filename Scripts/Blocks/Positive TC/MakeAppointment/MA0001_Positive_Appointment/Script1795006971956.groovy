import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//String facility = facility
//String komentar = komentar
//boolean readmission = readmission
//String programs = programs
//String visitDate = visitDate
//

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MakeAppointment/select_Facility_btn'), facility, true)

//WebUI.click(findTestObject('Object Repository/Page_MakeAppointment/input_Readmission_checkbox'))
'User melakukan check Hospital Readmission'
if (readmission == true) {
    WebUI.check(findTestObject('Page_MakeAppointment/input_Readmission_checkbox'))
} else {
    WebUI.uncheck(findTestObject('Page_MakeAppointment/input_Readmission_checkbox'))
}

//WebUI.click(findTestObject('Object Repository/Page_MakeAppointment/input_Medicaid_radio'))
'User memilih Program Healthcare yang diinginkan'
select_radio = programs

switch (select_radio) {
    case 'Medicaid':
        WebUI.check(findTestObject('Page_MakeAppointment/input_Medicaid_radio'))

        break
    case 'Medicare':
        WebUI.check(findTestObject('Page_MakeAppointment/input_Medicare_radio'))

        break
    case 'None':
        WebUI.check(findTestObject('Page_MakeAppointment/input_None_radio'))

        break
    default:
        WebUI.check(findTestObject('Page_MakeAppointment/input_None_radio'))

        break
}

WebUI.setText(findTestObject('Page_MakeAppointment/input_Visit Date_field'), visitDate)

WebUI.setText(findTestObject('Object Repository/Page_MakeAppointment/textarea_Comment_txt'), komentar)

WebUI.click(findTestObject('Object Repository/Page_MakeAppointment/Book Appointment_btn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppointmentConfirm/h2_AppointmentConfirmation_text'))

