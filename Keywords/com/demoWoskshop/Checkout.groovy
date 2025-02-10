package com.demoWoskshop

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.demoWorkshop.utils.ExceptionHandling
import com.demoWorkshop.utils.Screenshot
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Checkout {
	private static final KeywordLogger logger = KeywordLogger.getInstance(Registration.class)
	Screenshot SS = new Screenshot()

	//Entering all the imp credentials for billing page address
	@Keyword
	def billingAddress(v_FirstName, v_LastName, v_Email, v_City, v_Address, v_ZipCode, v_PhoneNo, v_Country,v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Header'), 5)
			String buillingAddress = WebUI.getText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Header'))
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_FirstName'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_FirstName'), v_FirstName)
			
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_LastName'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_LastName'), v_LastName)
			
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Email'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Email'), v_Email)
			
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_City'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_City'), v_City)
			
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Address1'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Address1'), v_Address)
			
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_ZipPostalCode'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_ZipPostalCode'), v_ZipCode)
			
			WebUI.clearText(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_PhoneNo'))
			WebUI.sendKeys(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_PhoneNo'), v_PhoneNo)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Country'), v_Country, false)
			
			WebUI.scrollToElement(findTestObject('Object Repository/Products/Categories/books'), 10)
			return buillingAddress
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in buillingAddress'+e.message)
		}
	}

	//Billing Address Page
	@Keyword
	def billingAddress_Dropdown(v_BAD, v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Dropdown'), 5)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Checkout/Billing Address/billingAddress_Dropdown'), v_BAD, false)
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in billingAddress_Dropdown'+e.message)
		}
	}

	//Shipping Address Page
	@Keyword
	def inStorePickup_Checkbox(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Shipping Address/shippingAddress_Header'), 5)
			String Shipping = WebUI.getText(findTestObject('Object Repository/Checkout/Shipping Address/shippingAddress_Header'))
			WebUI.click(findTestObject('Object Repository/Checkout/Shipping Address/inStorePickup_checkbox'))
			
			SS.captureScreenShot(v_ScreenshotPath)
			WebUI.click(findTestObject('Object Repository/Checkout/Shipping Address/continueButton'))
			return Shipping
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in inStorePickup_Checkbox'+e.message)
		}
	}

	//Payment Method Page
	@Keyword
	def cashOnDelivery(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Payment Method/paymentMethodHeader'), 5)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/COD'))
			
			SS.captureScreenShot(v_ScreenshotPath)
			WebUI.scrollToElement(findTestObject('Object Repository/Products/Categories/books'), 10)
			
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/continueButton'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in cashOnDelivery'+e.message)
		}
	}

	@Keyword
	def creditCard(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Payment Method/paymentMethodHeader'), 5)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/creditCard'))
			
			SS.captureScreenShot(v_ScreenshotPath)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/continueButton'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in creditCard'+e.message)
		}
	}

	@Keyword
	def purchaseOrder(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Payment Method/paymentMethodHeader'), 5)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/Purchase Order'))
			
			SS.captureScreenShot(v_ScreenshotPath)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/continueButton'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in purchaseOrder'+e.message)
		}
	}

	@Keyword
	def Check_MoneyOrder(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Payment Method/paymentMethodHeader'), 5)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/Check_MoneyOrder'))
			
			SS.captureScreenShot(v_ScreenshotPath)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Method/continueButton'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in Check_MoneyOrder'+e.message)
		}
	}

	@Keyword
	def continueButton_PaymentInfo(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Payment Info/continueButton'), 5)
			WebUI.click(findTestObject('Object Repository/Checkout/Payment Info/continueButton'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in continueButton_PaymentInfo'+e.message)
		}
	}
	
	@Keyword
	def continueButton_ShippingMethod(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Shipping Method/continueButton'), 5)
			WebUI.click(findTestObject('Object Repository/Checkout/Shipping Method/continueButton'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in continueButton_ShippingMethod'+e.message)
		}
	}
	
	
	@Keyword
	def confirmButton(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Checkout/Confirm Order/confirm_Button'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in Check_MoneyOrder'+e.message)
		}
	}
	
	//Confirm Order Details before success
	@Keyword
	def confirmOrderDetails(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Confirm Order/confirmOrder_Header'), 5)
			String confirmOrder = WebUI.getText(findTestObject('Object Repository/Checkout/Confirm Order/confirmOrder_Header'))
			String billersName = WebUI.getText(findTestObject('Object Repository/Checkout/Confirm Order/billersName'))
			String shippingMethod = WebUI.getText(findTestObject('Object Repository/Checkout/Confirm Order/shippingMethod'))
			String paymentMethod = WebUI.getText(findTestObject('Object Repository/Checkout/Confirm Order/paymentMethod'))
			String totalPrice = WebUI.getText(findTestObject('Object Repository/Checkout/Confirm Order/totalPrice'))
			
			WebUI.scrollToElement(findTestObject('Object Repository/Products/Categories/books'), 10)
			return [
				confirmOrder,
				billersName,
				shippingMethod,
				paymentMethod,
				totalPrice
			]
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in confirmOrderDetails'+e.message)
		}
	}

	//Order successful message
	@Keyword
	def orderSuccessMessage(v_ScreenshotPath) {
		try {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Success Screen/successMessage'), 5)
			String successMessage = WebUI.getText(findTestObject('Object Repository/Checkout/Success Screen/successMessage'))
			return successMessage
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in orderSuccessMessage'+e.message)
		}
	}
	//li[contains(text(),'Order number: 1897189')]
	//Click on Click here for order details
	@Keyword
	def orderDetailsButton(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Checkout/Success Screen/orderDetails_Button'))
			WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Success Screen/orderInformation'), 5)
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in orderDetailsButton'+e.message)
		}
	}

	@Keyword
	def orderDetails_Success(v_ScreenshotPath) {
		try {
			String orderTotal =WebUI.getText(findTestObject('Object Repository/Checkout/Success Screen/orderTotal'))
			String Name = WebUI.getText(findTestObject('Object Repository/Checkout/Success Screen/billersName'))
			String ShippingMethod = WebUI.getText(findTestObject('Object Repository/Checkout/Success Screen/shippingMethod'))
			String PaymentMethod = WebUI.getText(findTestObject('Object Repository/Checkout/Success Screen/paymentMethod'))
			return [
				orderTotal,
				Name,
				ShippingMethod,
				PaymentMethod
			]
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in orderDetails_Success'+e.message)
		}
	}

	//Click on Pdf Invoice button
	@Keyword
	def pdfInvoice_Button(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Checkout/Success Screen/pdfInvoice_Button'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in pdfInvoice_Button'+e.message)
		}
	}
}