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
public class ketqua {
    private String MaSV;
    private String MaMH;
    private String Diem;
    
    public ketqua(){
        
    }

    public ketqua(String MaSV, String MaMH, String Diem) {
        this.MaSV = MaSV;
        this.MaMH = MaMH;
        this.Diem = Diem;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getDiem() {
        return Diem;
    }

    public void setDiem(String Diem) {
        this.Diem = Diem;
    }
    
}
