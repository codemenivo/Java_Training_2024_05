package Sirma_May_2024_17_Generics.Ex_17_02_GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static<T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;

    }


    public  static<T> T[] create(Class<T> myClass, int length, T item) {
        T[] array = (T[]) Array.newInstance(myClass, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

}