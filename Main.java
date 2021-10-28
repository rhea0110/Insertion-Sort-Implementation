package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {22, -10, 99, 0, -1, -99, 100};
        int size = arr.length;

        for (int firstIndex = 1; firstIndex < size; firstIndex++) {
            int newElement = arr[firstIndex];

            int i;

            for (i = firstIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
