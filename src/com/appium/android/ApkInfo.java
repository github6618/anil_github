package com.appium.android;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class ApkInfo {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("VERSION", "9"); 
			capabilities.setCapability("deviceName","5faf48d6");
			capabilities.setCapability("platformName","Android");
		    capabilities.setCapability("appPackage", "com.wt.apkinfo");
		// This package name of your app (you can get it from apk info app)
			capabilities.setCapability("appActivity","com.wt.apkinfo.activity.StartActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
			
			//capabilities.setCapability("noReset", "true");
		 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  
  }
  
  @Test
  public void f() 
  {
	  System.out.println(" is launched");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
