import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Muthulakshmi Mamundi
 * Date January 27, 2020
 * File Name: HelloLexisNexis.java
 * Description: This is to perform a Google search "LexisNexis" in a Chrome browser and then click on the third link and print the page title.
 *
 */

public class HelloLexisNexis {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		/*
		File file = new File("C:\\Users\\Lakse\\eclipse-workspace\\HelloLexisNexis\\lib\\chromedriver_win32.zip");
		System.out.println(file.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    */

		File file = new File("./lib/chromedriver.exe");
		System.out.println(file.getAbsolutePath());

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakse\\eclipse-workspace\\HelloLexisNexis\\lib");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver objDriver = new ChromeDriver();
		
		objDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		objDriver.get("http://www.google.com/");
		
		System.out.println(objDriver.getTitle());
		
		WebElement objElement = objDriver.findElement(By.name("q"));
		objElement.sendKeys("LexisNexis");
		objElement.submit();
		
	    //Wait until the google page shows the result
	    //WebElement myDynamicElement = (new WebDriverWait(objDriver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

	    //List<WebElement> findElements = objDriver.findElements(By.xpath("//*[@id='gsr']")); 

	    //Get the url of third link and navigate to it
	    //String third_link = findElements.get(2).getAttribute("href");
	    //objDriver.navigate().to(third_link);
	    //System.out.println(objDriver.getTitle());
   
	    objDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
	    //objDriver.findElement(By.className("LC20lb")).click();
	    objDriver.findElement(By.xpath("//*[@id='rso']/div[3]/div/div[2]/div/div/div[1]/a/h3")).click();
	    System.out.println(objDriver.getTitle());

	}

}
