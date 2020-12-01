package com.lehigh;

import java.util.Arrays;

public class SortArray {

    public int[] arr = {1, 3, 9, 5, 10, 8, 6};
    public int size = arr.length;

    public void swap(int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void bubbleSort(){

    }

    public void selectionSort(){

    }

    public static void main(String[] args) {
        SortArray sa = new SortArray();
        sa.bubbleSort();
//        sa.selectionSort();
        System.out.println(Arrays.toString(sa.arr));
    }
}
