import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class takeScrenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		File s1= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		System.out.println(s1);
		String str=RandomString.make(2);
		File file= new File("D:\\Velocity\\Screenshot\\fblogin"+str+".jpg");
		FileHandler.copy(s1, file);
}
}
