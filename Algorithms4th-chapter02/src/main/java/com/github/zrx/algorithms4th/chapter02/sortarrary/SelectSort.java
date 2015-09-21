package com.github.zrx.algorithms4th.chapter02.sortarrary;


import com.github.zrx.algorithms4th.chapter02.SortExample;
import com.github.zrx.algorithms4th.chapter02.ISort;

/**
 * 排序算法 -- 选择排序(冒泡排序)
 * Created by R on 2015/9/19.
 */
public class SelectSort extends  SortExample {
    @Override
    public  void sort(Comparable[] a)
    { // 将a[]按升序排序
        int N = a.length;
        for (int i = 0; i <N ; i++)
        {
            int min =i;
            for (int j=i+1; j < N; j++)
                if(less(a[j],a[min])) min=j;
            exch( a, i, min);
        }
    }
}
