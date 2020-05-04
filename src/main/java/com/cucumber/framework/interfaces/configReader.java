package com.cucumber.framework.interfaces;

import com.cucumber.framework.configuration.browser.Browser;

public interface configReader {
	public String getSearchTitle();
	public String getImdbTitle();
	public String getName();
	public String getEmailId();
	public String getRetryPassword();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public Browser getBrowser();
}
