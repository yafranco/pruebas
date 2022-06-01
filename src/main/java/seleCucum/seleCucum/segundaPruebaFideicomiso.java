package seleCucum.seleCucum;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class segundaPruebaFideicomiso {

	
	public static void main(String[]args)
	{
		//Declaracion e instanciacion de objetos/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yafranco\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Lanzar la pagina Web
		driver.navigate().to("https://bgcpnortxap2a:8443/group/fideicomiso/crear-fideicomiso");
		
		
		//Maximizamos la pantalla
		driver.manage().window().maximize();
		
		//Clickear la barra de busqueda y enviar valores
		
	}
	
}
