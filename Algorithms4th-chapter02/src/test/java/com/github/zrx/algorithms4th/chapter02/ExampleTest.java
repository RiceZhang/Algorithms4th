package com.github.zrx.algorithms4th.chapter02;

import com.github.zrx.algorithms4th.chapter02.sortarrary.InsertionSort;
import com.github.zrx.algorithms4th.chapter02.sortarrary.SelectSort;
import com.github.zrx.algorithms4th.chapter02.sortarrary.ShellSort;
import com.github.zrx.algorithms4th.util.ReadIntArrayFromFile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by R on 2015/9/20.
 */
public class ExampleTest
{
    @BeforeClass
    public static void testInitClass()
    {
        System.out.println("begining test SortExample sortarrary Algorithms");
    }

    /**
     * 测试选择排序(冒泡排序)
     */
    @Test
    public void testSelectSort()
    {
        List list= ReadIntArrayFromFile.readTXTFileByChars("D:\\WorkSpace\\IdeaWorkSpace\\Algorithms4th\\Algorithms4th-chapter02\\src\\test\\resources\\data1.txt");
        SelectSort selectSort =new SelectSort();
        Comparable[] objects= (Comparable[]) list.toArray(new Comparable[list.size()]);
        selectSort.sort(objects);
        selectSort.show(objects);
        selectSort.isSorted(objects);
        Assert.assertTrue(selectSort.isSorted(objects));
    }

    /**
     * 测试插入排序
     */
    @Test
    public void testInsertionSort()
    {
        List list= ReadIntArrayFromFile.readTXTFileByChars("D:\\WorkSpace\\IdeaWorkSpace\\Algorithms4th\\Algorithms4th-chapter02\\src\\test\\resources\\data1.txt");
        Comparable[] objects= (Comparable[]) list.toArray(new Comparable[list.size()]);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(objects);
        insertionSort.show(objects);
        Assert.assertTrue(insertionSort.isSorted(objects));
    }

    /**
     * 测试希尔排序
     */
    @Test
    public void testShellSort()
    {
        System.out.println("testShellSort.....");
        List list= ReadIntArrayFromFile.readTXTFileByChars("D:\\WorkSpace\\IdeaWorkSpace\\Algorithms4th\\Algorithms4th-chapter02\\src\\test\\resources\\data1.txt");
        Comparable[] objects= (Comparable[]) list.toArray(new Comparable[list.size()]);
        ShellSort shellSort = new ShellSort();
        shellSort.sort(objects);
        shellSort.show(objects);
        Assert.assertTrue(shellSort.isSorted(objects));
    }
}