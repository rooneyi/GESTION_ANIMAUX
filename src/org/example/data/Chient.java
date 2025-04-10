package org.example.data;

import org.example.InvalidAgeException;

public class Chient extends Mammifere {
    private static  long serialVersionUID = 1L;

    private String race;
    public Chient(String name, int age, String Pellage, String race) throws InvalidAgeException {
        super(name, age, Pellage);
        this.race = race;
    }

    @Override
    public void faireDuBruit() {
        System.out.println(this.name + " est entrain d'aboyer");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
