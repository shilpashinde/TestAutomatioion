package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Testcase7 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testCase7() throws Exception {
		selenium.open("http://www.ebay.com/");
		selenium.click("link=Sign in");
		selenium.waitForPageToLoad("80000");
		selenium.type("id=userid", "silpa_01s@rediffmail.com");
		selenium.type("id=pass", "shilpa123");
		selenium.click("id=sgnBt");
		selenium.waitForPageToLoad("80000");
		selenium.click("link=Collector & Hobbyist Toys");
		selenium.waitForPageToLoad("80000");
		selenium.click("css=img[alt=\"LOT\"]");
		selenium.waitForPageToLoad("80000");
		selenium.click("css=img.img");
		selenium.waitForPageToLoad("80000");
		selenium.click("id=watchLink");
		selenium.click("link=Watch list");
		selenium.waitForPageToLoad("80000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
