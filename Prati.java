package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prati {
	
public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium Project2\\Driver\\chromedriver.exe");

WebDriver dr=new ChromeDriver();
dr.manage().window().maximize();

dr.get("https://tamil.pratilipi.com/");
JavascriptExecutor js = (JavascriptExecutor) dr;
js.executeScript("window.scrollBy(0,8600)","");
WebElement dn = dr.findElement(By.xpath("/html/body/div[1]/div/div/footer/div[1]/div/div[2]/div[2]/div/a[2]/span"));
dn.click();
Thread.sleep(3000);
WebElement page1 = dr.findElement(By.xpath("/html/body/div[1]/div/div/header[2]/div[5]/div[1]/h4"));
page1.click();
dr.close();
}
}
