import org.example.InvalidAgeException;
import org.example.data.*;
import org.example.persistance.AnimalFileRepository;
import org.example.persistance.AnimalJsonRepository;
import org.example.persistance.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        AnimalRepository repository = new AnimalFileRepository("animaux.html.twig");
        AnimalJsonRepository repositoryJson = new AnimalJsonRepository("animaux.json");

        List<Animal> animaux = new ArrayList<>();
        animaux.add(new ChauveSouris("chauve-souris", 23, "pellage"));
        animaux.add(new Pigeon("pigeon", 22, 4.9F));
        animaux.add(new Personne("rooney", 20, "Poil", 8));
        animaux.add(new Peroquet("JEan", 2, 4.2F));
//        repository.save(animaux);
        repositoryJson.save(animaux);



        List<Animal> animaux2 = repository.load();
        for (Animal a : animaux2) {
            System.out.println(a.getName());
        }



//        List<Animal> animaux = new ArrayList<>();
//        animaux.add(new ChauveSouris("chauve-souris", 23, "pellage"));
//        animaux.add(new Pigeon("pigeon", 22, 4.9F));
//        animaux.add(new Personne("rooney", 20, "Poil", 8));
//        animaux.add(new Peroquet("JEan", 2, 4.2F));
////
////
//        Peroquet peroquet = new Peroquet("Jean", 2, 4.2F);
////        peroquet.setAge(-2);
//        try{
//            peroquet.setAge(-2);
//        }catch (InvalidAgeException e){
//            System.out.println(e.getMessage());
//        }

//        // Une seule boucle pour tous les traitements
//        for (Animal animal : animaux) {
//            afficherSiCorrespond(animal, "Mammifère", Mamiphere.class);
//            afficherSiCorrespond(animal, "Oiseau", Oiseau.class);
//            afficherSiCorrespond(animal, "Parlant", Parlant.class);
//        }
    }

    // Méthode générique pour afficher conditionnellement
//    private static <T> void afficherSiCorrespond(Animal animal, String type, Class<T> classe) {
//        if (classe.isInstance(animal)) {
//            System.out.println("===============" + type + "===============");
//            System.out.println(animal.name);
//
//            // Comportements spécifiques
//            if (animal instanceof Parlant) {
//                ((Parlant) animal).parler();
//            }
//        }
//    }
//        int nb1;
//        int nb2;
//        Scanner clav = new Scanner(System.in);
//
//        System.out.println("Entrez le premier nombre : ");
//        nb1 = clav.nextInt();
//        System.out.println("entres le second nombre : ");
//        nb2 = clav.nextInt();
//
//
//        try{
//            float result = nb1/nb2;
//            System.out.println("la division est : " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Division par zero impossible");
//        }
//        }
}