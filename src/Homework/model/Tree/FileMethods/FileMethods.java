package Homework.model.Tree.FileMethods;

import Homework.model.Tree.FamilyTree;

import java.io.*;

public class FileMethods extends FamilyTree implements Writable, Serializable {

    @Override
    public boolean saveAllInFile(Serializable serializable, String filePath) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));){
           objectOutputStream.writeObject(serializable);
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object read(String filePath) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));){
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
