package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver; // null driver

    //1 webdriver
public static WebDriver getBrowser(String browserName) {
if (browserName.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\DELL\\eclipse-workspace\\Maven_Demo\\chrome\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
}

else if (browserName.equalsIgnoreCase("firefox")) {
System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Driver\\geckodriver.exe");
driver = new FirefoxDriver();
}

else if (browserName.equalsIgnoreCase("edge")) {
System.setProperty("webdriver.edge.driver",
		"C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
driver = new EdgeDriver();
}

//2 driver
driver.manage().window().maximize();
return driver;
}

//3 url
public static void getUrl(String url) {
driver.get(url);
}

//4 close
public static WebDriver close() {
driver.close();
}

//5 quit
public static void quit() {
driver.quit();
}

//6 Title
public static void getTitle() { 
String title= driver.getTitle();
System.out.println(title);
}

//7 CurrentUrl
public static void getCurrentUrl() {
String currenturl=driver.getCurrentUrl();
System.out.println(currenturl);
}

//8 navigation methods 
public static void navigateTo(String Url) {
driver.navigate().to(Url);
}

//9 back
public static void back() {
driver.navigate().back();
}

//10 forward
public static void forward() {
driver.navigate().forward();
}

//11 refresh
public static void refresh() {
driver.navigate().refresh();
}

//12 
public static void sendkeys(WebElement element,String value) {
element.sendKeys(value);
}

//13 click
public static void click(WebElement element) {
element.click();
}

//14 clear
public static void clear(WebElement element) {
element.clear();
}

//15 isdisplay-check an element visible in page 
public static void isDisplayed(WebElement element) {
boolean displayed  = element.isDisplayed();
System.out.println(displayed);
}

//16 isEnable
public static void isEnabled(WebElement element) {
System.out.println(element.isEnabled());
}

//17 isSelected
public static void isSelected(WebElement element) {
System.out.println(element.isSelected());
}

//18 gettext
public static void getText(WebElement element) {
String text=element.getText();
System.out.println(text);
}

//19 attribute value--text 
public static void getAttribute(WebElement element) {
String attribute= element.getAttribute("value");
System.out.println(attribute);
}

//20 attribute name 
public static void getAttributeName(WebElement element) {
String attribute= element.getAttribute("name");
System.out.println(attribute);}

//21alert
public static void alertHandle(String options) {
Alert alert= driver.switchTo().alert();

if(options.equalsIgnoreCase("ok"));{
alert.accept();
}

else if(options.equalsIgnoreCase("cancel")){
alert.dismiss();
}

else if(options.equalsIgnoreCase("getText")){
String text=alert.getText();
System.out.println(text);
}

//dropdown 22
public static void singleDropdown (WebElement element, String options) {
Select s = new Select(element);
String input;
if (options.equalsIgnoreCase("value")) {
	s.selectByValue(input);
	
}
else if (options.equalsIgnoreCase("text")) {
	s.selectByVisibleText(input);
	
}
else if (options.equalsIgnoreCase("index")) {
	//parseInt
	int parseInt = Integer.parseInt(input);
	s.selectByIndex(parseInt);
}
	
}

//23 Actions-- mouse 
//clickl,double clk,movetoelement,drag n drop,clknhold

public static void actions(WebElement element,String options) {
Actions act= new Actions(driver);
if(options.equalsIgnoreCase("click")) {
	act.click(element).build().perform();
}
else if (options.equalsIgnoreCase("right click")) {
	
act.contextClick(element).build().perform();
}

else if(options.equalsIgnoreCase("move")) {
	act.doubleClick(element).build().perform();}
}
//24 dragdrop 
public static void dragndrop(WebElement src,WebElement trg) {
Actions act= new Actions(driver);
act.dragAndDrop(src, trg).build().perform();
}

//25 robot 
public static void  robot(String options)throws AWTException{
Robot r = new Robot();
if(options.equalsIgnoreCase("down")) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}

else if (options.equalsIgnoreCase("up")) {
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
}

else if (options.equalsIgnoreCase("enter")) {
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}

else if (options.equalsIgnoreCase("left")) {
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
}

else if (options.equalsIgnoreCase("right")) {
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyRelease(KeyEvent.VK_RIGHT);
}

//26 scroll pages 
public static void scrollpages(WebElement element) {
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",element);
}

//27 wait-implicitwait 
public void implicitwait(int ) {
driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);
}












