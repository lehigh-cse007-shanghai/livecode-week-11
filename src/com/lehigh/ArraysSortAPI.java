package com.lehigh;

import java.util.Arrays;

public class ArraysSortAPI {
    Monster monster1 = new Duck();
    Monster monster2 = new Dragon();
    Monster monster3 = new Tortoise();

    Monster[] arr = new Monster[]{monster1, monster2, monster3};
    int size = 3;

    public static void main(String[] args){
        ArraysSortAPI instance = new ArraysSortAPI();

        Arrays.sort(instance.arr);

        System.out.println(instance.arr[0]);
        System.out.println(instance.arr[1]);
        System.out.println(instance.arr[2]);
        // sort the monsters according to their strength

    }
}
