package _4_ForLoop_2;

import java.util.Scanner;

public class _1_NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 7; i <= 1000 ; i += 10) {
            System.out.println(i);
        }
    }
}
