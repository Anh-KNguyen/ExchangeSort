package exchangesort;

import java.util.Random;
import java.util.Scanner;

public class ExchangeSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");

        int enterNum = input.nextInt();
        int[] number = new int[enterNum];

        Random randomNums = new Random();
        int min = 1;
        int max = 100;

        for (int i = 0; i < enterNum; i++) {
            number[i] = randomNums.nextInt(max - min) + min;
        }
        
        exchangeSort(number);
        input.close();
    }

    public static void exchangeSort(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j]; 
                    number[j] = temp;
                }
            }
        }
        print(number);
    }

    public static void print(int[] number) {
        System.out.println("Sorted array for " + number.length + " elements");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

}
