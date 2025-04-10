package org.example.persistance;

import com.google.gson.*;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import org.example.data.Animal;
import org.example.data.Mammifere;
import org.example.data.Oiseau;
import org.example.data.Poisson;
import org.example.persistance.AnimalRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnimalJsonRepository implements AnimalRepository {
    private final String fileName;
    private final Gson gson;

    public AnimalJsonRepository(String fileName) {
        this.fileName = fileName;
        RuntimeTypeAdapterFactory<Animal> typeFactory = RuntimeTypeAdapterFactory
                .of(Animal.class, "type")
                .registerSubtype(Mammifere.class, "mammifere")
                .registerSubtype(Oiseau.class, "oiseau")
                .registerSubtype(Poisson.class, "poisson"); // Correction: "poisson" au lieu de "poissons"

        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapterFactory(typeFactory)
                .create();
    }

    @Override
    public void save(List<Animal> animaux) {
        Path path = Paths.get(fileName);
        try (Writer writer = Files.newBufferedWriter(path)) {
            gson.toJson(animaux, writer);
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors de l'enregistrement dans " + fileName, e);
        }
    }

    @Override
    public List<Animal> load() {
        Path path = Paths.get(fileName);

        // Si le fichier n'existe pas, retourner une liste vide
        if (!Files.exists(path)) {
            return new ArrayList<>();
        }

        try (Reader reader = Files.newBufferedReader(path)) {
            // Utilisation de TypeToken pour la désérialisation de List<Animal>
            Animal[] animauxArray = gson.fromJson(reader, Animal[].class);

            if (animauxArray == null) {
                return new ArrayList<>();
            }

            return new ArrayList<>(Arrays.asList(animauxArray));
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors de la lecture de " + fileName, e);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Format JSON invalide dans " + fileName, e);
        }
    }
}