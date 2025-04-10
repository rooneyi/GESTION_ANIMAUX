package org.example.data;

import org.example.InvalidAgeException;

public abstract class Oiseau extends Animal {
    private static  long serialVersionUID = 1L;

    private Float envergureDesAiles;
    public Oiseau(String name, int age, Float envergureDesAiles) {
        super(name, age);
        this.envergureDesAiles = envergureDesAiles;

    }

    public Float getEnvergureDesAiles() {
        return envergureDesAiles;
    }

    public void setEnvergureDesAiles(Float envergureDesAiles) {
        this.envergureDesAiles = envergureDesAiles;
    }

//    @Override
//    public void faireDuBruit() {
//        System.out.println(this.name + " est entrain de faire glouglou ");
//    }

    @Override
    public String toString() {
        return super.toString() + " (" + envergureDesAiles + ")";
    }
}
