/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub;

import com.ub.hrappub.service.ui.frmLogin;

/**
 *
 * @author Ugur
 */
public class App {

    public static void main(String[] args) {
        frmLogin login = new frmLogin(null, true);
        login.setLocationRelativeTo(null);
        login.show();
        
    }

}
