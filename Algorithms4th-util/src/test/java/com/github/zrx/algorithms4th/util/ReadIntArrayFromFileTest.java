package com.github.zrx.algorithms4th.util;

import org.junit.Test;

import java.util.List;



/**
 * Created by R on 2015/9/20.
 */
public class ReadIntArrayFromFileTest {


    /**
     * 测试 以一行为单位读取文件
     * @throws Exception
     */
    @Test
    public void testreadTXTFileByLine() throws Exception
    {
        List<Integer> list= ReadIntArrayFromFile.readTXTFileByLine("D:\\WorkSpace\\IdeaWorkSpace\\Algorithms4th\\Algorithms4th-util\\src\\main\\resources\\dataInt.txt");
        for (Integer i : list){
           System.out.print(i);System.out.print("|");
        }
        System.out.print("|"+"\n");
    }

    /**
     * 测试 ，以字符为单位 读取字符（一个个读）
     */
    @Test
    public void testreadTXTFileByChars()
    {
        List<Integer> list= ReadIntArrayFromFile.readTXTFileByChars("D:\\WorkSpace\\IdeaWorkSpace\\Algorithms4th\\Algorithms4th-util\\src\\main\\resources\\dataInt2.txt");
        for (Integer i : list){
            System.out.print(i);
            System.out.print("");
        }
        System.out.println();
    }

}