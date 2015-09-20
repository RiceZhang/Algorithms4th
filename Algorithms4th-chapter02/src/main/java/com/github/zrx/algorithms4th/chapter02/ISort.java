package com.github.zrx.algorithms4th.chapter02;

/**
 * Created by R on 2015/9/19.
 */
public interface ISort {

     void  sort(Comparable[] a);
     boolean less(Comparable v, Comparable w);
     void exch(Comparable[] a , int i , int j);
     boolean isSort(Comparable  a[]);
     void show(Comparable a[]);


}
