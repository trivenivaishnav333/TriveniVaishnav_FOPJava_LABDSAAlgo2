package paymoney.main;

import paymoney.helperClasses.Transaction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Transaction transaction = new Transaction();

        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of transaction array");
        size = scan.nextInt();
        System.out.println("Enter the values of array");
        int[] volume = new int[size];

        for (int i = 0; i < size; i++) {
            volume[i] = scan.nextInt();
        }

        System.out.println("Enter the total number of targets that need to be achieved");
        int target = scan.nextInt();

        for (int i = 0; i < target; i++) {
            System.out.println("Enter the value of target");
            int value = scan.nextInt();
            transaction.completed(value, volume);
        }
    }

	
}
