package com.crg.chapter2;

import com.crg.chapter1.In;
import com.crg.chapter1.StdOut;

public  class Example {
    public static void sort(Comparable[] a){}
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[]a ,int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

//    public static void main(String[] args) {
//        String[] a = In.readStrings();
//        sort(a);
//        assert  isSorted(a);
//        show(a);
//    }

}
