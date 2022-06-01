package seleCucum;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;


	@CucumberOptions(features = "src/test/java/seleCucum",
	        tags = "(@wip)",
	        glue = "steps",
	        plugin = {"summary", "pretty"},
	        snippets = CucumberOptions.SnippetType.CAMELCASE)
	
	public class runCucumberSeleniumTest extends AbstractTestNGCucumberTests {

	    @AfterMethod
	    public void closeAll() {
	        try {
	            ChromeDriver chromeDriver = new ChromeDriver();
				chromeDriver.close();
	            System.out.println("Se cerro correctamente el explorador ");
	        } catch (Exception e) {
	            System.out.println("No se pudo cerrar chrome " + e.getMessage());
	            throw new IllegalStateException(e);
	        }
	    }
	}
