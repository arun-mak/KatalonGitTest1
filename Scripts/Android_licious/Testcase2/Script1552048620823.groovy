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

Mobile.waitForElementPresent(findTestObject('second_payment/android.widget.TextView3 - Red Meat'), 5)

Mobile.tap(findTestObject('second_payment/android.widget.TextView3 - Red Meat'), 0)

not_run: Mobile.scrollToText('Goat Mince/Keema', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('second_payment/android.widget.TextView5 - Goat MinceKeema'), 1)

Mobile.tap(findTestObject('second_payment/android.widget.TextView14 - ADD TO CART'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView16 - Checkout'), 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView11 - Proceed'), 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView28 - Place Order'), 0)

not_run: Mobile.scrollToText('Credit Debit cards', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.RelativeLayout15'), 2)

Mobile.tap(findTestObject('second_payment/android.widget.EditText0'), 2)

Mobile.setText(findTestObject('second_payment/android.widget.EditText0'), '4111111111111111', 0)

Mobile.tap(findTestObject('second_payment/TextInputLayout1 - Name on card'), 0)

WebUI.setText(findTestObject('second_payment/TextInputLayout1 - Name on card'), 'tester')

Mobile.tap(findTestObject('second_payment/android.widget.EditText2'), 0)

Mobile.setText(findTestObject('second_payment/android.widget.EditText2'), '12', 0)

Mobile.tap(findTestObject('second_payment/android.widget.EditText3'), 0)

Mobile.setText(findTestObject('second_payment/android.widget.EditText3'), '22', 0)

Mobile.tap(findTestObject('second_payment/android.widget.EditText4'), 0)

Mobile.setText(findTestObject('second_payment/android.widget.EditText4'), '123', 0)

Mobile.tap(findTestObject('Fromcart_afterlogin/android.widget.TextView28 - Place Order'), 0)

