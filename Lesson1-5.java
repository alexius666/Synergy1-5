package com.company;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN =  "\033[0;92m"; //"\u001B[32m"; "\033[1;92m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\033[4;36m"; //"\033[1;96m"; //"\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.print(ANSI_RED + "=====" + ANSI_RESET);
        System.out.print(ANSI_BLUE + "=====" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "=====" + ANSI_RESET);
        System.out.print(ANSI_WHITE + "=====" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "=====" + ANSI_RESET);

        int x=2,y=2;

        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_CYAN+"Создание первой матрицы..."+ANSI_RESET);
        System.out.println(ANSI_GREEN+"1. Выбор размера матрицы по умолчанию 2х2");
        System.out.println("2. Ввести размер матрицы вручную");
        System.out.print("Введите число: ");
        int userIn = scanner.nextInt();
        if(userIn!=2){
            System.out.println("Создана матрица по умолчанию 2х2");
            x=y=2;
        }
        if(userIn==2){
            System.out.println("Введите количество строк: ");
            userIn=scanner.nextInt();
            x=userIn;
            System.out.println("Введите количество столбцов: ");
            userIn=scanner.nextInt();
            y=userIn;
            System.out.println("Создана матрица "+x+"x"+y);
        }
            Matrix matrix1 = new Matrix(x,y);

        x=y=2;

        System.out.println(ANSI_CYAN+"Создание второй матрицы..."+ANSI_RESET);
        System.out.println(ANSI_GREEN+"1. Выбор размера матрицы по умолчанию 2х2");
        System.out.println("2. Ввести размер матрицы вручную");
        System.out.print("Введите число: ");
        userIn = scanner.nextInt();
        if(userIn!=2){
            System.out.println("Создана матрица по умолчанию 2х2");
            x=y=2;
        }
        if(userIn==2){
            System.out.println("Введите количество строк: ");
            userIn=scanner.nextInt();
            x=userIn;
            System.out.println("Введите количество столбцов: ");
            userIn=scanner.nextInt();
            y=userIn;
            System.out.println("Создана матрица "+x+"x"+y);
        }
            Matrix matrix2 = new Matrix(x,y);

        System.out.println(ANSI_CYAN+"Возможные Опреции"+ANSI_RESET);
        System.out.println(ANSI_GREEN+"1. Вычисление определителя первой матрицы");
        System.out.println("2. Вычисление определителя второй матрицы");
        System.out.println("3. Возведение первой матрицы в квадрат");
        System.out.println("4. Возведение второй матрицы в квадрат");
        System.out.println("5. Вывод значений первой матрицы на экран");
        System.out.println("6. Вывод значений второй матрицы на экран");
        System.out.println("7. Вывести размер первой матрицы на экран");
        System.out.println("8. Вывести размер второй матрицы на экран");
        System.out.println("9. Сложение матриц");
        System.out.println("10. Умножение матриц");
        System.out.println("11. Умножение первой матрицы на Х");
        System.out.println("12. Умножение второй матрицы на Х");
        System.out.print("Введите число: ");
        userIn = scanner.nextInt();
        switch (userIn) {
            case 1: {matrix1.Opredelitel();break;}
            case 2: {matrix2.Opredelitel();break;}
            case 3: {matrix1.Kvadrat(); matrix1.Pechat();break;}
            case 4: {matrix2.Kvadrat();matrix2.Pechat();break;}
            case 5: {matrix1.Pechat();break;}
            case 6: {matrix2.Pechat();break;}
            case 7: {matrix1.Razmer();break;}
            case 8: {matrix2.Razmer();break;}
            case 9: {matrix1.Summa();break;}
            case 10: {matrix1.Umnozhenie();break;}
            case 11: {matrix1.UmnozhenieX();matrix1.Pechat();break;}
            case 12: {matrix2.UmnozhenieX();matrix2.Pechat();break;}
            default: System.out.println("Конец");
        }
    }
}
