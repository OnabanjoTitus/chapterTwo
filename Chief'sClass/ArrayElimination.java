package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayElimination {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int c []= {1,2,3,4,5};
        System.out.println("Enter The index Of The Number u want to eliminate");
        int count=input.nextInt();

        c[count]=c[count]-c[count];

        System.out.println(Arrays.toString((c)));
    }
}
