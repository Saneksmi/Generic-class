package com.company;


public class Gen <T> {

    public void printArr(T[] arr){
        for (int i = 0; i <= arr.length - 1; i++) {
            getElement(arr, i);
        }
    }
    
    public void getElement(T[] arr, int i) {

        System.out.println((i + 1) + " = " + arr[i].toString());

    }

    public  void reverse(T[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            swap(arr, i, j, false);
            i++;
            j--;
        }

        printArr(arr);

        //просто вывод в обратном порядке
        /*for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }*/
    }

    public void swap (T[] arr, int i, int j, boolean print){
        T tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        if (print){
            printArr(arr);
        }

    }


}