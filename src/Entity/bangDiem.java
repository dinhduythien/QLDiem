/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;

/**
 *
 * @author Thanh
 */
public class bangDiem implements Serializable{
    private int diem;
    private sinhVien sv;
    private monHoc mh;

    public bangDiem() {
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public monHoc getMh() {
        return mh;
    }

    public void setMh(monHoc mh) {
        this.mh = mh;
    }

    public sinhVien getSv() {
        return sv;
    }

    public void setSv(sinhVien sv) {
        this.sv = sv;
    }

    public bangDiem(int diem, sinhVien sv, monHoc mh) {
        this.diem = diem;
        this.sv = sv;
        this.mh = mh;
    }

//    public Object[] toArray()
//    {
//        return new Object[]{sv.getMaSV(),sv.getHo()+" "+sv.getTen(),mh.getTenMon()
//            ,diem};
//    }
    
}
