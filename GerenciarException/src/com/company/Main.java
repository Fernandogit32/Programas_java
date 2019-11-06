package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a, b, soma;
            System.out.println("ENTRE COM VALOR DE A");
            a =sc.nextInt();
            System.out.println("ENTRE COM VALOR DE B");
            b =sc.nextInt();
            soma = a /b;
            System.out.println("a soma é "+soma);

        }catch (ArithmeticException ex1){
            System.out.println("Divisão por 0 não pode");
        }
        catch (InputMismatchException ex2){

            System.out.println("Voce precisa entrar com numero inteiro");
        }catch (Exception ex3){
            System.out.println("Aconteceu um erro"+ ex3.getMessage());
        }finally {
            System.out.println("Passei aqui de qualquer geito");
        }

    }
}
