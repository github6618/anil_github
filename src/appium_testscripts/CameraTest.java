package appium_testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CameraTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OpenCamera();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

public static void OpenCamera () throws Exception {	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "realme 3 Pro");
	capabilities.setCapability("udid", "5faf48d6");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("plateformVersion", "9");
    capabilities.setCapability("appPackage", "com.oppo.camera");
// This package name of your app (you can get it from apk info app)
	capabilities.setCapability("appActivity","com.oppo.camera.Camera"); // This is Launcher activity of your app (you can get it from apk info app)
	//capabilities.setCapability("appActivity","com.andriod.calculator2.PortraitCalculator");
	//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
  // driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	driver=new AppiumDriver<MobileElement>(url,capabilities);
	
	System.out.println("Application started");
}
}