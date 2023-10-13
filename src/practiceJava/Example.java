package practiceJava;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) throws InterruptedException, IOException {

//		ChromeOptions options = new ChromeOptions();

		// Add a cookie to indicate that the signup dialog should be closed
//	        Cookie closeDialogCookie = new Cookie("signup_closed", "true");

		String baseURL = System.getProperty("user.dir");
		System.out.println(baseURL);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", baseURL);
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://tools.pdf24.org/en/pdf-converter");
//		driver.manage().addCookie(closeDialogCookie);
		driver.findElement(By.cssSelector("a[class*=\"toolLink convertToPdf\"]")).click();
		driver.findElement(By.cssSelector("div[class*=\"chooseFile\"] span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime()
				.exec("C:\\Users\\NAGOOR BABU\\OneDrive\\Desktop\\Practice\\Installers\\AutoItPractice\\Script1.exe");
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class=\"btn action\"]")));
		driver.findElement(By.cssSelector("a[class=\"btn action\"]")).click();
		Thread.sleep(10000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("jobMonitor")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='downloadTool']")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("downloadTool")));
//		driver.findElement(By.xpath("//div/a[contains(@class,\"downloadTool\")]")).click();

		WebElement frame = driver.findElement(By.className("workerFrame"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/a[1]/i[1]")).click();

		Thread.sleep(5000);
		File f = new File(baseURL);
		if (f.exists()) {
			System.out.println("File Found");
		} else {
			
		}
//
		driver.switchTo().defaultContent();
//		driver.close();
//		driver.quit();
//		driver.close();
//		driver.quit();
//		driver.close();
//		driver.quit();
//		driver.close();
//		driver.quit();
	}
}
