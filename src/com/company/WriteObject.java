package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Animals animals1 = new Animals("Dog", "Nigel", 80);
        Animals animals2 = new Animals("Cat", "Twix", 60);

        try {
            FileOutputStream fos = new FileOutputStream("halflife");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(animals1);
            oos.writeObject(animals2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
