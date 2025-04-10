package org.example.data;

import org.example.InvalidAgeException;
import org.example.interf.Parlant;

public class Peroquet extends Oiseau implements Parlant {
    public Peroquet(String name, int age, Float envergureDesAiles) throws InvalidAgeException {
        super(name, age, envergureDesAiles);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(this.name+ " est entrain de jacasser");
    }

    @Override
    public void parler() {
        System.out.println(this.name+ " est entrain de parler");
    }
}
