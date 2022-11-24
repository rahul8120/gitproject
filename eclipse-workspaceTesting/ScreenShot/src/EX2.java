import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		
		
	File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Screenshot captured");
		
		File src= new File("D:\\Velocity\\Screenshot\\facebook.jpeg");
		FileHandler.copy(file, src);

	}
}
