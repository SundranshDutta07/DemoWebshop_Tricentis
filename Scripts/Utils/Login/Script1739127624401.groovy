import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


try {
WebUI.comment('Performing Login')
 String LoginSuccess = CustomKeywords.'com.demoWoskshop.Login_Logout.login_Into'( v_ScreenshotPath, v_URL, v_Email, v_Password)
 assert WebUI.verifyMatch(LoginSuccess, v_Email, false)
}
finally {
	WebUI.comment('Logout')
	CustomKeywords.'com.demoWoskshop.Login_Logout.logout'(v_ScreenshotPath)
}