import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.interactions.SendKeysAction as SendKeysAction
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

//selenium.open("http://s72.18.139.134/ksei_monitoring/dashboard")
//WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://172.18.139.134/ksei_monitoring'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

//selenium.open("http://172.18.139.134/ksei_monitoring/dashboard/users")
//TestData value = findTestData('UserList')
//def rowNumTotal = TestDataFactory.findTestData('UserList').getRowNumbers()
//for (int rowNum = 1; rowNum <= rowNumTotal; rowNum++) {
WebUI.click(findTestObject('Object Repository/Test/Page_KSEI Monitoring/a_Manajemen User'))

WebUI.takeScreenshot()

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Test/Page_KSEI Monitoring/a_Create User'))

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_User ID_userid'), UserId)

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_PN_pn'), PN)

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_Unit Kerja_unit_kerja'), UnitKerja)

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_Nama Lengkap_nama_lengkap'), NamaLengkap)

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_Jabatan_jabatan'), Jabatan)

//String level = findTestData('ExistingUserList').
if (Level == '1') {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Test/Page_KSEI Monitoring/select_Pilih Sys AdminOperatorOperator Kant_175e5e'), 
        '1', true)
}

if (Level == '2') {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Test/Page_KSEI Monitoring/select_Pilih Sys AdminOperatorOperator Kant_175e5e'), 
        '2', true)
}

if (Level == '3') {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Test/Page_KSEI Monitoring/select_Pilih Sys AdminOperatorOperator Kant_175e5e'), 
        '3', true)
}

if (Level == '4') {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Test/Page_KSEI Monitoring/select_Pilih Sys AdminOperatorOperator Kant_175e5e'), 
        '4', true)
}

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_Telepon_telepon'), Telepon)

WebUI.setText(findTestObject('Object Repository/Test/Page_KSEI Monitoring/input_Email_email'), Email)

WebUI.click(findTestObject('Test/Page_KSEI Monitoring/button_Simpan'))

Thread.sleep(1000)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Test/Page_KSEI Monitoring/Page_KSEI Monitoring/button_Reset'))

selenium.click('xpath=(//button[@type=\'button\'])[2]')