package com.crg.chapter1;

import java.util.Arrays;

/**
 * Created by crg on 2017/4/26.
 */
public class BinarySearch {
    public static int  rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return  -1;
    }

    public static void main(String[] args){
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key, whiteList) < 0){
                StdOut.print(key);
            }
        }
    }
}
