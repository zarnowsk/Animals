
package animalexample;


public abstract class Animal {
    
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    abstract public String play();
    
    abstract public String makeSound();

    abstract public String eat();
}
