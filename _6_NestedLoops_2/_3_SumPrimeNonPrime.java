package _6_NestedLoops_2;

import java.util.Scanner;

public class _3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        while(!input.equals("stop")){
            int number = Integer.parseInt(input);

            if (number < 0){
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;

                for (int divisor = 2; divisor < number ; divisor++) {
                    if (number % divisor == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    sumPrime += number;
                } else {
                    sumNonPrime += number;

                }
            }

           input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n" , sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d" , sumNonPrime);
    }
}
