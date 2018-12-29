package com.sample.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Invoke {
	
	@Test
	public void invokeApp(){
		System.setProperty("webdriver.gecko.driver", "E:\\Devops27\\Basics\\Drivers\\geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver wbDriver = new FirefoxDriver(capabilities);
	}

}
