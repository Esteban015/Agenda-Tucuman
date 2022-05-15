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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://agenda.eltucumano.com/')

WebUI.click(findTestObject('Object Repository/Page_Agenda el tucumano  Eventos Tucumn - A_a4b9e3/a_HOY'))

WebUI.verifyElementAttributeValue(findTestObject('Page_Hoy - Tucumn - Agenda el tucumano/h1_Hoy'), 'id', 'section-title title titulo-tucu section-tag', 
    20)

WebUI.verifyElementText(findTestObject('Page_Hoy - Tucumn - Agenda el tucumano/h1_Hoy'), 'hoy')

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

WebUI.delay(2)

WebUI.closeBrowser()

