package seleCucum;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StepDefinition {
    public static WebDriver driver;
    public static WebDriverWait wait;

    
    
    public void assembleLink(String requestLink) {
    	/**/
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yatzer\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(requestLink);
    }   
        
        
           public void clickOnButton(String products) {
            wait = new WebDriverWait(driver, 20);
            /**/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"))));
            driver.findElement(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a")).click();
            
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            /**/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[1]/section/div[3]/div/div/div/div[2]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a"))));
    		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[1]/section/div[3]/div/div/div/div[2]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a")).click();
    		
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
    		/*Seleccionar prestamo de auto*/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[2]/h2/a"))));
            driver.findElement(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[2]/h2/a")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            
            /*ingresar tasas y tarifas*/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("body.toolbar-closed:nth-child(2) div.wpthemeLayoutContainers.wpthemeLayoutContainersHidden:nth-child(2) div.wpthemeInner div.component-control.id-Z7_8252I1C0MO0OF0ABLVQR7TGHV7:nth-child(2) section.ibmPortalControl.wpthemeControl.wpthemeHidden.a11yRegionTarget:nth-child(2) div.wpthemeControlBody.wpthemeOverflowAuto.wpthemeClear div.container-fluid.none:nth-child(2) div.row div.col-xs-12 div.tabs-verticales.container-fluid.tabs-horizontal div.row ul.nav.nav-tabs.responsive.col-sm-3.hidden-xs.hidden-sm li.none:nth-child(4) > a:nth-child(1)"))));
            driver.findElement(By.cssSelector("body.toolbar-closed:nth-child(2) div.wpthemeLayoutContainers.wpthemeLayoutContainersHidden:nth-child(2) div.wpthemeInner div.component-control.id-Z7_8252I1C0MO0OF0ABLVQR7TGHV7:nth-child(2) section.ibmPortalControl.wpthemeControl.wpthemeHidden.a11yRegionTarget:nth-child(2) div.wpthemeControlBody.wpthemeOverflowAuto.wpthemeClear div.container-fluid.none:nth-child(2) div.row div.col-xs-12 div.tabs-verticales.container-fluid.tabs-horizontal div.row ul.nav.nav-tabs.responsive.col-sm-3.hidden-xs.hidden-sm li.none:nth-child(4) > a:nth-child(1)")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }
        public void searchInput(String validation) {
               
        	
                /*Seleccionar prestamo de auto*/
                
                
                
                
                 
                /**/
            
              
                
                
                
        }
     }



