package com.github.zrx.algorithms4th.chapter02;

/**
 * 定义一个抽象类 作为排序算法的模版类
 * Created by R on 2015/9/20.
 */
public abstract class SortExample implements ISort{

    public  abstract  void  sort(Comparable[] a);

    /**
     * 比较 return v-w < 0  是否为true
     * @param v
     * @param w
     * @return
     */
     public boolean less(Comparable v, Comparable w)
    {
       return v.compareTo(w)<0;
    }

    /**
     * 交换 a[] 下标为 i  j 的值
     * @param a
     * @param i
     * @param j
     */
    public void exch(Comparable[] a , int i , int j)
    {
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    /**
     * 检查测试，数据是否已经排序 (升序)
     * @return
     */
    public  boolean isSorted(Comparable  a[])
    {
        for (int i=1 ; i<a.length ; i++ )
            if( less(a[i] ,a[i-1]) ) return false;//出现降序
        return true;
    }

    /**
     * 打印出排序的数据
     */
    public  void show(Comparable a[])
    {
          for (int i=0;i<a.length;i++)
              System.out.print(a[i] + " ");
    }


}
