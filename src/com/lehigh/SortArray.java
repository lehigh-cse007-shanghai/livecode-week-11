package com.lehigh;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public int[] arr = {9, 5, 1, 3, 8, 10, 2}; // Objective: 1 3 5 6 8 9 10
    public int size = arr.length;

    public void swap(int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void bubbleSort(){
        for(int i = 0; i < size; i ++) // i 指代轮次
            for(int j = 0; j < size - i - 1; j ++) // j 指代位置
                if(arr[j] > arr[j + 1])
                    swap(j, j + 1);
    }

    public void twoForLoops(){
        for(int i = 0; i < 5; i ++)
            for(int j = i; j < 4 - i - 1; j ++)
                for(int k = 0; k < 4; k ++)
                    System.out.println(i + "" + j + "" + k);
            // 000, 001, 002, 003; 010, 011, 012, 013;
    }


    public void selectionSort(){
        int min_index = -1;
        for(int i = 0; i < size; i ++) {
            min_index = i;
            for(int j = i + 1; j < size; j ++)
                if(arr[j] < arr[min_index])
                    min_index = j;
            swap(i, min_index);
        }
    }

    public static void main(String[] args) {
        SortArray sa = new SortArray();

        Arrays.sort(sa.arr);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(6);

        Collections.sort(arrayList);

        System.out.println(arrayList);

//        sa.twoForLoops();
//        sa.bubbleSort();
//        sa.selectionSort();
//        System.out.println(Arrays.toString(sa.arr));
    }
}
