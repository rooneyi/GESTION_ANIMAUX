package org.example.persistance;

import org.example.data.Animal;
import java.util.List;

public interface AnimalRepository {
    void save(List<Animal>animaux);
    public List<Animal> load();
}
