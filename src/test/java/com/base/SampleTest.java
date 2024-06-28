package com.base;



	import io.appium.java_client.android.AndroidElement;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class SampleTest extends Baseclass {

	    @Test
	    public void sampleTest() {
	        AndroidElement el = (AndroidElement) driver.findElementById("com.example.android:id/button"); // Change to your element's ID
	        el.click();

	        AndroidElement resultEl = (AndroidElement) driver.findElementById("com.example.android:id/result"); // Change to your element's ID
	        String resultText = resultEl.getText();
	        
	        Assert.assertEquals(resultText, "Expected Result", "The result text is not as expected!");
	    }
	}


