import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\\\Users\\\\dgpl\\\\Desktop\\\\ProdCloneDev.apk', false)

Mobile.waitForElementPresent(findTestObject('Swipe/android.widget.RelativeLayout1'), 0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY = device_Height / 2

int endY = startY

int startX = device_Width * 0.10

int endX = device_Width * 0.99

Mobile.swipe(endX, startY, startX, endY)

Mobile.tapAtPosition(endX, endY)

Mobile.swipe(endX, startY, startX, endY)

Mobile.tapAtPosition(endX, endY)

Mobile.swipe(endX, startY, startX, endY)

Mobile.tapAtPosition(endX, endY)

//Mobile.swipe(538,480,0,480)
Mobile.waitForElementPresent(findTestObject('Swipe/android.widget.RelativeLayout1'), 0)

Mobile.waitForElementPresent(findTestObject('Swipe/android.widget.TextView2 - Lets Get Started'), 0)

Mobile.tap(findTestObject('Buildlaunch/android.widget.TextView2 - Lets Get Started'), 0)

Mobile.tap(findTestObject('Swipe/android.widget.LinearLayout4'), 0)

Mobile.setText(findTestObject('Buildlaunch/android.widget.EditText0 - Choose delivery location'), 'koramangala', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Swipe/android.widget.RelativeLayout4'), 0)

Mobile.waitForElementPresent(findTestObject('Login/android.widget.TextView1 - Chicken'), 5)

Mobile.tap(findTestObject('Login/android.widget.TextView1 - Chicken'), 1)

Mobile.tap(findTestObject('Login/android.widget.TextView13 - ADD TO CART'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView16 - Checkout'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText0'), findTestData('Credentials/Test Data').getValue(1, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login/android.widget.TextView2 - Proceed'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView4 - Password Login'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText1'), findTestData('Credentials/Test Data').getValue(2, 1), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login/android.widget.TextView6 - Login'), 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.ImageView2'), 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView11 - Proceed'), 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView28 - Place Order'), 0)

Mobile.scrollToText('Pay Online on Delivery', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView6 - Pay Online on Delivery'), 2)

not_run: Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.RelativeLayout20'), 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView28 - Place Order'), 0)

