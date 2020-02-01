package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

    @FindBy(xpath="//span[@class='sn_menu_title']")
    private WebElement lbUserEmail;

    public String getLbUserEmail() {
        return lbUserEmail.getText();
    }


 /*   @FindBy(className="make_message")
    private WebElement lnkNewMsg;

    public void getLnkNewMsg() {
        lnkNewMsg.click();
    }
*/


}//end of file