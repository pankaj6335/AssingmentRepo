package testdemo.a;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Assingmenttoretriewflipkartlinks {

	@Test
	public void retrieveAllLinks() {

		RemoteWebDriver driver = new ChromeDriver();// by for each loop
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (WebElement link : alllinks) {

			System.out.println(link.getText() + " " + link.getAttribute("href"));
		}

	}

	@Test
	public void retrieveLinksByLamdaExpression() {

		RemoteWebDriver driver = new ChromeDriver();// by lamdaExpression
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.forEach(ele -> System.out.println(ele.getText()));

	}

	public void retriveLinksByStream() {

		RemoteWebDriver driver = new ChromeDriver();// by stream
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		List<String> collectlist = elements.stream().filter(ele -> !ele.getText().equals("")).map(ele -> ele.getText())
				.collect(Collectors.toList());
		collectlist.forEach(ele -> System.out.println(ele));

	}

	@Test
	public void retriewLinksByParallelStream() {
		RemoteWebDriver driver = new ChromeDriver();// by parallelstream
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.parallelStream().forEach(ele -> System.out.println(ele));

	}

}
