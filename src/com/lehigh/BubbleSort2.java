package com.lehigh;

public class BubbleSort2 {
    Monster monster1 = new Duck();
    Monster monster2 = new Dragon();
    Monster monster3 = new Tortoise();

    Monster[] arr = new Monster[]{monster1, monster2, monster3};
    int size = 3;

    public void swap(int i, int j){
        Monster tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void bubbleSort(){
        for(int i = 0; i < size; i ++) // i 指代轮次
            for(int j = 0; j < size - i - 1; j ++) // j 指代位置
                if(arr[j].intelligence > arr[j + 1].intelligence)
                    swap(j, j + 1);
    }

    public static void main(String[] args){
        BubbleSort2 main = new BubbleSort2();
        main.bubbleSort();
        System.out.println(main.arr[0]);
        System.out.println(main.arr[1]);
        System.out.println(main.arr[2]);
        // sort the monsters according to their strength

    }


}
