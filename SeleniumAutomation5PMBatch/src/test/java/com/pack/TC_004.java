package com.pack;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_004.class.getName());

	public static void main(String[] args) throws Exception 
	{
		
		init();
		log.info("Init the properties files...");
		
		launch("chromebrowser");
		log.info("Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " + childprop.getProperty("amazonurl"));
		
		Thread.sleep(10000);
		
		selectOption("amazondropbox_id","Books");
		log.info("selected the option from dropbox By using locator : " + orprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchbox_id","Harry Potter");
		log.info("Entered the text by using  locator : " + orprop.getProperty("amazonsearchbox_id") );
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked the Element by using locator : " +  orprop.getProperty("amazonsearchbutton_xpath"));
		
	}
}
