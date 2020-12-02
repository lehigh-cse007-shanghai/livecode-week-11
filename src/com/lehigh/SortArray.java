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

    public void bubbleSort2(){
        for(int i = 0; i < size; i ++) // i 指代轮次
            for(int j = size - 1; j >= 1 + i; j --) // j 指代位置
                if(arr[j] < arr[j - 1])
                    swap(j, j - 1);
    }

    public void bubbleSortRecursive(int i){
        if(i == 0)
            return;
        for(int j = 0; j < i; j ++)
            if(arr[j] > arr[j + 1])
                swap(j, j + 1);
        bubbleSortRecursive(i - 1);
    }

    public void bubbleSortRecursive2(int i){
        if(i == size - 1)
            return;
        for(int j = size - 1; j > i; j --)
            if(arr[j] < arr[j - 1])
                swap(j, j - 1);
        bubbleSortRecursive2(i + 1);
    }


    // 1 1 2 3 5 8 13 21
    public int fibonacciRecursive(int i){
        if(i == 0 || i == 1)
            return 1;
        return fibonacciRecursive(i -1) + fibonacciRecursive(i - 2);
    }

    public int fibonacciIterative(int i) {
        int[] arrFibo = new int[10];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for(int j = 2; j <= 9; j ++)
            arrFibo[j] = arrFibo[j - 1] + arrFibo[j - 2];
        return arrFibo[i];
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

    public void selectionSort2(){
        int max_index = -1;
        for(int i = size - 1; i >= 1; i --) {
            max_index = i;
            for(int j = 0; j <= i - 1; j ++)
                if(arr[j] > arr[max_index])
                    max_index = j;
            swap(i, max_index);
        }
    }




    public static void main(String[] args) {
        SortArray sa = new SortArray();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(6);

        Collections.sort(arrayList);

//        System.out.println(arrayList);

//        sa.twoForLoops();
//        sa.bubbleSort2();
//        sa.selectionSort2();
        sa.bubbleSortRecursive(3);
//        sa.bubbleSortRecursive2(0);
        System.out.println(Arrays.toString(sa.arr));

//        System.out.println(sa.fibonacciIterative(7));
    }
}
