package org.example.data;

import org.example.InvalidAgeException;
import org.example.interf.Chantant;
import org.example.interf.Volant;

public class ChauveSouris extends Mammifere implements Volant, Chantant {
    private static  long serialVersionUID = 1L;

    public ChauveSouris(String name, int age, String Pellage) throws InvalidAgeException {
        super(name, age, Pellage);
    }

    @Override
    public void faireDuBruit(){
        System.out.println(this.name + " est entrain de faire du bruit ");
    }

    @Override
    public void voler() {
        System.out.println(this.name+" est entrain de voler");
    }

    @Override
    public void chanter() {
        System.out.println(this.name+" est entrain de chanter");
    }
}
