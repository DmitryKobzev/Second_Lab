package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер матрицы n");
            int n = input.nextInt();
            Matrix call = new Matrix(n);
            System.out.println("Матрица имеет вид:");
            call.GetMatrix();
            call.Task();
        }
        catch(InputMismatchException a){
            System.out.println("Error!!!!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}