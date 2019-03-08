package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("С чем хотите работать?: 1 - Строки, 2 - Целые числа, 3 - Котики");
            String s = r.readLine();
            switch (s){
                case "1": String[] mas1 = {"a", "b", "c", "d","e"};
                          Gen<String> arr1 = new Gen<>();
                          System.out.println("Изначальный массив");
                          arr1.printArr(mas1);
                          System.out.println();
                          System.out.println("Вывод второго элемента");
                          arr1.getElement(mas1, 1);
                          System.out.println();
                          System.out.println("Вывод перевёрнутого массива");
                          arr1.reverse(mas1);
                          System.out.println();
                          System.out.println("Первый и четвёртый элементы меняются местами");
                          arr1.swap(mas1,0,3,true);

                          break;
                case "2": Integer[] mas2 = {1, 2, 3, 4, 5};
                          Gen<Integer> arr2 = new Gen<>();
                          System.out.println("Изначальный массив");
                          arr2.printArr(mas2);
                          System.out.println();
                          System.out.println("Вывод второго элемента");
                          arr2.getElement(mas2, 1);
                          System.out.println();
                          System.out.println("Вывод перевёрнутого массива");
                          arr2.reverse(mas2);
                          System.out.println();
                          System.out.println("Первый и четвёртый элементы меняются местами");
                          arr2.swap(mas2,0,3,true);
                          break;
                case "3": Cat[] mas3 = {new Cat("Васька"), new Cat("Барсик"), new Cat("Мурзик")};
                          Gen<Cat> arr3 = new Gen<>();
                          System.out.println("Изначальный массив");
                          arr3.printArr(mas3);
                          System.out.println();
                          System.out.println("Вывод второго элемента");
                          arr3.getElement(mas3, 1);
                          System.out.println();
                          System.out.println("Вывод перевёрнутого массива");
                          arr3.reverse(mas3);
                          System.out.println();
                          System.out.println("Первый и второй элементы меняются местами");
                          arr3.swap(mas3,0,1,true);
                          break;
                default:
                    break;

            }
            break;
        }
    }
}
