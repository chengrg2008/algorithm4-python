package com.crg.chapter2;

import com.crg.chapter1.StdRandom;

public class SortCompare {
   public static double time(String alg, Double[] a){
       return 0.;
   }

   public static double timeRandomInput(String alg, int N, int T)
   {
       double total = 0.0;
       Double[] a = new Double[N];
       for (int t = 0; t < T; t++) {
           //进行一次测试(生成一个数组并排序)
           for (int i = 0; i < N; i++) {
               a[i] = StdRandom.uniform();
           }
           total += time(alg, a);
       }
       return total;
   }
}
