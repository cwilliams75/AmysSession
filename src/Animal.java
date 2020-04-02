public class Animal {
    // specify the variables for the animal
    //create the variable
    int numberOfLegs; // local variable
    static int numberOfAnimals; // class variable : static means it belongs to this class
    String type;

    public Animal(int numberOfLegs, String type)       //constructor
    {
    this.numberOfLegs = numberOfLegs;
    this.type = type;

    }

    public Animal() {

    }
}
