package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Testcase4 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testCase4() throws Exception {
		selenium.open("http://www.ebay.com/");
		selenium.click("link=Collector & Hobbyist Toys");
		selenium.waitForPageToLoad("80000");
		selenium.click("link=Educational");
		selenium.waitForPageToLoad("80000");
		selenium.click("css=img.img");
		selenium.waitForPageToLoad("80000");
		selenium.click("id=isCartBtn_btn");
		selenium.waitForPageToLoad("80000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
