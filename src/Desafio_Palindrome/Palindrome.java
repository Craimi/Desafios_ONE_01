package Desafio_Palindrome;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.floor;

public class Palindrome {
    static Scanner input = new Scanner(System.in);

    public void challenge() throws InterruptedException {
        int numberReversed = 0;
        boolean value = true;

        System.out.println("[======== RETO: PALINDROME ========]");

        int numberOriginal = scannerInput();

        int numberBackup = numberOriginal;

        while (value){

            double floatPart = (double) numberOriginal / 10 ; //Separamos el ultimo valor como decimal

            int intPart = (int)floatPart; //Elimina el ultimo valor y deja solo el entero
            numberOriginal = intPart; //Vamos recorriendo el numero original para el siguiente ciclo

            double result = floatPart - intPart; //Obtenemos el decimal
            result = result * 10; //Lo convertimos en entero
            result = (floor(result + 0.01)); //Eliminamos los posibles residuos decimales

            numberReversed *= 10;
            numberReversed += (int) result;


            if(numberOriginal == 0){
                value = false;
            }
        }

        System.out.println("Numero Original = " + numberBackup);
        System.out.println("Numero Reversed = " + numberReversed);

        if(numberBackup == numberReversed){
            System.out.println("El numero SI ES un palindromo");
        }
        else{
            System.out.println("El numero NO ES un palindromo");
        }

        Thread.sleep(2500);
    }

    private static int scannerInput() throws InterruptedException {
        while (true){
            try {
                System.out.print("* Indique el numero que quiera analizar: ");
                return input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("[ERROR: El input debe ser numerico]");
                Thread.sleep(500);
                input.next();
            }
        }
    }
}
