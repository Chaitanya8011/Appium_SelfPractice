package MilestoneAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SelfTrialApp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Xiaomi M2006C3LII");
		caps.setCapability("appPackage","com.example.appiuselfproject");
		caps.setCapability("appActivity","com.example.appiuselfproject.LoginActivity");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        AppiumDriver driver =  new AndroidDriver(new URL("http://127.0.0.1:4723"),caps);
       WebElement any  =  driver.findElement(By.id("TextView"));//TextView
       WebElement user  =  driver.findElement(By.id("username"));
       WebElement pass  =  driver.findElement(By.id("password_"));
       WebElement Loginbtn = driver.findElement(By.id("Loginbtn"));
       //btnskip

    		   if(Loginbtn.isDisplayed())
    		   {
    			   System.out.println("page login is found"); 
    		   }
    		   else
    		   {
    			   System.out.println("page login is not found");
    		   }
    		   if(user.isDisplayed() && pass.isDisplayed())
    		   {
    			   System.out.println("both user and paswword elements are visible");
    		   }else
    		   {
    			   System.out.println("both user and paswword elements are not visible");
    		   }
    		   user.sendKeys("cmg");
    		   pass.sendKeys("123");
    		   Loginbtn.click();
			   System.out.println("wait for 3 sec");
		      WebElement list =  driver.findElement(By.id("ListViews"));
			  System.out.println("list is find out");
			  

    		   WebElement btnskip = driver.findElement(By.id("btnskip"));
    		   if(btnskip.isDisplayed())
    		   {
    			   System.out.println("move to second screen");
    			   System.out.println("second screen is visible");

    		   }
    		   btnskip.click();
			   Thread.sleep(2200);

    		   System.out.println("click on skip button transiomn to last page");
    		   WebElement Textlast = driver.findElement(By.id("lastTextView"));
    		   if(Textlast.isDisplayed())
    		   {
    			   System.out.println("this is last page found");
    		   }
    		   else
    		   {
    			   System.out.println("last page is not found");
    		   }
    		   

	}
	

}
