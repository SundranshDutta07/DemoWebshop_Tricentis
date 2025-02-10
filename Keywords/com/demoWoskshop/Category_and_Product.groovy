package com.demoWoskshop

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import com.demoWorkshop.utils.ExceptionHandling
import com.demoWorkshop.utils.Screenshot
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType

public class Category_and_Product {
	private static final KeywordLogger logger = KeywordLogger.getInstance(Category_and_Product.class)
	Screenshot SS = new Screenshot()

	//Categories From Menu
	@Keyword
	def bookCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/books'))
		}catch(Exception e) {
			//Using exception handling for failed screenshots
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in bookCategory'+e.message)
		}
	}

	@Keyword
	def computersCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/computers'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in computersCategory'+e.message)
		}
	}

	@Keyword
	def electronicsCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/electronics'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in electronicsCategory'+e.message)
		}
	}

	@Keyword
	def apparelShoesCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/apparelShoes'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in apparelShoesCategory'+e.message)
		}
	}

	@Keyword
	def digitalDownloadCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/digitalDownload'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in digitalDownloadCategory'+e.message)
		}
	}

	@Keyword
	def jewelleryCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/jewellery'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in jewelleryCategory'+e.message)
		}
	}

	@Keyword
	def giftCardsCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/giftCards'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in giftCardsCategory'+e.message)
		}
	}

	@Keyword
	def cellPhones_SubCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/electronics_SubCategory/cellPhones'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in cellPhones_SubCategory'+e.message)
		}
	}

	@Keyword
	def cameraPhoto_SubCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/electronics_SubCategory/cameraPhoto'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in cameraPhoto_SubCategory'+e.message)
		}
	}

	@Keyword
	def desktops_SubCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/computers_SubCategory/desktops'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in desktops_SubCategory'+e.message)
		}
	}

	@Keyword
	def accessories_SubCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/computers_SubCategory/accessories'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in accessories_SubCategory'+e.message)
		}
	}

	@Keyword
	def notebooks_SubCategory(v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/Categories/computers_SubCategory/notebooks'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in notebooks_SubCategory'+e.message)
		}
	}

	@Keyword
	def dynamicProductSelection(v_Product, v_ScreenshotPath) {
		try {
			String dynamicXPath ="(//a[contains(text(),'"+v_Product+"')])[1]"
			TestObject dynamicProductSelection= new TestObject('DynamicTestObject').addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
			WebUI.getText(dynamicProductSelection)
			WebUI.click(dynamicProductSelection)
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in dynamicProductSelection'+e.message)
		}
	}

	@Keyword
	def dynamicProductPrice_Actual(v_Product, v_ScreenshotPath) {
		try {
			String dynamicXPath ="(//a[contains(text(),'"+v_Product+"')])[1]/following::span[@class='price actual-price'][1]"
			TestObject dynamicProductPrice_Actual= new TestObject('DynamicTestObject').addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
			String actualPrice = WebUI.getText(dynamicProductPrice_Actual)
			return actualPrice
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in dynamicProductPrice_Actual'+e.message)
		}
	}

	@Keyword
	def dynamicAddToCart(v_Product, v_ScreenshotPath) {
		try {
			String dynamicXPath ="(//a[contains(text(),'"+v_Product+"')])[1]/following::input[@value='Add to cart'][1]"
			TestObject dynamicAddToCart= new TestObject('DynamicTestObject').addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
			WebUI.click(dynamicAddToCart)
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in dynamicAddToCart'+e.message)
		}
	}

	@Keyword
	def searchProduct(v_SearchProduct, v_ScreenshotPath) {
		try {
			WebUI.click(findTestObject('Object Repository/Products/search_Input'))
			WebUI.sendKeys(findTestObject('Object Repository/Products/search_Input'), v_SearchProduct)
			SS.captureScreenShot(v_ScreenshotPath)

			WebUI.click(findTestObject('Object Repository/Products/search_Button'))
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in searchProduct'+e.message)
		}
	}

	@Keyword
	def productAddedToCart_Message(v_ScreenshotPath) {
		try {
			boolean product = WebUI.verifyElementPresent(findTestObject('Object Repository/Products/Products/productAddedTocart_Text'), 5)
			String productAtC = product.toString()
			return productAtC
		}catch(Exception e) {
			ExceptionHandling EH = new ExceptionHandling()
			EH.Exception_Handling(v_ScreenshotPath, e)
			logger.logFailed('Error in productAddedToCart_Message'+e.message)
		}
	}
}