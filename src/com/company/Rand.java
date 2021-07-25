package com.company;

public class Rand {

    public static int[] randNnumbersWithoutIteration(int max_number, int amount_of_numbers) throws MaxSizeExeption {
        if (amount_of_numbers > max_number) {
            throw new MaxSizeExeption("amount_of_numbers can't be more than max_number!");
        }
        int[] arr = new int[amount_of_numbers];
        int[] arr2 = new int[amount_of_numbers];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * max_number);

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr2[j]) {
                    if (arr[i] == 0) {
                        arr[i] += 1;
                    }
                    i--;
                    break;
                }
            }
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]);
        }
        return arr2;
    }

    public static int[] rand(int max_num, int amount_of_numbers) {

        int[] arr = new int[amount_of_numbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * max_num);
            if (arr[i] == 0) {
                arr[i] += 1;
            }
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static class MaxSizeExeption extends Exception {

        public MaxSizeExeption(String message) {
            super(message);
        }

    }
}

