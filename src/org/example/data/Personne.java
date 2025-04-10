package org.example.data;

import org.example.InvalidAgeException;
import org.example.interf.Parlant;

public class Personne extends Mammifere implements Parlant {
    private int Qi;
    private String bruit;

    public Personne(String name, int age, String Pellage, int Qi) throws InvalidAgeException {
        super(name, age, Pellage);
        this.Qi = Qi;
        this.bruit = "Pleurer";
    }

    @Override
    public void faireDuBruit() {
        System.out.println(this.name+ " est entrain de "+ this.bruit);
    }

    @Override
    public void parler() {
        System.out.println(this.name+ " est entrain de parler");
    }

    public String getBruit() {
        return bruit;
    }

    public void setBruit(String bruit) {
        this.bruit = bruit;
    }
}
