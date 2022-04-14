package com;
public class gen {
    public void test(int a , char b , int[] c , String d, long e){
        System.out.println("int:"+a);
        System.out.println("char:"+b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("String:"+d);
        System.out.println("long:"+e);
    }
}