package com.example.testAutomatizados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumConfig {
	private WebDriver driver;
	
	public SeleniumConfig() {
		Capabilities capabilities = DesiredCapabilities.chrome();
		driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	static {
		System.setProperty("webdriver.gecko.driver", "/home/Sebastian/Documents/Facultad/Taller de Programación Avanzada/Spring/testAutomatizados/src/bin/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/Sebastian/Documents/Facultad/Taller de Programación Avanzada/Spring/testAutomatizados/src/bin/chromedriver");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
