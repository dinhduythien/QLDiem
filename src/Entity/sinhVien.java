/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Thanh
 */
public class sinhVien extends nguoi implements java.io.Serializable{
    String maSV;
    String lop;

    public sinhVien(String maSV, String lop, String ho, String ten, String diaChi) {
        super(ho, ten, diaChi);
        this.maSV = maSV;
        this.lop = lop;
    }
    
    public sinhVien() {
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public Object[] toArray(){
        return new Object[]{maSV,ho,ten,diaChi,lop};
    }
    
}
