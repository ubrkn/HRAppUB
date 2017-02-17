/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub;

import com.ub.hrappub.entity.Kullanici;
import com.ub.hrappub.service.KullaniciService;
import com.ub.hrappub.service.ui.frmLogin;
import com.ub.hrappub.service.ui.frmPersonelListesi;

/**
 *
 * @author Ugur
 */
public class App {

    public static void main(String[] args) {
        
        
//        try {
//            KullaniciService ks = new KullaniciService();
//            ks.save(new Kullanici("test", "test"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//             
//        frmLogin login = new frmLogin(null, true);
//        login.setLocationRelativeTo(null);
//        login.show();
        
        frmPersonelListesi personel = new frmPersonelListesi();
        personel.setVisible(true);



    }

}
