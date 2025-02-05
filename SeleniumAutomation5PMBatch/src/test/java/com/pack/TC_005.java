package com.pack;

import com.aventstack.extentreports.Status;

public class TC_005 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.createTest("TC_005");
		test.log(Status.INFO, "Init the properties files...");
		
		launch("chromebrowser");
		test.log(Status.INFO, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to url : " + childprop.getProperty("amazonurl"));
		
		Thread.sleep(10000);
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "selected the option from dropbox By using locator : " + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchbox_id","Harry Potter");
		test.log(Status.PASS, "Entered the text by using  locator : " + orprop.getProperty("amazonsearchbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.FAIL, "Clicked the Element by using locator : " +  orprop.getProperty("amazonsearchbutton_xpath"));
		
		report.flush();
	}
}
