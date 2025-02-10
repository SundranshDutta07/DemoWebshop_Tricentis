package com.demoWoskshop

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.demoWorkshop.utils.ExceptionHandling
import com.demoWorkshop.utils.Screenshot
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Cart {
	private static final KeywordLogger logger = KeywordLogger.getInstance(Cart.class)
	Screenshot SS = new Screenshot()

	@Keyword
	def shoppingCart_Click(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/shoppingCart_Button'))
			WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/shoppingCart_Header'), 5)
			String shoppingCart = WebUI.getText(findTestObject('Object Repository/Cart/shoppingCart_Header'))
			return shoppingCart
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in shoppingCart_Click'+e.message)
		}
	}

	@Keyword
	def termsOfService_Checkbox(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Cart/TnC_checkbox'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in termsOfService_Checkbox'+e.message)
		}
	}

	@Keyword
	def checkoutButton(v_ScreenshotPath) {
		try {
			WebUI.scrollToElement(findTestObject('Object Repository/Cart/checkout_Button'), 10)
			WebUI.click(findTestObject('Object Repository/Cart/checkout_Button'))
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/checkout_Header'), 5)
			String checkout = WebUI.getText(findTestObject('Object Repository/Checkout/checkout_Header'))
			return checkout
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in checkoutButton'+e.message)
		}
	}
}