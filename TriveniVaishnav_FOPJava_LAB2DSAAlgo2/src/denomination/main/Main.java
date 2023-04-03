package denomination.main;

import denomination.helperClasses.Denomination;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Denomination denomination = new Denomination();
        Scanner scan = new Scanner(System.in);
        int numOfDenominations = 0;
        System.out.println("Enter the size of Currency Denominations");
        numOfDenominations = scan.nextInt();
        System.out.println("Enter the Currency Denomination Value");


        int[] value = new int[numOfDenominations];
        for (int i = 0; i < numOfDenominations; i++) {
            value[i] = scan.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = scan.nextInt();
        denomination.bubbleSort(value);
        denomination.numOfNotes(value, amount);
    }
}