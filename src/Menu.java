import Desafio_Palindrome.Palindrome;
import Desafio_TwoSum.TwoSum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        while (true){
            int reto = scannerInput();

            if (reto >= 1 && reto <= 2){
                switch (reto){
                    case 1:
                        new TwoSum().challenge();
                        break;
                    case 2:
                        new Palindrome().challenge();
                        break;
                }
            }
            else {
                System.out.println("Saliendo del programa. Gracias.");
                Thread.sleep(2000);
                return;
            }
        }
    }

    private static int scannerInput(){
        while (true){
            System.out.println("[======== MENU ========]");
            System.out.println("[Retos disponibles]");
            System.out.println("(1) Two Sum");
            System.out.println("(2) Palindrome");
            System.out.println("(>3) Salir");
            try {
                System.out.print("* Ingrese el numero del reto que desee seleccionar: ");
                return input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("[ERROR: El input debe ser numerico]");
                input.next();
            }
        }
    }
}
