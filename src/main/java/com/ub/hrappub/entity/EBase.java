/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.sound.midi.Sequence;

/**
 *
 * @author uberkun
 */

@MappedSuperclass
public abstract class EBase implements Serializable {
    
    private Long id;
    private String ekleyen;
    private String guncelleyen;
    private Date eklemeTarihi;
    private Date guncellemeTarihi;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_id_generator")
    @Column (name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "ekleyen", length = 100)
    public String getEkleyen() {
        return ekleyen;
    }

    public void setEkleyen(String ekleyen) {
        this.ekleyen = ekleyen;
    }

    @Column (name = "guncelleyen", length = 100)
    public String getGuncelleyen() {
        return guncelleyen;
    }

    public void setGuncelleyen(String guncelleyen) {
        this.guncelleyen = guncelleyen;
    }

    @Column (name = "ekleme_tarihi")
    @Temporal (TemporalType.TIMESTAMP)
    public Date getEklemeTarihi() {
        return eklemeTarihi;
    }

    public void setEklemeTarihi(Date eklemeTarihi) {
        this.eklemeTarihi = eklemeTarihi;
    }

    @Column (name = "ekleme_tarihi")
    @Temporal (TemporalType.TIMESTAMP)
    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }
    
}
