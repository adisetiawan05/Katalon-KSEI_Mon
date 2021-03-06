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

WebUI.openBrowser('')
def driver = DriverFactory.getWebDriver()
String baseUrl = "http://172.18.139.134/ksei_monitoring/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://172.18.139.134/ksei_monitoring/")
selenium.click("name=userid")
selenium.type("name=userid", "Admin2")
selenium.click("//div[2]/div/div")
selenium.click("name=password")
selenium.type("name=password", "Adminbr1")
selenium.click("//button[@type='submit']")
selenium.click("id=navbarDropdownMenuLink")
selenium.click("link=Update Password")
selenium.click("name=password_lama")
selenium.type("name=password_lama", "Adminbr1")
selenium.click("name=password_baru")
selenium.type("name=password_baru", "adminbri")
selenium.click("name=ulangi_password_baru")
selenium.type("name=ulangi_password_baru", "adminbri")
selenium.click("xpath=(//button[@type='submit'])[2]")
Thread.sleep(2000)
selenium.click("xpath=(//button[@type='button'])[4]")
selenium.click("id=navbarDropdownMenuLink")
selenium.click("link=Logout")
