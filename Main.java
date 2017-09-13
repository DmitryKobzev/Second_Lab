package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матрицы n");
        int n = input.nextInt();
        Matrix call = new Matrix(n);
        System.out.println("Матрица имеет вид:");
        call.GetMatrix();
        call.Task();
    }
}