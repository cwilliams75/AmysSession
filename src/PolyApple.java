import java.security.AlgorithmConstraints;

public class PolyApple {
    public static void main(String[] args) {

        // polymorphic array
        SuperFood bucky[] = new SuperFood[2];
        bucky[0] = new potpie();
        bucky[1] = new tuna();

        for (int i = 0; i < 2; i++) {
            bucky[i].eat();
        }

        fatty bucky1 = new fatty ();
        SuperFood fo = new SuperFood();
        SuperFood po = new potpie();

        bucky1.digest(fo);
        bucky1.digest(po);

        AnimalList ALO = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();

        ALO.add(d);
        ALO.add (f);
//        DogList DLO = new DogList();
//        Dog d = new Dog();
//        DLO.add(d);

        Animal [] thelist = new Animal[2];
       // Dog d = new Dog();
       // Fish f = new Fish();

        thelist[0] = d;
        thelist[1] = f;
        for (Animal x: thelist) {
            x.noise();
        }
    }
}
