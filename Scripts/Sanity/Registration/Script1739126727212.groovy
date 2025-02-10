import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
WebUI.comment('Browser Open')
CustomKeywords.'com.demoWoskshop.Registration.openBrowser'(v_URL, v_ScreenshotPath)

WebUI.comment('Click on Registration icon')
String Register = CustomKeywords.'com.demoWoskshop.Registration.registration_Icon'(v_ScreenshotPath)
assert WebUI.verifyMatch(Register, v_Register, false)

WebUI.comment('Selecting gender checkbox')
CustomKeywords.'com.demoWoskshop.Registration.checkbox_Gender'(v_Gender, v_ScreenshotPath)

WebUI.comment('Enter credentials')
CustomKeywords.'com.demoWoskshop.Registration.enter_InputFields'(v_Firstname,v_Lastname, v_Email,v_Password,v_ScreenshotPath)

WebUI.comment('Click on register Button')
String registerSuccess = CustomKeywords.'com.demoWoskshop.Registration.registerButton'(v_ScreenshotPath)
assert WebUI.verifyMatch(registerSuccess, v_registerSuccess, false)

WebUI.comment('Click on continue Button')
CustomKeywords.'com.demoWoskshop.Registration.continueButton'(v_ScreenshotPath)

WebUI.comment('Verify the registered account is displayed on the dashboard')
String DashboardAccount= CustomKeywords.'com.demoWoskshop.Registration.accountDashboard'(v_ScreenshotPath)
assert WebUI.verifyMatch(DashboardAccount, v_Email, false)

CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)

}finally {
	WebUI.comment('Logout')
	CustomKeywords.'com.demoWoskshop.Login_Logout.logout'(v_ScreenshotPath)
}