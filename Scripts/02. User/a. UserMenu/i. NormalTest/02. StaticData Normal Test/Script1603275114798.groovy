import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Thread.sleep(5000)

WebUI.click(findTestObject('Page_KSEI Monitoring/3. Static Data/a_RDN Monitoring'))

WebUI.click(findTestObject('Page_KSEI Monitoring/3. Static Data/a_Static Data'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Page_KSEI Monitoring/3. Static Data/select_Semua Tahun 20202019201820172016'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Page_KSEI Monitoring/3. Static Data/select_All Status Open Close'), 'O', true)

WebUI.selectOptionByValue(findTestObject('Page_KSEI Monitoring/3. Static Data/select_All Status KSEI Valid KSEI Invalid KSEI'), 
    'Y', true)

WebUI.click(findTestObject('Page_KSEI Monitoring/3. Static Data/button_Search'))

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.click(findTestObject('Page_KSEI Monitoring/3. Static Data/a_Excel'))



