package org.example.data;

public abstract class Mammifere extends Animal {
    private static  long serialVersionUID = 1L;

    private String Pellage;
    public Mammifere(String name, int age, String Pellage)  {
        super(name, age);
        this.Pellage = Pellage;
    }



    public void allaiter(){
        System.out.println(this.name + " est entrain d'allaiter...");
    }
    public String getPellage() {
        return Pellage;
    }

    public void setPellage(String pellage) {
        Pellage = pellage;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + Pellage + ")";
    }
}
