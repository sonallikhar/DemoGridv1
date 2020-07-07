package demo.test.grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumCode {
@Parameters("browserType")
	@Test
	public void mailTest(String browserType) throws MalformedURLException, InterruptedException{
        DesiredCapabilities dr=null;
        if(browserType.equals("chrome")){
        dr=DesiredCapabilities.chrome();
        dr.setBrowserName("chrome");
        dr.setPlatform(Platform.WINDOWS);
        }else 
        {
        	dr=DesiredCapabilities.firefox();
            dr.setBrowserName("firefox");
            dr.setPlatform(Platform.WINDOWS);	
        }
             
        RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
        driver.navigate().to("http://gmail.com");
        /*driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
        driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");*/
        Thread.sleep(3000);
        driver.close();
	}
}
