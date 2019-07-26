package com.mmt.flights.omnitureAutomation;

import org.openqa.selenium.JavascriptExecutor;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BrowserMobSetup {
    String driverPath = "chromedriver";

    public WebDriver driver;
    public BrowserMobProxy proxy;

    public void setUp(String pageRef, String url){
        proxy = new BrowserMobProxyServer();
        proxy.setTrustAllServers(true);
        proxy.start();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setAcceptInsecureCerts(true);

        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver(capabilities);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT);

        proxy.newHar(pageRef);

        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    }

    public void tearDown(String FileName) {
        Har har = proxy.getHar();

        File harFile = new File(FileName);

        try {
            har.writeTo(harFile);

        } catch (IOException e) {


            System.out.println("Could not find file " + FileName);
        }
       if (driver != null) {
           proxy.stop();
           driver.quit();
       }
    }
}


