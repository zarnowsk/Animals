
package animalexample;

/**
 *
 * @author paulbonenfant
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    
    @Override
    public String play() {
        return name + " is playing with a ball";
    }
    
    @Override
    public String makeSound() {
        return "woof woof";
    }
    
    @Override
    public String eat() {
        return "eats raw meat";
    }

}
