package Desafio_TwoSum;

import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(2,7,11,15,28,1,9);
        List<Integer> indices = new ArrayList<>();
        Integer target;

        System.out.println("El array contiene los valores " + nums);

        try {
            System.out.println("Indique el target: ");
            target = new Scanner(System.in).nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("El input debe ser numerico");
            return;
        }

        for(int num: nums){
            Integer objective = target - num;
            if(nums.contains(objective)){
                Collections.addAll(indices, nums.indexOf(num), nums.indexOf(objective));
                System.out.printf("Los indices de los valores que suman %d son: %n", target);
                for(int indice: indices){
                    System.out.printf("Indice [%d] con valor %d%n", indice, nums.get(indice));
                }
                return;
            }
        }
        System.out.println("El array no contiene numeros que sumen el mismo valor que el target.");
    }
}
