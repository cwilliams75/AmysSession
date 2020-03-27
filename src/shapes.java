public class shapes {
    // Print the following shapes using loop(s)
//    1*****          12345 &                 @
//    12****          1234 &&                 @@
//    123***          123 &&&                 @ @
//    1234**          12 &&&&                 @  @
//    12345*          1 &&&&&                 @    @
//    123456           &&&&&&                 @@@@@@

    public static void main(String[] args) {
        //  i = number of row being printed
        for (int i = 1; i <= 6; i++) {
            // j = will print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // k = will print *'s
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println();
            //i = number of row being printed
            for (int i = 6; i >= 1; i--) {
                // j = will print numbers
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                // k = will print *'s
                for (int k = 6; k >= i; k--) {
                    System.out.print("&");
                }
                System.out.println();
            }
        System.out.println();
        System.out.println("@");
        for (int i = 5; i >= 1; i--) {
            System.out.print("@");
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for (int j = 5; j > 0; j--) {
            System.out.print("@ ");
        }
        }

}
