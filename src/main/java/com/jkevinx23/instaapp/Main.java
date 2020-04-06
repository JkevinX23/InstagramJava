package com.jkevinx23.instaapp;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.controller.UserController;
/**
 *
 * @author jkevin
 */
public class Main {
  public static void main(String[] args)
    {
        String email = "ab@email.com";
        String password = "password";
        UserController userController = new UserController();
        
        int resp = userController.login(email,password);
        
       System.out.println("Codigo :: "+resp);
       if(resp == 0)
        System.out.println("Token :: "+Keys.BearerToken);
        
    }
}