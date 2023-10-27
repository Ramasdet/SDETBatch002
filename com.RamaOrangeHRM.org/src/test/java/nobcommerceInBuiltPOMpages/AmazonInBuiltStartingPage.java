package nobcommerceInBuiltPOMpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonInBuiltStartingPage {

	WebDriver driver;
	public AmazonInBuiltStartingPage(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver,this);
		
	}
	public void syncMethod() {
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	public void launchAmazonSite() {
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=5799318951149303442&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9181929&hvtargid=kwd-10573980&hydadcr=14453_2316415");	 
		
	}

}
