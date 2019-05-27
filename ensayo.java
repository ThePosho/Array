import java.util.Scanner;

public class ensayo {

    public static void main(String args[]) {

        // NUMEROS IMPARES

    System.out.println("***********   FOR   ***********");

        for (int n = 0; 2 * n + 1 <= 100; n++){
            System.out.println(2 * n +1);
        }

    System.out.println("***********   WHILE   ***********");

        int n = 0;

        while (2 * n + 1 <= 100) {
            System.out.println(2 * n +1);
            n++;
        }

    System.out.println("***********   DO WHILE   ***********");        
        
        n = 0;

        do {
            System.out.println(2 * n + 1);
            n++;
        } while (2 * n + 1 <= 100);

    System.out.println("***********   IF   ***********");

        n = 0;

        if ((2 * n + 1) <= 100){
            while (2 * n + 1 <= 100) {
                System.out.println(2 * n +1);
                n++;
            }
        }

        //NUMEROS PARES
    
    System.out.println("***********   FOR   ***********");

        for (n = 0; 2 * n <= 100; n++) {
            System.out.println(2 * n);
        }

    System.out.println("***********   WHILE   ***********");
        
        n = 0;

        while (2 * n <= 100) {
            System.out.println(2 * n);
            n++;
        }

    System.out.println("***********   DO WHILE   ***********");

        n = 0;

        do {
            System.out.println(2 * n);
            n++;
        } while (2 * n <= 100);

        //RANGO

    System.out.println("***********   RANGO DESDE 5 HASTA 10   ***********");
    
    Scanner entrada = new Scanner (System.in);

    int number;
        do {
            number = entrada.nextInt();
        } while ((number < 5) || (number > 10));

    }
}