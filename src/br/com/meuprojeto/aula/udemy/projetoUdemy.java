package br.com.meuprojeto.aula.udemy;

import java.util.Scanner;
//Aprendendo a somar números.
public class projetoUdemy {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.print("Digite o Primeiro Número : ");
        double number1 = calculadora.nextDouble();

        System.out.print("Digite o Segundo Número : ");
        double number2 = calculadora.nextDouble();

        double soma = number1 + number2;

        System.out.println("A Soma dos Dois Números inseridos é : " + soma);

    }
}

