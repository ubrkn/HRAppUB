/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.entity;

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
@Table(name = "personel")
@SequenceGenerator(allocationSize = 1, name = "default_id_generator", sequenceName = "seq_personel")
public class Personel extends EBase {
    
    private String adSoyad;
    private EUnvan unvan;
    private EBirim birimi;
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
    public EUnvan getUnvan() {
        return unvan;
    }

    public void setUnvan(EUnvan unvan) {
        this.unvan = unvan;
    }

    @Enumerated (EnumType.ORDINAL)
    @Column(name="birim")
    public EBirim getBirimi() {
        return birimi;
    }

    public void setBirimi(EBirim birimi) {
        this.birimi = birimi;
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
