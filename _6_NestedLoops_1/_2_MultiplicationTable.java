package _6_NestedLoops_1;

public class _2_MultiplicationTable {
    public static void main(String[] args) {

        for (int first = 1; first <= 10 ; first++) {
            for (int second = 1; second <= 10 ; second++) {

                int sum = first * second;

                System.out.println(first + " * " + second + " = " + sum);
            }
        }
    }
}
