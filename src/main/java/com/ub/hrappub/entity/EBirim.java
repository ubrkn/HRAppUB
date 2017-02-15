/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.hrappub.entity;

/**
 *
 * @author uberkun
 */
public enum EBirim {
    
    MERKEZ("Genel Müdürlük"),
    BOLGE("Bölge Müdürlüğü");
    
    private String label;

    private EBirim(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
    public static EBirim getEnum(int i){
        switch(i){
            case 0 : return MERKEZ;
            case 1 : return BOLGE;
         }
        return MERKEZ;
    }
    
    
    
    
}
