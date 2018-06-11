/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javadoctestproject;

import java.io.*;

/**
 * <h1>Dodaj dwie liczby!</h1>
 * Jest to testowy program implementujący aplikację która dodaje dwie liczby i
 * wyświetla ich wartość na ekranie.
 * <p>
 * <b>Uwaga:</b> Dawanie odpowiednich komentarzy w twoim programie robi go
 * bardziej przyjaznym dla użytkownika i jest uznawane za kod wyższej jakości.
 *
 * @author Panda
 * @version 1.0
 * @since 2018-06-11
 */
public class ExampleJavaDocApp {

    /**
     * Jest to metoda która dodaje dwie wartości int. Jest to najprostsza forma
     * methody klasy tylko po to aby pokazać różne Tagi JavaDocs.
     *
     * @param numA Jest to pierwszy parametr metody addNum
     * @param numB Jest to drugi parametr metody addNum
     * @return int Zwraca sumę dwóch liczb.
     */
    public int addNum(int numA, int numB) {
        return numA + numB;
    }

    /**
     * Jest to główna metoda wykorzystująca metodę addNum.
     *
     * @param args Unused.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String args[]) throws IOException {
        ExampleJavaDocApp obj = new ExampleJavaDocApp();
        int sum = obj.addNum(10, 15);

        System.out.println("Suma 10 i 15 to : " + sum);
    }
}
