/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.entity.personel;

import com.ub.hrappub.entity.EBase;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author uberkun
 */

@Entity
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_personel")
@Table(name = "personel")
public class Personel extends EBase {
    
    private String adSoyad;
    private String unvan;
    private String Birimi;
    private long sicilNo;
    private Date girisTarihi;

    @Column(name="isim", length = 150)
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    @Enumerated (EnumType.ORDINAL)
    @Column(name="unvan")
    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Enumerated (EnumType.ORDINAL)
    @Column(name="birim")
    public String getBirimi() {
        return Birimi;
    }

    public void setBirimi(String Birimi) {
        this.Birimi = Birimi;
    }

    @Column(name="sicil_no")
    public long getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(long sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Column(name="giris_tarihi")
    @Temporal(TemporalType.DATE)
    public Date getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(Date girisTarihi) {
        this.girisTarihi = girisTarihi;
    }
      
}
