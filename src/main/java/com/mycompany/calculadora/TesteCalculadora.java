package com.mycompany.calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cefet
 */

import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;

        // do-while: garante que o menu apareça PELO MENOS uma vez
        // e repete até o usuário escolher "0 - Sair"
        do {
            System.out.println("\n===== MENU CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();
                double resultado;

                // switch: direciona para a operação escolhida
                switch (opcao) {
                    case 1:
                        resultado = calc.somar(a, b);
                        System.out.println("Resultado da soma: " + resultado);
                        break;
                    case 2:
                        resultado = calc.subtrair(a, b);
                        System.out.println("Resultado da subtração: " + resultado);
                        break;
                    case 3:
                        resultado = calc.multiplicar(a, b);
                        System.out.println("Resultado da multiplicação: " + resultado);
                        break;
                    case 4:
                        resultado = calc.dividir(a, b);
                        System.out.println("Resultado da divisão: " + resultado);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Encerrando a calculadora. Até logo!");
        scanner.close();
    }
}

