package com.javarush.test;

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(b.readLine(1));
        int c = Integer.parseInt(b.readLine(2));
        int d = Integer.parseInt(b.readLine(3));

        int num1 = Math.max(a,Math.max(c,d));
        int num3 = Math.min(a,Math.min(c,d));
        int num2 = (a+c+d)-(num1+num3);
        System.out.println(num1+" "+num2+" "+num3);
    }
}
