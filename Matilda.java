public class Matilda {

    public static void main(String args[]) {

        int[] array = {1, 2, 3, 4, 5, 60, 7, 8, 9, 10};
        int i = 0;
        int mayor = array[0];

        while ( i < 10) {
            if (array[i] > mayor) {
                mayor = array[i];
            } 
            i++;

        }
        System.out.println("... " + mayor);
    }
}