package seleCucum.seleCucum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class primeraPruebaFideicomiso {

	public static void main(String[]args)
	{
		//Declaracion e instanciacion de objetos/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yafranco\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Lanzar la pagina Web
		driver.navigate().to("https://bgcpnortxap2a:8443/web/guest/home");
		
		
		//Maximizamos la pantalla
		driver.manage().window().maximize();
		
		//Clickear la barra de busqueda y enviar valores
		driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")).sendKeys("yafranco");
		
		
		driver.findElement(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")).sendKeys("Sucursal05*");
		
		//Clickear en ingresar
		driver.findElement(By.xpath("//span[contains(text(),'Ingresar')]")).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Seleccionar oficina y rol
		driver.findElement(By.xpath("//body/div[@id='login-custom']/section[@id='login-desktop']/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/select[1]/option[1]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'CONSUMO - SUBGER OFICIAL ASIST Y OFICINIST')]")).click();
		
		
		driver.findElement(By.xpath("//select[@id='_com_bgp_norte_user_office_portlet_UserOfficePortlet_INSTANCE_OUvXGireEqlP_cobisUserOffice']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'CASA MATRIZ')]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Clickear aceptar
		driver.findElement(By.xpath("//button[contains(text(),'Aceptar')]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"Módulos\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Módulos-menu\"]/ul/div/div[5]/li")).click();
		driver.findElement(By.xpath("//a[contains(text(),'FIDEICOMISO')]")).click();
		
		
		driver.findElement(By.cssSelector("//body/div[@id='bgp-norte-theme-container']/div[@id='page-wrapper']/ul[1]/li[1]/a[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body.controls-visible.yui3-skin-sam.signed-in.private-page.site.bgp-norte-theme-body.bgp-norte-theme.ng-scope:nth-child(2) div.bgp-norte-theme-container.ng-scope:nth-child(1) div.bgp-content.top-space:nth-child(3) ul.bgp-menubar.hidden-print li.col-sm-2.phn.dropdown.active ul.bgp-menubar__dropdown li.active > a:nth-child(1)")).click();
		
		
		
		
		driver.findElement(By.cssSelector("body.controls-visible.yui3-skin-sam.signed-in.private-page.site.bgp-norte-theme-body:nth-child(2) div.container-fluid:nth-child(4) div.bgp-content.top-space section.bgp-content section.portlet div.portlet-content div.columns-1 div.portlet-layout.row div.col-md-12.portlet-column.portlet-column-only div.portlet-dropzone.portlet-column-content.portlet-column-content-only div.portlet-boundary.portlet-boundary_com_cobiscorp_cobis_escrow_portlet_EscrowPortlet_.portlet-static.portlet-static-end.portlet-decorate:nth-child(2) section.portlet:nth-child(2) div.portlet-content div.portlet-content-container div.portlet-body div.ng-scope:nth-child(3) div.ng-scope:nth-child(2) div.cb-view.ng-scope div.cb-view-container-root.cb-view-container.cb-group-layout.ng-scope.container div.cb-group.cb-group-tabbed-h:nth-child(3) div.k-tabstrip-wrapper div.k-widget.k-header.k-tabstrip div.k-content.k-state-active:nth-child(2) div.cb-group.cb-group-layout div.cb-group.cb-group-simple:nth-child(2) div.form-vertical div.row div.col-xs-4:nth-child(1) div.form-group.cb-required div.cb-control span.k-widget.k-combobox.k-header.ng-valid-parse.ng-not-empty.ng-dirty.ng-valid.ng-valid-required.ng-touched span.k-dropdown-wrap.k-state-default.k-state-focused > input.k-input.ng-valid-parse.ng-not-empty.ng-dirty.ng-valid.ng-valid-required.ng-touched")).click();
		
		
	
		
		
     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	
		
		
		
		//cerrar chrome
		//driver.quit();
		
	}
	
}
