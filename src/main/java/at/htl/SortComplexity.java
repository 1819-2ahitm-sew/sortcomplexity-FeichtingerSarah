package at.htl;

import java.util.Random;
import java.util.Scanner;

public class SortComplexity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anzahl der zu sortierenden Arrays: ");
        int anzahl =scanner.nextInt();
        System.out.println("Größe der zu sortierenden Arrays: ");
        int groese = scanner.nextInt();

        for (int i = 0; i < anzahl; i++) {
            System.out.print("Laufzeit zur Sortierung des " + i+1 + ". Arrays: ");
            System.out.println(sortRandomArray(groese) + " ms");

            int durchschnittlicheLaufzeit =
        }
    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {
        int [] array = generateRandomArray(length);
        long startTime = System.currentTimeMillis();
        sort(array);
        long endTime = System.currentTimeMillis();

        return endTime-startTime;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int [] terminalus = new int[length];

        for (int i = 0; i < length; i++) {
            terminalus[i] = random.nextInt();
        }
        return terminalus;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {
        int min;
        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[min])
                {
                    swap(array, min, j);
                }
            }
        }
    }

    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {
        int help = array[i];
        array[i] = array[j];
        array[j] = help;
    }
}
