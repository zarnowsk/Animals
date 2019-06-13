
package animalexample;


public class Cat extends Animal {

    public Cat(String name) {
        super(name);       
    }
    
    @Override
    public String play() {
        return name + " is hunting mice";
    }
    
    @Override
    public String makeSound() {
        return "Meow!";
    
    }
    
    public String makeSound(boolean scared) {
        
        if (scared) {
             return "Hissssss!";
        } else {
            return makeSound();
        }
    }
    
    @Override
    public String eat() {
        return "eats mice & cat food";
    }

}
