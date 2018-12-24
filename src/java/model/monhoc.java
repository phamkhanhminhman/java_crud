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
public class monhoc {
    private String MaMH;
    private String TenMH;
    private String SoTiet;
    
    public monhoc(){
        
    }

    public monhoc(String MaMH, String TenMH, String SoTiet) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.SoTiet = SoTiet;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public String getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(String SoTiet) {
        this.SoTiet = SoTiet;
    }
    
}
