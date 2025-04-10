package org.example.persistance;

import org.example.data.Animal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AnimalFileRepository implements AnimalRepository {
    String filename;

    public AnimalFileRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public void save(List<Animal> animaux) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(animaux);
            System.out.println("Animals Enregistrer dans " + filename);
        } catch (Exception e) {
            System.out.println("Erreur d'enregistrement");
        }
    }

    @Override
    public List<Animal> load() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            List<Animal> animaux = (List<Animal>) ois.readObject();
            return animaux;
        } catch (Exception e) {
            System.out.println("Erreur d'enregistrement");
            return null;
        }

    }
}

