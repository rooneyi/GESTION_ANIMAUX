package org.example.data;

import org.example.InvalidAgeException;

public class AgeValidator {
    int age;
    public AgeValidator(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'Age ne peut pas etre negatif");
        } else {
            this.age = age;
        }
    }
}
