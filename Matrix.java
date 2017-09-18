package com.company;
import java.util.Arrays;

public class Matrix {
    int[][] arr;
    int [] sum;

    public Matrix(int n) throws Exception{
        if(n<0){
            throw new Exception("Error!!!n-natural number");
        }
        arr = new int[n][n];
        sum=new int[n];
    }

    ////////////
    public void GetMatrix() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= (int) Math.round((Math.random() * 40) - 13);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //////////////
    public void Task()throws Exception {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum[i]=0;
                  break;
                } else{
                    sum[i] += Math.abs(arr[i][j]);
                }
            }
        }
        Arrays.sort(sum);
        if(sum[sum.length-1]==0){
            throw new Exception("Данная строка не найдена");
        }
        System.out.println("Max_sum=");
        System.out.println(sum[sum.length-1]);
        }
    }
