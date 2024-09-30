package examples;

import java.util.concurrent.TimeUnit;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String demoUrl = "https://globalsqa.com/";

		driver.get(demoUrl);

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

// MouseHover on to aparticular element (Move the mouse pointer on to an element)

		WebElement testHub = driver.findElement(By.xpath("//div[@id='menu']/ul/li[4]"));

		Actions action = new Actions(driver);	

		action.moveToElement(testHub).build().perform();

		

		Thread.sleep(2000);

		driver.findElement(By.linkText("Demo Testing Site")).click();

		Thread.sleep(2000);

// Scroll the Window		

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		

		driver.findElement(By.linkText("DatePicker")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("DatePicker")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("23")).click();

		Thread.sleep(2000);

	}


	}

}
