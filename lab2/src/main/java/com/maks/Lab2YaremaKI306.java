package com.maks;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2YaremaKI306 {
    public static void main(String[] args){

        int size = inputSize();
        char symbol = inputFiller();
        char[][] juggedArr = generateJaggedArr(size, symbol);

        showJuggedArr(juggedArr);
        saveJuggedArrToFile(juggedArr);

    }

    public static int inputSize(){
        Scanner scanner = new Scanner(System.in);
        int size;

        while(true){
            try {
                System.out.print("Enter size of square matrix: ");
                size = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a number");
                scanner.next();
            }
        }
        return size;
    }

    public static char inputFiller(){
        Scanner scanner = new Scanner(System.in);
        char symbol;

        while(true){
            try {
                System.out.print("Enter character to fill matrix: ");
                String str = scanner.nextLine();

                if (str.isEmpty()){
                    continue;
                }
                symbol = str.charAt(0);
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a character");
                scanner.next();
            }
        }
        return symbol;
    }

    public static char[][] generateJaggedArr(int size, char symbol){
        char[][] juggedArr = new char[size][size];

        for (int i = 0; i < size; i++) {
            Arrays.fill(juggedArr[i], ' ');
            for (int j = 0; j < size - i; j++) {
                juggedArr[i][j] = symbol;
            }
        }
        return juggedArr;
    }

    public static void showJuggedArr(char[][] juggedArr) {
        for (char[] charArr : juggedArr) {
            for (char ch : charArr) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    private static void saveJuggedArrToFile(char[][] juggedArr) {
        try {
            PrintWriter writer = new PrintWriter("MyFile.txt");

            for (char[] charArr : juggedArr) {
                for (char ch : charArr) {
                    writer.print(ch + " ");
                }
                writer.print("\n");
            }

            writer.flush();
            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}