package org.example.data;

import org.example.InvalidAgeException;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private static  long serialVersionUID = 1L;
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void faireDuBruit();

    public void eat() {
        System.out.println( this.name + " est entrain de manger...");
    }
    public void sleep() {
        System.out.println(this.name + " est entrain de dormir...");
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'Age ne peut pas etre negatif");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
