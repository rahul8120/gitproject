import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class takeScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=flipkart&rlz=1C1CHBF_enIN979IN979&oq=fli&aqs=chrome.0.35i39j69i57j0i67i131i433j0i67i433j0i67j46i67i199i465j0i131i433i512j0i67i433j0i67i131i433l2.1720j0j15&sourceid=chrome&ie=UTF-8");
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println(src);
      String random = RandomString.make(5);
      File dest= new File("D:\\Velocity\\Screenshot\\today"+random+".jpg");
      FileHandler.copy(src, dest);
      
      
      
	}
}
