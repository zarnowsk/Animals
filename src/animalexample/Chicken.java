
package animalexample;


public class Chicken extends Animal implements Edible {
    
    public Chicken(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return "coocoo";
    }
    
    @Override
    public String play() {
        return "Laying eggs for fun";
    }
    
    @Override
    public String eat() {
        return "eats grain";
    }
    
    @Override
    public String howToEat() {
        return "Deep fry";
    }
}
