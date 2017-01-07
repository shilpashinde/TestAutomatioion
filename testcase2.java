package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Testcase2 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testCase2() throws Exception {
		selenium.open("https://www.google.com/");
		selenium.type("id=gbqfq", "ebay");
		selenium.click("link=exact:eBay: Electronics, Cars, Fashion, Collectibles, Coupons and ...");
		selenium.waitForPageToLoad("80000");
		selenium.click("link=Collector & Hobbyist Toys");
		selenium.waitForPageToLoad("80000");
		selenium.click("link=Educational");
		selenium.waitForPageToLoad("80000");
		selenium.click("id=gh-btn");
		selenium.waitForPageToLoad("80000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
