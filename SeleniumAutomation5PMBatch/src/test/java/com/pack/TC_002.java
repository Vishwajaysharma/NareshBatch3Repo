package com.pack;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		Thread.sleep(10000);
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchbox_id","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}

	
}
