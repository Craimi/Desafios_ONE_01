package Desafio_TwoSum;

import java.util.*;

public class TwoSum {
    static Scanner input = new Scanner(System.in);

    public void challenge() throws InterruptedException {
        List<Integer> nums = Arrays.asList(2,7,11,15,28,1,9);
        List<Integer> indices = new ArrayList<>();

        System.out.println("[======== RETO: TWO SUM ========]");
        System.out.println("El array contiene los valores " + nums);

        int target = scannerInput();


        for(int num: nums){
            Integer objective = target - num;
            if(nums.contains(objective)){
                Collections.addAll(indices, nums.indexOf(num), nums.indexOf(objective));
                System.out.printf("Los indices de los valores que suman %d son: %n", target);
                for(int indice: indices){
                    System.out.printf(" - Indice [%d] con valor %d%n", indice, nums.get(indice));
                }
                Thread.sleep(2500);
                return;
            }
        }
        System.out.println("El array no contiene numeros que sumen el mismo valor que el target.");
    }

    private static int scannerInput() throws InterruptedException {
        while (true){
            try {
                System.out.print("* Indique el target (Numero a buscar): ");
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
