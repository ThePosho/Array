import java.util.Scanner;

public class Array {

    public static void main(String args[]) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el numero que desea encontrar: ");
        int num = entrada.nextInt();
        int[] vector = new int [100];
        boolean verificacion = false;
    
            for (int i = 0; i < 100; i++) {
                vector[i] = i + 1;

                    if ( num == vector[i]) {
                        System.out.println("El numero ingresado se encuentra en la posicion: " + i);
                        verificacion = true;
                        break;
                    } 

            }

            if (!verificacion){
                System.out.println("El numero " + num + " no se encuentra.");
            }
    }
}