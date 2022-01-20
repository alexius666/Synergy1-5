package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int m;
    int n;
    int matrixArr[][];

    //---------Конструкторы------------------------------------
    public Matrix() {               // Конструктор по умолчанию 2х2
        this.m = 2;
        this.n = 2;
        this.matrixArr = new int[m][n];
        this.matrixArr[0][0] = 1;
        this.matrixArr[0][1] = 2;
        this.matrixArr[1][0] = 3;
        this.matrixArr[1][1] = 4;
    }

    public Matrix(int m, int n) {    // Конструктор индивидуальный
        this.m = m;
        this.n = n;
        int num = 1;
        this.matrixArr = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //this.matrixArr[i][j] = rand.nextInt(10); // Генерация положительных чисел до 10
                this.matrixArr[i][j] = (int) (Math.random() * (10 + Math.abs(-10) + 1)) - 10; // Генерация случайных чисел от-10 до 10
                //this.matrixArr[i][j] = num; // Присвоение матрице номеров по порядку
                num++;
            }
        }
    }

    //----------Методы----------------------------------------
    public void Summa() { // Сумма матриц
        System.out.println("В разработке. Прошу отнестись к этому с пониманием");

    }

    public void Raznitsa() { // Разница матриц
        System.out.println("В разработке. Прошу отнестись к этому с пониманием");
    }

    public void Umnozhenie() {  // Умножение матриц
        System.out.println("В разработке. Прошу отнестись к этому с пониманием");
    }

    public void UmnozhenieX() {  // Умнежение на число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите множитель: ");
        int userIn = scanner.nextInt();
        // Настроить исключения, если пользователь ввел нечисловое выражение
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.matrixArr[i][j] = this.matrixArr[i][j] * userIn;
            }
        }
    }

    public void Pechat() { // Вывод матрицы
        for (int i = 0; i < this.matrixArr.length; i++) {
            for (int j = 0; j < this.matrixArr[i].length; j++) {
                System.out.print(this.matrixArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void Razmer() { // Размер матрицы
        //System.out.println("Длина данного массива: "
        //        +this.matrixArr[0].length+" столбцов,"
        //        +this.matrixArr.length+" строк");
        System.out.println("Размер данного массива: " + this.m + "x" + this.n);
    }

    public void Kvadrat() { // Возведение в квадрат
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.matrixArr[i][j] *= this.matrixArr[i][j];
            }
        }
        System.out.println("Массив возведен в квадрат");
    }

    public void Opredelitel() {  // Вычисление определителя
        if (this.n != this.m) {
            System.out.println("Пардон, вычисления детерминанта " +
                    "возможно только для квадратных матриц");
        }
        else {
            Determinant cc = new Determinant(this.matrixArr);
            cc.getValue();
        }
    }
}
