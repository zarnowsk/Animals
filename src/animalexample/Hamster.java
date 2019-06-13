

package animalexample;


public class Hamster extends Animal{
    
    public Hamster(String name) {
        super(name);
    }
    
    @Override
    public String play() {
        return "Running on my wheel";
    }
    
    @Override
    public String makeSound() {
        return "squeak, squeak";
    }

    @Override
    public String eat() {
        return "eats carrots";
    }
}
