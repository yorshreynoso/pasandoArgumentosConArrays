/*
 * Pasando un array con argumentos a un metodo
 */
package passingarrayasargument;

import java.util.Scanner;

/**
 *
 * @author YORSH
 */
public class PassingArrayAsArgument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;         //declare sife of an array

        int[] numbers = new int[ARRAY_SIZE];

        //pasa el array al metodo getValues
        getValues(numbers);

        System.out.println("here are the numbers you entered");

        showArray(numbers);
    }

    private static void getValues(int[] array) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter a series of " + array.length + " numbers.");
        //leer valores del array
        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter number " + (index + 1) + " :");
            array[index] = teclado.nextInt();
        }
        
       

    }

    private static void showArray(int[] numbers) {
            for(int index: numbers){
                System.out.println(index);
            }
    }

}
