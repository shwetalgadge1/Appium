package com.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Baseclass {

    protected AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10S");
        caps.setCapability(MobileCapabilityType.UDID, "TCG6XCUG95X8DI7H");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13 TP1A.220624.014");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<>(url, caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest() {
        System.out.println("I am inside sample test");
        driver.get("http://www.google.com");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
