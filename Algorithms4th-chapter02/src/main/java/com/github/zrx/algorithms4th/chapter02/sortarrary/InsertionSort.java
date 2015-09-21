package com.github.zrx.algorithms4th.chapter02.sortarrary;

import com.github.zrx.algorithms4th.chapter02.SortExample;

/**
 *  排序算法 -- 插入排序
 * Created by R on 2015/9/20.
 */
public class InsertionSort extends SortExample {

    @Override
    public void sort(Comparable[] a)
    {//插入排序 升序排序
        int N = a.length;
        for (int i = 1; i < N; i++)
        { // 将a[i] 插入到[a-i] a[i-2] ... 之中 保证 i及i后全部有序
            for (int j = i; j > 0 && less(a[j],a[j-1]) ; j--)
                 exch(a, j , j-1);
        }
    }

}
