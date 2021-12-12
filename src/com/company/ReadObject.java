package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("halflife");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Animals animals1 = (Animals) ois.readObject();
            Animals animals2 = (Animals) ois.readObject();

            System.out.println(animals1);
            System.out.println(animals2);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
