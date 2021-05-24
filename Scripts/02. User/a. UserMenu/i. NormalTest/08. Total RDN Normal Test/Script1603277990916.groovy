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

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

Thread.sleep(5000)
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
//selenium.open("http://172.18.139.134/ksei_monitoring/dashboard/report_perusahaan")
selenium.click("link=Report")
WebUI.takeScreenshot()
Thread.sleep(2000)

selenium.click("link=Perusahaan Efek")
WebUI.takeScreenshot()
Thread.sleep(2000)

selenium.click("id=type_ksei")
selenium.select("id=type_ksei", "label=Total RDN")
selenium.click("//option[@value='Total RDN']")
WebUI.takeScreenshot()
Thread.sleep(2000)

selenium.click("id=tgl_akhir")
selenium.type("id=tgl_akhir", "2020-10-13")
WebUI.takeScreenshot()
Thread.sleep(2000)

selenium.click("name=pt")
selenium.select("name=pt", "label=[DX001] PT. Bahana Sekuritas")
selenium.click("//option[@value='DX001']")
WebUI.takeScreenshot()
Thread.sleep(2000)

selenium.click("//button[@type='submit']")
WebUI.takeScreenshot()
Thread.sleep(2000)

selenium.click("link=Excel")
