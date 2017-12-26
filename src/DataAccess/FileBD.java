/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entity.bangDiem;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Thanh
 */
public class FileBD {
    File f = new File("BANGDIEM.DAT");
    public void ghiBD(ArrayList<bangDiem> list)
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
    
    public ArrayList<bangDiem> docBD() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists())
            return new ArrayList<bangDiem>();
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        return (ArrayList<bangDiem>)ois.readObject();
    }
}
