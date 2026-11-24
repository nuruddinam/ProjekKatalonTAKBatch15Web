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

WebUI.verifyElementText(findTestObject('Page_Home/h1_CURA_text'), 'CURA Healthcare Service')

WebUI.click(findTestObject('Page_Home/Make Appointment_btn'))

WebUI.setText(findTestObject('Page_Login/Username_txtField'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Page_Login/Password_txtField'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.verifyElementClickable(findTestObject('Page_Login/Username_txtField'))

WebUI.click(findTestObject('Page_Login/Login_btn'))

WebUI.verifyElementVisible(findTestObject('Page_MakeAppointment/Make Appointment_txtField'))

WebUI.acceptAlert()

