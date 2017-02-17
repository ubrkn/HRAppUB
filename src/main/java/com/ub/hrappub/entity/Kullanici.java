/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.entity;

import com.ub.hrappub.entity.EBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Ugur
 */

@Entity
@Table(name = "kullanici")
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_kullanici")
public class Kullanici extends EBase {
    
    private String username;
    private String password;

    public Kullanici(String username, String password) {
        this.username = username;
        this.password = password;
    }

    
    
    @Column(name="uname", length = 50, unique=true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="pword", length = 15)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      
    
}
