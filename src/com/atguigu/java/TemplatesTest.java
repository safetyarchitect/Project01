package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author liuhonglei
 * @create 2018-12-18 19:46
 */
public class TemplatesTest {

    private static final Hello hello = new Hello();
    private static final Customer CUSTOMER = new Customer();

    public static final Customer CUS = new Customer();

    public static final int NUM = 10;

    public static final String NATION = "china";

    public static void main(String[] args) {
        System.out.println("args = " + args);

        ArrayList list = new ArrayList();
        list.add(13);
        list.add(14);
        list.add(15);

        if (list == null) {

        }

        if (list != null) {

        }

        if (list != null) {

        }


    }
    public void method(){
        System.out.println("TemplatesTest.method");
        int vm = 10;
        int vm2 = 20;
        System.out.println("vm2 = " + vm2);

        String[] arr = new String[]{"tom" , "jason" , "jerry"};



        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        for (int i = 0; i < ; i++) {

        }
        for (String s : arr) {
            
        }
        System.out.println("10 = " + 10);


        ArrayList list = new ArrayList();
        list.add(13);
        list.add(14);
        list.add(15);
        for (Object o : list) {
            
        }


        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
}
