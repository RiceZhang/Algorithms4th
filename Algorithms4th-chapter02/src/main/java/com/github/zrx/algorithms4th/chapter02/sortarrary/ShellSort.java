package com.github.zrx.algorithms4th.chapter02.sortarrary;

import com.github.zrx.algorithms4th.chapter02.SortExample;

/**
 * 排序算法 -- 希尔排序
 *
 * Created by R on 2015/9/20.
 */
public class ShellSort extends SortExample {

    @Override
    public void sort(Comparable[] a)
    {   // 将按升序排序
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1;
        while (h >= 1)
        {  //将数组变成有序
            for (int i = 0; i < N; i++)
            {
                for (int j = i;j >= h && less(a[j],a[j-h]);j--)
                    exch(a, j, j-h);
            }
            h=h/3;
        }
    }

}
