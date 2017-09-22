package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    int[][] arr;
    int[] sum;
    int max = 0;
    int n = 1;

    public Matrix(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error!!!n-natural number");
        }
        arr = new int[n][n];
        sum = new int[n];
    }

    ////////////
    public void SetMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public void GetMatrix() {
        System.out.println("Матрица имеет вид:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    //////////////
    public void Task() throws Exception {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum[i] = 0;
                    break;
                } else {
                    sum[i] += Math.abs(arr[i][j]);
                }
            }
        }
        max=sum[0];
        for (int i = 1; i < sum.length; i++) {
            if(max<=sum[i]){
                max=sum[i];
                n=i+1;
            }
        }
        System.out.println("Max_sum=");
        System.out.println(max);
        System.out.println("Номер строки=");
        System.out.println(n);
    }
}
