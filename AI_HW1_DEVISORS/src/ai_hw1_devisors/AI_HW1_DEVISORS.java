package ai_hw1_devisors;

import java.util.Scanner;

public class AI_HW1_DEVISORS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int Number = input.nextInt();
        System.out.println("List of all numbers which devisor of " + Number);
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.print(i + " | ");
            }

        }
    }

}
