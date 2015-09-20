package com.github.zrx.algorithms4th.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 工具类 ： 读取文件数组
 * Created by R on 2015/9/20.
 */
public class ReadIntArrayFromFile {

    //Constructor
    public ReadIntArrayFromFile() {
    }

    /**
     * 功能：Java读取txt文件的内容
     * 步骤：1：先获得文件句柄
     * 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
     * 3：读取到输入流后，需要读取生成字节流
     * 4：一行一行的输出。readline()。
     * 备注：需要考虑的是异常情况
     * @param filePath
     */
    public static List readTXTFileByLine(String filePath)
    {
        List list=new ArrayList() ;
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    System.out.println(Integer.parseInt(lineTxt.toString().trim())  + " | " );
                    list.add(Integer.parseInt(lineTxt.toString().trim()));
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

        return list;
    }


    /**
     * 以字符为单位读取文件 一次读取一个字符， 常用于 文本 数字文件的读取
     * @param filePath
     * @return
     */
    public static List readTXTFileByChars(String filePath)
    {
        List list=new ArrayList() ;
        try {
            String encoding="UTF-8";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                list=readFile(file,encoding);
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return list;
    }
    private static List readFile(File file,String encoding) throws IOException {
        InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
        BufferedReader bufferedReader = new BufferedReader(read);
        int lineTxt = 0;
        String string="";
        List list=new ArrayList();

        while((lineTxt = bufferedReader.read()) != -1){
            if ( ((char) lineTxt)  !=  '\r') {
                System.out.print((char) lineTxt);
                string=string+String.valueOf((char)lineTxt);
                if((char)lineTxt == ' '){
                    list.add(Integer.parseInt(string.toString().trim()));
                    string="";
                }
            }
        }
        if ( ((char) lineTxt)  !=  '\r'){
            list.add(Integer.parseInt(string.toString().trim()));
        }
        read.close();
        return list;
    }

}
