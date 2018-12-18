package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

//this is single line comment
public class HelloWorld {

    private static int num;

    public HelloWorld() {
    }

    public static int getIntialSize() {
        return INTIAL_SIZE;
    }



    public static final int INTIAL_SIZE = 10;
    public int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {


        return a;
    }

    public static void main(String[] args) {
        num = 10;
        //region Description
        ArrayList list1 = getList();

    }

    public static ArrayList getList() {
        System.out.println("helloworld!!");
        ArrayList list1 = new ArrayList();
        //endregion
        list1.add(0,123);
        try {
            FileInputStream fis = new FileInputStream("hello.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list1;
    }


}