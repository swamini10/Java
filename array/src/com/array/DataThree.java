package com.array;

public class DataThree {
    public static int[] getSum(int arr[], int sum) {
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[i] + arr[j] == sum) {
                    return new int[] { arr[i], arr[j] };
                }
                j++;
            }
            i++;
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 5, 7, 10 };
        System.out.println((DataTwo.getSum(arr, 9)));
    }
}


