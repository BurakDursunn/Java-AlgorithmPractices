public class Star {

    public static void main(String[] args) {

        System.out.println("*");
        int star = 1;

        for (int i=1; i<10; i++){

                star += 1;

            for (int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i=1; i<10; i++){

            star -= 1;

            for (int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        
    }
}
