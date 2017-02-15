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
public enum EUnvan {
    
    UZMAN_YARDIMCISI("Uzman Yardımcısı"),
    UZMAN("Uzman"),
    TEKNIK_UZMAN_YARDIMCISI("Tenkik Uzman Yardımcısı"), 
    TEKNIK_UZMAN("Teknik Uzman");
    
    private String label;

    private EUnvan(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public static EUnvan getEnum(int i){
        switch(i){
            case 0 : return UZMAN_YARDIMCISI;
            case 1 : return UZMAN;
            case 2 : return TEKNIK_UZMAN_YARDIMCISI;
            case 3 : return TEKNIK_UZMAN;
        }
        return UZMAN;
    }
    
    
}
