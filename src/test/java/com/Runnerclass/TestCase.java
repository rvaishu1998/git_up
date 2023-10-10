package com.Runnerclass;

import org.testng.annotations.Test;

import com.base.Baseclass_T;
import com.pom.LoginPom;

public class TestCase extends Baseclass_T{
	
	
	
	@Test
	public void Facebooklogin() throws InterruptedException {
		lauchBrowser("chrome");
	    launchUrl("https://www.facebook.com");
	    Thread.sleep(2000);
	    LoginPom pom = new LoginPom();
        input(pom.getUsername(), "vaishu");
        input(pom.getPassword(), "v@123");
        clickOnElement(pom.getLoginButton());	
	}

}
