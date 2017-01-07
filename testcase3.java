package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Testcase3 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testCase3() throws Exception {
		selenium.open("https://www.google.com/");
		selenium.type("id=gbqfq", "ebay.com");
		selenium.click("link=exact:eBay: Electronics, Cars, Fashion, Collectibles, Coupons and ...");
		selenium.waitForPageToLoad("80000");
		selenium.click("link=Collector & Hobbyist Toys");
		selenium.waitForPageToLoad("80000");
		selenium.click("link=Educational");
		selenium.waitForPageToLoad("80000");
		selenium.click("id=zip_codeFld");
		selenium.type("id=zip_codeFld", "95045");
		selenium.click("id=zip_e1-95");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
