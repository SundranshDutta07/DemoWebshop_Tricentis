package com.demoWoskshop

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.demoWorkshop.utils.ExceptionHandling
import com.demoWorkshop.utils.Screenshot
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Login_Logout {
	private static final KeywordLogger logger = KeywordLogger.getInstance(Login_Logout.class)
	Screenshot SS = new Screenshot()

	@Keyword
	def login_Into(String v_ScreenshotPath, String v_URL, v_Email, v_Password) {
		try {
			WebUI.openBrowser(v_URL)
			WebUI.maximizeWindow()

			WebUI.waitForElementPresent(findTestObject('Object Repository/Login/Login_Icon'), 5)
			SS.captureScreenShot(v_ScreenshotPath)

			//Performing click on login icon
			WebUI.click(findTestObject('Object Repository/Login/Login_Icon'))
			SS.captureScreenShot(v_ScreenshotPath)

			//Entering login credentials
			WebUI.waitForElementPresent(findTestObject('Object Repository/Login/returningCustomer_Text'), 5)
			WebUI.sendKeys(findTestObject('Object Repository/Login/email_Input'), v_Email)
			WebUI.sendKeys(findTestObject('Object Repository/Login/password_Input'), v_Password)
			SS.captureScreenShot(v_ScreenshotPath)

			//Performing click on login button
			WebUI.click(findTestObject('Object Repository/Login/login_Button'))

			WebUI.waitForElementPresent(findTestObject('Object Repository/Login/loginAccount_text'), 5)
			SS.captureScreenShot(v_ScreenshotPath)

			//Verifying Account on Dashboard
			String Dashboard= WebUI.getText(findTestObject('Object Repository/Login/loginAccount_text'))
			return Dashboard
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in login'+e.message)
		}
	}

	@Keyword
	def logout(String v_ScreenshotPath) {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/Logout/logout_Icon'), 5)
		String Account = WebUI.getText(findTestObject('Object Repository/Login/loginAccount_text'))

		WebUI.click(findTestObject('Object Repository/Login/Logout/logout_Icon'))

		WebUI.verifyTextNotPresent(Account, false)
		SS.captureScreenShot(v_ScreenshotPath)

		WebUI.deleteAllCookies()
		WebUI.closeBrowser()
	}
}