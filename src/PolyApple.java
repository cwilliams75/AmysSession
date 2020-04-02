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
    }
}
