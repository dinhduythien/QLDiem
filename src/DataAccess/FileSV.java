/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entity.sinhVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Thanh
 */
public class FileSV {
    File f = new File("SINHVIEN.DAT");
    public void ghiSV(ArrayList<sinhVien> list)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(list);
            oos.close();
        }   
        catch(Exception e){}
    }
    
    public ArrayList<sinhVien> docSV() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists())
            return new ArrayList<sinhVien>();
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        return (ArrayList<sinhVien>)ois.readObject();
    }
}
