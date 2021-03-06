package com.sample.Basics;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invoke {
	
	@Test
	@Ignore
	public void invokeApp(){
		System.setProperty("webdriver.gecko.driver",String.format(System.getProperty("user.dir")+"%sDrivers%sgeckodriver",File.separatorChar,File.separatorChar));
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver wbDriver = new FirefoxDriver(capabilities);
		wbDriver.navigate().to("https://www.google.com");
		System.out.println(">>>>>>>>"+wbDriver.getCurrentUrl());
	}

}
