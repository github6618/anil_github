package com.appium.android;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class Erail {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("VERSION", "9"); 
			capabilities.setCapability("deviceName","5faf48d6");
			capabilities.setCapability("platformName","Android");
		    capabilities.setCapability("appPackage", "in.erail.m");
		// This package name of your app (you can get it from apk info app)
			capabilities.setCapability("appActivity","in.erail.m.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
		 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  
  }
  
  @Test
  public void f() 
  {
	  System.out.println("Erail app is launched");
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.ListView[1]/android.view.View[1]/android.view.View")).click();
      driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText\n")).sendKeys("20801");
      driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
      
  }

  @AfterMethod
  public void afterMethod() {
  }

}
