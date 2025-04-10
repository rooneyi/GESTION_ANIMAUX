package org.example.data;

import org.example.InvalidAgeException;

public abstract class Poisson extends Animal {
    private static  long serialVersionUID = 1L;

    private String typeEaux;

    public Poisson(String name, int age, String typeEaux) {
        super(name, age);
        this.typeEaux = typeEaux;
    }

    public String getTypeEaux() {
        return typeEaux;
    }

    public void setTypeEaux(String typeEaux) {
        this.typeEaux = typeEaux;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + typeEaux + ")";
    }
}
