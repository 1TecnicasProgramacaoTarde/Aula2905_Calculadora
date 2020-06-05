/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, total, op;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora --\n");
        
        //Menu
        System.out.println("[1] soma");
        System.out.println("[2] multiplicação");
        System.out.println("[3] subtração");
        System.out.println("[4] resto inteiro da divisao");
        //System.out.println("[5] divisão"); Daniel
        
        //Opção do usuário
        System.out.print("\nOpção: ");
        op = entrada.nextInt();
        
        if(op == 1){
            //Entrada
            System.out.println("Soma Simples");
            System.out.print("Informe n1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe n2: ");
            n2 = entrada.nextInt();
        
            //Processamento
            total = n1 + n2;
                
            //Saída
            System.out.println("\n\t " + n1 + " + " + n2 + " = " + total);
        }else if(op == 2){
                
            //Gustavo & Henrique M. Multiplicação
       
            //Entrada
            System.out.println("Multiplicação");
            System.out.print("Informe n1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe n2: ");
            n2 = entrada.nextInt();
        
            //Processamento
            total = n1 * n2;
        
            //Saida
            System.out.println("\n\t " + n1 + " * " + n2 + " = " + total);
        
        } else if(op == 3){
            //Jéssica Subtração
            //Acho que repetir o título é desnecessario - D. Ps:D = Douglas :)
            //System.out.println("\n\t\t\t -- Calculadora --\n");
            //Entrada
            System.out.println("Subtracao Simples");
            System.out.print("Informe n1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe n2: ");
            n2 = entrada.nextInt();
        
            //Processamento
            total = n1 - n2;
        
        
            //Saída
            System.out.println("\n\t " + n1 + " - " + n2 + " = " + total);
        } else if(op == 4){
            //Douglas Resto da Divisão
       
            //Entrada
            System.out.println("Resto da divisão");
            System.out.print("Informe n1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe n2: ");
            n2 = entrada.nextInt();
        
            //Processamento
            total = n1 % n2;
        
            //Saida
            System.out.println("\n\t " + n1 + " % " + n2 + " = " + total);
        } else {
            System.out.println("Opção " + op + " inválida!");
        }
                                                                
    }
    
    
}
