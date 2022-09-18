package com.company;
import java.lang.Byte;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	byte a;
        System.out.println("Byte"+"\n"+Byte.MIN_VALUE+"\n"+Byte.MAX_VALUE);
    short b;
        System.out.println("Short"+"\n"+Short.MIN_VALUE+"\n"+Short.MAX_VALUE);
    int c;
        System.out.println("Integer"+"\n"+Integer.MIN_VALUE+"\n"+Integer.MAX_VALUE);
        long m;
        System.out.println("Long"+"\n"+Long.MIN_VALUE+"\n"+Long.MAX_VALUE);
    float d;
        System.out.println("Float"+"\n"+Float.MIN_VALUE+"\n"+Float.MAX_VALUE);
    double e;
        System.out.println("Double"+"\n"+Double.MIN_VALUE+"\n"+Double.MAX_VALUE);
    char f;
        System.out.println("Character"+"\n"+(int)Character.MIN_VALUE+"\n"+(int)Character.MAX_VALUE);
    boolean g;
        System.out.println("Boolean"+"\n"+true+"\n"+false);
        int arr[] = new int[10];
        for (int i = 0;i<arr.length;i++){
            arr[i] = (int)Math.round(Math.random()*40+0);
        }
        System.out.println("Max value "+Arrays.stream(arr).max().getAsInt());
        System.out.println("Min value "+Arrays.stream(arr).min().getAsInt());
    }

}
