/**
 * 
 */
package fi.csc.avaa.tupa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import fi.csc.avaa.test.selenium.SeleniumJUnitTest;

/**
 * @author jmlehtin
 *
 */
@Ignore
public class InfraViewTest extends SeleniumJUnitTest {

	@Before
	public void goToLandingPage() {
		driver.navigate().to("https://infrat-test.avointiede.fi/");
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
	}
	
	@Test
	public void shouldShowEmptyResultWhenNoMatch() {
		sendKeysToSearchField("foobar");
		assertEquals("Should not find any infra results", translator.localize("Search.FoundAmount") + ": 0", getElemText(getFoundAmountLocator()));
	}
	
	@Test
	public void shouldListAllInfras() {
		assertTrue("Should find more than 0 infra results", getElemText(getFoundAmountLocator()).matches(translator.localize("Search.FoundAmount") + ": " + "[^0]+"));
	}
	
	@Test
	public void shouldListSpecificInfras() {
		sendKeysToSearchField("ess");
		assertEquals("Should find 30 infra results", translator.localize("Search.FoundAmount") + ": 30", getElemText(getFoundAmountLocator()));
	}
	
	@Test
	public void shouldCollapseAndExpandFiltersCorrectly() {
		clickWebElement(driver.findElementById("CollapseButton"), 1);
		By intSwitchLocator = By.id("InternationalSwitch");
		assertTrue("Clicking collapse button should result in exposing international switch", isElementPresent(intSwitchLocator));
		clickWebElement(driver.findElementById("CollapseButton"), 1);
		assertTrue("Clicking collapse button should result in exposing international switch", !isElementPresent(intSwitchLocator));
	}

	@Test
	public void shouldChangeFoundAmountWhenUsingSwitch() {
		clickWebElement(driver.findElementById("CollapseButton"), 2);
		By intSwitchLocator = By.id("InternationalSwitch");
		clickWebElement(fluentWait(intSwitchLocator), 5);
		String firstAmtText = getElemText(getFoundAmountLocator());
		assertTrue("Turning international switch on should not result in 0 infra results", firstAmtText.matches(translator.localize("Search.FoundAmount") + ": " + "[^0]+"));
		clickWebElement(fluentWait(intSwitchLocator), 3);
		String secondAmtText = getElemText(getFoundAmountLocator());
		assertTrue("Turning international switch off should not result in 0 infra results", secondAmtText.matches(translator.localize("Search.FoundAmount") + ": " + "[^0]+"));
		assertTrue("Turning international switch on should result in different amount of infra results than when the switch is turned off", !firstAmtText.equals(secondAmtText));
	}
	
	@Test
	public void shouldOpenDetailsWindowWhenClickingResultGridRow() {
		By firstGridRowLocator = getFirstGridRowLocator();
		WebElement firstRow = fluentWait(firstGridRowLocator);
		assertTrue("Grid first row should be present", isElementPresent(firstGridRowLocator));
		clickWebElement(firstRow, 1);
		WebElement window = driver.findElementByCssSelector(".infra-details");
		assertTrue("When clicking grid row a window appears", window.isDisplayed());
	}
	
	private By getFoundAmountLocator() {
		return By.id("FoundAmount");
	}
	
	private By getFirstGridRowLocator() {
		return By.xpath("//div[3]/table/tbody/tr/td[2]");
	}
	
	private void sendKeysToSearchField(String keys) {
		WebElement searchField = fluentWait(By.id("Search.Infra.SearchField"));
		searchField.sendKeys(keys);
		sleepSeconds(1);
	}

}
