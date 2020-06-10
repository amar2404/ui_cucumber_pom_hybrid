package page;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.UserActions;

public class SearchPage extends UserActions {
	
	static String txtSearch = "#global-search";
	static String btnSearch = ".gicon-magnifier";
	static String lblPrice_xpath = "//*[@id=\"shelf-sort\"]/ul/li[4]/a";
//	static String priceArticle_xpath = "xp";
//			
//			
//		String a= "/html/body/div[1]/div[2]/div[1]/div[4]/section[3]/div[3]/div/article[";
//					int i=1;
//					String b= "]/div/a/div[4]/span/div[2]/div[1]";
//	xp=a+i+b;

	//div div[id='gf-BIG']
	////
	//div[id='shelf-sort'] div ul li[4]
	
//	String a= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/section[3]/div[3]/div/article[1]/div/a/div[4]/span/div[2]/div[1]")).getText();

	
	public static void search(WebDriver driver, String search) throws InterruptedException
	{	
		base.UserActions.enter(driver, txtSearch, search);
	
		base.UserActions.scrollDown(driver);

		Thread.sleep(5000);
		base.UserActions.click(driver, btnSearch);
	}
	
	public static void displayProductPrice(WebDriver driver) throws InterruptedException
	{	
		base.UserActions.scrollDown(driver);
      	Thread.sleep(5000);
		base.UserActions.verifyElementPresent(driver, lblPrice_xpath);
		
		
}
	public static void sortPrice(WebDriver driver) throws InterruptedException
	{	
		base.UserActions.scrollDown(driver);
      	Thread.sleep(5000);
		base.UserActions.click_xpath(driver, lblPrice_xpath);
		
		
}
	
	public static void validatePriceSorting(WebDriver driver) throws InterruptedException
	{	
		String count = driver.findElement(By.cssSelector(".last-rec-num")).getText();
		
		int count_items = Integer.parseInt(count);
		
//		 ArrayList<String> list=new ArrayList<String>();
//			String a= "/html/body/div[1]/div[2]/div[1]/div[4]/section[3]/div[3]/div/article[";
//			String b= "]/div/a/div[4]/span/div[2]/div[1]";
//		 
//		 for(int i =1;i<=3;i++)
//		 {
//			 String c = a + i + b;
//			 System.out.println(c + "\n");
//			 if (driver.findElement(By.xpath(c)).getText().contains("¢"))
//			 {
//				 String str = driver.findElement(By.xpath(c)).getText();
//				 String result = str.substring(0, str.length() - 1);
//				 list.add(result);
//				 System.out.println(list + "\n");
//			 }
//			 else
//			 {
//				 list.add(driver.findElement(By.xpath(c)).getText());
//				 System.out.println(list);
//			 }
//		 }
//		 
//		 System.out.println(list);
		
		String a = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[4]/section[3]/div[3]/div/article[1]/div/a/div[4]/span/div[2]/div[1]")).getText();
		String b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[4]/section[3]/div[3]/div/article[2]/div/a/div[4]/span/div[2]/div[1]")).getText();
		System.out.println("--------" + a);
		System.out.println("------" + b);
}
	
	
}