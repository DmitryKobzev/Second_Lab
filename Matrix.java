package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int[][] arr;
    int [] sum;

    public Matrix(int n) {
        arr = new int[n][n];
        sum=new int[n];
    }

    ////////////
    public void GetMatrix() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(20);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //////////////
    public void Task() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    sum[i] += arr[i][j];
                } else {
                    break;
                }
            }
            System.out.println(sum[i]);
        }
    }
}