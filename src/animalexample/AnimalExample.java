package animalexample;

import java.util.Scanner;

public class AnimalExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new animal instances
        Animal cat = new Cat("Fluffy");
        Animal dog = new Dog("Lucky");
        Animal hamster = new Hamster("Hammy");

        //calling makeSound() and play() methods for each animal
        System.out.println("Cat makeSound " + invokeSound(cat));
        System.out.println("Cat play " + invokePlay(cat));

        System.out.println("Dog makeSound " + invokeSound(dog));
        System.out.println("Dog play " + invokePlay(dog));

        System.out.println("Hamster makeSound " + invokeSound(hamster));
        System.out.println("Hamster play" + invokePlay(hamster));
        
        //calling eat() method for each animal
        invokeEat(cat);
        invokeEat(dog);
        invokeEat(hamster);
        
        //creating instances of Classes implementing the Edible interface
        Edible chick = new Chicken("Roosty");
        Edible gala = new Apple();
        
        //calling howToEat() method for each Edible object
        invokeHowToEat(chick);
        invokeHowToEat(gala);
        
    }

    /**
     * Method accesses makeSound() methods of each instance of Animal
     *
     * @param animal
     * @return
     */
    public static String invokeSound(Animal animal) {
        if (animal instanceof Cat) {
            Scanner input = new Scanner(System.in);
            System.out.println("Is the cat scared?");
            String scared = input.nextLine();
            if (scared.equalsIgnoreCase("y")) {
                return ((Cat) animal).makeSound(true);
            } else {
                return ((Cat) animal).makeSound();
            }
        }

        return animal.makeSound();
    }

    /**
     * Method accesses play() method of each instance of Animal
     *
     * @param animal
     * @return
     */
    public static String invokePlay(Animal animal) {
        return animal.play();
    }
    
    /**
     * Method access eat() method of each instance of Animal
     * @param animal 
     */
    public static void invokeEat(Animal animal) {
        if(animal instanceof Cat) {
            System.out.print("Cat: ");
            System.out.println(animal.eat());
        }
        else if(animal instanceof Dog) {
            System.out.print("Dog: ");
            System.out.println(animal.eat());
        }
        else if(animal instanceof Hamster) {
            System.out.print("Hamster: ");
            System.out.println(animal.eat());
        }
    }
    
    public static void invokeHowToEat(Edible object) {
        if(object instanceof Apple) {
            System.out.print("Apple: ");
            System.out.println(object.howToEat());
        }
        else if(object instanceof Chicken) {
            System.out.print("Chicken: ");
            System.out.println(object.howToEat());
        }
    }

}
