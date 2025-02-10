import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

try {
	WebUI.comment('Performing Login')
	 String LoginSuccess = CustomKeywords.'com.demoWoskshop.Login_Logout.login_Into'( v_ScreenshotPath, v_URL, v_Email, v_Password)
	 assert WebUI.verifyMatch(LoginSuccess, v_Email, false)
	 
	 WebUI.comment('search for any element & Add it to cart')
	 CustomKeywords.'com.demoWoskshop.Category_and_Product.searchProduct'(v_SearchProduct, v_ScreenshotPath)

	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Add Health Book to cart-Dynamic Selection')
	 CustomKeywords.'com.demoWoskshop.Category_and_Product.dynamicAddToCart'(v_Product, v_ScreenshotPath) 
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Verify Product added to cart message')
	 String productAdded = CustomKeywords.'com.demoWoskshop.Category_and_Product.productAddedToCart_Message'( v_ScreenshotPath)
	 assert WebUI.verifyMatch(productAdded, v_productAddedToCart, false)
	 
	 WebUI.comment('Select a category-Jewelry')
	 CustomKeywords.'com.demoWoskshop.Category_and_Product.jewelleryCategory'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Black & White Diamond Heart to cart-Dynamic Selection')
	 CustomKeywords.'com.demoWoskshop.Category_and_Product.dynamicAddToCart'(v_Product1, v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Verify Product added to cart message')
	 String product1Added = CustomKeywords.'com.demoWoskshop.Category_and_Product.productAddedToCart_Message'( v_ScreenshotPath)
	 assert WebUI.verifyMatch(product1Added, v_productAddedToCart, false)
	 
	 WebUI.comment('Click on Shopping cart & verify heading')
	 String Cart = CustomKeywords.'com.demoWoskshop.Cart.shoppingCart_Click'(v_ScreenshotPath)
	 assert WebUI.verifyMatch(Cart, v_Cart, false)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Select Terms os service and click on Checkout')
	 CustomKeywords.'com.demoWoskshop.Cart.termsOfService_Checkbox'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 String Checkout = CustomKeywords.'com.demoWoskshop.Cart.checkoutButton'(v_ScreenshotPath)
	 	 
	 WebUI.comment('Verify heading for Checkout')
	 assert WebUI.verifyMatch(Checkout, v_Checkout, false)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Enter Billing Details')
	 CustomKeywords.'com.demoWoskshop.Checkout.billingAddress_Dropdown'(v_BAD, v_ScreenshotPath)
	 CustomKeywords.'com.demoWoskshop.Checkout.billingAddress'(v_FirstName, v_LastName, v_Email, v_City, v_Address, v_ZipCode, v_PhoneNo, v_Country,v_ScreenshotPath) 
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Click on continue')
	 CustomKeywords.'com.demoWoskshop.Registration.continueButton'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)

	 WebUI.comment('Select in store Pickup checkbox')	 
	 CustomKeywords.'com.demoWoskshop.Checkout.inStorePickup_Checkbox'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Select payment method as COD')
	 CustomKeywords.'com.demoWoskshop.Checkout.cashOnDelivery'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Observe Payment Information & Click on continue')
	 CustomKeywords.'com.demoWoskshop.Checkout.continueButton_PaymentInfo'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Review Order Details & Click on Confirm Button')
	 ConfirmOrderDetails = CustomKeywords.'com.demoWoskshop.Checkout.confirmOrderDetails'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWoskshop.Checkout.confirmButton'(v_ScreenshotPath)

	 WebUI.comment('Verify Order success message')
	 String Ordersuccessful = CustomKeywords.'com.demoWoskshop.Checkout.orderSuccessMessage'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 assert WebUI.verifyMatch(Ordersuccessful, v_Ordersuccessful, false)
	 
	 WebUI.comment('Click on Click here on Order Details')
	 CustomKeywords.'com.demoWoskshop.Checkout.orderDetailsButton'(v_ScreenshotPath)
	 CustomKeywords.'com.demoWorkshop.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)

	 WebUI.comment('Verify Order Details')
	 SuccessOrderDetails = CustomKeywords.'com.demoWoskshop.Checkout.orderDetails_Success'(v_ScreenshotPath)
	 
	 WebUI.comment('Verifying BillersName')
	 assert WebUI.verifyMatch(SuccessOrderDetails[1].toString(), ConfirmOrderDetails[1].toString(), false)
	 
	 WebUI.comment('Verifying Shipping Method')
	 assert WebUI.verifyMatch(SuccessOrderDetails[2].toString(), ConfirmOrderDetails[2].toString(), false)
	 
	 WebUI.comment('Verifying Payment Method')
	 assert WebUI.verifyMatch(SuccessOrderDetails[3].toString(), ConfirmOrderDetails[3].toString(), false)
	 
	 WebUI.comment('Verifying Total Price')
	 assert WebUI.verifyMatch(SuccessOrderDetails[0].toString(), ConfirmOrderDetails[4].toString(), false)

	 WebUI.comment('Click on PDF Invoice deownload')
	 CustomKeywords.'com.demoWoskshop.Checkout.pdfInvoice_Button'(v_ScreenshotPath)
	}
	finally {
		WebUI.comment('Logout')
		CustomKeywords.'com.demoWoskshop.Login_Logout.logout'(v_ScreenshotPath)

		WebUI.comment('Verifying PDF Invoice deownload')
		CustomKeywords.'com.demoWoskshop.Checkout.downloadFileSS'(v_File, v_ScreenshotPath)
	}
