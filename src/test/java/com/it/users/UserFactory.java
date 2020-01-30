package com.it.users;

import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle resourceUser= ResourceBundle.getBundle("user");

    static public User getValidUser(){
        return new User(resourceUser.getString("username"),
                resourceUser.getString("password"),
                resourceUser.getString("email"));
    }
   /* static public user getRandomUser(){

     }*/


}
