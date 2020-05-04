package com.cucumber.framework.configreader;

import java.util.Properties;

import com.cucumber.framework.utility.ResourceHelper;
import org.apache.log4j.Level;

import com.cucumber.framework.configuration.browser.Browser;
import com.cucumber.framework.interfaces.configReader;


public class PropertyFileReader implements configReader {
	
	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper
					.getResourcePathInputStream("configfile/"
							+ "config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getSearchTitle() {
		return prop.getProperty("SearchTitle");
	}

	public String getImdbTitle() {
		return prop.getProperty("ImdbTitle");
	}

	public String getName() {
		return prop.getProperty("Name");
	}

	public String getEmailId() {
		return prop.getProperty("EmailId");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getRetryPassword() {
		return prop.getProperty("RetryPassword");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	public Browser getBrowser() {
		return Browser.valueOf(prop.getProperty("Browser"));
	}
	
	public Level getLoggerLevel() {
		
		switch (prop.getProperty("Logger.Level")) {
		
		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "WARN":
			return Level.WARN;
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		}
		return Level.ALL;
	}

}
