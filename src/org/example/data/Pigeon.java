package org.example.data;

import org.example.InvalidAgeException;

public class Pigeon extends Oiseau {
    public Pigeon(String name, int age, Float envergureDesAiles)  {
        super(name, age, envergureDesAiles);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(this.name+" Roucoule");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
