package ru.mirea.task29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    String currPath;

    public Main()
    {
        currPath = System.getProperty("user.dir");
    }

    void serializeCurrency(Curr ci, String fileName)
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currPath + fileName))) {
            oos.writeObject(ci);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    Curr deserializeCurrency(String pathToFile)
    {
        Curr ci = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currPath + pathToFile)))
        {
            ci = (Curr) ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return ci;
    }

    public static void main(String[] args) {
        Main task = new Main();

        Curr ci = new Curr("Dollar", new ArrayList<>(Arrays.asList(
                "USA", "Australia", "Canada", "New Zealand", "Belize")), "Cent");
        ci.printCurr();

        task.serializeCurrency(ci, "currencyInfo.dat");

        Curr deserializedCi = task.deserializeCurrency("currencyInfo.dat");
        System.out.println("Currency info from deserialized object: ");
        deserializedCi.printCurr();
    }
}