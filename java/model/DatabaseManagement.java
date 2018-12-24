/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MinhMan
 */
public class DatabaseManagement {
   public boolean checkUser(String username,String password){
    if(username.equals("man") && password.equals("123123")){
              return true;
       }
       return false;
}
}
