package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Script\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table");
		java.util.List<WebElement> r = driver.findElements(By.tagName("tr"));
		int n=r.size();
		int m=n-2;
		for(int i=m;i<r.size();i++) {
		WebElement rr = r.get(i);
		java.util.List<WebElement> d = rr.findElements(By.tagName("td"));
		for(int j=0;j<d.size();j++) {
		WebElement dd = d.get(j);
		String text = dd.getText();
		System.out.println(text);

		}		
		
	}
	}
	}

