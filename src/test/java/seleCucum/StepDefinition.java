package seleCucum;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StepDefinition {
    public static WebDriver driver;
    public static WebDriverWait wait;

    
    
    public void assembleLink(String requestLink) {
    	/*busqueda del driver para el navegador*/
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yatzer\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(requestLink);
    }   
        
        
           public void clickOnButton(String products) {
            wait = new WebDriverWait(driver, 30);
            /*click en el primer curso a comprar*/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/ul[1]/li[1]/a[2]"))));
            driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/ul[1]/li[1]/a[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            /*click para agregar el segundo curso a comprar */
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]"))));
    		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
    		
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
    		/*Ir a la sección de carrito de compras*/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a"))));
            driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            
            /*eliminar un curso del carrito*/
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("body.page-template-default.page.page-id-34.woocommerce-cart.woocommerce-page.template-themify-ultra.template-themify-ultra-1-5-0.skin-default.webkit.not-ie.default_width.sidebar-none.no-home.no-touch.header-top-bar.fixed-header.footer-block.default.tagline-off.rss-off.filter-hover-none.filter-featured-only.masonry-enabled.sidemenu-active.builder-parallax-scrolling-active.animation-on.page-loaded.themify_lightbox_loaded:nth-child(2) div.hfeed.site:nth-child(1) div.clearfix:nth-child(2) div.pagewidth.clearfix div.clearfix div.type-page div.page-content.entry-content div.woocommerce table.shop_table.shop_table_responsive.cart tbody:nth-child(2) tr.cart_item:nth-child(1) td.product-remove > a.remove"))));
            driver.findElement(By.cssSelector("body.page-template-default.page.page-id-34.woocommerce-cart.woocommerce-page.template-themify-ultra.template-themify-ultra-1-5-0.skin-default.webkit.not-ie.default_width.sidebar-none.no-home.no-touch.header-top-bar.fixed-header.footer-block.default.tagline-off.rss-off.filter-hover-none.filter-featured-only.masonry-enabled.sidemenu-active.builder-parallax-scrolling-active.animation-on.page-loaded.themify_lightbox_loaded:nth-child(2) div.hfeed.site:nth-child(1) div.clearfix:nth-child(2) div.pagewidth.clearfix div.clearfix div.type-page div.page-content.entry-content div.woocommerce table.shop_table.shop_table_responsive.cart tbody:nth-child(2) tr.cart_item:nth-child(1) td.product-remove > a.remove")).click();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            
     }
        public static void validaciones (String validation)  {
            
            /*Validacion que el precio es menor de 400*/
        	driver.navigate().refresh();

            String montoObtenido = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span")).getText();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            
           
            /*Validacion del monto que es inferior a 400*/
            System.out.println("el total es de: " + montoObtenido);
        }
     }



