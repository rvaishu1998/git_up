package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass_T;

public class LoginPom extends Baseclass_T{
 
	public LoginPom() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(id = "email") 
 private  WebElement username ;

 @FindBy(id = "pass")
 private WebElement password;

 @FindBy(name = "login")
 private WebElement loginButton;

 public WebElement getUsername() {
 	return username;
 }

 public WebElement getPassword() {
 	return password;
 }

 public WebElement getLoginButton() {
 	return loginButton;
 }
}
