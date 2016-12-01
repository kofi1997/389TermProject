/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse389_termserver;

/**
 *
 * @author Emily
 */
public class Authentication {
    public String user;
    public String password;
    
    public Authentication (){
    this.user="Administrator";
    this.password="root";
    }
    
    public Authentication (String user, String password){
    this.user=user;
    this.password=password;
    }
    
    
    
}


