package com.demoWoskshop

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.demoWorkshop.utils.ExceptionHandling
import com.demoWorkshop.utils.Screenshot
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Registration {
	private static final KeywordLogger logger = KeywordLogger.getInstance(Registration.class)
	Screenshot SS = new Screenshot()

	//Function to open broswer
	@Keyword
	def openBrowser(String v_URL, v_ScreenshotPath) {
		try {
			WebUI.openBrowser(v_URL)
			WebUI.maximizeWindow()
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in openBrowser'+e.message)
		}
	}

	//Performing click on registration icon
	@Keyword
	def registration_Icon(String v_ScreenshotPath) {
		try {
			WebUI.waitForElementPresent(findTestObject('Object Repository/Registration/Registration_Icon'), 5)
			SS.captureScreenShot(v_ScreenshotPath)

			//Performing click on registration icon
			WebUI.click(findTestObject('Object Repository/Registration/Registration_Icon'))

			WebUI.waitForElementPresent(findTestObject('Object Repository/Registration/register_Header'), 5)
			String Register =WebUI.getText(findTestObject('Object Repository/Registration/register_Header'))
			SS.captureScreenShot(v_ScreenshotPath)
			return Register
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in registration'+e.message)
		}
	}

	//selecting gender checkbox
	@Keyword
	def checkbox_Gender(v_Gender, v_ScreenshotPath) {
		try {
			//Selecting checkbox
			String dynamicXPath ="//input[@id='gender-"+v_Gender+"']"
			TestObject gender_Checkbox= new TestObject('DynamicTestObject').addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
			WebUI.click(gender_Checkbox)
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in checkbox_Gender'+e.message)
		}
	}

	@Keyword
	def enter_InputFields(v_Firstname,v_Lastname, v_Email,v_Password,v_ScreenshotPath) {
		try {
			//Input credentials
			WebUI.sendKeys(findTestObject('Object Repository/Registration/firstname_Input'), v_Firstname)
			WebUI.sendKeys(findTestObject('Object Repository/Registration/lastname_Input'), v_Lastname)

			WebUI.sendKeys(findTestObject('Object Repository/Login/email_Input'), v_Email)
			WebUI.sendKeys(findTestObject('Object Repository/Login/password_Input'), v_Password)
			WebUI.sendKeys(findTestObject('Object Repository/Registration/confirmPassword_Input'), v_Password)

			SS.captureScreenShot(v_ScreenshotPath)
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in enter_InputFields'+e.message)
		}
	}

	@Keyword
	def registerButton(v_ScreenshotPath) {
		try {
			//Click on Register button
			WebUI.click(findTestObject('Object Repository/Registration/register_Button'))

			WebUI.waitForElementPresent(findTestObject('Object Repository/Registration/successMessage'), 5)
			SS.captureScreenShot(v_ScreenshotPath)

			WebUI.getText(findTestObject('Object Repository/Registration/successMessage'))
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in registerButton'+e.message)
		}
	}

	@Keyword
	def continueButton(v_ScreenshotPath) {
		try {
			//Click on continue button
			WebUI.click(findTestObject('Object Repository/Registration/continue_Button'))
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in continueButton'+e.message)
		}
	}

	@Keyword
	def accountDashboard(v_ScreenshotPath) {
		try {
			//Verifying Account on Dashboard
			WebUI.waitForElementPresent(findTestObject('Object Repository/Login/loginAccount_text'), 5)
			String Dashboard= WebUI.getText(findTestObject('Object Repository/Login/loginAccount_text'))
			return Dashboard
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in accountDashboard'+e.message)
		}
	}
}