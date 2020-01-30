package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbUserEmail;

    public  String getLbUserEmail(){
        return lbUserEmail.getText();
    }

    @FindBy(xpath = "//a[.='Создать письмо']")
    private WebElement lnkNewMsg;

    public void getLnkNewMsg() {
        lnkNewMsg.getLocation().getClass();
    }

 /*   @FindBy(xpath = "//)
    private WebElement ;

    @FindBy(xpath = "//ul[@class='list_underlined']")
    private WebElement ;

    @FindBy(xpath = "//li[@class='current new']")
    private WebElement ;
  */

}//end of file